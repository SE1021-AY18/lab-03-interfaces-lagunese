/*
 *Course: SE 1021
 *Term: Winter 17/18
 *Assignment: Lab03
 *Author: Edwin Lagunes-Gonzalez
 *Date: 12/14/17
 */

import java.text.DecimalFormat;

public class Nut implements Part{

    private static final double LBS_MULTIPLIER = 0.01;
    private static final double USD_MULTIPLIER = 0.50;

    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.000 lbs");
    private DecimalFormat diameterFormat = new DecimalFormat("0.00");

    private double diameterInches;

    /**
     *'Makes' a new Nut
     * @param diameterInches the desired diameter of each nut in inches
     */
    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    public double getCost() {
        //double cost = (USD_MULTIPLIER*diameterInches);
        return USD_MULTIPLIER*diameterInches;
    }

    public String getName(){
        return (diameterFormat.format(diameterInches)+" inch nut");
    }

    public double getWeight(){
        //double weight = LBS_MULTIPLIER*(diameterInches*diameterInches);
        return LBS_MULTIPLIER*(diameterInches*diameterInches);
    }

    /**
     * Prints the Bill of materials for each nut
     * B.o.M displays the name of the piece, diameter of each nut,
     * and the cost and weight of each nut
     *
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: "+diameterFormat.format(diameterInches)+" inches");
        System.out.println("Cost: "+costFormat.format(getCost()));
        System.out.println("Weight: "+weightFormat.format(getWeight())+"\n");

    }
}