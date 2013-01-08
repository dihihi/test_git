
public class CC {
	private final String[] initArr = new String[]{"a", "b", "c"};
	
	public void printNum() {
		for (int i=0; i<initArr.length; i++) {
			System.out.print(initArr[i]);
		}
		System.out.println();//dd
	}
	
	public void swap(int i, int j) {
		String temp = initArr[j];
		initArr[j] = initArr[i];
		initArr[i] = temp;
	}
	
	public void range(int i) {
		if (i == 1) {
			System.out.print(initArr[0]);
		} else if (i==2){
			System.out.print(initArr[0]);
			System.out.println(initArr[1]);
		} else {
			range(i-1);
			System.out.println(initArr[i-1]);
			
		}
		
	}
	
	public static void main(String[] args) {
		CC cc = new CC();
		cc.range(3);
	}
}
