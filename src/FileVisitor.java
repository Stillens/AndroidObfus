import java.io.File;
import java.io.FilenameFilter;
public class FileVisitor implements Visitor {
    int depth = 1;
    public void visit(Element e) {
        if (e instanceof FileElement) { //Проверяем, принадлежит ли посещённый объект классу FileElement
            FileElement fileElement = (FileElement) e; //Если да, то приводим его явно к типу FileElement
            String dirPath = fileElement.pathname; //И тогда можно обратиться к pathname. Ведь он существует для FileElement, но не для e.
            File f = new File(dirPath);
            File[] files = f.listFiles();


            String tab = "\t"; // разделитель для визуализации иерархии
            for (int i = 1; i < depth; i++) { //складываем: какова глубина, столько раз разделитель
                tab = tab + tab;
            }
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) { //Если директория, то рекурсивно пробегаем
                    if (depth > 1) System.out.print(tab); //Табуляция, кроме первого уровня
                    depth++; //Увеличиваем уровень для элементов, которые в этой директории
                    System.out.println("" + files[i].getName() + "/"); //Название директории
                    FileElement innerDir = new FileElement(files[i].toString()); //Объект директории
                    innerDir.pathname = files[i].toString(); //Переменная с путём
                    visit(innerDir); // Рекурсия тут
                    depth--; //Поднимаемся на уровень обратно
                }
                else { if(files[i].getName().toLowerCase().endsWith(".java")) { //нам нужны только *.java файлы
                    if (depth > 1) System.out.print(tab); //Табуляция, кроме первого уровня
                    System.out.println(files[i].getName());
                    }
                }
            }


        }
    }




}
