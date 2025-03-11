package SeleniumScenario1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class VerifyLinkStatus {

	public static int invalidLink = 0;

	public static void verifyLink(String link) throws IOException {

		if (link != null) {
			try {
				URL url = new URL(link);

				// open http connection
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();

				// set timout
				connection.setConnectTimeout(30000);

				// connect the URL
				connection.connect();

				if (connection.getResponseCode() == 200) {

				} else {
					invalidLink++;
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		}
	}

	public static void getInvalidLinkCount() {
		System.out.println("Total Invalid Links : " + invalidLink);
	}
}
