package exercice1sorted;

import java.util.ArrayList;

public class Empty extends List {

    public Boolean isEmpty()
    {
        return true;
    }

    public int length()
    {
        return 0;
    }

    @Override
    public NotEmpty putLast(Integer elt) {
        return new NotEmpty(elt);
    }

    public List reverse()
    {
        return this;
    }

    @Override
    public ArrayList toArrayList() {
        return new ArrayList<Integer>();
    }

    @Override
    public List insert(Integer element)
    {
        return new NotEmpty(element);
    }

    public List sort()
    {
        return this;
    }
}
