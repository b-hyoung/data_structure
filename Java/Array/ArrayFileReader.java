import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayFileReader {
    public static void main(String[] args){
        String fileName = "array_20250327_090637.txt";
        ArrayList<Integer> numbers = new ArrayList<>(); //읽을 정수들을 저장할 동적 배열입니다.

        try{
            //버퍼를 통해 파일네임을 읽어옵니다.
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line; //파일을 한줄씩 읽기위한 준비

            //파일을 끝까지 읽고 , 읽은 문자열 int로 변환
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line)); // 한줄로 읽어서 정수로 변환
            }
            //닫아주기
            reader.close();
            //파일이 없거나 읽기 중 문제가 생겼을 때 문제 출력
        }catch(IOException e){
            e.printStackTrace();
        }
        //읽어온 숫자를 하나씩 출력해주기
        for(int num : numbers){
            System.out.println("읽은 값 : "+num);
        }
    }
}