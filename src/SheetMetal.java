/*
 *Course: SE 1021
 *Term: Winter 17/18
 *Assignment: Lab03
 *Author: Edwin Lagunes-Gonzalez
 *Date: 12/14/17
 */

import java.text.DecimalFormat;

public class SheetMetal implements Part {
    private static final double LBS_MULTIPLIER = 0.1;
    private static final double USD_MULTIPLIER = 0.50;
    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.0## lbs");
    private DecimalFormat lengthAndWidthFormat = new DecimalFormat("0.0");
    private DecimalFormat thicknessFormat = new DecimalFormat("0.00#");
    private double lengthInches;
    private double thicknessInches;
    private double widthInches;

    /**
     * 'Makes' a piece of sheet metal with the desired dimensions
     *
     * @param lengthInches    the length of the piece in inches
     * @param widthInches     the width of the piece in inches
     * @param thicknessInches the thickness of the piece in incehs
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.widthInches = widthInches;
        this.lengthInches = lengthInches;
        this.thicknessInches = thicknessInches;
    }

    public double getCost() {
        //double cost = USD_MULTIPLIER * lengthInches * widthInches * thicknessInches;
        return USD_MULTIPLIER * lengthInches * widthInches * thicknessInches;
    }

    public String getName() {
        return (lengthAndWidthFormat.format(lengthInches) + "x" + lengthAndWidthFormat.format(widthInches) + "x" + thicknessFormat.format(thicknessInches) + " sheet");
    }


    public double getWeight() {
        //double weight = LBS_MULTIPLIER * lengthInches * thicknessInches * widthInches;
        return LBS_MULTIPLIER * lengthInches * thicknessInches * widthInches;
    }

    /**
     *Prints the name of the piece, the length, width, and thickness of the sheet,
     * and the cost and weight of each sheet
     */
    public void printBillOfMaterials() {
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Length: " + lengthAndWidthFormat.format(lengthInches) + " inches");
        System.out.println("Width: " + lengthAndWidthFormat.format(widthInches) + " inches");
        System.out.println("Thickness: " + thicknessFormat.format(thicknessInches) + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()) + "\n");

    }


}
