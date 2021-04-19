public class Book extends Artifact implements book_review{
    private String ISBN;
    private String ISBN13;
    
    public Book (String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13){
        super(t,cfn,cln,d,i);
        this.ISBN = ISBN;
        this.ISBN13 = ISBN13;
    }

    public Book() {
        super();
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

public void ratingScore()
{
    int score = 0;
    score=10;
    System.out.println(score);
}

    @Override
    public void ratingCount() {
        int count = 0;
        count = 1000;
        System.out.println(count);
    }
}

