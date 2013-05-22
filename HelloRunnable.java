import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class HelloRunnable implements Runnable {
	public int c=0;
	public static Queue<String> qe = new LinkedList<String>();

    public void run() {
    	for(int i=0; i<10; i++){
    		increment();
    		qe.add(""+c);
    	}	
    }
    
    private synchronized void increment() {
		c++;
	}
    
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();
    
        qe.add("b");
        qe.add("a");
        qe.add("c");
        qe.add("e");
        qe.add("d");

        Iterator it = qe.iterator();
        while(it.hasNext()){
        	System.out.println(it.next());
        }
        
    }

}
