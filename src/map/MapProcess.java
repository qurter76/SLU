package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class MapProcess {

	Map<String, Integer> testMap = new HashMap<>();{
	for (int idx = 0; idx < 10000000; idx++) {
	    testMap.put(RandomStringUtils.random(10, true, true),RandomUtils.nextInt());

	    long start = System.currentTimeMillis();
	    
	    Iterator<String> keyIter = testMap.keySet().iterator();
	    int count = 0;
	    while (keyIter.hasNext()) {
	        String key = keyIter.next();
	        count++;
	    }
	     
	    System.out.println("startTime = " + start + ", executeTime = " + (System.currentTimeMillis() - start));
	    start = System.currentTimeMillis();
	     
	    Set<String> keySet = testMap.keySet();
	    for (String key : keySet) {
	        count++;
	    }
	     
	    System.out.println("startTime = " + start + ", executeTime = " + (System.currentTimeMillis() - start));
	    start = System.currentTimeMillis();
	     
	    for (Entry<String, Integer> entry : testMap.entrySet()) {
	        count++;
	    }
	     
	    System.out.println("startTime = " + start + ", executeTime = " + (System.currentTimeMillis() - start));

		}

	}
}
