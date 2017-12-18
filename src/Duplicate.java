/*
 *Course: SE 1021
 *Term: Winter 17/18
 *Assignment: Lab03
 *Author: Edwin Lagunes-Gonzalez
 *Date: 12/14/17
 */

import java.text.DecimalFormat;

public class Duplicate implements Part {
    private static final double REDUCTION_FACTOR1 = 0.95;
    private static final double REDUCTION_FACTOR2 = 0.9;
    private static final int USD_THRESHOLD1 = 5;
    private static final int USD_THRESHOLD2 = 10;

    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.0## lbs");
    private Part identicalPart;
    private int numDuplicates;

    /**
     *constructor for Duplicate parts
     * @param identicalPart sets the number of identical parts to the number of
     *                      parts that are identical
     * @param numDuplicates sets the number of duplicate parts to the number of
     *                      parts that are duplicates
     */
    public Duplicate(Part identicalPart, int numDuplicates){
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    public double getCost(){
        double cost =  numDuplicates*(identicalPart.getCost());

        if(numDuplicates>=USD_THRESHOLD1){
            if (numDuplicates>=USD_THRESHOLD2){
                return (cost*REDUCTION_FACTOR2);
            }
            return (cost*REDUCTION_FACTOR1);
        }
        return cost;
    }

    public String getName(){
        return numDuplicates +" "+ identicalPart.getName()+"s";
    }

    public double getWeight(){
        //double weight = (numDuplicates*identicalPart.getWeight());
        return numDuplicates*identicalPart.getWeight();
    }


    /**
     *Prints the name of each part, how many copies of each there is,
     * the cost and weight per single item,
     * the total cost and weight for all of the items
     *
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Duplicate Part: "+identicalPart.getName());
        System.out.println("Copies: "+numDuplicates);
        System.out.println("Individual cost: "+costFormat.format(identicalPart.getCost()));
        System.out.println("Individual weight: "+weightFormat.format(identicalPart.getWeight())+"\n");
        System.out.println("Total cost: "+costFormat.format(getCost()));
        System.out.println("Total weight: "+weightFormat.format(getWeight())+"\n");
        identicalPart.printBillOfMaterials();
    }





}