package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class PyramidCSVDAO {
    public List<Pyramid> readPyramidsFromCSV(String filename) throws Exception{
        List<Pyramid> pyramids = new LinkedList<Pyramid>();

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String columnNames = br.readLine();

        String pyramidData = br.readLine();
        while (pyramidData != null){
            String[] metadata = pyramidData.split(",");
            pyramids.add(createPyramid(metadata));
            pyramidData = br.readLine();
        }
        br.close();
        return pyramids;
    }

    public Pyramid createPyramid(String[] metadata){
        double height = metadata[7].length() != 0 ? Double.parseDouble(metadata[7]) : 0;
        return new Pyramid(metadata[0], metadata[2], metadata[4], height);
    }
}
