import java.util.Set;
import java.util.HashMap;

public class MapHashmatiqueTest {
    //Create a Hash Map
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        //Add key_value pairs (songs by John Legend)
        trackList.put("Ordinary People", "We're just ordinary people, We don't know which way to go");
        trackList.put("Written In The Stars", "You can go anywhere babe wherever you want, Because I know we're written in the stars");
        trackList.put("This Time", "This time I want it all, I'm showing you all the cards");
        trackList.put("All Of Me", "'Cause all of me Loves all of you");


    //get the keys by using the keySet method
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key)); 
        }
    }
}