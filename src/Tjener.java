/**
 * Created by eselta on 12/16/15.
 */
public class Tjener extends Medarbejder {

    //Stilling bliver automatisk sat til "Tjener" når der oprettes en ny instans af denne klasse
    public Tjener() {
        this.stilling = "Tjener";
    }


    public Tjener(String fornavn, String efternavn, String adresse, String tlf, String regNr, String kontoNr){
        this.stilling = "Tjener";
        this.Fornavn = fornavn;
        this.Efternavn = efternavn;
        this.Adresse = adresse;
        this.Telefon_nr = tlf;
        this.Reg_nr = regNr;
        this.Konto_nr = kontoNr;
    }
}
