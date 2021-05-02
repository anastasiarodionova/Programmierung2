package aufgaben.aufgabe2;

public class MyInteger
{
	public static final int MAX_VALUE = 2147483647;
	public static final int MIN_VALUE = -2147483648;
	
	private int value;
	
	public MyInteger(int value)
	{
		this.value=value;
	}
	
	public MyInteger(String s) throws IllegalArgumentException {
		this.value = parseInt(s);
	}
	
	private static boolean isDigit(char c) {
		return (c=='0' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' ||
				c=='6' || c=='7' || c=='8' || c=='9');
	}
	
	private static int charToInt(char c) {
		int asciivalue = c;
		int intvalue = asciivalue-48; // 0 ist 048 bis 9 ist 057
		return intvalue;
	}
	
	public static int parseInt(String s) throws IllegalArgumentException {
		boolean negativ = false;
		if(s.length()==0) throw new IllegalArgumentException("leer");
		// pruefe, ob erstes Zeichen + oder -
		// merken und weiter mit Rest
		if(s.charAt(0)=='+') s = s.substring(1);
		else if(s.charAt(0)=='-') {
			s = s.substring(1);
			negativ = true;
		}
		if(s.length()==0) throw new IllegalArgumentException("nur '+' bzw. '-' --> keine Zahl");
		// entferne führende Nullen
		while(s.charAt(0)=='0') {
			s = s.substring(1);
		}
		for(int i=0; i<s.length(); i++) {
			if(!isDigit(s.charAt(i))) throw new IllegalArgumentException("keine Zahl!");
		}
		int exponent = 0;
		int zahl = 0;
		for(int i = s.length()-1; i>=0; i--) {
			zahl = zahl + charToInt(s.charAt(i))*(int)Math.pow(10, exponent);
			exponent++;
		}
		if(negativ) return -zahl;
		else return zahl;
	}
	
	public int intValue()
	{
		return this.value;
	}
	
	public double doubleValue()
	{
		return this.value;
	}
	
	public static MyInteger valueOf(String s) throws IllegalArgumentException {
		return new MyInteger(s);
	}
	
	public static MyInteger valueOf(int value)
	{
		return new MyInteger(value);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null) return false;
		if(this == other) return true; 
		if(this.getClass() != other.getClass())	return false; 	

		MyInteger otherInt = (MyInteger)other; 	
		return (this.value == otherInt.value); 
	}
	
	@Override
	public int hashCode()
	{
		return this.value;
	}
	
	@Override
	public String toString()
	{
		return value+"";
	}
}
