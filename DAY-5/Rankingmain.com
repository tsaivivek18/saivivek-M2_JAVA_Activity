import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;
import java.util.*;
public class RankingMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Ranking> rList = new ArrayList<Ranking>();
        System.out.println("Please provide the number of  players");

        int number = scan.nextInt();

        for(int i= 0;i<number;i++)
        {
            System.out.println("Enter the name of the player "+(i+1));

           String  name = scan.nextLine();

            System.out.println("Enter the score of the player "+(i+1));
          int  score = scan.nextInt();
            
           rList.add(new Ranking(name,score));
        }
        
        Collections.sort(rList);
        
        System.out.println("Player Details by Score(High to Low)");
        for (Ranking r : rList) {
            System.out.println(r);
        }
        scan.close();
    }
}