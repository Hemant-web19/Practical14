/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author govin
 */
public class TextAnalyzer {

    /**
     * @param args the command line arguments
     */
    
    private String inputText ; 
    private int textLength ;
    private int WordCount ; 
    private int lineCount ; 
    private int tabCount ; 
    private int spaceCount ; 
    private String uniqueChaText ; 

    public TextAnalyzer(String inputText) {
        this.inputText = inputText;
        analyze();
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return WordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public String getUniqueChaText() {
        return uniqueChaText;
    }
    
    private void  TextLength(){
        
        textLength = inputText.length() ; 
        
    }
    private void wordCount(){
        String [] arr = inputText.split("[\n\t ]") ;
    }
    
   void analyze(){
       
   }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
