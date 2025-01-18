

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadfromJSON {

	public static void main(String[] args) throws IOException, ParseException{
		// TODO Auto-generated method stub
		String filepath = "example2.json";
		FileReader file = new FileReader(filepath);
		
		JSONParser parser = new JSONParser();
		
		JSONObject json = (JSONObject) parser.parse(file);
		
//		System.out.println(json.toJSONString());
		
		JSONArray testdata = (JSONArray) json.get("testdata");
		
//		System.out.println(testdata.toJSONString());
		
		JSONObject quiz = (JSONObject) testdata.get(0);
//		System.out.println(quiz.toJSONString());
		
		JSONArray quizz = (JSONArray) quiz.get("quiz");
//		System.out.println(quizz.toJSONString());
		
		for(int i=0;i<quizz.size();i++) {
			JSONObject data = (JSONObject) quizz.get(i);
			System.out.println(data.toJSONString());
			
			JSONArray sub1 = (JSONArray) data.get("maths");
			for(int j=0;j<sub1.size();j++) {
				JSONObject qestions = (JSONObject) sub1.get(j);
				System.out.println(qestions.toJSONString());
			}
		}
	}
}