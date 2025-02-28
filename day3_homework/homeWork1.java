package day3;

public class homeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sapXepGiamDan();
	}

	public static void sapXepGiamDan() {
		int []Arr = {9, 7, 12, 5, 9, 2, 7, 14, 6, 1};
		for (int i=0; i<Arr.length; i++) {
			for (int j=0; j <Arr.length-1; j++) {
				if (Arr[j] < Arr[j+1]) {
					int tmp = Arr[j+1];
					Arr[j+1] = Arr[j];
					Arr[j] = tmp;
				}
			}
		}
		
		for (int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]+ " ");
		}
	}
}
