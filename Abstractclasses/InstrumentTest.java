package com.wipro.Abstractclasses;
abstract class Instrument
{
	abstract void play();
}
class paino extends Instrument
{
	void play()
	{
		System.out.println("Paino is playing tan tan tan");
	}
}
class flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}
public class InstrumentTest {
	public static void main(String[] args) {
		Instrument  Insta[]=new Instrument[10];
		int i;
		for(i=0;i<4;i++)
		{
			Insta[i]=new paino();
			Insta[i].play();
		}
		for(i=4;i<7;i++)
		{
			Insta[i]=new flute();
			Insta[i].play();
		}
		for(i=7;i<10;i++)
		{
			Insta[i]=new guitar();
			Insta[i].play();
		}
		for(i=0;i<10;i++)
		{
			if(Insta[i] instanceof paino)
			{
				System.out.println(i+". Paino object");
			}
			else if(Insta[i] instanceof flute)
			{
				System.out.println(i+". flute object");
			}
			else 
				
			{
				System.out.println(i+". Guitar object");
			}
			
			
		}
	}

}
