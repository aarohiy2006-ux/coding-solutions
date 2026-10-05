class MyCircularQueue {
    int front=-1;
    int rear=-1;

    int[] queue;
    public MyCircularQueue(int k) {
     queue=new int[k];
    }
    
    public boolean enQueue(int value) {
        
    if((rear+1)%queue.length==front){
        return false;
    }
    if(front==-1){
    front=0;}
    rear=(rear+1)%queue.length;
    queue[rear]=value;
    return true;
    }
    
    public boolean deQueue() {
        if(front==-1){
            return false;
        }
        int value=queue[front];
        if(front==rear){
            front=rear=-1;
        }    
        else{front=(front+1)%queue.length;
        }
       return true;
        }
    
    public int Front() {
        if(front==-1){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(rear==-1){
            return -1;
        }
        return queue[rear];
    }
    
    public boolean isEmpty() {
       return front==-1;
    }
    
    public boolean isFull() {
        return (rear+1)%queue.length==front;
        }
    }


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */