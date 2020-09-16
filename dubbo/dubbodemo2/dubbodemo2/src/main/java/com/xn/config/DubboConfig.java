package com.xn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2018/9/29.
 */

@Configuration
@PropertySource("classpath:application.properties")
@ImportResource({ "classpath:applicationContext-dubbo.xml" })
public class DubboConfig {

}
