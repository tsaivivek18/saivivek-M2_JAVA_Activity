import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TeamMain {
	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		 scan.useDelimiter(System.lineSeparator());
		ArrayList<Team> tList = new ArrayList<Team>();
		
		


        System.out.println("Enter number of teams:");

        int number = scan.nextInt();

        for(int i= 0;i<number;i++)
        {
            System.out.println("Enter team "+(i+1)+" detail");
            
            System.out.println("Enter Name");

           String  name;
            name = scan.next();
          
  
            System.out.println("Enter number of matches");
            Long  matches = scan.nextLong();

          tList.add(new Team(name,matches));
        }
        
        Collections.sort(tList,new TeamComparator());
        
        System.out.println("Team list after sort by number of matches\n");
        
        Collections.sort(tList,new TeamComparator());
        for (Team t : tList) {
            System.out.println(t);
        }
        scan.close();
		
	}
	
}