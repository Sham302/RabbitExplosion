package com.spartaglobal.rabbitexplosion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//list for male(ismale) and female pop(!ismale) = remove after 5 yrs
// breeding method: starts with single pair??,  1month preg period, figure out
// lists to log new born  + add to sum of pop
// list for male(ismale) and female pop(!ismale) = remove after 5 yrs

public class Reproduction {
    private List <IBunnies> bunnyList = new ArrayList<>();
    private Bunnies bunnies = new Bunnies();
    Bunny a = new Bunny();

    public void Reproduction(int seconds, int age) {
        age = seconds;
    }

    static int breeding(){
        int maleCount = 0;
        int femaleCount = 0;
        int sum;

         while (a.isMale() && a.mature && !a.isMale() && a.mature()){   //relate to count
             Random rdm = new Random();
             int random = rdm.nextInt(15);
             ;

         }

         sum = maleCount + femaleCount; //sum add to list of pop

    }

}
