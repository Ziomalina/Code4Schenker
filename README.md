# Faulty mailbox
### DB Schenker challenge #CODE4SCHENKER


CODE TASK FOR 30 PTS
Introduction
Something is wrong with your mailbox. You have noticed that messages are not in chronological order and some of your clients are getting angry waiting while the others are on the top of your list. That need to change.
 
Do that by implementing FIFO queue system for your inbox.
 
Requirements
Your queue should be size of N
It should have two methods:
push()that inserts message into queue
pull()which extracts earliest message that got into your queue
In case of overfilled queue or using pull() method on empty mailbox, custom exceptions (created outside mailbox class) should be thrown as described below.
 
Constraints:
message is in string format
0 < N < 150
In case of full queue and calling push() method:
FullQueueError:'Queue full'
In case of calling pull() method on empty mailbox:
EmptyMailboxError:'No messages'
 
Example unit tests
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
 
try {
	mailbox.pull();
    Assert.fail("Empty Mailbox");
    }catch (EmptyMailboxError error) {
    	assertEquals("No messages", error.getMessage());
}



//--------------------------------------------------------------------

class Mailbox{
	int mailbox_size;
    public Mailbox(int N){
    	mailbox_size = N;
    }
    // implement queue
	public String pull() throws EmptyMailboxError{
    	// handle pull request 
    }
    public void push(String message) throws FullQueueError{
    	// handle push request 
    }
}
