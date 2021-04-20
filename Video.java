//Author Matthew Clark
public class Video extends Artifact{
    private int VideoID;
    private String Director;
    
    public Video (String t, String cfn, String cln, String d, int i, String Director)
    {
        super(t,cfn,cln,d,i);
        
        this.Director=Director;
        
    }
    
   
    
    //return and set Director Methods
    
    public String getDirector() {
        return Director;
        
    }
    
    public void setDirector(String Director) {
        this.Director = Director;
    }
    
}
