package DailyTask;

public class DuplicateTsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,2,4,6,8,0,8,9,3,4,6};
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate number is:"+arr[j]);
				}
				
			}
			
			
		
		}

	}

}
