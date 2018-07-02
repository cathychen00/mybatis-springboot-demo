package com.cathy.example.mybatisspringbootdemo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 陈敬
 * @date 2018/7/2
 */
@Data
public class City implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String state;
    private String country;
}
