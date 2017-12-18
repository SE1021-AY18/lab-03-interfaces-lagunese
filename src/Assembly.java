/*
 *Course: SE 1021
 *Term: Winter 17/18
 *Assignment: Lab03
 *Author: Edwin Lagunes-Gonzalez
 *Date: 12/14/17
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part {
    private static final double USD_PER_SUB_PART = 0.25;

    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.0## lbs");
    private List<Part> subParts = new ArrayList<>();
    private String name;

    /**
     *Creates a new pair of parts, i.e. Nut-Bolt Pair
     * @param name the name of the pair
     */
    public Assembly(String name) {
        this.name = name;
    }

    /**
     *Adds each part of a pair to an arrayList of parts
     * @param part the part that is being added to the arrayList
     */
    public void addPart(Part part) {
        subParts.add(part);
    }

    public double getCost() {
        double totalCost = 0;
        for (int i = 0; i < subParts.size(); i++) {
            totalCost += (subParts.get(i).getCost() + USD_PER_SUB_PART);
        }
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < subParts.size(); i++) {
            totalWeight += subParts.get(i).getWeight();
        }
        return totalWeight;
    }

    /**
     * Prints the Bill of materials for each group of pieces, i.e. Nut-Bolt Pairs,
     * B.o.M. consists of the name of the pair, the name cost, and weight of each
     * individual piece, as well as the total cost and weight of the pair
     *
     */
    public void printBillOfMaterials() {
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        for (int i = 0; i < subParts.size(); i++) {
            System.out.println("Part: " + subParts.get(i).getName());
            System.out.println("Cost: " + costFormat.format(subParts.get(i).getCost()));
            System.out.println("Weight: " + weightFormat.format(subParts.get(i).getWeight()) + "\n");
        }
        System.out.println("Total Cost: " + costFormat.format(getCost()));
        System.out.println("Total Weight: " + weightFormat.format(getWeight()) + "\n");
        for (int i = 0; i < subParts.size(); i++) {
            subParts.get(i).printBillOfMaterials();
        }

    }


}
