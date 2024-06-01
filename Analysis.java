package practical;
import java.io.*;
public class Analysis
{   
    public static void main(String[] args)
    {
        BufferedReader reader = null;
        int charCount = 0 , wordCount = 0 , lineCount = 0;
       try
        {
            reader = new BufferedReader(new FileReader("D:\\TEMP\\sample3.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;
                 
                for (String word : words)
                {
                    charCount = charCount + word.length();
                }
                 currentLine = reader.readLine();
            }
            System.out.println("***************");
            System.out.println("Demonstration of file analysis");
            System.out.println("****************");
             System.out.println("Number of character in file : "+charCount);
             System.out.println("Number of words in a file : "+wordCount);
             System.out.println("Number of lines in file : "+lineCount);
             System.out.println("---------------------------------------------------");
     		System.out.println("NAME :SHAILESH KUMAR  SECTION : I  Roll no: 50");
     		System.out.println("---------------------------------------------------");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();          
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }    
}

