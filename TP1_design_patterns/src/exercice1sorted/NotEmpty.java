package exercice1sorted;

import java.util.ArrayList;

public class NotEmpty extends List {

    protected List tail;

    protected Integer head;

    public NotEmpty(Integer head )
    {
        this.head = head;
        this.tail = new Empty();
    }

    public NotEmpty(Integer head, List tail) {
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
    public NotEmpty putLast(Integer elt) {
        return new NotEmpty(this.head, this.tail.putLast(elt));
    }

    @Override
    public List reverse() {
        return this.tail.reverse().putLast(this.head);
    }

    public List insert(Integer element)
    {
        if ( element <= this.head )
        {
            return new NotEmpty(element, this);
        }

        return new NotEmpty( this.head, this.tail.insert(element));
    }

    public List sort()
    {
        return this.tail.sort().insert(this.head);
    }

    @Override
    public ArrayList toArrayList() {
        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(head);
        arrayList.addAll(this.tail.toArrayList());
        return arrayList;
    }
}
