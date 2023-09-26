package org.example.Lesson6.Task1;

public class ElectronBook extends Book{
    private int weight;
    private FormatElectronBook format;


    public ElectronBook(String name, String auter,
                        BookGenere genre, int weight,
                        FormatElectronBook format) {
        super(name, auter, genre);
        this.weight = weight;
        this.format = format;
    }


    @Override
    public String toString() {
        return "ElectronBook{" +
                "format=" + format +
                ", weight=" + weight +
                "} " + super.toString();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public FormatElectronBook getFormat() {
        return format;
    }

    public void setFormat(FormatElectronBook format) {
        this.format = format;
    }
}
