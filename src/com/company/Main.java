package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PyramidCSVDAO pyramidDAO = new PyramidCSVDAO();
        try {
            //1- Reading file and printing pyramids info
            List<Pyramid> pyramids = pyramidDAO.readPyramidsFromCSV("pyramids.csv");
            for (Pyramid pyramid: pyramids){
                System.out.println(pyramid);
            }
            System.out.print("\n--------------------------------------------------------------------\n");

            ///////////////////////////////////////////////////////////////////////////////////////////////

            //2- Sorting Pyramids list
            System.out.println("Sorted Pyramdis: ");
            pyramids.sort(Comparator.comparingDouble(p->p.getHeight()));
            for (Pyramid pyramid: pyramids){
                System.out.println(pyramid);
            }
            System.out.print("\n--------------------------------------------------------------------\n");

            ////////////////////////////////////////////////////////////////////////////////////////////////

            //3- Site -> Number of Pyramids map
            Map<String, Integer> sitePyramidsMap = new HashMap<String, Integer>();
            for (Pyramid pyramid: pyramids){
                int noOfPyramids = sitePyramidsMap.getOrDefault(pyramid.getSite(), 0);
                sitePyramidsMap.put(pyramid.getSite(), noOfPyramids+1);
            }
            sitePyramidsMap.forEach((k, v) -> System.out.println(k + ": " + Integer.toString(v)));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
