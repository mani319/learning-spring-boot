package com.manikanta.springboot.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Manikanta Tummalapenta on 04/07/20
 */
@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue retrieveSomeBean() {
        SomeBean someBean =  new SomeBean("val1", "val2", "val3");

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("s1", "s2");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(someBean);
        mapping.setFilters(filters);

        return mapping;
    }

    @GetMapping("/filtering-list")
    public MappingJacksonValue retrieveSomeBeans() {
        List<SomeBean> list = Arrays.asList(new SomeBean("val1", "val2", "val3"),
                new SomeBean("val1", "val2", "val3"));

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("s3", "s2");
        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("SomeBeanFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(list);
        mapping.setFilters(filters);

        return mapping;
    }
}
