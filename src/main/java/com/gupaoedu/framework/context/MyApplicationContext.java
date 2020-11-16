package com.gupaoedu.framework.context;

import com.gupaoedu.framework.bean.support.MyBeanDefinitionReader;

public class MyApplicationContext {
    MyBeanDefinitionReader beanDefinitionReader;

    public MyApplicationContext(String... configLocation) {
        beanDefinitionReader = new MyBeanDefinitionReader(configLocation);

        beanDefinitionReader.loadBeanDefinition();
    }
}
