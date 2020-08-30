package com.manikanta.springboot.restfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by Manikanta Tummalapenta on 03/07/20
 */
@Data
@AllArgsConstructor
public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private String details;
}
