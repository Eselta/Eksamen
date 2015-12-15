/**
 * Created by eselta on 12/4/15.
 */
public class Login {
    private static final String medarbejderPassword = "qweqwe";
    private static final String medarbejderBrugernavn = "qweqwe";
    private static final String chefPassword = "qwe"; // bøddel
    private static final String chefBrugernavn = "qwe"; // Fenger

    public int validerLogin(String b, String p){

        //iD 1 = chef login, iD 2 = medarbejder login
        int loginID = 0;
        if(b.equalsIgnoreCase(chefBrugernavn) && p.equals(chefPassword)){
            loginID = 1;
        }
        else if (b.equalsIgnoreCase(medarbejderBrugernavn) && p.equals(medarbejderPassword)){
            loginID = 2;
        }
        else{
            loginID = -1;
        }
        return loginID;
    }


}