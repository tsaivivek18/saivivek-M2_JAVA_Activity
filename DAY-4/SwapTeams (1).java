import java.util.*;
public class SwapTeams {
    public static void main(String[] args) {
        ArrayList<String> teamList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int i=0;
        while( i <5){
            teamList.add(sc.next());
            i++;
        } 
        System.out.println("Enter swap postions");
        int pos = sc.nextInt();
        Collections.swap(teamList, 0,pos );
        for(String j: teamList){
            System.out.println(j);
        }
        sc.close();

    }
}