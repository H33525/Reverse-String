import java.io.*;
class reversee
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String st= "The character is soooooo long";
	StringBuffer st1=new StringBuffer();
	st1.append(st1);
	st1=st1.reverse();
	System.out.print("Reverse="+ st1);

}
}