package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    /*
    couplage faible
     */
    private IDao dao = null;
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp/10;
        return res;
    }
    /*
    Injecté dans la variable dao un objet d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao){
        this.dao = dao;
    }
}
