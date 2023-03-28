import java.io.*;


/**
 *<H1>Add Two Numbers!</H1>
 * The AddNum program implements an application that
 * simply adds two given Integer numbers and Prints
 * the output on the screen
 * <p>
 * <b>Note:</b> Giving propoer comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 * 
 * @author Ferdi
 * @version 1.0
 * @since 2023-24-1
 */
public class AddNum {

    /**
     * This method is used to add two integers. This is
     * a the simplest form of a class method, just to
     * show the usage of various javadoc Tags.
     * @param numA this is in the first parameter to addNum method
     * @param numB This is the second parameter to addNum method
     * @return int This returns sum of numA and numB
     */
    public int addNum(int numA, int numB){
        return numA + numB;
    }

    /**
     * This is the main method which makes use of addNum method.
     * @param args Unused.
     * @exception IOException on input error.
     * @see IOException
     */
    public static void main(String args[]) throws IOException {
        AddNum obj = new AddNum();
        int sum = obj.addNum(10,20);
        
        System.out.println("Sum of 10 and 20 is :"+ sum);
    }
}