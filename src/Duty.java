import java.time.LocalDate;

public class Duty extends Note implements WriteToFile{

    public Duty(String text, LocalDate date, String typeOfNote, String header) {
        super(text, date, typeOfNote, header);
    }
    @Override
    public void makeRecord() {

    }
}
