/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SealedImpl.Company_Hierarch.Manager;

/**
 *
 * @author bhayu
 */
public non-sealed class SecurityManager extends FinanceManager
        
{
    public void secure()
    {
        Managers mg = (Managers) new SecurityManager();
        
    }
}
