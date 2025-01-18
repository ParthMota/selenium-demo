


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteonJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject student1= new JSONObject();
		
		student1.put("Name", "Parth");
		student1.put("Grade", "6th");
		student1.put("Location", "Mumbai");
		
		JSONObject student2= new JSONObject();
		
		student2.put("Name", "Nana");
		student2.put("Grade", "5th");
		student2.put("Location", "Hyderabad");
		
		System.out.println(student1.toJSONString());
		System.out.println(student2.toJSONString());
		
		JSONArray studentRepos = new JSONArray();
		studentRepos.add(student1);
		studentRepos.add(student2);
		
		System.out.println(studentRepos.toJSONString());
		
		JSONObject details = new JSONObject();
		
		details.put("Student Repository", studentRepos);
		System.out.println(details.toJSONString());
	}

}
