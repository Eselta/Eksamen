/**
 * Created by eselta on 12/16/15.
 */
public class Chef extends Medarbejder {


    //Stilling bliver automatisk sat til "Chef" når der oprettes en ny instans af denne klasse
    public Chef() {
        this.stilling = "chef";
    }



    public Chef(String fornavn, String efternavn, String adresse, String tlf, String regNr, String kontoNr){
        this.stilling = "Chef";
        this.Fornavn = fornavn;
        this.Efternavn = efternavn;
        this.Adresse = adresse;
        this.Telefon_nr = tlf;
        this.Reg_nr = regNr;
        this.Konto_nr = kontoNr;
    }
}
