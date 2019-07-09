import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public void replaceWithLeon(){     //make method that replace Hamlet with Leon
        Pattern pattern = Pattern.compile("\\bHamlet|Hamlets\\b");// "Pattern" is utilizing regex to identify a specified pattern which is "Hamlet/Hamlets"
        Matcher matcher = pattern.matcher(hamletData);// Matcher matcher is referencing the body of text that we want to search through which is "hamletData"
        hamletData = matcher.replaceAll("Leon"); //matcher.replaceAll is replacing "pattern" (Hamlet|Hamlets) which is now "matcher" with "Leon"

    }


    public  void replaceWithTariq(){   //make method that replace Horatio with Tariq
        Pattern pattern = Pattern.compile("\\bHoratio|Horatios\\b");
        Matcher matcher = pattern.matcher(hamletData);
        hamletData = matcher.replaceAll("Tariq");

    }



    public String getHamletData(){


        return hamletData;
    }

}
