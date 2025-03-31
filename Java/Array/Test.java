import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        try {
            // 버퍼리더를 활용하여 값을 읽어온다.
            BufferedReader br = new BufferedReader(new FileReader("number.txt"));
            ArrayList<Integer> number = new ArrayList<>();
            String line;
            
            // 파일을 끝까지 읽고, 읽은 문자열을 int로 변환
            while ((line = br.readLine()) != null) {
                int currentNumber = Integer.parseInt(line);
                
                // 삽입할 위치를 찾는다.
                int i = 0;
                for (; i < number.size(); i++) {
                    // 리스트에 있는 숫자가 현재 숫자보다 크면 멈춘다.
                    if (number.get(i) > currentNumber) {
                        break;
                    }
                }
                // 해당 인덱스 위치에 currentNumber를 삽입한다.
                number.add(i, currentNumber);
            }
            br.close();
            
            // 리스트의 첫 번째 요소 출력
            System.out.println(number.get(0));
            // 전체 리스트 출력
            System.out.println(number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
