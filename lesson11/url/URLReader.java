package lesson11.url;


import java.io.*;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {

    URL url;
    URLConnection urlCon = null;
    InputStreamReader inStream = null;
    BufferedReader bufReader = null;

    public static void main(String[] args) {
        URLReader urlReader= new URLReader();
        urlReader.readDataFromNetwork();
    }

    public void readDataFromNetwork () {

        try {
            url = new URL("http://www.ex.ua");
            urlCon = url.openConnection();
            inStream = new InputStreamReader(urlCon.getInputStream(), "UTF-8");
            bufReader = new BufferedReader(inStream);

            String inputData;
            while ((inputData=bufReader.readLine())!= null) {
                System.out.println(inputData);

            }

        }catch (MalformedURLException ex) {
             ex.printStackTrace();
        }catch (IOException ex1) {
            ex1.printStackTrace();
        }
    }
}
