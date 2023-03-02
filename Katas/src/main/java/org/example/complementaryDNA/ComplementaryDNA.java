package org.example.complementaryDNA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComplementaryDNA {
    public String makeComplement(String dna) {
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A' -> result.add('T');
                case 'T' -> result.add('A');
                case 'C' -> result.add('G');
                case 'G' -> result.add('C');
                default -> System.out.println("ERROR!");
            }
        }
        return result.stream().map(Object::toString).collect(Collectors.joining());
    }
}
