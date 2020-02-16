package com.kj.application.annoationconfig.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.kj.application.annoationconfig.javaconfig.beans.CompmentOne;
import com.kj.application.annoationconfig.javaconfig.beans.CompmentTwo;
import com.kj.application.annoationconfig.javaconfig.beans.Dependency;

/**
 *  @Import 注解允许从另一个配置类中加载 @Bean 定义。考虑 ConfigA 类，如下所示：
 */
@Import(ConfigureTwo.class)
@Configuration
public class Configure {

    @Bean
    public CompmentOne compmentOne() {
       return new CompmentOne();
    }

    /**
     *  注入 Bean 的依赖性
     *  当 @Beans 依赖对方时，表达这种依赖性非常简单，只要有一个 bean 方法调用另一个，如下所示：
     *  @return
     */

    @Bean
    public CompmentTwo compmentTwo() {
        return new CompmentTwo(dependency());
    }

    public Dependency dependency() {
        return  new Dependency();
    }
}
