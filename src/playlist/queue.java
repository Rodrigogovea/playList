
package playlist;
public class queue 
{
    private int front, rear, size, capacity;
    private String queueArray[];
    
    queue(int theCapacity)
    {
        this.queueArray = new String[theCapacity];
        capacity = theCapacity;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    
    public void enqueue(String dato)
    {
        if(!isFull())
        {
            queueArray[rear] = dato;
            size++;
            rear++;
            System.out.println("Se agregó a la playlist: " + dato);
        }
        else
        {
            System.out.println("La  playList ya está llena...");
        }
    }
    public void dequeue()
    {
        if(!isEmpty())
        {
            String aux = queueArray[front];
            queueArray[front] = "";
            front++;
            System.out.println("Reproduciendo: " + aux + " ...............");
            size--;
            //reorganize();
        }
        else
            System.out.println("No hay elementos en la playList...");
    }
    
    public String getFront()
    {
        return this.queueArray[front];
    }
    public String getRear()
    {
        return this.queueArray[rear];
    }
    
    public int getSize()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        if(size == 0)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if((queueArray.length) == size)
            return true;
        else
            return false;
    }
    
    public void showItems()
    {
        System.out.println("\n - My playlist -");
        for(int i=front; i<rear; i++)
        {
            System.out.println(i+1 + " .- " + this.queueArray[i]);
        }
        System.out.println("_________________________________________________");
    }
    public int getCapacity()
    {
        return this.capacity;
    }
    public void reorganize()
    {
        //for (int i = )
    }
}
