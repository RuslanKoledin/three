import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Note note1 = new Note("NOTE 1",LocalDate.now(),"IDEAS","ideas for program ");
        Note note2 = new Note("NOTE 2" , LocalDate.now(),"DUTY","BOb 900 должен");
        Note note3 = new Note("NOTE 3",LocalDate.now(),"DUTY","Tom 1000 должен");

        Note [] notesArray = new Note[3];
        notesArray[0] = note1;
        notesArray[1] = note2;
        notesArray[2] = note3;


        Contacts contacts1 = new Contacts("номер телефона",LocalDate.now(),"MOBILE",
                "заголовок","708626629","Ruslan");
        Contacts contacts2 = new Contacts("номер телефона городской",LocalDate.now(),"URBAN",
                "заголовок","708626629","Ruslan");
        Contacts contacts3 = new Contacts("сосед",LocalDate.now(),"MOBILE",
                "Tom сосед", "0708000000","Tom");


        Contacts [] contactsArray = new Contacts[3];
        contactsArray[0] = contacts1;
        contactsArray[1] = contacts2;
        contactsArray[2] = contacts3;

        for (int i = 0; i < notesArray.length; i++){
            System.out.println(notesArray[i]);
        }
        try {

            FileWriter fileWriter = new FileWriter("NoteBook.txt");
            fileWriter.write(note1+ "\n");
            fileWriter.write(note2 + "\n");
            fileWriter.write(note3+ "\n");
            fileWriter.write(contacts1 + contacts1 .getTypeOfNote()+ "\n");
            fileWriter.write(contacts2 + contacts2 .getTypeOfNote()+ "\n");
            fileWriter.write(contacts3 + contacts3 .getTypeOfNote()+ "\n");


            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("ошибка при вводе/выводе данных");
        }








    }
}