
class E1 implements Element {
    public void accept(Visitor v) {
        v.visit(this);
    }
}