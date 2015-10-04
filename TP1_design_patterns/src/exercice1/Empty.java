package exercice1;

import java.util.ArrayList;

public class Empty<T> extends List<T> {

    public Boolean isEmpty()
    {
        return true;
    }

    public int length()
    {
        return 0;
    }

    @Override
    public NotEmpty<T> putLast(T elt) {
        return new NotEmpty<T>(elt);
    }

    public List<T> reverse()
    {
        return this;
    }

    @Override
    public ArrayList<T> toArrayList() {
        return new ArrayList<T>();
    }
}
