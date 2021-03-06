package com.manikanta.springboot.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static Integer userCount = 1;

    static {
        users.add(new User(userCount++, "Mani", new Date()));
        users.add(new User(userCount++, "Mahesh", new Date()));
        users.add(new User(userCount++, "Arjun", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (Objects.isNull(user.getId())) {
            user.setId(userCount++);
        }
        users.add(user);

        return user;
    }

    public User findById(Integer id) {
        for (User user : users) {
            if (id.equals(user.getId())) {
                return user;
            }
        }

        return null;
    }

    public User deleteById(Integer id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (id.equals(user.getId())) {
                iterator.remove();
                return user;
            }
        }

        return null;
    }
}
