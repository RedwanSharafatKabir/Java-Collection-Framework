package Collection;
import java.time.LocalDateTime;
import java.util.*;

public class Tweet_with_ArrayList {
    private String text;
    private String name;
    private LocalDateTime dateTime;
    
    public Tweet_with_ArrayList(String text,String name){
        this.text = text;
        this.name = name;
        this.dateTime = LocalDateTime.now();
    }
    
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public LocalDateTime dateTime(){
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }
    
    @Override
    public String toString(){
        return text+" - by "+name+" on "+dateTime.toString();
    }
}
interface Twitter {
    public void addTweet(Tweet_with_ArrayList tweet);
    public void printAllTweets();
}
class TwitterImpl implements Twitter{
    private List<Tweet_with_ArrayList> list = new ArrayList<>();
    
    @Override
    public void addTweet(Tweet_with_ArrayList tweet) {
        list.add(tweet);
    }

    @Override
    public void printAllTweets() {
        for(Tweet_with_ArrayList tweet: list){
            System.out.println(tweet);
        }
    }
    public static void main(String args []){
        Twitter twitter = new TwitterImpl();
        Tweet_with_ArrayList tweet = new Tweet_with_ArrayList("Welcome to my university"+" Daffodil International University. ","Daffodil Corporation.");
        
        twitter.addTweet(tweet);
        twitter.printAllTweets();
    }
}
