package DailyTask;

import java.util.Scanner;

public class TskWithoutnull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name=new String[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<name.length;i+=2)
		{
			System.out.println("What is your name");
			name[i]=scan.nextLine();
		}
		
		for(int i=0;i<name.length;i++)
		{
			if(name[i]!=null)
				System.out.println(name[i]);
		}

	}

}
