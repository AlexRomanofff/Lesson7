
public class Launcher {

	public static void main(String[] args) {
     long l = Long.MAX_VALUE;
		long sec = l/1000;
		long hour = sec/3600;
		long day = hour/24;
		long year = day/365;

		System.out.println(year/1000);

	}
}
