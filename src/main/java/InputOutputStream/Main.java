package InputOutputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //demoReadWrite();
        //demoInputOutput();
        //encodeDemo();
    }

    public static void demoInputOutput() throws Exception {
        try (
                InputStream is = new FileInputStream("C:\\Users\\Aleks\\Downloads\\result_126400 (online-video-cutter.com).mp4");
                OutputStream os = new FileOutputStream("C:\\Users\\Aleks\\Downloads\\new.mp4", true)) {

            byte[] buffer = new byte[4096];
            int r = is.read(buffer);
            while (r != -1) {
                os.write(buffer, 0, r);
                r = is.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demoReadWrite() throws Exception {
        Reader r = new FileReader("C:\\temp\\log.txt");
        Writer w = new FileWriter("C:\\temp\\log1.txt");

        char[] buffer = new char[4096];
        int c = r.read(buffer);
        while (c != -1) {
            w.write(buffer, 0, c);
            c = r.read(buffer);
        }
        r.close();
        w.close();
    }

    public static void encodeDemo() throws Exception {
        FileInputStream fis = new FileInputStream("C:\\temp\\log.txt");
        Reader fr = new InputStreamReader(fis, "utf-8");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
        fis.close();
    }

    public static void demoMemory() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
    }
}
