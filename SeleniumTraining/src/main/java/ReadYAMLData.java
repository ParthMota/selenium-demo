import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadYAMLData {

	public static void main(String[] args) throws FileNotFoundException, YamlException {
		// TODO Auto-generated method stub
		String filepath = "testdata.yaml";
		FileReader file = new FileReader(filepath);
		
		YamlReader reader = new YamlReader(file);
		
		Map testdata = (Map)reader.read();
		
		List testcases = (List)testdata.get("testdata");
		
//		System.out.println(testcases);
		
		Map first = (Map)testcases.get(2);
//		System.out.println(first.get("Third"));
		
		List data = (List)first.get("Third");
//		System.out.println(data);
		
		Map details = (Map) data.get(0);
//		System.out.println(details);
		
		Set<String> set = details.keySet();
		for (String key : set) {
			System.out.println(key+" : "+details.get(key));
		}
	}
}
