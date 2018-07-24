#### 创建对象的几种方式
* 通过new关键字。
* 通过Class类的newInstance()方法。
* 通过Constructor类的newInstance()方法。
* 通过类的Clone()方法。(需要类实现Cloneable接口并在类中重写Clone方法)
```
1. clone是Object类的一个由protected和native修饰的方法，由native修饰，说明clone方法是由c++实现的，protected修饰，说明不是同一个包下或不是子孙类无法调用此方法。如果我们要想调用clone方法，一般要重写clone方法。在重写的方法中，一般这样写Object objiect = super.clone();

2.在重写了clone方法后不是就可以调用clone方法了，还需要这个类实现Cloneable接口，Cloneable接口里面什么方法都没有，是一个标记接口。

3.如果在clone方法里面只是写Object objiect = super.clone();那么这个clone方法是对当前对象的一种浅拷贝。
```
* 通过反序列化。(需要实现Serializable接口)
#### 对比
* 这几种方法中 前三种类的构造函数是会被调用，后两种不会。
#### Reference
* <https://dzone.com/articles/5-different-ways-to-create-objects-in-java-with-ex>