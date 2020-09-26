package absoluteBasics;
//https://www.tutorialspoint.com/How-to-create-a-string-from-a-Java-ArrayList#:~:text=To%20convert%20the%20contents%20of,using%20the%20toString()%20method.
import java.util.ArrayList;

public class String_ArrayList {
   public static void main(String args[]) {
      ArrayList<String> al = new ArrayList<String>();
      al.add("Hello");
      al.add("are");
      al.add("you");
      StringBuffer sb = new StringBuffer();
      
      for (String s : al) {
         sb.append(s);
         sb.append(" ");
      }
      String str = sb.toString();
      System.out.println(al);
      System.out.println(str);
   }
}
