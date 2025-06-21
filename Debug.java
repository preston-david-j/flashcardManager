import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Debug {
    public static void timestmapedOutput(String message){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss.SSSS");
        String now = LocalDateTime.now().format(formatter);

        System.out.println("[" + now + "]: " + message);
    }

    public static void printArray(String[] array){
        String amalgamation = "";
        for(String str : array){
            amalgamation += str + ", ";
        }

        timestmapedOutput(amalgamation.substring(0, amalgamation.length()-2));
    }
}
