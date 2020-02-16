### spring 基于Java配置
到目前为止，你已经看到如何使用 XML 配置文件来配置 Spring bean。如果你熟悉使用 XML 配置，那么我会说，不需要再学习如何进行基于 Java 的配置是，因为你要达到相同的结果，可以使用其他可用的配置。
基于 Java 的配置选项，可以使你在不用配置 XML 的情况下编写大多数的 Spring


#### @Configuration

带有 @Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源 [可以理解为声明了一个xml的配置]



### @Bean

@Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象相当于xml中的
```xml
<bean id="xxx" class="xxx.xxx.xxx"/>
```

