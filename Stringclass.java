public class Test { 
  public static void main(String args[]) { 
      String str1 = "Not immutable"; 
      String str2 = "Strings are immutable"; 
      StringBuffer str3 = new StringBuffer( "Not immutable"); 
      boolean  result = str1.contentEquals( str3 ); 
      System.out.println(result);  
      result = str2.contentEquals( str3 ); 
      System.out.println(result); 
  } 
} 
public class Test { 
  public static void main(String args[]) { 
      char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'}; 
      String Str2 = ""; 
      Str2 = Str2.copyValueOf( Str1 ); 
      System.out.println("Returned String: " + Str2); 
  } 
}
public class Test { 
  public static void main(String args[]) { 
      char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'}; 
      String Str2 = ""; 
      Str2 = Str2.copyValueOf( Str1, 2, 6 ); 
      System.out.println("Returned String: " + Str2); 
  } 
}
public class Test { 
  public static void main(String args[]) { 
      String Str = new String("This is really not immutable!!"); 
      boolean retVal; 
      retVal = Str.endsWith( "immutable!!" ); 
      System.out.println("Returned Value = " + retVal ); 
      retVal = Str.endsWith( "immu" ); 
      System.out.println("Returned Value = " + retVal ); 
  } 
} 
 
public class Test { 
  public static void main(String args[]) { 
      String Str1 = new String("This is really not immutable!!"); 
      String Str2 = Str1; 
      String Str3 = new String("This is really not immutable!!"); 
      boolean retVal; 
      retVal = Str1.equals( Str2 ); 
      System.out.println("Returned Value = " + retVal ); 
      retVal = Str1.equals( Str3 ); 
      System.out.println("Returned Value = " + retVal ); 
  } 
} 
public class Test { 
   public static void main(String args[]) { 
      String Str1 = new String("This is really not immutable!!"); 
      String Str2 = Str1; 
      String Str3 = new String("This is really not immutable!!"); 
      String Str4 = new String("This IS REALLY NOT IMMUTABLE!!"); 
      boolean retVal; 
      retVal = Str1.equals( Str2 ); 
      System.out.println("Returned Value = " + retVal ); 
      retVal = Str1.equals( Str3 ); 
      System.out.println("Returned Value = " + retVal ); 
      retVal = Str1.equalsIgnoreCase( Str4 ); 
      System.out.println("Returned Value = " + retVal ); 
   } 
} 