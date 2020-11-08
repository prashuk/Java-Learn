/**
 * Queue
 */
class Queue {

    int startIndex;
    int endIndex;
    int capacity;
    int currSize;
    Object[] queue;

    public Queue(int capacity) {
        this.startIndex = 0;
        this.endIndex = 0;
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.currSize = 0;
    }

    // Adding object to end of queue
    public void enqueue(int data) {
        if (currSize == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[endIndex] = data;
        endIndex++;
        if(endIndex == capacity) {
            endIndex = 0;
        }
        currSize++;
    }

    // Removing object from start of queue
    public void dequeue() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        startIndex++;
        if(startIndex == capacity) {
            startIndex = 0;
        }
        currSize--;
    }

    // Get the first object of queue
    public Object peek() {
        if(currSize == 0) {
            return "Queue is empty";
        }
        return queue[startIndex];
    }

    // Get the last object of queue
    public Object poll() {
        if(currSize == 0) {
            return "Queue is empty";
        }
        if(endIndex == 0) {
            return queue[4];
        }
        return queue[endIndex-1]; 
    }

    // Printing queue
    public void printQueue() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return;
        }

        boolean flag = false;
        if (currSize == capacity) {
            flag = true;
        }

        for(int i = startIndex; i != endIndex || flag; i = (i + 1) % capacity) {
            if (flag) {
                flag = false;
            }
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

/**
 * QueueArray
 */
public class QueueWithArray {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.printQueue();

        queue.enqueue(20);
        queue.printQueue();
        
        queue.enqueue(30);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();

        queue.enqueue(40);
        queue.printQueue();

        queue.enqueue(50);
        queue.printQueue();

        queue.enqueue(60);
        queue.printQueue();

        queue.enqueue(70);
        queue.printQueue();

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}