package Davaleba1;

public class Book {
    String Name;
    int Pages;
    boolean HardCover;

    public void Read(){
        System.out.println("Im Reading " + Name);
    }

    public Book(String name, int pages, boolean hardCover) {
        Name = name;
        Pages = pages;
        HardCover = hardCover;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
    }

    public boolean isHardCover() {
        return HardCover;
    }

    public void setHardCover(boolean hardCover) {
        HardCover = hardCover;
    }
}
