package lesson11.symbolsStrings;

import java.io.*;

public class ChangeEncoding {

    public void changeEncoding (File file, String currentEncoding, String neededEncoding) throws IOException{

        StringBuilder builder = new StringBuilder();
        InputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in, currentEncoding);

        System.out.println(reader.getEncoding());

        BufferedReader bfr = new BufferedReader(reader);

        String str;
        while ((str = bfr.readLine()) !=null) {
            builder.append(str);
        }
        str = builder.toString();
        bfr.close();

        OutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos, neededEncoding);
        BufferedWriter br = new BufferedWriter(osw);
        br.write(str);
        System.out.println(osw.getEncoding());
        br.flush();
        br.close();

    }
}
