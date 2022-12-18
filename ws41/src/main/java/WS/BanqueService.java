package WS;

import java.util.Date;
import java.util.List;

@webservice(serviceName = "BanqueWS")
public class BanqueService {
    @webMethode(operationName = "convert")
    public double conversion (@webParam(name = "montant")double mt){
        return mt *10.54;
    }
   // @webMethode
    public Compte getCompte(@webParam(name = "code")int code){

        return new Compte(code , Math.random()*9888, new Date());
        }

    //@webMethode
        public List<Compte> listCompt(){
        for( Compte list : listCompt()) {
            new Compte(1, Math.random() * 9888, new Date());
            new Compte(2, Math.random() * 9888, new Date());
            new Compte(3, Math.random() * 9888, new Date());
        }return listCompt();
        }
    }

