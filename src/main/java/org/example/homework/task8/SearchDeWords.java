package org.example.homework.task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchDeWords {
    public static void main(String[] args) {
        String testForSearch = "When you first start to evaluate a cloud migration, the decisions to be made, stakeholders who need to be involved, it can sometimes feel overwhelming – and with good reason. " +
                "A move to the cloud can take time, resources, and manpower, and while companies are nearly universally glad they made those investments, that doesn't cancel out the fact that they take strategic planning and up-front work."
                + "DEADLINE What do you need to plan for? Who needs to be involved (and when)? What roles and responsibilities need to be divided up? The answers vary a bit depending on your company size, the scope of your migration, and whether you have the budget (or need) for a migration partner."
                + "Decision Below are the typical roles and responsibilities we see from successful migrations – and some tips to prepare your team for success. Because without the right team in place, missed deadlines, duplicative work, and depost-migration workflow issues become much greater risks de.";

        String deRegExp = "(?i)\\bde[a-z]*\\b";

        //add uppeercases variants - (?i)
        Pattern pattern = Pattern.compile(deRegExp);
        Matcher matcher = pattern.matcher(testForSearch);
        System.out.println();

        while (matcher.find()) {
            System.out.println("Found words start with de: " + matcher.group());
        }
    }
}
