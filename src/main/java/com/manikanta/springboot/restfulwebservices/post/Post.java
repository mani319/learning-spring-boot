package com.manikanta.springboot.restfulwebservices.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.manikanta.springboot.restfulwebservices.user.User;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Manikanta Tummalapenta on 07/07/20
 */
@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String message;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
}
