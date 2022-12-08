import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.util.Locale;

public abstract class AbstractNote {
    private String text;
    private LocalDate date;
    private String TypeOfNote ;
    private String header;

    public AbstractNote(String text, LocalDate date, String typeOfNote, String header) {
        this.text = text;
        this.date = date;
        TypeOfNote = typeOfNote;
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTypeOfNote() {
        return TypeOfNote;
    }

    public void setTypeOfNote(String typeOfNote) {
        TypeOfNote = typeOfNote;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "" +
                "Текст ='" + text + '\'' +
                ", дата =" + date +
                ", Тип заметки ='" + TypeOfNote + '\'' +
                ", Заголовок ='" + header + '\'' +
                ' ';
    }
}
