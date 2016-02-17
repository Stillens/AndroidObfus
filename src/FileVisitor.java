import java.io.File;
//import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileVisitor implements Visitor {
    int depth = 1;
    public ArrayList<String> javaFileList = new ArrayList<>();
    public void visit(Element e) {
        if (e instanceof FileElement) { //Проверяем, принадлежит ли посещённый объект классу FileElement
            File[] files = ((FileElement) e).listFiles(); //Приводим явно е к FileElement и вызываем listFiles();


            for (int i = 0; i < files.length; i++) {

                if (files[i].isDirectory()) { //Если директория, то рекурсивно пробегаем
                    FileElement innerDir = new FileElement(files[i].toString()); //Объект директории
                    visit(innerDir); // Рекурсия тут
                }
                else {
                    if (files[i].getName().toLowerCase().endsWith(".java")) { //нам нужны только *.java файлы
                        javaFileList.add(files[i].getAbsolutePath());
                        System.out.println(files[i].getAbsolutePath());
                    }
                }

            }


        }
    }




}
