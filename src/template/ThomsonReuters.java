package template;

public class ThomsonReuters extends Template {

	public ThomsonReuters(String indexName) {
		super(indexName);
	}

	public String provider() {
		return "Thomson Reuters";
	}
	
	public String gatherInformation() {
		return "value=5,221.00"; // Imagine we got this json string from a Thomson Reuters API
	}

	public String processInformation() {
		return "{ provider: " + provider() +
				", index_name: " + indexName +
				", index_value: " + gatherInformation().split("=")[1] +
				" }";
	}

}
