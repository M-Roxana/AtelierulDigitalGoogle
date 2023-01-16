package Curs03_DesignPatterns.Ex_Visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Film film);
    void visit(Album album);
}
