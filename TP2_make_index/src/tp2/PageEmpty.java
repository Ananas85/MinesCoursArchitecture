package tp2;

public class PageEmpty extends Pages {

    public PageEmpty(){}

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public String toStringAux() {
        return "";
    }

    @Override
    public Pages insert( int p ) {
        return this.add(p);
    }

    @Override
    public Pages sort() {
        return null;
    }

    @Override
    public boolean find( int p ) {
        return false;
    }
}
