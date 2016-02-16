import java.io.File;
import java.net.URI;

public class FElement extends File implements Element {

    public FElement(String pathname) {
        super(pathname);
    }

    public FElement(String parent, String child) {
        super(parent, child);
    }

    public FElement(File parent, String child) {
        super(parent, child);
    }

    public FElement(URI uri) {
        super(uri);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}

