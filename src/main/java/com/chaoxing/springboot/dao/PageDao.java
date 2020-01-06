package com.chaoxing.springboot.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class PageDao {

    @Resource
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public void test(){
       List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from news");
       list.forEach(map -> {
           System.out.println(map.get("title"));
       });
    }
}
