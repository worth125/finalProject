public class QueueReferenceBased  implements QueueInterface{
  private Node lastNode;

  public QueueReferenceBased() {
    lastNode = null;
  }  
  /** Determines whether a queue is empty.
      @returns true if the queue is empty; otherwise returns false.
  */
  public boolean isEmpty() {
    return lastNode == null;
  }  
  
  public int size(){
      int c = 0;
      
      if(!isEmpty()){
          Node n = lastNode.getNext();
          c++;
          while(n != lastNode){
              n = n.getNext();
              c++;
              
          }
      }
      return c;
  }
  /** Removes all items of a queue.
  */
  public void dequeueAll() {
    lastNode = null;
  }  
  /** Adds an item at the back of a queue.
      @param newItem is the item to be inserted.
      @throwsQueueException if newItem cannot be added to the queue.
  */
  public void enqueue(Object newItem) {
    Node newNode = new Node(newItem);

    // insert the new node
    if (isEmpty()) {
      // insertion into empty queue
      newNode.setNext(newNode);
    }
    else {
      // insertion into nonempty queue
      newNode.setNext(lastNode.getNext());
      lastNode.setNext(newNode);
    }  

    lastNode = newNode;  // new node is at back
   

 } 
  /** Retrieves and removes the front of a queue.
      @return the item that was added to the queue earliest 
         is returned 
      @throws QueueException if the operation is impossible
  */  
  public Object dequeue() throws QueueException {
    if (!isEmpty()) {
      // queue is not empty; remove front
      Node firstNode = lastNode.getNext();
      if (firstNode == lastNode) { // special case?
        lastNode = null;           // yes, one node in queue
      }
      else {
        lastNode.setNext(firstNode.getNext());
      }  
      return firstNode.getItem();
    }
    else {
      throw new QueueException("QueueException on dequeue:"
                             + "queue empty");
    } 
  }  
  /** Retrieves the item at the front of a queue.
      @return item at front of queue (do not remove)
      @throws QueueException if the operation is impossible
  */

  public Object peek() throws QueueException {
    if (!isEmpty()) {
      // queue is not empty; retrieve front
      Node firstNode = lastNode.getNext();
      return firstNode.getItem();
    }
    else {
      throw new QueueException("QueueException on peek:"
                             + "queue empty");
    } 
  }  

  public String toString(){
      String s;
      if(!isEmpty()){
          Node n = lastNode.getNext();
          s = n.getItem().toString();
          while(n != lastNode){
              n = n.getNext();
              s = s.concat(n.getItem().toString());
          }
      }
      else{
          s = "This Queue is Empty";
      }
      return s;
  } 
} 
