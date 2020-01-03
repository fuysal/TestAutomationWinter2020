package com.cybertek.utilities;

public class SelenuimUtils {

    public void verifyEquals(String expectedREsult, String actualReasult){

        if (expectedREsult.equals(actualReasult)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected result: " + expectedREsult);
            System.out.println("Actual result: " + actualReasult);

        }

    }

}
