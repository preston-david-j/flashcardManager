import java.io.File;

public class FileManager 
{
    public static String[] directories;
    
    public static void InitFileManager(){
        File folder = new File("data");
        File[] childDirectories = folder.listFiles(File::isDirectory);

        directories = new String[childDirectories.length];
        for(int i = 0 ; i < childDirectories.length; i++){
            directories[i] = childDirectories[i].getName();
        }
        
        Debug.printArray(directories);
    }
}
