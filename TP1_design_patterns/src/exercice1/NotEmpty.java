package exercice1;

import java.util.ArrayList;

public class NotEmpty<T> extends List<T> {

    protected List<T> tail;

    protected T head;

    public NotEmpty(T head )
    {
        this.head = head;
        this.tail = new Empty<T>();
    }

    public NotEmpty(T head, List<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public Boolean isEmpty() {
        return this.length() == 0;
    }

    @Override
    public int length() {
        return 1 + this.tail.length();
    }

    @Override
    public NotEmpty<T> putLast(T elt) {
        return new NotEmpty<T>(this.head, this.tail.putLast(elt));
    }

    @Override
    public List<T> reverse() {
        return this.tail.reverse().putLast(this.head);
    }

    @Override
    public ArrayList<T> toArrayList() {
        ArrayList<T> arrayList = new ArrayList<T>();
        arrayList.add(head);
        arrayList.addAll(this.tail.toArrayList());
        return arrayList;
    }
}
