package kata4;

import java.io.IOException;
import view.MailListReader;
import model.Mail;
import view.MailHistogramBuilder;
import model.Histogram;
import java.util.List;
import view.HistogramDisplay;

public class Kata4 {
    
    static List<Mail> listMails;
    static Histogram c;
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
     public static void input() throws IOException{
        MailListReader a = new MailListReader();
        listMails = a.read("C:\\\\Users\\\\Usuario\\\\Downloads\\\\Kata4\\\\emails.txt");
    }
    
    public static void process(){
        MailHistogramBuilder b = new MailHistogramBuilder();
        c = b.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(c).execute();
    }
}
