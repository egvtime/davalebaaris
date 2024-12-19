package Davaleba1;

public class ScifiBook extends Book {
    String ScienceField;

    public ScifiBook(String name, int pages, boolean hardCover, String scienceField) {
        super(name, pages, hardCover);
        ScienceField = scienceField;
    }
}
