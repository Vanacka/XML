import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Clovek[] arr = {
                new Clovek("Chujo", "Zroutka", 69),
                new Clovek("Chujo", "Zmrd", 17)
        };

        for (Clovek c : arr) {
            System.out.println(c);
        }
        XStream xstream = new XStream(new StaxDriver());
        try (FileWriter out = new FileWriter("chujozmrd.xml")) {
            out.write(xstream.toXML(arr));
        }
    }
}