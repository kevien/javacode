import javax.tools.SimpleJavaFileObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

public class ClassJavaFileObject extends SimpleJavaFileObject {

    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();

    public ClassJavaFileObject(String className) {
        super(URI.create(String.format("bytes:///%s", className)), Kind.CLASS);
    }

    @Override
    public OutputStream openOutputStream() throws IOException {
        return baos;
    }

    public byte[] getBytes() {
        return baos.toByteArray();
    }
}