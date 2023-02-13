package FileSystem;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        File f = new File("nbproject");
        String[] l = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("p");
            }
        });
        for(String g : l){
            System.out.println(g);
        }
    }
}
