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
public abstract class Weapon {

    public Weapon(String Name, int AttackPoint) {
        this.Name = Name;
        this.AttackPoint = AttackPoint;
    }
    
    String Name;
    int AttackPoint;
    abstract int TotalPoint();
}
