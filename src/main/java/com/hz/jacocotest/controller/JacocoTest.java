package com.hz.jacocotest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacocoTest {

    @RequestMapping(value = "/cosy/test", method = RequestMethod.POST)
    public int motheOne(int a,int b){
        if (a!=0 || b!=0)
        {
            if (a >3 ||b>3){
                int c=a+b;
                return c;
            }
        }
        return 0;
    }

    @RequestMapping(value = "/cosy/test1", method = RequestMethod.POST)
    public String motheTwo(String a){
        if (a==null){
            System.out.print("a不能是空");
        }
        return  a;
    }
}
