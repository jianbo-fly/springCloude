package com.atguigu.springcloudalibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author 18482
 */
@Mapper
public interface AccountDao {

    void descMoney(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
