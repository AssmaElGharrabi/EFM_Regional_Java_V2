import java.util.Objects;
public class Produit {
    private Integer code;
    private double prixOrigine;
    private double pourcentageRemise;

    public Produit(Integer code, double prixOrigine) {
        this.code = code;
        this.prixOrigine = prixOrigine;
    }

    public Produit(Integer code, double prixOrigine, double pourcentageRemise) {
        this.code = code;
        this.prixOrigine = prixOrigine;
        this.pourcentageRemise = pourcentageRemise;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setPrixOrigine(double prixOrigine) {
        this.prixOrigine = prixOrigine;
    }

    public double getPrixOrigine() {
        return prixOrigine;
    }

    public void setPourcentageRemise(double pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public double getPourcentageRemise() {
        return pourcentageRemise;
    }

    public double prixProduit() {
        if (pourcentageRemise > 0) {
            return prixOrigine - (prixOrigine * (pourcentageRemise / 100.0));
        } else {
            return prixOrigine;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        return Objects.equals(this.code, other.code);
    }

    @Override
    public String toString() {
        return code + ";" + prixOrigine + ";" + pourcentageRemise;
    }
}

