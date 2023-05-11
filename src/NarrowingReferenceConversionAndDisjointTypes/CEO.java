/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NarrowingReferenceConversionAndDisjointTypes;

/**
 *
 * @author bhayu
 */
public class CEO extends BranchManager implements ChiefOfficer{

    @Override
    public boolean scrutnize(ChiefOfficer co) 
    
    {
      
        if ( co instanceof ChiefOfficer )
           return true;
       else
           return false;
    
    }
    
}
