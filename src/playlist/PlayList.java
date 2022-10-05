package playlist;
public class PlayList 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        queue myPlayList = new queue(20);
        
        myPlayList.enqueue("Metallica - Nothing else matter");
        myPlayList.enqueue("Metallica - One");
        myPlayList.enqueue("Queen - We will rock you");
        myPlayList.enqueue("Toto - Africa");
        myPlayList.enqueue("The outfield - Your love");
        
        myPlayList.enqueue("Metallica - Nothing else matter");
        myPlayList.enqueue("Metallica - One");
        myPlayList.enqueue("Queen - We will rock you");
        myPlayList.enqueue("Toto - Africa");
        myPlayList.enqueue("The outfield - Your love");
        
        myPlayList.enqueue("Metallica - Nothing else matter");
        myPlayList.enqueue("Metallica - One");
        myPlayList.enqueue("Queen - We will rock you");
        myPlayList.enqueue("Toto - Africa");
        myPlayList.enqueue("The outfield - Your love");
        
        myPlayList.enqueue("Metallica - Nothing else matter");
        myPlayList.enqueue("Metallica - One");
        myPlayList.enqueue("Queen - We will rock you");
        myPlayList.enqueue("Toto - Africa");
        myPlayList.enqueue("The outfield - Your love");
        
        myPlayList.enqueue("The outfield - Your love 2");
        
        myPlayList.showItems();
        
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();

        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();

        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();

        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        
        System.out.println("\n\nPendientes en la lista de reproducción: ");
        myPlayList.showItems();
    }
}
