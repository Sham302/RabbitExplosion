package com.spartaglobal.rabbitexplosion;

import java.util.List;

public class IncreaseAge extends Bunnies {
    public List<IBunnies> IncreaseAge(List<IBunnies> bunniesList, int age){

        for(int i = 0; i< bunniesList.size(); i++){
            bunniesList.get(i).setAge(age);
            System.out.println(bunniesList.get(i).getAge());
        }
        return bunniesList;
    }

}

