package level3.dz.module2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * Created by Володимир on 15.06.2016.
 */
public class JSONParser {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "d:\\0\\json\\json.txt";

        FileReader f = new FileReader(path);

        JsonParser parser = new JsonParser();
        Object obj = parser.parse(f);
        JsonObject jobj = (JsonObject)obj;

        System.out.println("[" + jobj.get("name") + "]" + "[" + jobj.get("surname") + "]"
                + "[" + jobj.get("phones") + "]"  + "[" + jobj.get("sites") + "]" + "["
                + jobj.get("address") + "]");

    }
}
