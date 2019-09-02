package ugtrivia_quizz_form;

import java.io.*;

// this is to fetch information from a txt file
public class MainFileStream 
{
    public static void showlines(String coursecode,int year, char startline, char endline)
    {
    String line = null;
    
    int currentLineNo = 0;
    
    BufferedReader into = null;
    try{
        
    into = new BufferedReader(new FileReader(coursecode));
    while(currentLineNo<startline)
    {
    if(into.readLine()== null)
    {
        throw new IOException("File of wrong size");
    
    }
    currentLineNo++;
    }
    while(currentLineNo<=endline)
    {
    line = into.readLine();
    if(line == null)
    {
        return;
    }
    System.out.println(line);
    currentLineNo++;
    }
}catch (IOException ex)
{
    System.out.println("Prpblem reading file");
}
}
}
