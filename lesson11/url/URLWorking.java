package lesson11.url;

import lesson11.frame4.*;

import java.io.*;
import java.io.PrintStream;

import java.net.URL;
import java.net.URLConnection;


public class URLWorking {

    URL ur;

    public void loadCodePageFromInternet () throws Exception{
        PrintStream ps;
        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("D:"+ File.separator+"new_Directory"+File.separator+"newFile.txt")),true);
        System.setOut(ps);
        ur = new java.net.URL("http://www.bigmir.net/");

        URLConnection yc = ur.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);}
        in.close();
        ps.close();
    }
}
