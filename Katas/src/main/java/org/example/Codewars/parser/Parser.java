package org.example.Codewars.parser;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {
    public int parseInt(String numStr) {
        HashMap<String, Integer> mapOfPossibilities = new HashMap<>();
        mapOfPossibilities.put("zero", 0);
        mapOfPossibilities.put("one", 1);
        mapOfPossibilities.put("two", 2);
        mapOfPossibilities.put("three", 3);
        mapOfPossibilities.put("four", 4);
        mapOfPossibilities.put("five", 5);
        mapOfPossibilities.put("six", 6);
        mapOfPossibilities.put("seven", 7);
        mapOfPossibilities.put("eight", 8);
        mapOfPossibilities.put("ten", 10);
        mapOfPossibilities.put("eleven", 11);
        mapOfPossibilities.put("twelve", 12);
        mapOfPossibilities.put("thirteen", 13);
        mapOfPossibilities.put("fourteen", 14);
        mapOfPossibilities.put("fifteen", 15);
        mapOfPossibilities.put("sixteen", 16);
        mapOfPossibilities.put("seventeen", 17);
        mapOfPossibilities.put("eighteen", 18);
        mapOfPossibilities.put("nineteen", 19);
        mapOfPossibilities.put("twenty", 20);
        mapOfPossibilities.put("thirty", 30);
        mapOfPossibilities.put("forty", 40);
        mapOfPossibilities.put("fifty", 50);
        mapOfPossibilities.put("sixty", 60);
        mapOfPossibilities.put("seventy", 70);
        mapOfPossibilities.put("eighty", 80);
        mapOfPossibilities.put("ninety", 90);
        
        mapOfPossibilities.put("hundred", 100);
        mapOfPossibilities.put("thousand", 1000);
        mapOfPossibilities.put("million", 1_000_000);

        List<String> numbersAsStrings = Arrays.stream(numStr.split(" ")).toList();

        int solution = 0;
        for (int i = 0; i < numbersAsStrings.size(); i++) {
            if (numbersAsStrings.get(i).equals("thousand") && i < 2) {
                solution = mapOfPossibilities.get("thousand") * mapOfPossibilities.get(numbersAsStrings.get(i));
            }
        }
        return solution;
    }
}
