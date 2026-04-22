package pkg20240544;

public class PostController {
    private Post model;
    private PostView view;

    public PostController(Post model, PostView view) {
        this.model = model;
        this.view = view;
    }

    public void addComment(String text) {
        model.addComment(text);
    }

    public void updateView() {
        view.printDetails(model.author, model.content, model.comments.size(), model.comments);
    }
}