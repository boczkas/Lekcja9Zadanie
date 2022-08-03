package lekcja9Zadanie;

public class Main {
    public static void main(String[] args) {

//        !! NIC TU NIE ZMIENIAJ !!
//        !! TWOJE ZADANIE LEZY W POZOSTALYCH KLASACH !!


//        1. Klasa Film
//              klasa ma posiadać pola:
//              String nazwa
//              int dlugosc

//              klasa ma posiadać metodę:
//              wyswietlFilm();
//
//              w której otrzymamy informację jaki film będzie aktualnie wyświetlany
//
//        2. Klasa SalaKinowa
//              klasa ma posiadać pola:
//              Film film
//              int iloscMiejsc
//
//              klasa ma posiadać metodę:
//              uruchom();
//
//              w której wypiszemy jak długo będzie wyświetlany film

//              klasa ma posiadać metodę:
//              ileMamMiejsc();
//
//              w której wypiszemy ile miejsc ma sala


//        Ponizszy kod ma sie uruchomic bez błędów:
        Film film = new Film();
        film.dlugosc = 136;
        film.nazwa = "Matrix";

        film.wyswietlFilm();

        SalaKinowa salaKinowa = new SalaKinowa();
        salaKinowa.iloscMiejsc = 10;
        salaKinowa.film = film;
        salaKinowa.uruchom();
        salaKinowa.ileMamMiejsc();
    }
}
