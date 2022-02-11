import java.io.File;

public final class Application
{
	public static void main(String[] args) 
	{
		//Load the unsorted key/definition pairs into the HashMap.
		Dictionary lexicon = new Dictionary(new File("text.txt"));
		
		//Print the unsorted dictionary keys and definitions from the HashMap.
		lexicon.print();
		System.out.println();
		
		//Search for words using HashMap.get(K).
		System.out.println(lexicon.define("wonted"));
		System.out.println();
		System.out.println(lexicon.define("appetency"));
		System.out.println();
		System.out.println(lexicon.define("larcener"));
		System.out.println();
		System.out.println(lexicon.define("recompense"));
		System.out.println();
		System.out.println(lexicon.define("therewith"));
		System.out.println();
		System.out.println(lexicon.define("CS215"));
		
	}//end main
}//end class
