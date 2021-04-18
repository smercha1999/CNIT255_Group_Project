public class Book extends Artifact{
    private String ISBN;
    private String ISBN13;
    
    public Book (String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13){
        super(t,cfn,cln,d,i);
        this.ISBN = ISBN;
        this.ISBN13 = ISBN13;
    }
    
    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the ISBN13
     */
    public String getISBN13() {
        return ISBN13;
    }

    /**
     * @param ISBN13 the ISBN13 to set
     */
    public void setISBN13(String ISBN13) {
        this.ISBN13 = ISBN13;
    }

    
}

