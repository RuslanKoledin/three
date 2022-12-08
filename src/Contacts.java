import java.net.http.WebSocket;
import java.time.LocalDate;

public class Contacts extends AbstractNote implements WriteToFile {
    private String number;
    private String nameOfContact;


    public Contacts
            (String text,
             LocalDate date,
             String typeOfNote,
             String header,
             String number,
             String nameOfContact) {
        super(text, date, typeOfNote, header);
        this.number = number;
        this.nameOfContact = nameOfContact;

    }

    @Override
    public void makeRecord() {

    }

    @Override
    public String toString() {
        return "Контакт =" +
                "Номер ='" + number + '\'' +
                " Имя контакта='" + nameOfContact + '\'' +
                ' ';
    }
}
