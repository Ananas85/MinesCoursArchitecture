package tp2;

public class PageFull extends Pages {

    protected Integer first;
    protected Pages listPages;

    public PageFull( Integer first, Pages listPages )
    {
        this.first = first;
        this.listPages = listPages;
    }

    public Integer getFirst() {
        return first;
    }

    public Pages getListPages() {
        return listPages;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toStringAux() {
        return this.getFirst() + ", " + this.getListPages().toStringAux();
    }

    @Override
    public Pages insert( int p ) {
        if (p == this.getFirst()) {
            return this;
        }

        if (p < this.getFirst()) {
            return this.add(p);
        }

        return (this.getListPages().insert(p)).add(this.getFirst());
    }

    @Override
    public Pages sort() {
        if (this.listPages.isEmpty()) {
            return this;
        } else {
            return this.listPages.sort().insert(this.first);
        }

    }

    @Override
    public boolean find( int p ) {
        return false;
    }
}
