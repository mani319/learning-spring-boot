package com.manikanta.springboot.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Manikanta Tummalapenta on 05/07/20
 */
@RestController
public class PersonController {

    @GetMapping("v1/person")
    public PersonV1 getPersonV1() {
        return new PersonV1("Manikanta Tummalapenta");
    }

    @GetMapping("v2/person")
    public PersonV2 getPersonV2() {
        return new PersonV2(new Name("Manikanta", "Tummalapenta"));
    }

    @GetMapping(value = "person/param", params = "version=1")
    public PersonV1 getPersonV1Param() {
        return new PersonV1("Manikanta Tummalapenta");
    }

    @GetMapping(value = "person/param", params = "version=2")
    public PersonV2 getPersonV2Param() {
        return new PersonV2(new Name("Manikanta", "Tummalapenta"));
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonV1Header() {
        return new PersonV1("Manikanta Tummalapenta");
    }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonV2Header() {
        return new PersonV2(new Name("Manikanta", "Tummalapenta"));
    }

    @GetMapping(value = "person/produces", produces = "application/com.mani.v1+json")
    public PersonV1 getPersonV1Produces() {
        return new PersonV1("Manikanta Tummalapenta");
    }

    @GetMapping(value = "person/produces", produces = "application/com.mani.v2+json")
    public PersonV2 getPersonV2Produces() {
        return new PersonV2(new Name("Manikanta", "Tummalapenta"));
    }
}
