import java.io.File;
import java.net.URI;

public class FileElement extends File implements Element {

    public FileElement(String pathname) {
        super(pathname);
    }

    public FileElement(String parent, String child) {
        super(parent, child);
    }

    public FileElement(File parent, String child) {
        super(parent, child);
    }

    public FileElement(URI uri) {
        super(uri);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}

