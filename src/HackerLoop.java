
public class HackerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer:
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++)
				{
					System.out.println("i= "+i+" j= "+j);
                        if(i==3)
                        {
                        	break Outer;
                        }
					
				}
			}
		
	}

}
