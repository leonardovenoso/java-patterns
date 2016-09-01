package template;

public class Main {

	public static void main(String[] args) {
		new GoogleFinance("Nasdaq").execute();
		new ThomsonReuters("Nasdaq").execute();
		new YahooFinance("Nasdaq").execute();
	}

}
