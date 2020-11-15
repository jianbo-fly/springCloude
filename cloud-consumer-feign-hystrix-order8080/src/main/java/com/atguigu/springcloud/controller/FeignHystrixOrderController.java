package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.ProviderFeignPayment;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author 18482
 */

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod") //设置全局的默认的服务降级处理
public class FeignHystrixOrderController {
    @Resource
    private ProviderFeignPayment providerFeignPayment;

    @GetMapping(value = "/consumer/payment/ok/{id}")
    public String hystrixIsOk(@PathVariable("id") Integer id) {
        return providerFeignPayment.hystrixIsOk(id);
    }

       @GetMapping(value = "/consumer/payment/delay/{id}")

       /* @HystrixCommand(fallbackMethod = "OrderError", commandProperties = {
                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "100000")})*/
    //@HystrixCommand //使用默认的服务降级处理
    public String hystrixIsError(@PathVariable("id") Integer id) {
        //int a = 10 / 0;
        String result = providerFeignPayment.hystrixIsError(id);
        log.info("++++++++++++++" + result);
        return result;
    }

    private String OrderError(Integer id) {
        return "订单程序出错！order ---线程名为：" + Thread.currentThread().getName() + "id为" + id + "服务出错或者服务出现超时！，请稍后重试！o(╥﹏╥)o ";
    }

    /**
     * 全局fallback 降级方法
     * <p>
     * 需要注释一些属性,没有特别指明,就用统一的方法
     * //    @HystrixCommand(fallbackMethod = "PaymentTimeOutFallbackMethod", commandProperties = {
     * //            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
     * //    })
     * <p>
     * 替换成@HystrixCommand一个注解
     *
     * @return
     */
    public String payment_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再试，o(╥﹏╥)o";
    }
}
