package com.cathy.example.mybatisspringbootdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 陈敬
 * @date 2018/7/2
 */
@Mapper
public interface CityMapper {
    @Select("SELECT id, name, state, country FROM city WHERE state = #{state}")
    City findByState(String state);
}
