import java.util.*;

public class ScannerTest {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String inputData;

        while(true){
            inputData = scan.nextLine();
            System.out.println("입력된 문자열 : \"" + inputData + "\"");
            if (inputData.equals("q"))
                break;
        }
        System.out.println("종료");
    }
}
