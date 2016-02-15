/**
 * Created by Денис on 15.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Element1 a = new Element1();
        Element2 b = new Element2();
        V1 someGuy = new V1();

        a.accept(someGuy);
        b.accept(someGuy);

    }




}
//Интерфейсы
interface Visitor {
    void visit(Element1 e);
    void visit(Element2 e);
}

interface Element {
    void accept(Visitor v);
}
// Элементы
class Element1 implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }
}
class Element2 implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }
}
//Посетители
class V1 implements Visitor {
    public void visit(Element1 e) {
        System.out.println("посетитель класса V1 посетил объект класса Element1"); //smth
    }
    public void visit(Element2 e) {
        System.out.println("посетитель класса V1 посетил объект класса Element2"); //smth
    }

}


