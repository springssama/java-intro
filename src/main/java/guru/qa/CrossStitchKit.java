package guru.qa;

public class CrossStitchKit
{

    String name;
    int numberOfColors;
    float sizeHeight;
    float sizeWidth;
    int count;
    Floss flosses[];

    public String getName() {
        return name;
    }

    public int getNumberOfStitches() {
        int stitchesHeight = (int) sizeHeight * count;
        int stitchesWidth = (int) sizeWidth * count;
        return (stitchesHeight * stitchesWidth); //число крестиков в вышивке не может быть дробным: count показывает сколько крестиков в одном дюйме
    }

    public CrossStitchKit(String name, int numberOfColors, float sizeHeight, float sizeWidth, int count, Floss[] flosses) {
        this.name = name;
        this.numberOfColors = numberOfColors;
        this.sizeHeight = sizeHeight;
        this.sizeWidth = sizeWidth;
        this.count = count;
        this.flosses = flosses;
    }
}
