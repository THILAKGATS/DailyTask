package DailyTask;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		int [] arr = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)	
			if(arr[i]%2!=0)//Odd Numbers
			{
				System.out.print(arr[i]);
				
			}
		for(int j=0;j<arr.length;j++)
			if(arr[j]%2==0)//Even NUmbers
			{
				System.out.print(arr[j]);
			}
	}

}	
