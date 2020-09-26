package absoluteBasics;

//https://stackoverflow.com/questions/11065517/eclipse-message-saying-list-cannot-be-resolved-to-a-type
import java.util.ArrayList;
import java.util.List;

//https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
public class ArrayList2IntArrayPrimitive {
	public static String[] convertString(List<String> strings)
	{
	    String[] ret = new String[strings.size()];
	    for (int i=0; i < ret.length; i++)
	    {
//	    	https://www.javatpoint.com/java-string-valueof
	    	ret[i] =String.valueOf(strings.get(i)); 
	        
	    }
	    return ret;
	}
	
}
