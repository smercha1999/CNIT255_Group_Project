import javax.swing.*;
public class TableExample extends Book implements book_review{
    JFrame f;
    JPanel x;
    TableExample(){
        super();
        Book EBookA = new Ebook("Creative Confidence", "Tom", "Kelley",  "2013", 1001, "9780385349369",  "9780007517978", "web.a.ebscohost.com/ehost/ebookviewer/ebook?sid=d0dcc184-89e5-4364-86f4-ea23d2dfd966%40sdc-v-sessmgr01&vid=0&format=EK");
        Book EBookB = new Ebook("The Kite Runner", "Khaled", "Hosseini", "2003", 1002, "9781594631931", "9781573222457", "mrsmeganparrish.weebly.com/uploads/3/8/0/5/38056115/the_kite_runner.pdf");
        Book EBookC = new Ebook("Feed", "M.T.", "Aderson", "2002", 1003, "9780763662622", "9780763622596", "www.amazon.com/Feed-M-T-Anderson-ebook/dp/B003KVKW9U");
        Book EBookD = new Ebook("Flight", "Sherman", "Alexie", "2007", 1004, "9780802170378", "9781435228177", "amazon.com/Flight-Novel-Sherman-Alexie-ebook/dp/B00FEZ25IQ");
        f=new JFrame();
        String data[][]={ {EBookA.getTitle(),EBookA.getCreatorFirstName(),EBookA.getCreatorLastName(),EBookA.getDateOfCreation(),EBookA.getISBN(),EBookA.getISBN13()},
                {EBookA.getTitle(),EBookB.getCreatorFirstName(),EBookB.getCreatorLastName(),EBookB.getDateOfCreation(),EBookB.getISBN(),EBookB.getISBN13()},
                {EBookC.getTitle(),EBookC.getCreatorFirstName(),EBookC.getCreatorLastName(),EBookC.getDateOfCreation(),EBookC.getISBN(),EBookC.getISBN13()}};
        String column[]={"Title","Author First Name","Author Last Name", "Date", "ISBN","ISBN13"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,700,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(800,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
} 