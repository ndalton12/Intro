
public class DataSet {
	
	int[] values;
	int first;
	int last;

	public static void main(String[] args) {
		int[] array = {1,2,3};
		
		DataSet ds = new DataSet(array, 1, 3);
		
		System.out.println(ds.getMaximum());
	}
	
	public DataSet(int[] values, int first, int last) {
		this.values = values;
		this.first = first;
		this.last = last;
	}
	
	public int getMaximum() {
		if (first > last)
			return first;
		else {
			
			getMaximum();
		}
		
		return -1;
	}

}
