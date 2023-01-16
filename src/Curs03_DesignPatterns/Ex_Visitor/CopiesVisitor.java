package Curs03_DesignPatterns.Ex_Visitor;

public class CopiesVisitor implements Visitor {
    private int numberOfCopies;

    @Override
    public void visit(Book book) {
        numberOfCopies += book.getNrOfCopies();
    }

    @Override
    public void visit(Film film) {
        numberOfCopies += film.getNrOfCopies();
    }

    @Override
    public void visit(Album album) {
        numberOfCopies += album.getNumberOfCopies();
    }

    @Override
    public String toString() {
        return "CopiesVisitor{" +
                "numberOfCopies=" + numberOfCopies +
                '}';
    }
}