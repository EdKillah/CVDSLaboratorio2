package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args!=null){
			for (int i=0; i<args.length; i++){
        	System.out.print( args[i] + " ");
			}
    	}else{
        	System.out.println( "Hello World!" );
    	}
    }
}
