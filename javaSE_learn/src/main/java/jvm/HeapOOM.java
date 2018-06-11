package jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VN args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author 李拜天
 *
 */
public class HeapOOM {
	
	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while(true) {
			list.add(new OOMObject());
		}
	}

}
