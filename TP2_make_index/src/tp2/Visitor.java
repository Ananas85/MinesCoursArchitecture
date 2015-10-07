package tp2;

public abstract class Visitor {
    /**
     * @param whi
     * @return an int
     */
    public abstract int visit(IndexFull whi);

    /**
     * @param wi
     * @return an int
     */
    public abstract int visit(IndexEmpty wi);
}
