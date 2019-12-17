package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype") //每次调用都会创建新的Bean
public class AlphaService {
    @Autowired
    AlphaDao alphaDao;
    public String find(){
        return alphaDao.select();
    }
    public AlphaService(){
        System.out.println("初始化AlphaService");
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化Service");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }
}
