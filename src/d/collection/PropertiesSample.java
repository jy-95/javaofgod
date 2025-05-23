package d.collection;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.checkProperties();
	}
	public void checkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keyset = prop.keySet();
		for (Object tempObject : keyset) {
			System.out.println(tempObject+" = " + prop.get(tempObject));
		}
	}

}
