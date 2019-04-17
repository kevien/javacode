import javax.tools.JavaFileObject;
import java.io.IOException;
import java.net.URI;

import javax.tools.SimpleJavaFileObject;
public class StringJavaFileObject extends SimpleJavaFileObject {

    private String code = null;

    public StringJavaFileObject(String className) {
        super(URI.create(String.format("string:///%s.java", className)), JavaFileObject.Kind.SOURCE);
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
        return code;
    }
}