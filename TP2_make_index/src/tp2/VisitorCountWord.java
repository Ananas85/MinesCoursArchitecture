package tp2;

public class VisitorCountWord extends Visitor {
    @Override
    public int visit( IndexFull whi ) {
        return 1 + whi.getListOfIndex().accept( this );
    }

    @Override
    public int visit( IndexEmpty wi ) {
        return 0;
    }
}
