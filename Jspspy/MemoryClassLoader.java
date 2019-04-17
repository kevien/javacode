import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MemoryClassLoader extends ClassLoader {

    private MemoryClassFileManager classFileManager;

    public MemoryClassLoader(MemoryClassFileManager classFileManager) {
        super(MemoryClassLoader.class.getClassLoader());

        this.classFileManager = classFileManager;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        for (ClassJavaFileObject classObject:
                classFileManager.getClasses()) {
            // 这里的类名通过 / 开头，所以需要跳过该前缀
            if (classObject.getName().substring(1).equals(name)) {
                byte[] bytes = classObject.getBytes();
                return defineClass(name, bytes, 0, bytes.length);
            }
        }
        return null;
    }



}