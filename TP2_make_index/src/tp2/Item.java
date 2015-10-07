package tp2;

public class Item {
    protected String word;
    protected Pages listOfPages;

    public Item(String word)
    {
        this.word = word;
        this.listOfPages = new PageEmpty();
    }

    public Item(String word, Pages listOfPages)
    {
        this.word = word;
        this.listOfPages = listOfPages;
    }

    public String getWord() {
        return word;
    }

    public Pages getListOfPages() {
        return listOfPages;
    }

    public void insertPages( int page )
    {
       this.listOfPages = this.listOfPages.insert( page );
    }

    @Override
    public String toString() {
        return word + " " + this.listOfPages.toString();
    }
}
