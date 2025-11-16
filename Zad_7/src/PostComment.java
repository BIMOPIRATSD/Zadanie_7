import java.util.ArrayList;
import java.util.Arrays;

public class PostComment {
    private String text;
    private String[] whoLiked;

    public String getText() { return text; }
    public String[] getWhoLiked() { return whoLiked; }

    public void setText(String text) { this.text = text; }
    public void setWhoLiked(String[] whoLiked) { this.whoLiked = whoLiked; }

    @Override
    public String toString() {
        String likedStr = (whoLiked != null) ? Arrays.toString(whoLiked) : "null";
        return "PostComment{text='" + text + "', whoLiked=" + likedStr + "}";
    }
}