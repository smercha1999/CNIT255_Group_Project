public class test extends Book{
    public test(String t, String cfn, String cln, String d, int i, String ISBN, String ISBN13) {
        super(t, cfn, cln, d, i, ISBN, ISBN13);
    }

    /*public test(String t, String cfn, String cln, String d, int i, int ImageID, String Location) {
            super(t, cfn, cln, d, i, ImageID, Location);
        }
    */
    /*
        public test(String t, String cfn, String cln, String d, int i) {
            super(t, cfn, cln, d, i);
            Artifact ab = new Artifact("Harry Potter","JK","Rowling","10/05/1997",1001);
        }
    */
    public static void main(String[] args) {
   //     Artifact ab = new Artifact("Harry Potter","JK","Rowling","10/05/1997",1001);
     //   System.out.println(ab.getCreatorName());
        //Video vid = new Video("Percy Jackson","Rick","Riordan","10/05/2012",1001,2002,"Not Important");
        //System.out.println(vid.getDirector());
        Book B = new Book("Kane Chronicles","Rick","Riordan","10/02/12",1009,"102929292","2020202020");
        B.ratingCount();
    }
}
