/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;

/**
 *
 * @author Windows 8.1
 */
public class Sword extends Weapon{

    public Sword(String Name, int AttackPoint) {
        super(Name, AttackPoint);
    }

    @Override
    int TotalPoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void Spesification (){
        System.out.println( Name  );
        System.out.println("efektif digunakan untuk pertarungan jarak dekat");
        System.out.println("akan menghasilkan Attack Point Sebesar " + AttackPoint);
        System.out.println("total attack point sebesar " + AttackPoint);
    }
  
}
