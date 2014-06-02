
/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 */
 
public class Link extends Post
{

    private String texto;
    private String url;


    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param username    The username of the author of this post.
     * @param text      The text of this post.
     * @param url      url adress
     */
    public Link (String username, String texto,String url){
        super(username);
        this.texto = texto;
        this.url = url;
    }
    public String getURL()
    {
      return  url;
    }
    /**
     * Return the text of this post.
     * 
     * @return The post's text.
     */
    public String getText()
    {   
        return texto;
    }

    
}
 