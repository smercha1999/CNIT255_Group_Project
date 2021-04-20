//Author Matthew Clark
public class Image extends Artifact{
   
    private String Location;
    
    public Image (String t, String cfn, String cln, String d, int i, String Location)
    {
        super(t,cfn,cln,d,i);
        this.ImageID = ImageID;
        this.Location=Location;
        
    }

    public Image() {

    }

  
    
    //return and set Location Methods
    
    public String getLocation() {
        return Location;
        
    }
    
    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    
}

