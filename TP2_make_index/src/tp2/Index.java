package tp2;

public abstract class Index {
    public abstract Index addItem(Item item);
    public abstract int size();
    public abstract int accept(Visitor v);
}
