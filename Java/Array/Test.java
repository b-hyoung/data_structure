import java.io.*;

public class Test {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new FileReader("number.txt"));
        String lines = br.lines();
        br.close();
        System.out.println(lines);


    }
}
