package iterateur;

public interface Iterator<T> {

    /**
     * To init the iterator
     */
    public void first();

    /**
     * Got to the next
     */
    public void next();

    /**
     * Know we have all iterated
     * @return
     */
    public boolean isDone();

    /**
     * Return the current Element
     *
     * @return T
     */
    public T current();
}
