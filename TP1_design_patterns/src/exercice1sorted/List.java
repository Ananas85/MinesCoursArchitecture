package exercice1sorted;

import java.util.ArrayList;

public abstract class List {

    public abstract Boolean isEmpty();

    public abstract int length();

    public abstract NotEmpty putLast(Integer elt);

    public abstract List reverse();

    public abstract ArrayList toArrayList();

    public abstract List insert(Integer element);

    public abstract List sort();
}
