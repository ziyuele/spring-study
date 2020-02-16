## Spring JSR-250 注释
Spring还使用基于 JSR-250 注释，它包括 @PostConstruct， @PreDestroy 和 @Resource 
注释。因为你已经有了其他的选择，尽管这些注释并不是真正所需要的，但是关于它们仍然让我给出一个简短的介绍。  


* @PostConstruct 和 @PreDestroy 注释：  

为了定义一个 bean 的安装和卸载，我们使用 init-method 和/或 destroy-method 参数简单的声明一下 。init-method 属性指定了一个方法，该方法在 bean 
的实例化阶段会立即被调用。同样地，destroy-method 指定了一个方法，该方法只在一个 bean 从容器中删除之前被调用。  


* @Resource 注释：  

你可以在字段中或者 setter 方法中使用 @Resource 注释，它和在 Java EE 5 中的运作是一样的。@Resource 注释使用一个 ‘name’ 属性，该属性以一个 bean 名称的形式被注入。你可以说，它遵循 
by-name 自动连接语义，如下面的示例所示：  


