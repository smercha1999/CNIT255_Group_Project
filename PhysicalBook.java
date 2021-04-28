public class PhysicalBook extends Book{
    private String copiesAvailable;
    private String location;

    public PhysicalBook(){
        super(null,null,null,null,-1,null,null);
        this.copiesAvailable = null;
        this.location = null;
    }
   public PhysicalBook(String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13, String copiesAvailable, String location){
        super(t,cfn,cln,d,i,ISBN,ISBN13);
        this.copiesAvailable = copiesAvailable;
        this.location = location;
    }

    /**
     * @return the copiesAvailable
     */
    public String getCopiesAvailable() {
        return String.valueOf(copiesAvailable);
    }

    /**
     * @param copiesAvailable the copiesAvailable to set
     */
    public void setCopiesAvailable(String copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
   
}
