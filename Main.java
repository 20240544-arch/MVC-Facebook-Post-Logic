/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20240544;

/**
 *
 * @author mahmoud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Post model = new Post();
        PostView view = new PostView();
        PostController controller = new PostController(model, view);

        controller.updateView();

        System.out.println("After adding a comment ->");
        controller.addComment("widsom :D");

        controller.updateView();
    }
    
}
