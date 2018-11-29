package Excercises;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.csdp.qa.base.TestBase;

public class GetPlayList extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GetPlayList();
		
		driver.get("https://www.youtube.com/watch?v=0Gew2XOuum8&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=27");
		
		List<WebElement> playLists = driver.findElements(By.xpath("//ytd-playlist-panel-video-renderer//span[@id='video-title']"));
		
		
		Iterator<WebElement> it = playLists.iterator();
		
		while(it.hasNext())
			System.out.println(it.next().getText());
		
		
		//ytd-playlist-panel-video-renderer//span[@id='video-title']

	}

}
