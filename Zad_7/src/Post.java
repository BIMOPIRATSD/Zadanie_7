import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList<PostComment> comments;

    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String[] getTags() { return tags; }
    public ArrayList<PostComment> getComments() { return comments; }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
    public void setTags(String[] tags) { this.tags = tags; }
    public void setComments(ArrayList<PostComment> comments) { this.comments = comments; }

    @Override
    public String toString() {
        int contentLength = (content != null) ? content.length() : 0;
        String tagsStr = (tags != null) ? Arrays.toString(tags) : "null";
        String commentsStr = (comments != null) ? comments.toString() : "null";

        return "Post{title='" + title + "', content.length='" + contentLength + "', tags=" + tagsStr +
                ", comments=" + commentsStr + "}";
    }
}