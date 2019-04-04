import java.util .*;
public class GarbageCollection {

	public static void main(String s[] ) throws 
	Exception 
	{
		Runtime rs = 
				Runtime.getRuntime();
		System.out.println("Free Memory in JMV before Garbage Collection = " +rs.freeMemory());
		rs.gc();
		System.out.println("Free Memory in JMV after Garbage Collection = " +rs.freeMemory());
				
		// TODO Auto-generated method stub

	}

}
