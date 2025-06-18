package dao;

public class DaoImpl  implements  IDao{

    @Override
    public double getData() {
        /*
        se connecter a la BD pour la recuperation de la temperature
         */
        System.out.println("Version base de données :");
        double temp = 100*20;
        return temp;
    }
}
