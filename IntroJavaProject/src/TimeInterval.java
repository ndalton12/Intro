
public class TimeInterval {
	
	public String time1;
	public String time2;

	public TimeInterval (String time1, String time2) {
		this.time1 = time1;
		this.time2 = time2;
	}
	
	public int getHours() {
		int hours;
		
		String sub1 = time1.substring(0, 2);
		String sub2 = time2.substring(0, 2);
		
		int hour1 = Integer.parseInt(sub1);
		int hour2 = Integer.parseInt(sub2);
		
		if (hour1 > hour2)
			if (Integer.parseInt(time1.substring(2)) > 0)
				hours = 24 - hour1 + hour2 - 1;
			else
				hours = 24 - hour1 + hour2;
		else
			if (Integer.parseInt(time2.substring(2)) < Integer.parseInt(time1.substring(2)))
				hours = hour2 - hour1 - 1;
			else
				hours = hour2 - hour1;
		
		return hours;
	}
	
	public int getMinutes() {
		int minutes;
		
		String sub1 = time1.substring(2);
		String sub2 = time2.substring(2);
		
		String sub3 = time1.substring(0, 2);
		String sub4 = time2.substring(0, 2);
		
		int hour1 = Integer.parseInt(sub3);
		int hour2 = Integer.parseInt(sub4);

		int min1 = Integer.parseInt(sub1);
		int min2 = Integer.parseInt(sub2);
		
		if (hour1 > hour2)
			minutes = 60 - min1 + min2;
		else
			minutes = 60 - min2 + min1;
		
		return minutes;
	}
	
	public static void main (String args[]) {
		TimeInterval time = new TimeInterval("1730","0900");
		System.out.println(time.getHours() + " Hours " + time.getMinutes() + " Minutes");
	}

}
