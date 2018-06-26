#### 通过JNDI方式加载远程class文件进行攻击
* 注意 在jdk1.8环境安全性增强，默认的 com.sun.jndi.rmi.object.trustURLCodebase 状态是false，所以需要设置成True，或者换用低版本的jdk 进行java文件的编译