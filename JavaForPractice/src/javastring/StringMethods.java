package javastring;

public class StringMethods {

	public static void main(String[] args) {
	
		//Java String toUpperCase() and toLowerCase() method
	
	String s= "Nawaz";
	
	System.out.println(s.toUpperCase());
	
	System.out.println(s.toLowerCase());
	
	System.out.println("-------------");
	
	//Java String trim() method (The string trim() method eliminates white spaces before and after string.)
	
	String n=" Areeb ";
	
	System.out.println(n.trim());
	
	System.out.println("-------------");
	
	//Java String startsWith() and endsWith() method
	
	System.out.println(s.startsWith("Na"));
	System.out.println(s.endsWith("z"));
	
	System.out.println("-------------");
	
	//Java String charAt() method
	
	System.out.println(s.charAt(1));
	System.out.println(s.charAt(4));
	
	System.out.println("-------------");
	
	//Java String length() method
	
	System.out.println(s.length());
	
	System.out.println("-------------");
	
	//Java String valueOf() method. (The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string).
	
	int a=10;
	String v=String.valueOf(a);
	System.out.println(v);
	
	System.out.println("-------------");
	char c='f';
	String D=String.valueOf(c);
	System.out.println(D+c);
	
	System.out.println("-------------");
	
	String[] arr= new String[3];
	arr[0]="Jaman";
	arr[1]="Rumman";
	arr[2]="Kamal";
	
	String Arr= String.valueOf(arr[2]);
	System.out.println(Arr);
	
	System.out.println("-------------");
	
	//Java String replace() method. (The string replace() method replaces all occurrence of first sequence of character with second sequence of character.)
	
	String line= "Smoking is injurious to health. Smoking means loss of money. We should avoid Smoking";
	
	String replace=line.replace("Smoking", "Drinking");
	System.out.println(replace);
	
	System.out.println("-------------");
	
	String line1= "Java is a programing language. Java is fun to learn. Java is essential for developing software";
	String replace1=line1.replace("Java", "Kava");
	System.out.println(replace1);
	
	System.out.println("-------------");
	
	String replace2=line.replace('o', 'i');
	System.out.println(replace2);
	
	System.out.println("-------------");
	
   //	String Concatenation
	
	String name=s.concat(" Ahmed");
	System.out.println(name);
	
	System.out.println("-------------");

	String name1=("Areeb"+" Nawaz");
	System.out.println(name1);
	
	System.out.println("-------------");
	
  // String comparison: we can compare by.equals() method, By = = operator, By compareTo() method (s1 == s2 :0; s1 > s2   :positive value; s1 < s2   :negative value).
	
	String player1="Virat";
	String player2="Virat";
	String player3= new String("Virat");
	String player4="Rohit";  
	
	System.out.println(player1.equals(player2));
	System.out.println(player2.equals(player3));
	System.out.println(player2.equals(player4));

	System.out.println("-------------");
	
	String p1="SAKIB";
	String p2="sakib";
	String p3="Mahmudullah";
	String p4="Reza";
	String p5="Reda";
	
	System.out.println(p1.equalsIgnoreCase(p2));
	
	System.out.println("-------------");
	
	System.out.println(player1==player2);
	System.out.println(player1==player3);
	
	System.out.println("-------------");
	
	System.out.println(player1.compareTo(player2));
	System.out.println(p3.compareTo(player2));
	System.out.println(player2.compareTo(p3));
	System.out.println(p1.compareToIgnoreCase(p2));
	System.out.println(p1.compareTo(p3));
	System.out.println(p5.compareTo(p4));
	
	System.out.println("-------------");
	
	/*Java String compareTo(): empty string--If you compare string with blank or empty string, it returns length of the string. 
	 * If second string is empty, result would be positive. If first string is empty, result would be negative.
	 */
	
	String Car1="Toyota";
	String Car2="";
	String Car3="Honda";
	
	System.out.println(Car1.compareTo(Car2));
	System.out.println(Car2.compareTo(Car3));
	System.out.println(Car1.compareTo(Car3));
	
	System.out.println("-------------");
	
/*     Java Substring: A part of string is called substring. In other words, substring is a subset of another string. In case of substring startIndex is inclusive and endIndex is exclusive.
*      public String substring(int startIndex): This method returns new String object containing the substring of the given string from specified startIndex (inclusive).
*	    public String substring(int startIndex, int endIndex): This method returns new String object containing the substring of the given string from specified startIndex to endIndex.	
	*/
      System.out.println(p3.substring(0));
      System.out.println(p3.substring(0, 5));
      System.out.println(p3.substring(6));
      System.out.println(p3.subSequence(2, 7));
      
      System.out.println("-------------");
      
   // Java StringBuffer class: Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e.
  //  it can be changed.
      
      
      StringBuffer sb= new StringBuffer("Hello ");
      sb.append("How are u?");
      System.out.println(sb);
      
      System.out.println("-------------");
      
      //The insert() method inserts the given string with this string at the given position.
      sb.insert(5, "Nawaz, ");
      System.out.println(sb);
      
      System.out.println("-------------");
      
      //The replace() method replaces the given string from the specified beginIndex and endIndex.
      
      sb.replace(0, 5, "Reza:");
      System.out.println(sb);
      
      System.out.println("------------");
      
      //The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
      
      sb.delete(0, 5);
      System.out.println(sb);
      sb.deleteCharAt(16);
      System.out.println(sb);
      
      System.out.println("------------");
      
      //The reverse() method of StringBuffer class reverses the current string.
      
      sb.reverse();
      System.out.println(sb);
      
      System.out.println("------------");
      
      /*The capacity() method of StringBuffer class returns the current capacity of the buffer. 
      The default capacity of the buffer is 16. If the number of character increases from its current capacity, 
      it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34./*/
      
      StringBuffer sb1= new StringBuffer();
      
      System.out.println(sb1.capacity());
      sb1.append("Wallace ");
      System.out.println(sb1.capacity());
      sb1.append("is the avenue where i live with my family.");
      System.out.println(sb1.capacity());
      
      System.out.println("-----------");
      
      /*The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity.
       * If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. 
       * For example if your current capacity is 16, it will be (16*2)+2=34.
       */
      
      StringBuffer sb2= new StringBuffer();
      sb2.append("The Bronx ");
      System.out.println(sb2.capacity());
      sb2.append("is one of the biggest borrough among the 5 borroughs.");
      System.out.println(sb2.capacity());
      sb2.ensureCapacity(10);
      System.out.println(sb2.capacity());
      sb2.ensureCapacity(70);
      System.out.println(sb2.capacity());
      
      System.out.println("-------------");
      
      int i=sb2.length();
      System.out.println(i);
      
      char carr=sb2.charAt(22);
      System.out.println(carr);
      
      String e=sb2.substring(5);
      System.out.println(e);
      String f=sb2.substring(0, 9);
      System.out.println(f);
      
      System.out.println("----------");
      
      //Write a java program to tOGGLE each word in string
      
     StringBuffer sb3= new StringBuffer("this is javatpoint");
     sb3.replace(1, 18, "HIS iS jAVAPOINT");
     System.out.println(sb3);
    
     
     System.out.println("---------");
      
     String world= "The world is not enough";
     
     StringBuilder sbl= new StringBuilder(world);
     sbl.reverse();
     System.out.println(sbl);
     
    System.out.println("---------");
    
  /*Java Convert String to int: We can convert String to an int in java using Integer.parseInt() method.
    To convert String into Integer, we can use Integer.valueOf() method which returns instance of Integer class./*/
    
    String number2="400";
    int t3=Integer.parseInt(number2);
    System.out.println(t3);
    
    String number="300";
    int t=Integer.valueOf(number);
    System.out.println(t);
    
    System.out.println("--------");
    
    /*Java Convert int to String: We can convert int to String in java using String.valueOf() and Integer.toString() methods.
     *  Alternatively, we can use String.format() method, string concatenation operator etc.
     */
    
    int door=4;
    String d1= String.valueOf(door);
    System.out.println(d1);
    
   String d2= Integer.toString(door);
   System.out.println(d2);
   
   System.out.println("----------");
   
   



	
	
}
}