/**
 * Created by eselta on 12/16/15.
 */
public class Medarbejder {

    //protected variabler for at det kun er Super og Sub-classes som kan tilgå dem
    protected String Fornavn, Efternavn, Adresse, Telefon_nr, stilling, Løntrin, Reg_nr, Konto_nr;

    //Getters and setters herunder

    public String getFornavn() {
        return Fornavn;
    }

    public void setFornavn(String fornavn) {
        Fornavn = fornavn;
    }

    public String getEfternavn() {
        return Efternavn;
    }

    public void setEfternavn(String efternavn) {
        Efternavn = efternavn;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getTelefon_nr() {
        return Telefon_nr;
    }

    public void setTelefon_nr(String telefon_nr) {
        Telefon_nr = telefon_nr;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public String getLøntrin() {
        return Løntrin;
    }

    public void setLøntrin(String løntrin) {
        Løntrin = løntrin;
    }

    public String getReg_nr() {
        return Reg_nr;
    }

    public void setReg_nr(String reg_nr) {
        Reg_nr = reg_nr;
    }

    public String getKonto_nr() {
        return Konto_nr;
    }

    public void setKonto_nr(String konto_nr) {
        Konto_nr = konto_nr;
    }
}
