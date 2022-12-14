import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FangraphTopTen {

public static void main(String[]args) throws IOException {
final String stats2022 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_200";

Document statsPage = Jsoup.connect(stats2022).timeout(10000).get();

Elements page = statsPage.select("tbody");

for (Element e : page.select("tr") ) {
	String info = e.select("td.grid_line_regular").text();
	System.out.println(info);
}
final String stats2021 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_200";

Document stats21Page = Jsoup.connect(stats2021).timeout(10000).get();

Elements page21 = stats21Page.select("tbody");

for (Element e : page21.select("tr") ) {
	String info = e.select("td.grid_line_regular").text();
	System.out.println(info);
}
final String stats2020 = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=1_200";

Document stats20Page = Jsoup.connect(stats2020).timeout(10000).get();

Elements page20 = stats20Page.select("tbody");

for (Element e : page20.select("tr") ) {
	String info = e.select("td.grid_line_regular").text();
	System.out.println(info);
}
}
}

