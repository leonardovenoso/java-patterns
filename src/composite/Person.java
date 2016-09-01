package composite;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Person {
	private String fullName;
	private ArrayList<Person> children = new ArrayList<Person>();
	
	public Person(String fullName) {
		this.fullName = fullName;
	}
	
	public void addChildren(Person child) {
		this.children.add(child);
	}
	
	public String toJSONString() {
		JSONObject root = new JSONObject();
		root.put("mother", this);
	
		
		JSONArray jsonChildrenArr = new JSONArray();
		jsonChildrenArr.addAll(this.children);
		
		root.put("children", jsonChildrenArr);

		return root.toJSONString();
	}
	
	public String toString() {
		return "\"" + this.fullName + "\"";
	}
}
