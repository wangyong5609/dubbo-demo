package com.yong;

import com.yong.service.SiteService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        SiteService service =  (SiteService)context.getBean("siteService");
        System.out.println(service.getName("yong"));
    }
}