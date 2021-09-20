package guru.qa;

public class Main {
    public static void main(String[] args) {
        int numberOfColors = 5;
        Floss[] flossesForKit = new Floss[numberOfColors];
        flossesForKit[0] = new Floss(1, 1, "White", "DMC");
        flossesForKit[1] = new Floss(3, 364, "Blue", "DMC");
        flossesForKit[2] = new Floss(2, 21, "Blue", "Metallic");
        flossesForKit[3] = new Floss(2, 456, "Green", "Anchor");
        flossesForKit[4] = new Floss(4, 884, "Black", "DMC");
        CrossStitchKit firstKit = new CrossStitchKit("Sea Sunset", numberOfColors, 30, 40, 16, flossesForKit);
        firstKit.flosses[3].changeFlossType("DMC");
        int numberOfStitches = firstKit.getNumberOfStitches();
        System.out.println("Number of stitches in this kit " + numberOfStitches);
    }
}
