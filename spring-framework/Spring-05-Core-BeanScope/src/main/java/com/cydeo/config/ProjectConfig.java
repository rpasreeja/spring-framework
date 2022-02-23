package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.cydeo.proxy","com.cydeo.service","com.cydeo.repository"})  //We put the packages where classes has a dependency or is dependent on some
public class ProjectConfig {

}
