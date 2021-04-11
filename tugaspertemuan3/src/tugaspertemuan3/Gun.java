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
public class Gun extends Weapon {
    String Scope ;
    int Amunition ;
    
    public Gun(int Amunition, String Scope, String Name, int AttackPoint) {
        super( Name, AttackPoint);
        this.Amunition = Amunition;
        this.Scope=Scope;
    }
       
       @Override 
       int TotalPoint(){
       return Amunition*AttackPoint;
    }
          void Spesification (){
        System.out.println( Name  );
        System.out.println("efektif digunakan untuk pertarungan jarak jauh dan akan");
        System.out.println("Senjata ini memiliki scope sejauh " + Scope);
        System.out.println("memiliki amunisi sebanyak " + Amunition);
        System.out.println("akan menghasilkan Attack Point Sebesar " + AttackPoint);
        System.out.println("total attack point sebesar " +Amunition * AttackPoint);
    }
}
    
    
    
    

