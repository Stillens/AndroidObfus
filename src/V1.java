
class V1 implements Visitor {
public void visit(Element e) {
        if (e instanceof E1) {
            System.out.println("посетитель класса V1 посетил объект класса " + e.getClass().getName()); //smth
        }
 }


}
