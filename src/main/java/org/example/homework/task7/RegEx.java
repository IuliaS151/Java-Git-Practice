package org.example.homework.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        String originalString = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  " +
                "OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract " +
                "customerName=00050848634 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 " +
                "poNum=Test_TS5155079515 lineCount=3";

        // Удаляю двойные пробелы
        String replaceDoubleSpace = " ";
        String stringWithoutDoubleSpaces = originalString.replaceAll("\\b\\s\\s", replaceDoubleSpace);
        //System.out.println(stringWithoutDoubleSpaces);

        // Печатаю каждое поле, разделенное пробелом
        //String[] lines = stringWithoutDoubleSpaces.split("\\s");
        /*for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("This string has " + lines.length + " fields");*/

        String orderUUIRegExp = "[a-z]{5}[A-Z]{4}[^\\w]\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}"; // регулярное выражение для orderUUID
        Pattern pattern = Pattern.compile(orderUUIRegExp);
        Matcher matcher = pattern.matcher(stringWithoutDoubleSpaces);

        //1. Find and return true or false if String contains orderUUID
        boolean result = isFoundByRegExp(matcher);
        System.out.println("Does the originalString contains the orderUUID?: "  + result);

        // 2. Find and return orderUUID substring from string
        String myOrderUUID = getSubString(matcher);
        System.out.println(myOrderUUID);

        // 3. Find and return user email from string
        String stringWithEmail = "test 2667843 (test_email@griddynamics.com) test 67483 some string ";
        String emailRegExp = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern2 = Pattern.compile(emailRegExp);
        Matcher matcher2 = pattern2.matcher(stringWithEmail);

        boolean isEmailFound = isFoundByRegExp(matcher2);
        System.out.println("Does the stringWithEmail contains the emial?: "  + isEmailFound);

        String myEmail = getSubString(matcher2);
        System.out.println(myEmail);

        // 4. find and return how many orders were created from this string -
        String stringWithOrders = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 " +
                "poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], " +
                "total number of orders successfully processed: [2]";

        String orderRegExp = "total\\s+number\\s+of\\s+orders\\s+successfully\\s+processed:\\s*\\[(\\d+)\\]";

        Pattern pattern3 = Pattern.compile(orderRegExp);
        Matcher matcher3 = pattern3.matcher(stringWithOrders);

        boolean isOrderNumFound = isFoundByRegExp(matcher3);
        System.out.println("Does the stringWithOrders contains the number of orders?: "  + isOrderNumFound);

        String orderNumber = getSubString(matcher3);
        System.out.println(orderNumber);
    }

    static String getSubString(Matcher myMatcher) {
        return myMatcher.group();
    }

    static boolean isFoundByRegExp(Matcher myMatcher) {
        return myMatcher.find();
    }
}

/*
orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200
orderUUID=d34149d8-88ab-4791-bb0a-4c96e034200
o*/
