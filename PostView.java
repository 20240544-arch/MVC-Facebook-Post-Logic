package pkg20240544;
import java.util.ArrayList;

public class PostView {
    public void printDetails(String user, String postContent, int count, ArrayList<String> allComments) {
        System.out.println(user + " posted : " + postContent);
        System.out.println("number of comments : " + count);
        for (String c : allComments) {
            System.out.println("Omar commented : " + c);
        }
        System.out.println("----------------------------");
    }
}