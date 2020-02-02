package com.records.records.utilities;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

    List<String> records = new ArrayList<String >();

   public int findLengthMax(List<String> records[]){
       int lengthMax = records.length;

       for (int i = 1; i < records.length; i++) {
           if ( lengthMax < records.length ){
                   lengthMax = records.length;
           }


       }
       return lengthMax;
   }
}
