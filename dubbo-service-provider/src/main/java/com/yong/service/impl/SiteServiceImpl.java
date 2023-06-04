package com.yong.service.impl;

import com.yong.service.SiteService;

public class SiteServiceImpl implements SiteService {
    @Override
    public String getName(String name) {
        return "hello" + name;
    }
}
