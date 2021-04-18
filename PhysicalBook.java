public class PhysicalBook extends Book{
    private int copiesAvailable;
    private String location;
    
   public PhysicalBook(String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13, int copiesAvailable, String location){
        super(t,cfn,cln,d,i,ISBN,ISBN13);
        this.copiesAvailable = copiesAvailable;
        this.location = location;
    }

    /**
     * @return the copiesAvailable
     */
    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    /**
     * @param copiesAvailable the copiesAvailable to set
     */
    public void setCopiesAvailable(int copiesAvailable) {
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
