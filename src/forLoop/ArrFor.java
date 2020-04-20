package forLoop;
public class ArrFor {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80};
		int cnt = 0;
		
		for(int i : arr){
			System.out.println("arr[" + (cnt++) + "] 값 : " + i);
		}
	}
}
