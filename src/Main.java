import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 2;
		String test_message = new String("message 1");
		String test_message_2 = new String("message 2");

		Mailbox mailbox = new Mailbox(N);
		
		
		try{
			mailbox.push(test_message);
			mailbox.push(test_message_2);
		 
			mailbox.pull().equals(test_message);
			mailbox.pull().equals(test_message_2);
		}
		catch(Exception e){}
		 
		

	}

}



class Mailbox {
	int mailbox_size;
	ArrayList<String> mails;
	int numMails;

	public Mailbox(int N) {
		mailbox_size = N;
		mails = new ArrayList<>(N);
		numMails = 0;
	}

	// implement queue
	public String pull() throws EmptyMailboxError {
		if (numMails == 0) {
			throw new EmptyMailboxError("No messages" );
		}
		String result = mails.get(numMails - 1);
		
		numMails--;
		
		
		
		return result;

	}

	public void push(String message) throws FullQueueError {
		if (numMails == mailbox_size) {
			throw new FullQueueError("Queue full");
		}
		
		mails.set(numMails, message);
		numMails++;
	}
  
 
  private class EmptyMailboxError extends Exception {
    
    public EmptyMailboxError(String msg) {
		super(msg);
	} 
    
    

	} 
  
  
  private class FullQueueError extends Exception {
    
    public FullQueueError(String msg) {
		super(msg);
	} 
    

	}
  
  
} 
