package main;

public class Testowanie {
//public int x = 5;
//public int y = 5;
//public double deltaMnozenie = 0.0;
	public double dodawanie(double x, double y){
		return x+y;
	}
	
	public double odejmowanie(double x, double y){
		return x-y;
	}
	
	public double mnozenie(double x, double y){
		return x*y;
	}
	
	public boolean sprawdzyCzyDzieliPrzezZero(int x,int y){
		if (y==0)
		{
			return true;
		}
		else
			return false;
	}
	
	public double dzielenie(double x, double y){
		if (y==0)
		{
			throw new java.lang.Error("Nie dzielimy przez 0!");
		}
		else
		{
			return x/y;
		}	
	}
}
