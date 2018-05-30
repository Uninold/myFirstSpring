package com.example.myFirstSpring.model;

/**
 * Created by Arnold on 29 May 2018.
 */
public class ProductExpert {
    public String giveRecommendation(String recommended){
        System.out.println(recommended);
        String service = "";
        if(recommended.equalsIgnoreCase("Sangot"))
        {
            service = "Pahait Service";
        }
        else if(recommended.equalsIgnoreCase("Luthang"))
        {
            service = "Reload Holy Bullets Service";
        }
        else if(recommended.equalsIgnoreCase("Hanger ni Mama"))
        {
            service = "Armament Haki Hanger Service";
        }
        return recommended;
    }
}
