package playlist;
public class PlayList 
{
    public static void main(String[] args) 
    {
<<<<<<< HEAD
        // TODO code application logic here   
        queue myPlayList = new queue(20);
=======
        // TODO code application logic here
        queue myPlayList = new queue(5);
>>>>>>> 22b0a7562611a0fd354b93401d5d5594dd717248
        
        myPlayList.enqueue("Metallica - Nothing else matter");
        myPlayList.enqueue("Metallica - One");
        myPlayList.enqueue("Queen - We will rock you");
        myPlayList.enqueue("Toto - Africa");
        myPlayList.enqueue("The outfield - Your love");
        
        myPlayList.showItems();
        
        myPlayList.dequeue();

        System.out.println("\n\nPendientes en la lista de reproducción: ");
        myPlayList.showItems();
    }
}
