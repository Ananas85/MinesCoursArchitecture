package tp2;

public class IndexFull extends Index {

    protected Item first;
    protected Index listOfIndex;


    public IndexFull(Item first)
    {
        this.first = first;
        this.listOfIndex = new IndexEmpty();
    }

    public IndexFull(Item first, IndexFull listOfItem)
    {
        this.first = first;
        this.listOfIndex = listOfItem;
    }

    public Index addItem(Item item)
    {
        return new IndexFull( item, this );
    }

    public Index getListOfIndex()
    {
        return this.listOfIndex;
    }

    @Override
    public int size() {
        return 1 + this.listOfIndex.size();
    }

    @Override
    public int accept( Visitor v ) {
        return v.visit( this );
    }

    @Override
    public String toString() {
        return "Index : " + this.first.toString() + " \n " + this.listOfIndex.toString();
    }
}
