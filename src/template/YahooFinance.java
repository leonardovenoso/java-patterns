package template;

public class YahooFinance extends Template {

	public YahooFinance(String indexName) {
		super(indexName);
	}

	public String provider() {
		return "Yahoo Finance";
	}
	
	public String gatherInformation() {
		return "index 5,222.97";
	}

	public String processInformation() {
		return "{ provider: " + provider() +
				", index_name: " + indexName +
				", index_value: " + gatherInformation().split(" ")[1] +
				" }";
	}

}
