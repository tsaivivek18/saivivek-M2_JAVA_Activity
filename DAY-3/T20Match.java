public class T20Match extends Match {

	public T20Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	float calculateRunRate() {
	
			return ((getTarget()-getCurrentScore())/(20-getCurrentOver()));
			}
	@Override
	
	float calculateBalls() {
		// TODO Auto-generated method stub
		return 6*(20-getCurrentOver());
	}
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}
© 2022 GitHub, Inc.
Terms
