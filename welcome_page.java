import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome_page extends Book implements book_review{
    private JButton booksButton;
    private JButton audioBooksButton;
    private JButton imagesButton;
    private JButton physicalBooksButton;
    private JPanel panel;
    private JButton videosButton;
    private JButton Videos;


    public welcome_page() {

        booksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newframe = new JFrame();
                Book EBookA = new Ebook("Creative Confidence", "Tom", "Kelley",  "2013", 1001, "9780385349369",  "9780007517978", "web.a.ebscohost.com/ehost/ebookviewer/ebook?sid=d0dcc184-89e5-4364-86f4-ea23d2dfd966%40sdc-v-sessmgr01&vid=0&format=EK");
                Book EBookB = new Ebook("The Kite Runner", "Khaled", "Hosseini", "2003", 1002, "9781594631931", "9781573222457", "mrsmeganparrish.weebly.com/uploads/3/8/0/5/38056115/the_kite_runner.pdf");
                Book EBookC = new Ebook("Feed", "M.T.", "Aderson", "2002", 1003, "9780763662622", "9780763622596", "www.amazon.com/Feed-M-T-Anderson-ebook/dp/B003KVKW9U");
                Book EBookD = new Ebook("Flight", "Sherman", "Alexie", "2007", 1004, "9780802170378", "9781435228177", "amazon.com/Flight-Novel-Sherman-Alexie-ebook/dp/B00FEZ25IQ");
                String data[][]={ {EBookA.getTitle(),EBookA.getCreatorFirstName(),EBookA.getCreatorLastName(),EBookA.getDateOfCreation(),EBookA.getISBN(),EBookA.getISBN13()},
                        {EBookA.getTitle(),EBookB.getCreatorFirstName(),EBookB.getCreatorLastName(),EBookB.getDateOfCreation(),EBookB.getISBN(),EBookB.getISBN13()},
                        {EBookC.getTitle(),EBookC.getCreatorFirstName(),EBookC.getCreatorLastName(),EBookC.getDateOfCreation(),EBookC.getISBN(),EBookC.getISBN13()}};
                String column[]={"Title","Author First Name","Author Last Name", "Date", "ISBN","ISBN13"};
                JTable jt=new JTable(data,column);
                jt.setBounds(30,40,700,300);
                JScrollPane sp=new JScrollPane(jt);
                newframe.add(sp);
                newframe.setSize(800,400);
                newframe.setVisible(true);
                //newframe.set
        }
    });
        imagesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame imageframe = new JFrame();
                Image ImageA;
                ImageA = new Image("The Terror of War","Nick","Jonas","1989",123,"Japan");
                Image ImageB = new Image("Lunch Atop A Skyscraper","Unknown","Unknown","1932",125,"New York City");
                Image ImageC = new Image("Tank Man","Jeff","Widener","1989",124,"China");
                String imagedata[][] = {{ImageA.getTitle(), ImageA.getCreatorName(),ImageA.getDateOfCreation()},
                        {ImageB.getTitle(),ImageB.getCreatorName(),ImageB.getDateOfCreation()},
                        {ImageC.getTitle(),ImageC.getCreatorName(),ImageC.getDateOfCreation()}};
                String imagecolumn[]={"Title","Creators Name","Date of Creation"};
                JTable jt=new JTable(imagedata,imagecolumn);
                jt.setBounds(30,40,700,300);
                JScrollPane sp=new JScrollPane(jt);
                imageframe.add(sp);
                imageframe.setSize(800,400);
                imageframe.setVisible(true);
            }
        });
        audioBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newframe = new JFrame();
                Book AudioBookA = new AudioBook("Creative Confidence", "Tom", "Kelley",  "2013", 1001, "9780385349369",  "9780007517978", "Dan Woren", "www.audible.com/pd/Creative-Confidence-Audiobook/B00FRL537W", 7);
                Book AudioBookB = new AudioBook("The Kite Runner", "Khaled", "Hosseini", "2003", 1002, "9781594631931", "9781573222457", "Khaled Hosseini", "www.amazon.com/The-Kite-Runner-Khaled-Hosseini-audiobook/dp/B0000BZ2U8", 12);
                Book AudioBookC = new AudioBook("Feed", "M.T.", "Aderson", "2002", 1003, "9780763662622", "9780763622596", "David Baker", "www.audible.com/pd/Feed-Audiobook/B002UZHP0Q", 5);
                Book AudioBookD = new AudioBook("Flight", "Sherman", "Alexie", "2007", 1004, "9780802170378", "9781435228177", "Adam Beach", "www.audible.com/pd/Flight-Audiobook/B002VA9VNE", 4);
                String data[][]={ {AudioBookA.getTitle(),AudioBookA.getCreatorFirstName(),AudioBookA.getCreatorLastName(),AudioBookA.getDateOfCreation(),AudioBookA.getISBN(),AudioBookA.getISBN13()},
                        {AudioBookA.getTitle(),AudioBookB.getCreatorFirstName(),AudioBookB.getCreatorLastName(),AudioBookB.getDateOfCreation(),AudioBookB.getISBN(),AudioBookB.getISBN13()},
                        {AudioBookC.getTitle(),AudioBookC.getCreatorFirstName(),AudioBookC.getCreatorLastName(),AudioBookC.getDateOfCreation(),AudioBookC.getISBN(),AudioBookC.getISBN13()}};
                String column[]={"Title","Author First Name","Author Last Name", "Date", "ISBN","ISBN13"};
                JTable jt=new JTable(data,column);
                jt.setBounds(30,40,700,300);
                JScrollPane sp=new JScrollPane(jt);
                newframe.add(sp);
                newframe.setSize(800,400);
                newframe.setVisible(true);
                //newframe.set
            }
        });
        physicalBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new welcome_page().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
