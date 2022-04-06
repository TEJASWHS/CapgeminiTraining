package com.capg.tday1;

abstract class plane{
 abstract void land();
}


class Cargo extends plane{
	@Override
	void land() {
		{
			System.out.println("\nCargo plane is landed");
		}
	} 
}
class Fighter extends plane{
	@Override
	void land() {
		{
			System.out.println("\nFighter plane is landed");
		}
	} 
}

	 class passenger extends plane{
		 @Override
		 void land()
		 {
			 System.out.println("\npassenger plane is landed");
		 }	 
	 }
	 
	 class Airport{
		 void allowplanetoland(plane ref) {
			 ref.land();
		 }
	 }
	 
public class MyPolymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo c=new Cargo();
		passenger p=new passenger();
		Fighter f=new Fighter();
		Airport a=new Airport();
		a.allowplanetoland(c);
		a.allowplanetoland(p);
		a.allowplanetoland(f);
	}	
}
