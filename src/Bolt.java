/*
 *Course: SE 1021
 *Term: Winter 17/18
 *Assignment: Lab03
 *Author: Edwin Lagunes-Gonzalez
 *Date: 12/14/17
 */

import java.text.DecimalFormat;

public class Bolt implements Part{
    private static final double LBS_MULTIPLIER = 0.05;
    private static final double USD_MULTIPLIER = 1.00;

    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.0## lbs");
    private DecimalFormat lengthAndDiameterFormat = new DecimalFormat("0.0#");

    private double diameterInches;
    private double lengthInches;

    /**
     *'Makes' a new Bolt
     * @param diameterInches the desired diameter of the bolt in inches
     * @param lengthInches the desired diameter of the bolt in inches
     */
    public Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    public double getCost() {
        //double cost = USD_MULTIPLIER*lengthInches*diameterInches;
        return USD_MULTIPLIER*lengthInches*diameterInches;
    }

    public String getName(){
        return (lengthAndDiameterFormat.format(diameterInches)+"x"+lengthAndDiameterFormat.format(lengthInches)+" bolt");
    }

    public double getWeight(){
        //double weight = LBS_MULTIPLIER*lengthInches*(diameterInches*diameterInches);
        return LBS_MULTIPLIER*lengthInches*(diameterInches*diameterInches);
    }


    /**
     *Prints the name of the piece, the diameter and length of the Bolt,
     * and the cost and weight of each Bolt
     */
    public void printBillOfMaterials(){

        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: "+lengthAndDiameterFormat.format(diameterInches)+" inches");
        System.out.println("Length: "+lengthAndDiameterFormat.format(lengthInches)+" inches");
        System.out.println("Cost: "+costFormat.format(getCost()));
        System.out.println("Weight: "+weightFormat.format(getWeight())+"\n");

    }
}

