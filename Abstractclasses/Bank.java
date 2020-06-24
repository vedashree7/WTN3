package com.wipro.Abstractclasses;

abstract class GeneralBank
{
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
	
}
class ICICIBank extends GeneralBank
{
	 double getSavingsInterestRate()
	 {
		 return 4;
	 }
	 double getFixedDepositInterestRate()
	 {
		 return 8.5;
	 }
	
}
class KotMBank extends GeneralBank
{
	double getSavingsInterestRate()
	 {
		
		 return 6;
	 }
	 double getFixedDepositInterestRate()
	 {
		
		 return 9;
	 }
}

public class Bank {
	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		KotMBank  k=new KotMBank();
		GeneralBank g=new ICICIBank();
		GeneralBank g1=new KotMBank();
		System.out.println("The savings intrest of ICICI is ="+i.getSavingsInterestRate()+"%\nThe Fixed intrest of ICICI is= "+i.getFixedDepositInterestRate()+"%");
		System.out.println("The savings intrest of KotMBank is ="+k.getSavingsInterestRate()+"%\nThe Fixed intrest of KotMBank is= "+k.getFixedDepositInterestRate()+"%");	
		System.out.println("The savings intrest of ICICI is ="+g.getSavingsInterestRate()+"%\nThe Fixed intrest of ICICI is= "+g.getFixedDepositInterestRate()+"%");
		System.out.println("The savings intrest of KotMBank is ="+g1.getSavingsInterestRate()+"%\nThe Fixed intrest of KotMBank is= "+g1.getFixedDepositInterestRate()+"%");	
				
	}

}
