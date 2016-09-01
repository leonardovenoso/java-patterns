package template;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GoogleFinance extends Template {

	public GoogleFinance(String indexName) {
		super(indexName);
	}

	public String provider() {
		return "Google Finance";
	}

	/**
	 * Imagine we get this JSON string from a Google API
	 */
	public String gatherInformation() {
		return "{\"index_value\": \"3\" }";
	}

	@SuppressWarnings("unchecked")
	public String processInformation() {
		try {
			JSONObject json = (JSONObject)new JSONParser().parse(gatherInformation());
			json.put("index_name", indexName);
			json.put("provider", provider());
			
			return json.toJSONString();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return "";
	}

}
