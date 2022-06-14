import java.time.LocalDate;

public class UserPosts {

    private String username;
    private String post;
    private LocalDate postDate;

    public UserPosts(String username, String post)
    {
        this.username = username;
        this.post = post;
        this.postDate = LocalDate.now();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }
}
