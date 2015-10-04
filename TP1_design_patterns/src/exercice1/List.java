package exercice1;

import java.util.ArrayList;

public abstract class List<T> {

    public abstract Boolean isEmpty();

    public abstract int length();

    public abstract NotEmpty putLast(T elt);

    public abstract List reverse();

    public abstract ArrayList<T> toArrayList();
}
