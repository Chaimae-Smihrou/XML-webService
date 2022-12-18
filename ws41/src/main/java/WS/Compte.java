package WS;
import jakarta.xml.blind.annotation.xmlTransient;
import jakarta.xml.blind.annotation.XmlAccessorType;
import jakarta.xml.blind.annotation.xmlAccessType;
import jakarta.xml.blind.annotation.xmlRootElement;
import java.util.Date;
@xmlRootElement(name = "compte")
@xmlAccessorType(xmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @xmlTransient
    private Date dateCreation;

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

}
