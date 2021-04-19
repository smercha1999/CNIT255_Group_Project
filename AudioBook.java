public class AudioBook extends Book{
    private String narrator;
    private String link;
    private int length;
    
    public AudioBook(String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13, String narrator, String link, int length){
        super (t,cfn,cln,d,i,ISBN,ISBN13);
        this.narrator = narrator;
        this.link = link;
        this.length = length;
    }

    /**
     * @return the narrator
     */
    public String getNarrator() {
        return narrator;
    }

    /**
     * @param narrator the narrator to set
     */
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }
}
