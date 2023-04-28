package HelloWorld;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      int i, j;
      boolean anyChpt = false;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
      for (i = 1; i <= 15; i++) {
         if (chptList[i] == true) {
            anyChpt = true;
            
            if ((i <= 13) && (chptList[i+1] && chptList[i+2])) {
               j = i;
               includeChpt = i;
               while ((chptList[j] == true) && (j <= 15)) {
                  j++;
                  i++;
                  if (j == 16) {
                     break;
                  }
               }
               System.out.print(includeChpt + "-" + (j-1) + " ");
            } else {
               System.out.print(i + " ");
            }
         }
      }
      if (anyChpt == false) {
         System.out.print("None ");
      }
      
      System.out.println();
      scnr.close();
    }
}
