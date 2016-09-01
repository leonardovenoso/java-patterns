package template;

public abstract class Template {

	protected String indexName;
	
	public abstract String gatherInformation();
	public abstract String processInformation();
	public abstract String provider();
	
	public Template(String indexName) {
		this.indexName = indexName;
	}
	
	public void sendMessageToMultimediaServer() {
		System.out.println("Sending: " + processInformation());
	};
	
	public final void execute() {
		gatherInformation();
		processInformation();
		provider();
		sendMessageToMultimediaServer();
	}

}
