import java.io.File;
import java.net.URI;

public class FileVisitor extends File implements Element {

    public FileVisitor(String pathname) {
        super(pathname);
    }

    public FileVisitor(String parent, String child) {
        super(parent, child);
    }

    public FileVisitor(File parent, String child) {
        super(parent, child);
    }

    public FileVisitor(URI uri) {
        super(uri);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}

