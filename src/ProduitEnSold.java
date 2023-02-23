public class ProduitEnSold extends Produit {
    private double remise;

    public ProduitEnSold(Integer code, double prixOrigine, double remise) throws Exception {
        super(code, prixOrigine);
        if (remise < 0 || remise > 90) {
            throw new Exception("La remise doit être comprise dans l'intervalle [0, 90].");
        }
        this.remise = remise;
    }

    public void setRemise(double remise) throws Exception {
        if (remise < 0 || remise > 90) {
            throw new Exception("La remise doit être comprise dans l'intervalle [0, 90].");
        }
        this.remise = remise;
    }

    public double getRemise() {
        return remise;
    }

    @Override
    public double prixProduit() {
        double prix = super.prixProduit();
        return prix - (prix * (remise / 100.0));
    }

    @Override
    public String toString() {
        return super.toString() + ";" + remise;

    }
}