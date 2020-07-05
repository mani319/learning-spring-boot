package com.manikanta.springboot.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@ApiModel(description = "Details about the user")
public class User {

    private Integer id;

    @Size(min=2, message = "Name should have at least 2 chars")
    @ApiModelProperty(notes = "Name should have at least 2 chars")
    private String name;

    @Past
    @ApiModelProperty(notes = "DOB should be in past")
    private Date dob;
}
