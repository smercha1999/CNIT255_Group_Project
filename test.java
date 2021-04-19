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
        //EBooks
        /*
        Book EBookA = new Ebook("Creative Confidence", “Tom”, “Kelley”,  “2013”, 1001, “9780385349369”,  “9780007517978”, “web.a.ebscohost.com/ehost/ebookviewer/ebook?sid=d0dcc184-89e5-4364-86f4-ea23d2dfd966%40sdc-v-sessmgr01&vid=0&format=EK”);
        Book EBookB = new Ebook(“The Kite Runner”, “Khaled”, “Hosseini”, “2003”, 1002, “9781594631931”, “9781573222457”, “mrsmeganparrish.weebly.com/uploads/3/8/0/5/38056115/the_kite_runner.pdf”);
        Book EBookC = new Ebook(“Feed”, “M.T.”, “Aderson”, “2002”, 1003, “9780763662622”, “9780763622596”, “www.amazon.com/Feed-M-T-Anderson-ebook/dp/B003KVKW9U”);
        Book EBookD = new Ebook(“Flight”, “Sherman”, “Alexie”, “2007”, 1004, “9780802170378”, “9781435228177”, “amazon.com/Flight-Novel-Sherman-Alexie-ebook/dp/B00FEZ25IQ”);
        
        //PhysicalBooks
        Book PhysicalBookA = new PhysicalBook(“Creative Confidence”, “Tom”, “Kelley”,  “2013”, 1001, “9780385349369”,  “9780007517978”, 8, “Hicks Underground Library”);
        Book PhysicalBookB = new PhysicalBook(“The Kite Runner”, “Khaled”, “Hosseini”, “2003”, 1002, “9781594631931”, “9781573222457”, 5, “WALC”);
        Book PhysicalBookC = new PhysicalBook(“Feed”, “M.T.”, “Aderson”, “2002”, 1003, “9780763662622”, “9780763622596”, 12, “Stewart”);
        Book PhysicalBookD = new PhysicalBook(“Flight”, “Sherman”, “Alexie”, “2007”, 1004, “9780802170378”, “9781435228177”, 6, “Hicks Underground Library”);
        
        //AudioBooks
        Book AudioBookA = new AudioBook(“Creative Confidence”, “Tom”, “Kelley”,  “2013”, 1001, “9780385349369”,  “9780007517978”, “Dan Woren”, “www.audible.com/pd/Creative-Confidence-Audiobook/B00FRL537W”, 7.8);
        Book AudioBookB = new AudioBook(“The Kite Runner”, “Khaled”, “Hosseini”, “2003”, 1002, “9781594631931”, “9781573222457”, “Khaled Hosseini”, “www.amazon.com/The-Kite-Runner-Khaled-Hosseini-audiobook/dp/B0000BZ2U8”, 12.1);
        Book AudioBookC = new AudioBook(“Feed”, “M.T.”, “Aderson”, “2002”, 1003, “9780763662622”, “9780763622596”, “David Baker”, “www.audible.com/pd/Feed-Audiobook/B002UZHP0Q”, 5.1);
        Book AudioBookD = new AudioBook(“Flight”, “Sherman”, “Alexie”, “2007”, 1004, “9780802170378”, “9781435228177”, “Adam Beach”, “www.audible.com/pd/Flight-Audiobook/B002VA9VNE”, 4.41);

         */
    }
}
