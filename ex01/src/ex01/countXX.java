package ex01;

public class countXX {

	public static void main(String[] args) {
		String str= "vaseaxxpetea";
		System.out.println(countXX(str));
	}
	public static int countXX(String s)
	{
		int k = 0;
		  for (int i = 0; i < s.length();i++)
		  {
		    if ((s.charAt(i) == 'x')&&(s.charAt(i+1) == 'x'))
		    {
		    	k++;
		    }
		  }
		  return k;
	}

}
