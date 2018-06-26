#### About
* JNDI rmi 
RMI 是 Remote Method Invocation 的简称，是 J2SE 的一部分，能够让程序员开发出基于 Java 的分布式应用。一个 RMI 对象是一个远程 Java 对象，可以从另一个 Java 虚拟机上（甚至跨过网络）调用它的方法，可以像调用本地 Java 对象的方法一样调用远程对象的方法，使分布在不同的 JVM 中的对象的外表和行为都像本地对象一样。

对于任何一个以对象为参数的 RMI 接口，你都可以发一个自己构建的对象，迫使服务器端将这个对象按任何一个存在于 class path 中的可序列化类来反序列化。

RMI 的传输 100% 基于反序列化。

注意：在jdk1.8环境安全性增强，默认的 com.sun.jndi.rmi.object.trustURLCodebase 状态是false，所以需要设置成True，或者换用低版本的jdk