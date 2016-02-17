import com.xsis.projectB.ClassBA;


public class ArrayExample {
	ClassBA ba[];
	private String[] dataArray1;
	private Integer[] dataArray2;
	private String[] dataArray3;
	
	public void setArray() {
		dataArray1 = new String[5];
		dataArray2 = new Integer[5];
		dataArray3 = new String[] {
				"da1", "da2", "da3"
		};
		String[] dt = {"abc", "def", "ghi"};
		ba = new ClassBA[5];
		
		dataArray1[0] = "satu";
		dataArray1[2] = "dua";
		dataArray1[3] = "tiga";
		
		ba[0] = new ClassBA();
		ba[1] = new ClassBA();
		ba[2] = new ClassBA();
		
	}

}
