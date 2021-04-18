//Author Matthew Clark
public class Video extends Artifact{
    private int VideoID;
    private String Director;
    
    public Video (String t, String cfn, String cln, String d, int i, int ImageID, String Location)
    {
        super(t,cfn,cln,d,i);
        this.VideoID = ImageID;
        this.Director=Director;
        
    }
    
    //return and set videoID methods
    
    public int getVideoID() {
       return VideoID;
    }
    
    public void setVideoID(int VideoID) {
        this.VideoID = VideoID;
    }
    
    //return and set Director Methods
    
    public String getDirector() {
        return Director;
        
    }
    
    public void setDirector(String Director) {
        this.Director = Director;
    }
    
}
