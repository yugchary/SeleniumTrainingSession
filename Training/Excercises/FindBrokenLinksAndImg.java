package Excercises;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.csdp.qa.base.TestBase;

public class FindBrokenLinksAndImg extends TestBase {

	public static <E> void main(String[] args) throws InterruptedException, IOException {

		new FindBrokenLinksAndImg();

		driver.get("https://www.facebook.com/");

		/*
		 * driver.get("https://www.freecrm.com/index.cfm?");
		 * driver.findElement(By.name("username")).sendKeys("yug_chary");
		 * driver.findElement(By.name("password")).sendKeys("omsris");
		 * driver.findElement(By.xpath("//input[@type='submit']")).submit();
		 * 
		 * driver.switchTo().frame("mainpanel");
		 */

		Thread.sleep(5000);

		List<WebElement> list = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = list.iterator();

		System.out.println("count =" + list.size());

		/*
		 * for(WebElement we :list) System.out.println(we);
		 */

		//ArrayList<WebElement> urls = new ArrayList<WebElement>();
		
		ArrayList<String> urls = new ArrayList<String>();

		// urls.addAll(list);

		while (it.hasNext()) {
			// System.out.println(it.next().getAttribute("href"));
			//urls.add(it.next());
			urls.add(it.next().getAttribute("href"));
		}

		

		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			@Override
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			@Override
			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}

			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}
		} };

		try {
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
		}

		/*for (int j = 0; j < urls.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(urls.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String res = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(urls.get(j).getAttribute("href") + "---->" + res);
		}*/
		
		
		  for(String x :urls) { 
			  
			  //System.out.println(x);
		  
		  
		  
			  if(x.startsWith("http")) {
			  
				  URL obj = new URL(x); HttpURLConnection con = (HttpURLConnection)
				  obj.openConnection(); con.setRequestMethod("GET");
				  
				  int resCode = con.getResponseCode();
				  
				  if (resCode == 200) System.out.println("success"); else System.out.println(x
				  + "--->fail");
				  
				  }
			  
		}
		 

	}

}
