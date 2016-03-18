
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Program {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		int x = 0;
		int y = 0;
		int nx = 0;
		int ny = 0;

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document xDoc = db.parse(XmlReader.class.getResourceAsStream("/data.xml"));
		xDoc.normalize();
		NodeList nList = xDoc.getElementsByTagName("Alg");

		Node node;
		node = nList.item(0);
		Element element = (Element) node;

		int height = Integer.parseInt(element.getElementsByTagName("Height").item(0).getTextContent());
		int width = Integer.parseInt(element.getElementsByTagName("Width").item(0).getTextContent());
		WaveAlg Path = new WaveAlg(width, height);
		int i = 0;
		while (true) {
			try {
				x = Integer.parseInt(element.getElementsByTagName("X").item(i).getTextContent());
				y = Integer.parseInt(element.getElementsByTagName("Y").item(i).getTextContent());
				Path.block(x, y);
			} catch (NullPointerException e) {
				break;
			}
			i++;
		}

		Path.traceOut();
		System.out.println();

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("¬ведите x начала");
			x = scan.nextInt();
			System.out.println("¬ведите y начала");
			y = scan.nextInt();
			System.out.println("¬ведите x конца");
			nx = scan.nextInt();
			System.out.println("¬ведите y конца");
			ny = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("¬водите числа!");
		}

		Path.findPath(x, y, nx, ny);

		Path.traceOut();
		System.out.println();

		Path.waveOut();
	}

}
