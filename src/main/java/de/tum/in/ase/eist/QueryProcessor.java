package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Julian";
        } else if (query.contains("what is") && query.contains("plus")) {
            int plusIndex = query.indexOf("plus");
            int isIndex = query.indexOf("is");
            int a = Integer.parseInt(query.substring(isIndex + 3, plusIndex - 1));
            int b = Integer.parseInt(query.substring(plusIndex + 5));
            return a + b + "";
        } else if (query.contains("which") && query.contains("largest")) {
            int colonIndex = query.lastIndexOf(":");
            String substring = query.substring(colonIndex + 1);
            int[] numbers = Arrays.stream(substring.split(", ")).mapToInt(Integer::parseInt).sorted().toArray();
            return numbers[0] + "";
        } else {
            return "";
        }
    }
}
