import java.io.FileWriter; // 파일에 데이터 쓰기 기능을 제공하는 클래스
import java.io.IOException;  //파일 입출력 예외처리 클래스
import java.text.SimpleDateFormat;
import java.util.Date;


public class ArrayFileWriter { //프로그램의 시작점 항상 파일이름과 동일해야함
    public static void main(String[] args) throws Exception{
        int[] numbers = {10,20,40,60};
        String timeStemp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "array_"+timeStemp+".txt"; //array_시간_.txt
        try{
            /*
            "array_data.txt"라는 파일을 새로 만들거나 열어서 데이터를 쓸 준비를 해.
    •	    파일이 현재 디렉토리에 없으면 새로 생성돼.
            경로 포함 파일 이름도 가능 (예: "./Java/Array/data.txt")
            */
            FileWriter writer = new FileWriter(fileName);
            for (int num : numbers ){
                writer.write(num+"\n");
            }
            //파일쓰기 마무리 후 반환
            writer.close();
            System.out.println("배열 저장 완료");
    }catch(IOException e){
        e.printStackTrace();
    }
}
}