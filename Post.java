package pkg20240544;
import java.util.ArrayList;

public class Post {
    public String author = "Hassan";
    public String content = "YOLO!";
    public ArrayList<String> comments = new ArrayList<>();

    public void addComment(String text) {
        comments.add(text);
    }
}