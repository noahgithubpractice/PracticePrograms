package secretmessage;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author noah
 */
public class SecretMessage {

    private static final String fileName = "/Users/noah/Desktop/PracticePrograms/java programs/SecretMessage/src/secretmessage/Pictures";
    //private static final String newName = "/Users/noah/Desktop/PracticePrograms/java programs/TakeABreak/src/pictures/NoahAbdelguerfi.jpg";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File dir = new File(fileName);
       //File fileNew = new File(newName);
        
       if(dir.isDirectory()){
            for(final File file: dir.listFiles()){

                System.out.println(file.getName());
                String name = file.getName();
                name = name.replaceAll("[0-9]","");
                
                file.renameTo(new File(fileName + "/" + name));
            
            }
    }
    
}

}
