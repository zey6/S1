import java.util.Scanner;

/**
 * Skill Builder 3
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;




        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();



        // TODO: Calculate and output the wall's area
        wallArea = wallHeight * wallWidth;
        System.out.printf("Wall Area: %.0f square feet\n" + wallArea);
        gallonsPaintNeeded = wallArea/ squareFeetPerGallons;
        System.out.printf("Paint needed; %.0f gallons\n"+ gallonsPaintNeeded);
        cansNeeded = (int)(gallonsPaintNeeded /gallonsPerCan);
        System.out.printf("Cans needed: %d 1 can\n",cansNeeded);


        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

    }
}
