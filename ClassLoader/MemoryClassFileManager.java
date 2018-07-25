import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.util.ArrayList;

public class MemoryClassFileManager extends ForwardingJavaFileManager {

    private ArrayList<ClassJavaFileObject> classes;

    /**
     * Creates a new instance of ForwardingJavaFileManager.
     *
     * @param fileManager delegate to this file manager
     */
    public MemoryClassFileManager(JavaFileManager fileManager) {
        super(fileManager);
        classes = new ArrayList<>();
    }

    public ArrayList<ClassJavaFileObject> getClasses() {
        return classes;
    }

    @Override
    public JavaFileObject getJavaFileForOutput(Location location, String className,
                                               JavaFileObject.Kind kind, FileObject sibling) throws IOException {
        ClassJavaFileObject classJavaFileObject = new ClassJavaFileObject(className);
        classes.add(classJavaFileObject);

        return classJavaFileObject;
    }
}