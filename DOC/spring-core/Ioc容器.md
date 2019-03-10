## 核心技术
version 5.1.5.RELEASE

---

**参考文档的这一部分涵盖了Spring使用的完整技术**

- spring 最重要的Ioc容器(Inversion of Contrl)，spring的Ioc框架在面向切面编程(aop)得到了广泛的应用
成功的解决了java企业编程的过程中有aop需求的近80%的痛点
- Ioc 还提供了Spring与AspectJ集成的覆盖（目前是最丰富的特性），在Java企业空间中也提供了最成熟的AOP实现。

### 1. Iocr容器

本章介绍Spring的Ioc 容器

#### 1.1 Ioc 容器的和beans的介绍

本章介绍了spring控制反转(Ioc)的实现, 在spring里, Ioc也被称为依赖注入(DI dependency injection), 这是一个过程, 通过对象构造函数参数定义其依赖(即要和当前对象一起工作的其他对象), 传入的参数可以是一个工厂方法， 或者通过构造类或者属性配置引入, 然后容器在创建bean的时候注入这些依赖项, 这个过程可以理解为bean创建的一个逆向的过程, 通过构造参数或者引入依赖的方式实现其他依赖的实例化  


最基本的ioc容器是```org.springframework.beans```和```org.springframework.context``` 两个package, ```BeanFactory``` 接口提供一个可以管理任何对象的高级配置机制, ```ApplicationContext``` 是 ```BeanFactory```的一个子接口， 这个接口增加了:  

- 更简单的spring aop的集成
- 消息资源处理(用在国际化)
- 事件发布
- 应用层特定的上下文比如用在web应用的```WebApplicationContext```

简而言之, BeanFactory 提供了框架的基本配置和功能, 同时```ApplicationContext```增加了更多的企业级功能, ```ApplicationContext```是```BeanFactory```的一个完整的超集, ```ApplicationContext```是专门用于描述Spring的Ioc容器, 更多有关使用```BeanFactory```而不是```ApplicationContext```内容, 还请参阅![BeanFactory](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#beans-beanfactory)  

在Spring中，构成应用程序主干并由SpringIOC容器管理的对象称为bean, bean是一个由SpringIOC容器实例化、组装和管理的对象。或者说, bean只是应用程序中许多对象中的一个。bean以及它们之间的依赖关系反映在容器使用的配置元数据中。

#### 1.2 容器概述

接口```org.springframework.context.ApplicationContext``` 表示Spring IoCd的容器, 负责容器的实例化和配置, 并用来组装Beans, 容器通过读取关于实例化, 配置和组装的对象指令， 配置元数据通过XML, Java注解或者代码来表示, 它使应用程序的对象依赖关系变的丰富化  

接口```ApplicationContext``` 实现的几个类由Spring提供, 在一个独立的应用程序中, 创建```ClassPathXMLApplicationContex```或者```FileSystemXMLApplicationContext```的实例很常见, 虽然说XML是定义元数据配置的传统方式, 但是也可以通过Java注解或者少量的XML配置元数据来制定  

在大多的应用场景中, 显式用户的代码不需要实例化IoC容器或者一个实例, 比如说在一个web应用场景中, 一个简单的模版描述配置, 使用XML就够了(参见 ![ApplicationContext 的实例化](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#context-create)) 如果你使用![Spring-Tool-suite](https://spring.io/tools) (一个基于eclipse的开发环境), 你可以稍微点点鼠标就很容易的的创建应用模版  

下面的这个图展示了Spring是如何工作的一个视图, 你的应用程序类和配置结合在一起, 这样在ApplicationContext 创建并完成初始化后, 你就拥有了一个完整配置的可以执行的应用程序

![avatar](../../pic/container-magic.png)


##### 1.2.1 配置MetaData

如上图展示， Spring IoC容器使用一种形式配置元数据, 此配置元数据由开发人员配置, 以告知Spring容器如何完成容器的实例化, 配置和组装应用程序中的对象

在传统的角度讲, 配置元数据是使用直观的XML格式展现的, 这是本章的大部分内容, 用来介绍SpringIoC的相关概念和特性

```
基于XML的元数据配置不是唯一的配置形式， 容器和配置格式是完全分开的，
现在, 许多的开发人员选择基于Java配置来实现Spring的应用程序
```

Sping 支持的其他格式的元数据配置如:  

- ![基于注解的元数据配置](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#beans-annotation-config): Spring 2.5 引入的配置格式 配置元数据
- ![基于Java配置](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#beans-java): 从Spring3.0 开始，SpringJavaConfig 项目提供了许多特性成为了Spring框架核心的一部分, 开发者可以使用Java而不是XML文件来定义外部依赖的Bean， 想要使用这些新功能, 请参见 ```@configuration```, ```@Bean```, ```@dependson``` ```@import``` 注解。  

Sping 配置由至少一个Bean定义组成, 在基于XML的配置中使用```<bean></bean>```去配置, 在Java配置中 通常使用 ```@Bean``` 注解注释该方法， 并使用```@configuration``` 去注释该类。  

这些Bean定义了组成应用程序的实际对象。 通常定义服务层对象， 数据访问对象(DAO), 表示对象(eg. Sturts操作实例), 基础结构对象(eg. Hibernate 会话行为), JMS队列等, 通常, 我们不会在容器中配置细力度的domain对象, 因为DAO 和业务逻辑通常负责创建和加载domain, 但是你可以使用Spring和AspectJ的集成来配置IoC容器。 参见![使用AspectJ配置Spring domain](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#aop-atconfigurable)  

下面的案例展示了使用XML配置元数据:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="..." class="...">   
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <bean id="..." class="...">
        <!-- collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions go here -->
</beans>
```
- id 属性是标识单个bean定义的字符串
- class 属性定义了Bean类型及其使用的类名

id属性的值指的是协作对象, 这个实例没有显示用于协作的对象的XML, 具体信息参见： ![dependicies](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#beans-dependencies)

##### 1.2.2 实例话一个容器

容器的构造方式支持从多种外部资源配置加载, 例如本地文件系统， java CLASSPATH等  

```Java
WebApplicationContext context = new ClassPathXMLApplicationContex("services.xml", "doo.xml")
```

```
在了解Spring IoC容器之后, 你可能想要了解更多关于Spring的资源抽象， 这种为URI语法定义的
读取输入流的一种机制 参见![Application Contexts and Resource Paths.](https://docs.spring.io/spring/docs/5.1.5.RELEASE/spring-framework-reference/core.html#resources-app-ctx)
```

下面的这个例子展示了服务层的配置文件：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- services -->

    <bean id="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
        <property name="accountDao" ref="accountDao"/>
        <property name="itemDao" ref="itemDao"/>
        <!-- additional collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions for services go here -->

</beans>
```

这个是dao层的配置文件：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="accountDao"
        class="org.springframework.samples.jpetstore.dao.jpa.JpaAccountDao">
        <!-- additional collaborators and configuration for this bean go here -->
    </bean>

    <bean id="itemDao" class="org.springframework.samples.jpetstore.dao.jpa.JpaItemDao">
        <!-- additional collaborators and configuration for this bean go here -->
    </bean>

    <!-- more bean definitions for data access objects go here -->

</beans>
```
