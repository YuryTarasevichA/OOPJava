package org.example.Lesson6.Task1;

public class ElectronBook extends Book{
    private int weite;
    private FormatElectronBook format;

    public ElectronBook(String name, String addres,
                        Book genre, int weite,
                        FormatElectronBook format) {
        super(name, addres, genre);
        this.weite = weite;
        this.format = format;
    }

    public int getWeite() {
        return weite;
    }

    public void setWeite(int weite) {
        this.weite = weite;
    }

    public FormatElectronBook getFormat() {
        return format;
    }

    public void setFormat(FormatElectronBook format) {
        this.format = format;
    }
}
