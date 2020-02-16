### Spring @Autowired 注释 遵循byType 的予以

* Setter 方法中的 @Autowired  
可以在 XML 文件中的 setter 方法中使用 @Autowired 注释来除去 元素。当 Spring遇到一个在 setter 方法中使用的 @Autowired 注释，它会在方法中视图执行 byType 自动连接。

* 属性中的 @Autowired  
你可以在属性中使用 @Autowired 注释来除去 setter 方法。当时使用 为自动连接属性传递的时候，Spring 会将这些传递过来的值或者引用自动分配给那些属性。

* 构造函数中的 @Autowired  
你也可以在构造函数中使用 @Autowired。一个构造函数 @Autowired 说明当创建 bean 时，即使在 XML 文件中没有使用 元素配置 bean ，构造函数也会被自动连接


