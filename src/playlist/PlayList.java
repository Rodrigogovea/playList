package playlist;
public class PlayList 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here   
        queue myPlayList = new queue(5);
        
        myPlayList.enqueue("Metallica - Nothing else matter");
        myPlayList.enqueue("Metallica - One");
        myPlayList.enqueue("Queen - We will rock you");
        myPlayList.enqueue("Toto - Africa");
        myPlayList.enqueue("The outfield - Your love");
 
        
        myPlayList.showItems();
        
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();
        myPlayList.dequeue();

        myPlayList.enqueue("The offspring - Why don't you get a job");
        myPlayList.enqueue("The offspring - Pretty fly");
        myPlayList.enqueue("The offspring - Want you bad");
        myPlayList.enqueue("The offspring - Come out and play");
        myPlayList.enqueue("The offspring - Gone away");

        myPlayList.enqueue("Maluma - ----");


        System.out.println("\n\nPendientes en la lista de reproducción: ");

        myPlayList.showItems();
    }
}
