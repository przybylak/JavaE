import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.w3c.dom.Document;
 
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
 
/**
 * Created by Artur on 29.06.2017.
 */
public class source_Z8 {
 
    public static void main(String[] args){
 
        try {
 
            SAXParserFactory saxpf = SAXParserFactory.newInstance();
            SAXParser saxParser = saxpf.newSAXParser();
            saxParser.parse(new File("xmlinput.xml"), new ParserSAX());
 
        }
        catch(SAXException ex){
 
            ex.printStackTrace();
 
            System.out.println("NOT XML");
 
        }
        catch(Throwable t){
 
            System.out.println(t.getMessage());
 
        }
 
    }
 
}
 
class ParserSAX extends DefaultHandler {
 
    private int indent = 0;
 
    private void printIndent() {
        for (int i = 0; i < indent; i++){
            System.out.print("....");
        }
    }
 
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        printIndent();
        System.out.println(qName);
 
        indent++;
    }
 
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        indent--;
    }
 
}