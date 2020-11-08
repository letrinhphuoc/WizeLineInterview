package commons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataHelper
{
    public static Properties readPropertiesFile(String fileName) throws IOException {
        String pathFile = System.getProperty("user.dir") + "/src/main/resources/"+fileName+"";
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(pathFile);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }

}
