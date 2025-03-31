import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;

public class ArrayIOTest {

    public static void main(String[] args){
        int[] originalArray = {10,20,30,60};
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "array_" + timeStamp + ".txt";

        //1. 배열 쓰기
        try(FileWriter writer = new FileWriter(fileName)){
            for(int num : originalArray){
                writer.write(num + "\n");
            }
            System.out.println("배열 파일 저장 완료 : " + fileName);
        }catch(IOException e){
            System.out.println("파일 저장 중 오류 발생");
            e.printStackTrace();
        }

        //2. 파일 읽기
        ArrayList<Integer> readArray = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                readArray.add(Integer.parseInt(line));
            }
            System.out.println("파일 읽기 완료");
        }catch(IOException e){
            System.out.println("파일 읽기 중 오류 발생");
            e.printStackTrace();
        }
        

        System.out.println("읽은 배열 내용 : ");
        for(int num : readArray){
            System.out.println(" > " + num);
        }
    }
}