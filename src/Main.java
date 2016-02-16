import java.io.File;
public class Main {
    public static void main(String[] args) {
       /* E1 a = new E1();
        V1 someGuy = new V1();

        a.accept(someGuy);*/
        String dir = "C:\\Users\\User\\Desktop\\snowflakes\\check";
        FileElement someFileElement = new FileElement(dir);
        FileVisitor someVisitor = new FileVisitor();

        someFileElement.accept(someVisitor);
    }




}




