
public class Video extends Artifact{
 
    private String Director;

    public Video(){
        super(null,null,null,null,-1);
        this.Director=null;
    }
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
