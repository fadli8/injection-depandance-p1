package Dao;

import org.springframework.stereotype.Component;

@Component("vc")
public class DaoImplVCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("version Capteurs");
        double data=77;
        return data;
    }
}
