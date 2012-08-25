package de.bdh.kb2;

public class KBTimer implements Runnable {
	long time = 0;
	Main main;
	
	public KBTimer(Main main)
    {
        this.main = main;
    }
	
	public void run()
	{
		try
		{
		if (Math.abs(System.currentTimeMillis() - time) < 60*1000*60*12)
		{
			return;
		}
			time = System.currentTimeMillis();
			this.main.helper.Tick();
		} catch (Exception e) {}
		
	}
}
