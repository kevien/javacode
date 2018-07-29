#### java工具类collection
* 官方自带的util工具类，没什么好说的,提供了基础的集合类以及集合操作类。
![](https://github.com/kevien/javacode/blob/master/Collections/pic/commoncollectionsinterface.png)
#### apache common-collections
* Commons Collections包为Java标准的Collections API提供了补充。在java标准的Colllections基础上对常用的数据结构操作进行了很好的封装、抽象和补充，既保证性能，同时也能大大简化代码。但类似功能在java8的Stream API中提供了支持(待测)。
#### 我所理解的java collections
* 其实就是集合类的一些扩展和操作，这些集合不限List、Map等，而这些集合里面的元素可能是一些复杂的对象，官方标准API因为某些原因没提供，而在第三方包common-collections中提供了支持。
* 笔者在测试的时候发现大版本的3和4，变化还是有些多的。
#### Reference
* [javacollections_maptypes](http://www.vogella.com/tutorials/JavaCollections/article.html#javacollections_maptypes)
* [三方包系列-倚天剑：apache-common-collections](https://www.jianshu.com/p/c3c3ab2bad8d)
* [Apache Commons Collections包的学习之Map的简单使用](http://blinkfox.com/apache-commons-collectionsbao-de-xue-xi/)
* [apache-commons-collection-utils](http://www.baeldung.com/apache-commons-collection-utils)