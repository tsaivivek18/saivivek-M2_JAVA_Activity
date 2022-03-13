import java.util.*;
import java.util.Collections;

public class Ranking implements Comparable<Ranking> {
    private String name;
    private int score;
    public Ranking(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

	@Override
	public String toString() {
		return  name + " " + score;
	}

	@Override
	public int compareTo(Ranking o) {
		// TODO Auto-generated method stub
		 if(this.score==o.score){
		       return 0; 
		     } 
		     else if(this.score < o.score){
		     return 1;
		     }
		     else{
		       return -1;
		     }
	}
}
