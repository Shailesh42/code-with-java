package practical;
import java.io.*;
class Demoio implements java.io.Serializable
{  
	public int a;
	public String b;
	public Demoio(int a, String b)
	{  
		this.a = a;
		this.b = b;
	}
}
public class Demo
{ 
	public static void main(String[] args)
	{
		System.out.println("*********************************************");
		System.out.println("Demonstrating a object serilaization and object de serialization");
		System.out.println("NAME :SHAILESH KUMAR  SECTION : I  Roll no: 50");
		System.out.println("**********************************************");
		Demoio object = new Demoio(1, "All The Bright Places");
		String filename = "file.ser";
		try
		{ 
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		Demoio object1 = null;
		try
		{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			object1 = (Demoio)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}
		catch(IOException ex)
		{  
			System.out.println("IOException is caught");
         }
        catch(ClassNotFoundException ex)
		{ 
        	System.out.println("ClassNotFoundException is caught");
        }
		System.out.println("END OF THE PROGRAM ");
     }
 }
