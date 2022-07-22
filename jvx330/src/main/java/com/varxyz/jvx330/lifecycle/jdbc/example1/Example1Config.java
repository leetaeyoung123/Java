package com.varxyz.jvx330.lifecycle.jdbc.example1;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.varxyz.jvx330.lifecycle.DataSourceConfig;

@Configuration
@Import(DataSourceConfig.class)
public class Example1Config {

}
