package guru.qa;

public class Floss {
    int numberOfThreads;
    int colorNumber;
    String colorName;
    String flossType;

    void changeFlossType(String newFlossType){
        this.flossType = newFlossType;
    }

    public Floss(int numberOfThreads, int colorNumber, String colorName, String flossType) {
        this.numberOfThreads = numberOfThreads;
        this.colorNumber = colorNumber;
        this.colorName = colorName;
        this.flossType = flossType;
    }
}
