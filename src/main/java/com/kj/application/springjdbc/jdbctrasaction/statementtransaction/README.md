### Spring 声明式事务管理

声明式事务管理方法允许你在配置的帮助下而不是源代码硬编程来管理事务。这意味着你可以将事务管理从事务代码中隔离出来。你可以只使用注释或基于配置的 XML 来管理事务。 bean 配置会指定事务型方法。下面是与声明式事务相关的步骤：

  * 我们使用标签，它创建一个事务处理的建议，同时，我们定义一个匹配所有方法的切入点，我们希望这些方法是事务型的并且会引用事务型的建议。

  * 如果在事务型配置中包含了一个方法的名称，那么创建的建议在调用方法之前就会在事务中开始进行。

  * 目标方法会在 try / catch 块中执行。
  * 如果方法正常结束，AOP 建议会成功的提交事务，否则它执行回滚操作。

