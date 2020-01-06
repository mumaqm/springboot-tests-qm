package com.chaoxing.springboot.service;

import com.chaoxing.springboot.dao.PageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {

    @Autowired
    private PageDao pageDao;

    public void test(){
        pageDao.test();
    }
}
