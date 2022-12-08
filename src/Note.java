import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class Note extends AbstractNote implements WriteToFile {

    public Note(String text, LocalDate date, String typeOfNote, String header) {
        super(text, date, typeOfNote, header);
    }


    @Override
    public void makeRecord() {

    }



}
