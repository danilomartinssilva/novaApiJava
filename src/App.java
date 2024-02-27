
import java.util.List;

public class App {

    public static void main(String[] args) {
        IPostService postService = new JsonPlaceholderPostService();
        List<Post> posts = postService.fetchPosts();

        posts.forEach(post -> {
            System.out.println("Title: " + post.getTitle());
            System.out.println("Body: " + post.getBody());
            System.out.println();
        });
    }
}
