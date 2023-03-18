package org.example.lineNumbering;

import java.util.*;
import java.util.stream.IntStream;

public class LineNumbering {
    public List<String> number(List<String> lines) {
       /* List<String> answer = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            answer.add((i+1) + ": " + lines.get(i) );
        }
        return answer;*/
    return IntStream.range(0, lines.size()).mapToObj(i -> (i+1) + ": " + lines.get(i)).toList();
    }
}