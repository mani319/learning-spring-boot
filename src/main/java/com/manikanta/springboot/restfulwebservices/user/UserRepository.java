package com.manikanta.springboot.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Manikanta Tummalapenta on 06/07/20
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
