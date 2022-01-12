import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firma {
      JFrame frame;
    JLabel sys, im, naz, rok, dzi, wyp;
    JTextArea imie, nazwisko, rok_urodzienia, dzial, wyplata;
    JButton sortuj, max, wiek, find, all, save, cleare;
    DefaultListModel<Person> model = new DefaultListModel<>();
    JList<Person> list = new JList<Person>(model);
    DefaultListModel<String> model2 = new DefaultListModel<>();
    JList<String> list2 = new JList<String>(model2);



    Firma() {
        frame = new JFrame();
        sys = new JLabel("System Administracji Firmy");
        sys.setFont(new Font("Arial", Font.BOLD, 20));
        sys.setBounds(0, 0, 300, 30);
        frame.add(sys);
        Person Lidia = new Person("Lida", "Pacyna", "2000", "Księgowość", "5000");
        Person Justyna = new Person("Justyna", "Kowalska", "1999", "IT", "7500");
        Person Adam = new Person("Adam", "Nowak", "1987", "Marketing", "5000");
        Person Tomasz = new Person("Tomasz", "Matejek", "1995", "Księgowość", "3000");
        Person Marcelina = new Person("Marcelina", "Mniszek", "2002", "Marketing", "1975");
        Person Karol = new Person("Karol", "Staroń", "1995", "IT", "4500");
        Person Weronika = new Person("Weronika", "Matuszczak", "1997", "Księgowość", "2300");
        Person Maciej = new Person("Mciej", "Twaróg", "1999", "IT", "4500");
        Person Zbigniew = new Person("Zbigniew", "Ziemowit", "1993", "IT", "1900");
        Person Olga = new Person("Olga", "Przybylska", "1980", "Księgowość", "2800");


        model.addElement(Lidia);
        model.addElement(Justyna);
        model.addElement(Adam);
        model.addElement(Tomasz);
        model.addElement(Marcelina);
        model.addElement(Karol);
        model.addElement(Weronika);
        model.addElement(Maciej);
        model.addElement(Zbigniew);
        model.addElement(Olga);
        /*for (int i = 0; i < model.getSize(); i++) {
            model2.addElement(model.getElementAt(i).getImie() + " " + model.getElementAt(i).getNazwisko());
        }*/


        list2.setBounds(0, 30, 400, 300);
        sortuj = new JButton("Sortuj po wieku");
        sortuj.setBounds(410, 40, 250, 30);
        frame.add(sortuj);
        max = new JButton("Pracownicy z najwiekszą pensją");
        max.setBounds(410, 90, 250, 30);
        frame.add(max);
        wiek = new JButton("Wiek pracowników");
        wiek.setBounds(410, 150, 250, 30);
        frame.add(wiek);
        find = new JButton("Znajdz osobe");
        find.setBounds(410, 200, 250, 30);
        frame.add(find);
        all = new JButton("Wszyscy pracownicy");
        all.setBounds(410, 250, 250, 30);
        frame.add(all);

        imie = new JTextArea("");
        imie.setBounds(700, 40, 200, 30);
        frame.add(imie);
        nazwisko = new JTextArea("");
        nazwisko.setBounds(700, 90, 200, 30);
        frame.add(nazwisko);
        rok_urodzienia = new JTextArea("");
        rok_urodzienia.setBounds(700, 150, 200, 30);
        frame.add(rok_urodzienia);
        dzial = new JTextArea("");
        dzial.setBounds(700, 200, 200, 30);
        frame.add(dzial);
        wyplata = new JTextArea("");
        wyplata.setBounds(700, 260, 200, 30);
        frame.add(wyplata);
        save = new JButton("Zapisz");
        save.setBounds(700, 300, 100, 30);
        frame.add(save);
        cleare = new JButton("Wyczyść");
        cleare.setBounds(810, 300, 100, 30);
        frame.add(cleare);

        im = new JLabel("Imie");
        im.setBounds(700, 30, 200, 10);
        frame.add(im);
        naz = new JLabel("Nazwisko");
        naz.setBounds(700, 80, 200, 10);
        frame.add(naz);
        rok = new JLabel("Rok Urodzienia");
        rok.setBounds(700, 140, 200, 10);
        frame.add(rok);
        dzi = new JLabel("Dział");
        dzi.setBounds(700, 190, 200, 10);
        frame.add(dzi);
        wyp = new JLabel("Wypłata");
        wyp.setBounds(700, 240, 200, 15);
        frame.add(wyp);
        sortuj.addActionListener(ActionEvent ->
                {
                    Person[] tabb = new Person[model.getSize()];

                    for (int i = 0; model.getSize() > i; i++) {
                        tabb[i] = model.get(i);
                    }
                    b_sort(tabb);
                }

        );
        save.addActionListener(ActionEvent ->
        {
             Person p = new Person(imie.getText(), nazwisko.getText(), rok_urodzienia.getText(), dzial.getText(), wyplata.getText());
             model.addElement(p);

        });
        cleare.addActionListener(ActionEvent ->{
            model2.removeAllElements();

                });

        wiek.addActionListener(ActionEvent ->{

                for (int i = 0; i < model.getSize(); i++) {
                    model2.addElement(model.getElementAt(i).getImie() + " " + model.getElementAt(i).getNazwisko() + " " + model.getElementAt(i).getrok_Urodzenia());
                }
                });
        find.addActionListener(ActionEvent ->{
            Person[] tablica = new Person[model.getSize()];

            for (int i = 0; model.getSize() > i; i++) {
                tablica[i] = model.get(i);
            }
        for( Person p :tablica) {

            if(p.getImie().equals(imie.getText()) && p.getNazwisko().equals(nazwisko.getText())){
                pracuje s=new pracuje();
            }
            }




        });
        all.addActionListener(ActionEvent ->{
            for (int i = 0; i < model.getSize(); i++) {
                model2.addElement(model.getElementAt(i).getImie() + " " + model.getElementAt(i).getNazwisko() + " rok urodzenia " + model.getElementAt(i).getrok_Urodzenia() + " pensja " +
                        model.getElementAt(i).getWyplata() + " PLN " +" dział " + model.getElementAt(i).getDzial() + " "  );
            }
        });

        max.addActionListener(ActionEvent ->
                {
                    Person[] tabb = new Person[model.getSize()];

                    for (int i = 0; model.getSize() > i; i++) {
                        tabb[i] = model.get(i);
                    }
                    c_sort(tabb);
                }

        );

        frame.add(list2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        System.out.println(model2.get(2));
    }

    private void b_sort(Person[] tabb) {
        Person temp;
        for (int i = 0; i < tabb.length; i++) {

            for (int j = i + 1; j < tabb.length; j++) {

                int liczbaA = Integer.parseInt(tabb[i].getrok_Urodzenia());
                int liczbaB = Integer.parseInt(tabb[j].getrok_Urodzenia());

                if (liczbaA > liczbaB) {
                    temp = tabb[j];
                    tabb[j] = tabb[i];
                    tabb[i] = temp;
                }
            }
        }
        model.removeAllElements();
        model2.removeAllElements();
        for (int i = 0; i < tabb.length; i++) {


            model.addElement(tabb[i]);
        }
        for (int i = 0; i < model.getSize(); i++) {
            model2.addElement(model.getElementAt(i).getImie() + " " + model.getElementAt(i).getNazwisko() + " " +  model.getElementAt(i).getrok_Urodzenia());
        }

    }



    private void c_sort(Person[] tabb) {
        Person temp;
        for (int i = 0; i < tabb.length; i++) {

            for (int j = i + 1; j < tabb.length; j++) {

                int liczbaA = Integer.parseInt(tabb[i].getWyplata());
                int liczbaB = Integer.parseInt(tabb[j].getWyplata());

                if (liczbaA < liczbaB) {
                    temp = tabb[j];
                    tabb[j] = tabb[i];
                    tabb[i] = temp;
                }
            }
        }

        model.removeAllElements();
        model2.removeAllElements();


        for (int i = 0; i < tabb.length; i++) {


            model.addElement(tabb[i]);
        }
        for (int i = 0; i < model.getSize(); i++) {
            model2.addElement( model.getElementAt(i).getImie() +  " " + model.getElementAt(i).getNazwisko() + " " +  model.getElementAt(i).getWyplata()  );
        }


    }
}