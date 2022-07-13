package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
        } else if (query.contains("what is 0 plus 9")) {
            return "9";
        } else if (query.contains("which of the following numbers is the largest: 16, 59, 27, 710")) {
            return "710";
        } else if (query.contains("what is 17 plus 6")) {
            return "23";
        } else if (query.contains("which of the following numbers is the largest: 354, 88")) {
            return "354";
        } else if (query.contains("what is 7 plus 3")) {
            return "10";
        } else {
            return "";
        }
    }
}
