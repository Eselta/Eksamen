/**
 * Created by eselta on 12/16/15.
 */
public class Køkken extends Medarbejder {

    //Stilling bliver automatisk sat til "Køkken", som er køkkenpersonalet, når der oprettes en ny instans af denne klasse
    public Køkken() {
        this.stilling = "Køkken";
    }

    public Køkken(String fornavn, String efternavn, String adresse, String tlf, String regNr, String kontoNr){
        this.stilling = "Køkken";
        this.Fornavn = fornavn;
        this.Efternavn = efternavn;
        this.Adresse = adresse;
        this.Telefon_nr = tlf;
        this.Reg_nr = regNr;
        this.Konto_nr = kontoNr;
    }
}
