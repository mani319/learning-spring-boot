package com.manikanta.springboot.restfulwebservices.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Manikanta Tummalapenta on 07/07/20
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
