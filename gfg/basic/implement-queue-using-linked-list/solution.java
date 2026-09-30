// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {
Node front;
Node rear;
int size;
    public myQueue() {
        front =null;
        rear=null;
        size=0;
        // Initialize your data members
    }

    public boolean isEmpty() {
        return  size==0;
       } // check if the queue is empty
    

    public void enqueue(int x) {
        Node newNode= new Node(x);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }
        else{
        rear.next=newNode;
        rear=newNode;
        }
        size++;// Adds an element x at the rear of the queue.
    
        
    }

    public void dequeue(){
        if(isEmpty()){
            return;
            
        }
            front=front.next;
            size--;
        
        if(size==0){
            rear=null;
        }
        }// Removes the front element of the queue
    
        
    

    public int getFront() {
       if(isEmpty()){
            return -1;
        }
        return front.data;// Returns the front element of the queue.
        // If queue is empty, return -1.
    }

    public int size() {
        return size;
        // Returns the current size of the queue.
    }
}
