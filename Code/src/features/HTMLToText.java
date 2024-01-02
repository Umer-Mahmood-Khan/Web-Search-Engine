package features;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLToText {
	
	public static void convertHTMLFileToText(String url) throws IOException
	{
		File dir = new File("TextFiles");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		Document doc = Jsoup.connect(url).get();
		String location =null;

        String name = String.valueOf(System.currentTimeMillis());
        
		location ="TextFiles//"+ name +".txt";
				
		File file = new File(location);
        if(!file.exists()) {
        	file.createNewFile();
        }
		Elements element = doc.select("*");
		CacheOperations.addToCache(url + " "+ name + ".txt");

		BufferedWriter write = new BufferedWriter(new FileWriter(file));
		for (Element e : element) {
			write.write(e.ownText());
			write.newLine();
		}

		write.flush();
		write.close();
		
	}

}
