package com.manikanta.springboot.restfulwebservices.user;

import com.manikanta.springboot.restfulwebservices.post.Post;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@ApiModel(description = "Details about the user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message = "Name should have at least 2 chars")
    @ApiModelProperty(notes = "Name should have at least 2 chars")
    private String name;

    @Past
    @ApiModelProperty(notes = "DOB should be in past")
    private Date dob;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(Integer id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
}
