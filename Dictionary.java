import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Carl
 * @version 1.0 
 * Assignment 5.1
 */ 
public class Dictionary
{
    protected HashMap<String, String> dictionary;
    
    /**
     * allocates the HashMap object
     */ 
    public Dictionary()
    {
        dictionary = new HashMap<>(101, 0.5f);
    }//end empty-argument constructor
    
    /**
     * load the unsorted key/definition pairs into the HashMap
     */ 
    public Dictionary(File file)
    {
        this();
        load(file);
    }//end constructor
    
    /**
     * load the unsorted key/definition pairs into the HashMap
     */ 
    public void load(File file)
    {
        Scanner input = null;
        try
        {
            input = new Scanner(file);
            while (input.hasNext())
                dictionary.put(input.next(), input.nextLine());
        }
        catch (FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally 
        {
            if (input != null)
                input.close();
        }
    }//end load
    
    /**
     * @return a String representation of the definition for the argument, if the argument is defined in the dictionary
     */ 
    public String define(String word)
    {
        if (!dictionary.containsKey(word))
            return word+" is not defined in this dictionary.";
        else
            return "The hashkey for this word is "+word.hashCode()+"\n"+word+" - "+dictionary.get(word).trim()+".";
    }//end define
    
    /**
     * prints the unsorted dictionary keys and definitions
     */ 
    public void print()
    {
        Set<String> keys = dictionary.keySet();
        Collection<String> values = dictionary.values();
        Iterator<String> words = keys.iterator();
        Iterator<String> definitions = values.iterator();
        while (words.hasNext())
        {
            String sentence = words.next()+" - "+definitions.next().trim()+".";
            System.out.println(sentence);
        }
    }//end print
    
    /**
     * @return the number of entries in this dictionary
     */ 
    public int size()
    {
        return dictionary.size();
    }//end size
}//end class