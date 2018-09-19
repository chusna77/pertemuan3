package mypkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class tiga {
public static void main(String[] args) throws ClassNotFoundException,IOException {
        List<Participant> participants = new ArrayList<Participant>();

        System.out.println("masukkan nama awal ");
        InputStream input=System.in;
        InputStreamReader reader =new InputStreamReader(input);
        BufferedReader bufred=new BufferedReader(reader);
        String firstName=bufred.readLine();
        System.out.println("masukkan nama Akhir");
         String lastName=bufred.readLine();
        System.out.println("masukkan usia");
        int usia=Integer.parseInt(bufred.readLine());

    participants.add(new Participant(firstName, lastName, usia));
//        participants.add(new Participant("Ani", "yati", 24));
//        participants.add(new Participant("Heya", "Fahmi", 22));
//        participants.add(new Participant("Aya", "Ahya", 21));


        System.out.println("Participants :\n" + participants + "\n");

       SerializationDemo demo=new SerializationDemo();
        demo.serialize(participants, "participantData.ser");
        System.out.println("Serialization is Done");

        System.out.println("Deserialization object...");
        List<Participant> newList=demo.deserialize("participantData.ser");
        System.out.println("new list :"+newList);
    }
}
