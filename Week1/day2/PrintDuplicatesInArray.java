package Week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		 int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 int count = 0;
		 System.out.println("Duplicates are:");
		 
for(int i=0;i<arr.length;i++)//1 13
{
	for(int j=i+1;j<arr.length;j++)//j=1,j<13 2
	{
		if(arr[i]==arr[j])//14=12,14=13,14=11,14 = 15,14=14
			System.out.println(arr[j]);
	}
}
	}

}
