package GestioneEventi;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        EventoDao dao = new EventoDao();

        Evento e1 = new Evento("Titolo evento", java.time.LocalDate.now(), "Descrizione evento", TipoEvento.PUBBLICO, 100);

        dao.save(e1);
        System.out.println("Evento salvato con ID: " + e1.getId());

        dao.close();
    }
}
