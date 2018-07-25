# java 类加载机制笔记
#### 类加载机制
[Evading Anti-Virus by using dynamic code generation and reflection](http://docs.ioin.in/writeup/threathunter.org/_topic_5a49570eec721b1f1966f30f/index.html)
* @frozenme大佬文章中已经介绍的很详细，我这里就不写了，这里只是保存一下自己的测试代码，代码完成了
1.编译一个java类并重定向输出到内存中。
2.通过自定义的classloader来加载类对象，并通过反射调用类的main方法。
![](https://github.com/kevien/javacode/blob/master/ClassLoader/screenshot/1.png)
