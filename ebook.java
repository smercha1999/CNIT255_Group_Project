public class Ebook extends Book{
    private String link;
    
    public Ebook(String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13, String link){
        super (t,cfn,cln,d,i,ISBN,ISBN13);
        this.link=link;
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
    
}

