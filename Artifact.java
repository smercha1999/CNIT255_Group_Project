public class Artifact {
    
    private String title;
    private String creatorFirstName;
    private String creatorLastName;
    private String dateOfCreation;
    private int ID;
    private String borrowerID;
    private String borrowerFirstName;
    private String borrowerLastName;
    private Boolean isAvailable = true;

    public Artifact(String t, String cfn, String cln, String d, int i){
        title = t;
        creatorFirstName = cfn;
        creatorLastName = cln;
        dateOfCreation = d;
        ID = i;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the creatorFirstName
     */
    public String getCreatorFirstName() {
        return creatorFirstName;
    }

    /**
     * @param creatorFirstName the creatorFirstName to set
     */
    public void setCreatorFirstName(String creatorFirstName) {
        this.creatorFirstName = creatorFirstName;
    }

    /**
     * @return the creatorLastName
     */
    public String getCreatorLastName() {
        return creatorLastName;
    }

    /**
     * @param creatorLastName the creatorLastName to set
     */
    public void setCreatorLastName(String creatorLastName) {
        this.creatorLastName = creatorLastName;
    }

    public String getCreatorName(){
        return creatorFirstName + " " + creatorLastName;
    }
    /**
     * @return the dateOfCreation
     */
    public String getDateOfCreation() {
        return dateOfCreation;
    }

    /**
     * @param dateOfCreation the dateOfCreation to set
     */
    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the borrowerID
     */
    public String getBorrowerID() {
        return borrowerID;
    }

    /**
     * @param borrowerID the borrowerID to set
     */
    public void setBorrowerID(String borrowerID) {
        this.borrowerID = borrowerID;
    }

    /**
     * @return the borrowerFirstName
     */
    public String getBorrowerFirstName() {
        return borrowerFirstName;
    }

    /**
     * @param borrowerFirstName the borrowerFirstName to set
     */
    public void setBorrowerFirstName(String borrowerFirstName) {
        this.borrowerFirstName = borrowerFirstName;
    }

    /**
     * @return the borrowerLastName
     */
    public String getBorrowerLastName() {
        return borrowerLastName;
    }

    /**
     * @param borrowerLastName the borrowerLastName to set
     */
    public void setBorrowerLastName(String borrowerLastName) {
        this.borrowerLastName = borrowerLastName;
    }
   
    public String getBorrowerName(){
        return borrowerFirstName + " " + borrowerLastName;
    }

    /**
     * @return the isAvailable
     */
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
