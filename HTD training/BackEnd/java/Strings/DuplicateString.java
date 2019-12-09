import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

public class DuplicateString 
{
	static void findDuplicateWord(String str)
	{
		HashMap<String,Integer> hm=new HashMap<>();
		String[] s=str.split(" ");
		for(String tempString : s)
		{
	     if(tempString!=null)
	     {
	     hm.put(tempString,hm.get(tempString)+1);
	     }
		hm.put(tempString, 1);	
	}
	
public static void main(String[] args)
{
findDuplicateWord("i am am learning java java");	
}
}
