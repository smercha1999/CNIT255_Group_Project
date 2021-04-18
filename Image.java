//Author Matthew Clark
public class Image extends Artifact{
    private int ImageID;
    private String Location;
    
    public Image (String t, String cfn, String cln, String d, int i, int ImageID, String Location)
    {
        super(t,cfn,cln,d,i);
        this.ImageID = ImageID;
        this.Location=Location;
        
    }
    
    //return and set imageID methods
    
    public int getImageID() {
       return ImageID;
    }
    
    public void setImageID(int ImageID) {
        this.ImageID = ImageID;
    }
    
    //return and set Location Methods
    
    public String getLocation() {
        return Location;
        
    }
    
    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    
}
