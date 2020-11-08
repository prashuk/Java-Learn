/**
 * Queue
 */
class Queue {

    int end;
    int size;
    Object[] queue;

    public Queue(int size) {
        this.end = -1;
        this.size = size;
        this.queue = new Object[size];
    }

    // Adding object to end of queue
    public void enqueue(Object addData) {
        if(end == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        end++;
        queue[end] = addData;
    }

    // Removing object from start of queue
    public void dequeue() {
        if(end == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i = 0; i < end; i++) {
            queue[i] = queue[i+1];
        }
        queue[end] = 0;
        end--;
    }

    // Get the first object of queue
    public Object peek() {
        if(end == -1) {
            return "Queue is empty";
        }
        return queue[0];
    }

    // Get the last object of queue
    public Object poll() {
        if(end == -1) {
            return "Queue is empty";
        }
        return queue[end];
    }

    // Display queue
    public void printQueue() {
        if(end == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i <= end; i++) { 
            System.out.print(queue[i] + " "); 
        } 
        System.out.println();
    }
    
    // Get size after some operations
    public int getQueueSize() {
        return end+1;
    }
}

/**
 * QueueArray
 */
public class QueueArray {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();

        queue.enqueue(60);
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();

        System.out.println(queue.getQueueSize());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}