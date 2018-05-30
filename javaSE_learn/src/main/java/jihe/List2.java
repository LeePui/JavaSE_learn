package jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2 {
	public static double getMaxValue(List<Double> list) {
		double max = 0.0;
		Iterator<Double> it = list.iterator();
		while(it.hasNext()) {
			double d = it.next();
			max = d > max ? d : max;
		}
		return max;
	}
	
	public static void main(String[] args) {
		List<Double> ld = new ArrayList<Double>();
		ld.add(0.0);
		ld.add(1.0);
		ld.add(6.0);
		ld.add(7.7);
		ld.add(8.8);
		ld.add(0.6);
		System.out.println(getMaxValue(ld));
	}

}
