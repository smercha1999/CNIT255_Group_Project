import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
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
    private JButton borrowerInfoButton;


    public welcome_page() {

        booksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newframe = new JFrame();
                Book EBookA = new Ebook("Creative Confidence", "Tom", "Kelley", "2013", 1001, "9780385349369", "9780007517978", "web.a.ebscohost.com/ehost/ebookviewer/ebook?sid=d0dcc184-89e5-4364-86f4-ea23d2dfd966%40sdc-v-sessmgr01&vid=0&format=EK");
                EBookA.setBorrowerID("1");
                Book EBookB = new Ebook("The Kite Runner", "Khaled", "Hosseini", "2003", 1002, "9781594631931", "9781573222457", "mrsmeganparrish.weebly.com/uploads/3/8/0/5/38056115/the_kite_runner.pdf");
                EBookB.setBorrowerID("2");
                Book EBookC = new Ebook("Feed", "M.T.", "Aderson", "2002", 1003, "9780763662622", "9780763622596", "www.amazon.com/Feed-M-T-Anderson-ebook/dp/B003KVKW9U");
                EBookC.setBorrowerID("3");
                Book EBookD = new Ebook("Flight", "Sherman", "Alexie", "2007", 1004, "9780802170378", "9781435228177", "amazon.com/Flight-Novel-Sherman-Alexie-ebook/dp/B00FEZ25IQ");
                String data[][] = {{EBookA.getTitle(), EBookA.getCreatorFirstName(), EBookA.getCreatorLastName(), EBookA.getDateOfCreation(), EBookA.getISBN(), EBookA.getISBN13(), EBookA.getBorrowerID()},
                        {EBookB.getTitle(), EBookB.getCreatorFirstName(), EBookB.getCreatorLastName(), EBookB.getDateOfCreation(), EBookB.getISBN(), EBookB.getISBN13(), EBookB.getBorrowerID()},
                        {EBookC.getTitle(), EBookC.getCreatorFirstName(), EBookC.getCreatorLastName(), EBookC.getDateOfCreation(), EBookC.getISBN(), EBookC.getISBN13(), EBookC.getBorrowerID()}};
                DefaultTableModel model = new DefaultTableModel();
                JTable bookTable = new JTable(model);
                model.addColumn("Title");
                model.addColumn("Author Full Name");
                model.addColumn("Date");
                model.addColumn("ISBN");
                model.addColumn("ISBN 13");
                model.addColumn("Borrower ID");
                model.addRow(new Object[]{EBookA.getTitle(), EBookA.getCreatorName(), EBookA.getDateOfCreation(), EBookA.getISBN(), EBookA.getISBN13(), EBookA.getBorrowerID()});
                model.addRow(new Object[]{EBookB.getTitle(), EBookB.getCreatorName(), EBookB.getDateOfCreation(), EBookB.getISBN(), EBookB.getISBN13(), EBookB.getBorrowerID()});
                model.addRow(new Object[]{EBookC.getTitle(), EBookC.getCreatorName(), EBookC.getDateOfCreation(), EBookC.getISBN(), EBookC.getISBN13(), EBookC.getBorrowerID()});
                JButton b = new JButton("Add Books");
                JButton removeBooks = new JButton("Remove Books");
                removeBooks.setBounds(300, 100, 95, 30);
                b.setBounds(50, 100, 95, 30);
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Book newBook = new Book();
                        newBook.setTitle(JOptionPane.showInputDialog("Please Enter the Image Title"));
                        newBook.setCreatorFirstName(JOptionPane.showInputDialog("Please Enter the Creators First Name"));
                        newBook.setCreatorLastName(JOptionPane.showInputDialog("Please Enter the Creators Last Name"));
                        newBook.setDateOfCreation(JOptionPane.showInputDialog("Please Enter the Date of Creation"));
                        newBook.setISBN(JOptionPane.showInputDialog("Please Enter the ISBN"));
                        newBook.setISBN13(JOptionPane.showInputDialog("Please Enter the ISBN 13"));
                        model.addRow(new Object[]{newBook.getTitle(), newBook.getCreatorName(), newBook.getDateOfCreation(), newBook.getISBN(), getISBN13()});
                    }
                });
                removeBooks.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (bookTable.getSelectedRow() != -1) {
                            // remove selected row from the model
                            model.removeRow(bookTable.getSelectedRow());
                            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                        }
                    }
                });
                bookTable.setBounds(30, 40, 700, 300);
                JScrollPane sp = new JScrollPane(bookTable);
                newframe.add(b);
                newframe.add(removeBooks);
                newframe.add(sp);
                newframe.setSize(800, 400);
                newframe.setVisible(true);
                //newframe.set
            }
        });
        imagesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame imageframe = new JFrame();
                Image ImageA;
                ImageA = new Image("The Terror of War", "Nick", "Jonas", "1989", 123, "Japan");
                Image ImageB = new Image("Lunch Atop A Skyscraper", "Unknown", "Unknown", "1932", 125, "New York City");
                Image ImageC = new Image("Tank Man", "Jeff", "Widener", "1989", 124, "China");
                String imagedata[][] = {{ImageA.getTitle(), ImageA.getCreatorName(), ImageA.getDateOfCreation()},
                        {ImageB.getTitle(), ImageB.getCreatorName(), ImageB.getDateOfCreation()},
                        {ImageC.getTitle(), ImageC.getCreatorName(), ImageC.getDateOfCreation()}};
                String imagecolumn[] = {"Title", "Creators Name", "Date of Creation"};
                DefaultTableModel model = new DefaultTableModel();
                JTable imageTable = new JTable(model);
                model.addColumn("Title");
                model.addColumn("Creators Name");
                model.addColumn("Date of Creation");
                model.addRow(new Object[]{ImageA.getTitle(), ImageA.getCreatorName(), ImageA.getDateOfCreation()});
                model.addRow(new Object[]{ImageB.getTitle(), ImageB.getCreatorName(), ImageB.getDateOfCreation()});
                model.addRow(new Object[]{ImageC.getTitle(), ImageC.getCreatorName(), ImageC.getDateOfCreation()});
                JTable jt = new JTable(imagedata, imagecolumn);
                JButton b = new JButton("Add Images");
                JButton removeImages = new JButton("Remove Images");
                removeImages.setBounds(300, 100, 95, 30);
                b.setBounds(50, 100, 95, 30);
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Image newImage = new Image();
                        newImage.setTitle(JOptionPane.showInputDialog("Please Enter the Image Title"));
                        newImage.setCreatorFirstName(JOptionPane.showInputDialog("Please Enter the Creators First Name"));
                        newImage.setCreatorLastName(JOptionPane.showInputDialog("Please Enter the Creators Last Name"));
                        newImage.setDateOfCreation(JOptionPane.showInputDialog("Please Enter the Date of Creation"));
                        model.addRow(new Object[]{newImage.getTitle(), newImage.getCreatorName(), newImage.getDateOfCreation()});
                    }
                });
                removeImages.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (imageTable.getSelectedRow() != -1) {
                            // remove selected row from the model
                            model.removeRow(imageTable.getSelectedRow());
                            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                        }
                    }
                });
                imageTable.setBounds(30, 40, 700, 300);
                JScrollPane sp = new JScrollPane(imageTable);
                //imageframe.add(sp);
                imageframe.add(b);
                imageframe.add(removeImages);
                imageframe.add(sp);
                imageframe.setSize(800, 400);
                imageframe.setVisible(true);
            }
        });
        audioBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newframe = new JFrame();
                Book AudioBookA = new AudioBook("Creative Confidence", "Tom", "Kelley", "2013", 1001, "9780385349369", "9780007517978", "Dan Woren", "www.audible.com/pd/Creative-Confidence-Audiobook/B00FRL537W", 7);
                Book AudioBookB = new AudioBook("The Kite Runner", "Khaled", "Hosseini", "2003", 1002, "9781594631931", "9781573222457", "Khaled Hosseini", "www.amazon.com/The-Kite-Runner-Khaled-Hosseini-audiobook/dp/B0000BZ2U8", 12);
                Book AudioBookC = new AudioBook("Feed", "M.T.", "Aderson", "2002", 1003, "9780763662622", "9780763622596", "David Baker", "www.audible.com/pd/Feed-Audiobook/B002UZHP0Q", 5);
                Book AudioBookD = new AudioBook("Flight", "Sherman", "Alexie", "2007", 1004, "9780802170378", "9781435228177", "Adam Beach", "www.audible.com/pd/Flight-Audiobook/B002VA9VNE", 4);
                String data[][] = {{AudioBookA.getTitle(), AudioBookA.getCreatorFirstName(), AudioBookA.getCreatorLastName(), AudioBookA.getDateOfCreation(), AudioBookA.getISBN(), AudioBookA.getISBN13()},
                        {AudioBookA.getTitle(), AudioBookB.getCreatorFirstName(), AudioBookB.getCreatorLastName(), AudioBookB.getDateOfCreation(), AudioBookB.getISBN(), AudioBookB.getISBN13()},
                        {AudioBookC.getTitle(), AudioBookC.getCreatorFirstName(), AudioBookC.getCreatorLastName(), AudioBookC.getDateOfCreation(), AudioBookC.getISBN(), AudioBookC.getISBN13()}};
                String column[] = {"Title", "Author First Name", "Author Last Name", "Date", "ISBN", "ISBN13"};
                JTable jt = new JTable(data, column);
                jt.setBounds(30, 40, 700, 300);
                JScrollPane sp = new JScrollPane(jt);
                newframe.add(sp);
                newframe.setSize(800, 400);
                newframe.setVisible(true);
                //newframe.set
            }
        });
        physicalBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        borrowerInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        videosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame videoframe = new JFrame();
                Video VideoA = new Video("The Godfather", "Mario", "Puzo", "1972", 9001, "Coppola");
                Video VideoB = new Video("Citizen Kane", "Orson", "Welles", "1941", 9002, "Welles");
                Video VideoC = new Video("Pulp Fiction", "Quentin", "Tarantino", "1994", 9003, "Tarantino");
                String videodata[][] = {{VideoA.getTitle(), VideoA.getCreatorName(), VideoA.getDateOfCreation()},
                        {VideoB.getTitle(), VideoB.getCreatorName(), VideoB.getDateOfCreation()},
                        {VideoC.getTitle(), VideoC.getCreatorName(), VideoC.getDateOfCreation()}};
                String videocolumn[] = {"Title", "Creators Name", "Date of Creation"};
                DefaultTableModel model = new DefaultTableModel();
                JTable videoTable = new JTable(model);
                model.addColumn("Title");
                model.addColumn("Creators Name");
                model.addColumn("Date of Creation");
                model.addRow(new Object[]{VideoA.getTitle(), VideoA.getCreatorName(), VideoA.getDateOfCreation()});
                model.addRow(new Object[]{VideoB.getTitle(), VideoB.getCreatorName(), VideoB.getDateOfCreation()});
                model.addRow(new Object[]{VideoC.getTitle(), VideoC.getCreatorName(), VideoC.getDateOfCreation()});
                JTable jt = new JTable(videodata, videocolumn);
                JButton b = new JButton("Add Video");
                JButton removeVideo = new JButton("Remove Video");
                removeVideo.setBounds(300, 100, 95, 30);
                b.setBounds(50, 100, 95, 30);
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Video newVideo = new Video();
                        newVideo.setTitle(JOptionPane.showInputDialog("Please Enter the Video Title"));
                        newVideo.setCreatorFirstName(JOptionPane.showInputDialog("Please Enter the Creators First Name"));
                        newVideo.setCreatorLastName(JOptionPane.showInputDialog("Please Enter the Creators Last Name"));
                        newVideo.setDateOfCreation(JOptionPane.showInputDialog("Please Enter the Date of Creation"));
                        model.addRow(new Object[]{newVideo.getTitle(), newVideo.getCreatorName(), newVideo.getDateOfCreation()});
                    }
                });
                removeVideo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (videoTable.getSelectedRow() != -1) {
                            // remove selected row from the model
                            model.removeRow(videoTable.getSelectedRow());
                            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                        }
                    }
                });
                videoTable.setBounds(30, 40, 700, 300);
                JScrollPane sp = new JScrollPane(videoTable);
                videoframe.add(b);
                videoframe.add(removeVideo);
                videoframe.add(sp);
                videoframe.setSize(800, 400);
                videoframe.setVisible(true);
            }
        });
        physicalBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newframe = new JFrame();
                PhysicalBook PhysicalBookA = new PhysicalBook("Creative Confidence", "Tom", "Kelley",  "2013", 1001, "9780385349369",  "9780007517978", "8", "Hicks Underground Library");
                PhysicalBook PhysicalBookB = new PhysicalBook("The Kite Runner", "Khaled", "Hosseini", "2003", 1002, "9781594631931", "9781573222457", "5", "WALC");
                PhysicalBook PhysicalBookC = new PhysicalBook("Feed", "M.T.", "Aderson", "2002", 1003, "9780763662622", "9780763622596", "12", "Stewart");
                PhysicalBook PhysicalBookD = new PhysicalBook("Flight", "Sherman", "Alexie", "2007", 1004, "9780802170378", "9781435228177", "6", "Hicks Underground Library");
                String data[][] = {{PhysicalBookA.getTitle(), PhysicalBookA.getCreatorFirstName(), PhysicalBookA.getCreatorLastName(), PhysicalBookA.getDateOfCreation(), PhysicalBookA.getISBN(), PhysicalBookA.getISBN13(), PhysicalBookA.getCopiesAvailable(), PhysicalBookA.getLocation()},
                        {PhysicalBookB.getTitle(), PhysicalBookB.getCreatorFirstName(), PhysicalBookB.getCreatorLastName(), PhysicalBookB.getDateOfCreation(), PhysicalBookB.getISBN(), PhysicalBookB.getISBN13(), PhysicalBookB.getCopiesAvailable(), PhysicalBookB.getLocation()},
                        {PhysicalBookC.getTitle(), PhysicalBookC.getCreatorFirstName(), PhysicalBookC.getCreatorLastName(), PhysicalBookC.getDateOfCreation(), PhysicalBookC.getISBN(), PhysicalBookC.getISBN13(), PhysicalBookC.getCopiesAvailable(), PhysicalBookC.getLocation()},
                        {PhysicalBookD.getTitle(), PhysicalBookD.getCreatorFirstName(), PhysicalBookD.getCreatorLastName(), PhysicalBookD.getDateOfCreation(), PhysicalBookD.getISBN(), PhysicalBookD.getISBN13(), PhysicalBookD.getCopiesAvailable(), PhysicalBookD.getLocation()}};
                DefaultTableModel model = new DefaultTableModel();
                JTable bookTable = new JTable(model);
                model.addColumn("Title");
                model.addColumn("Author Full Name");
                model.addColumn("Date");
                model.addColumn("ISBN");
                model.addColumn("ISBN 13");
                model.addColumn("Borrower ID");
                model.addColumn("Copies Available");
                model.addColumn("Location");
                model.addRow(new Object[]{PhysicalBookA.getTitle(), PhysicalBookA.getCreatorName(), PhysicalBookA.getDateOfCreation(), PhysicalBookA.getISBN(), PhysicalBookA.getISBN13(), PhysicalBookA.getCopiesAvailable(), PhysicalBookA.getLocation()});
                model.addRow(new Object[]{PhysicalBookB.getTitle(), PhysicalBookB.getCreatorName(), PhysicalBookB.getDateOfCreation(), PhysicalBookB.getISBN(), PhysicalBookB.getISBN13(), PhysicalBookB.getCopiesAvailable(), PhysicalBookB.getLocation()});
                model.addRow(new Object[]{PhysicalBookC.getTitle(), PhysicalBookC.getCreatorName(), PhysicalBookC.getDateOfCreation(), PhysicalBookC.getISBN(), PhysicalBookC.getISBN13(), PhysicalBookC.getCopiesAvailable(),PhysicalBookC.getLocation()});
                model.addRow(new Object[]{PhysicalBookD.getTitle(), PhysicalBookD.getCreatorName(), PhysicalBookD.getDateOfCreation(), PhysicalBookD.getISBN(), PhysicalBookD.getISBN13(), PhysicalBookD.getCopiesAvailable(),PhysicalBookD.getLocation()});
                JButton b = new JButton("Add Book");
                JButton removeBooks = new JButton("Remove Book");
                removeBooks.setBounds(300, 100, 95, 30);
                b.setBounds(50, 100, 95, 30);
                b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        PhysicalBook newBook = new PhysicalBook();
                        newBook.setTitle(JOptionPane.showInputDialog("Please Enter the Image Title"));
                        newBook.setCreatorFirstName(JOptionPane.showInputDialog("Please Enter the Creators First Name"));
                        newBook.setCreatorLastName(JOptionPane.showInputDialog("Please Enter the Creators Last Name"));
                        newBook.setDateOfCreation(JOptionPane.showInputDialog("Please Enter the Date of Creation"));
                        newBook.setISBN(JOptionPane.showInputDialog("Please Enter the ISBN"));
                        newBook.setISBN13(JOptionPane.showInputDialog("Please Enter the ISBN 13"));
                        newBook.setCopiesAvailable(JOptionPane.showInputDialog("Please Enter the Number of Copies Available"));
                        newBook.setLocation(JOptionPane.showInputDialog("Please Enter the Location"));
                        model.addRow(new Object[]{newBook.getTitle(), newBook.getCreatorName(), newBook.getDateOfCreation(), newBook.getISBN(), newBook.getISBN13(), newBook.getBorrowerID(), newBook.getCopiesAvailable(), newBook.getLocation()});
                    }
                });
                removeBooks.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (bookTable.getSelectedRow() != -1) {
                            // remove selected row from the model
                            model.removeRow(bookTable.getSelectedRow());
                            JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                        }
                    }
                });
                bookTable.setBounds(30, 40, 700, 300);
                JScrollPane sp = new JScrollPane(bookTable);
                newframe.add(b);
                newframe.add(removeBooks);
                newframe.add(sp);
                newframe.setSize(800, 400);
                newframe.setVisible(true);
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
