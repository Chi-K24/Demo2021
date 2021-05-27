/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescommission;

/**
 *
 * @author Chi T. Le - 991185018>
 */
public class SalesCommission {

    /**
     * @param args the command line arguments
     */
    private double salesCommission;
    
    public SalesCommission(double salesCommission)
    {
        this.salesCommission = salesCommission;
    }
    
    public void setSalesCommission(double salesCommission)
    {
        this.salesCommission= salesCommission;
    }
    
    public double getSalesCommission()
    {
        return salesCommission;
    }
    
    public double computeCommission()
    {
        double comm; 				// commission

        final double rate1 = 0.08;
        final double rate2 = 0.10;
        final double rate3 = 0.12;

	final double constant1 = 900.0;
	final double constant2 = 400.0;
	final double constant3 = 10000.0;
	final double constant4 = 5000.0;

	if (salesCommission >= 10001)										// Processing
            comm = constant1 + (salesCommission - constant3)* rate3;

	else if (salesCommission >= 5001 && salesCommission <= 10000)
            comm = constant2 + ((salesCommission - constant4)* rate2);

	else
            comm = salesCommission * rate1;


        return comm;
}      
    
}