package tp2;

public class Main {
    public static void main( String[] args ) {
        Item item = new Item( "plop" );
        System.out.println(item.getWord());
        System.out.println( item.listOfPages );

        item.insertPages( 7 );
        System.out.println( item.listOfPages );
        item.insertPages( 8 );
        System.out.println(item.listOfPages);

        Item two = new Item( "yoyoyo" );
        two.insertPages( 3 );
        two.insertPages( 4 );
        Index index = new IndexEmpty();
        System.out.println(index);

        index = index.addItem( item );
        index = index.addItem( two );
        System.out.println( index );

        Visitor countWord = new VisitorCountWord();
        System.out.println(" nombre de mot : " + index.accept( countWord ));
    }
}
