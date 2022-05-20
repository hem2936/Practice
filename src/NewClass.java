
public class NewClass {
	public static void main(String[] args) {
		String a = "market";
	   String b = "this is the man";
	   String c = "       bhajgh";
	   String n = "Note";
	   String m = "note";	   
	   int length = a.length();
	   System.out.println(length);
	   String upperCase = b.toUpperCase();
	   System.out.println(upperCase);
	   String lowerCase = b.toLowerCase();
	   System.out.println(lowerCase);
	   boolean startsWith = b.startsWith("this");
	   System.out.println(startsWith);
	   boolean endsWith = b.endsWith("man");
	   System.out.println(endsWith);
	   boolean contains = b.contains("is");
	   System.out.println(contains);
	   String replace = b.replace("man", "mennnnn");
	   System.out.println(replace);
	   String trim = c.trim();
	   System.out.println(trim);
	   char charAt = b.charAt(8);
	   System.out.println(charAt);
	   int indexOf = b.indexOf('s');
	   System.out.println(indexOf);
	   boolean equals = n.equals(m);
	   System.out.println(equals);
	   boolean equalsIgnoreCase = n.equalsIgnoreCase(m);
	   System.out.println(equalsIgnoreCase);
	   int lastIndexOf = b.lastIndexOf("man");
	   System.out.println(lastIndexOf);
	   String substring = b.substring(0);
	   System.out.println(substring);
	   String substring2 = b.substring(3, 9);
	   System.out.println(substring2);
	   
	   
		
	}

}
