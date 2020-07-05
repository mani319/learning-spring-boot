package com.manikanta.springboot.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Manikanta Tummalapenta on 04/07/20
 */
@Data
@AllArgsConstructor
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String s1;
    private String s2;
    private String s3;
}
