package tp2;

public class IndexEmpty extends Index {
    public IndexEmpty() { }

    @Override
    public Index addItem( Item item ) {
        return new IndexFull( item );
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int accept( Visitor v ) {
        return v.visit( this );
    }

    @Override
    public String toString() {
        return "";
    }

}
