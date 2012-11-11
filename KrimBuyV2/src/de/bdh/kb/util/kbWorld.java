package de.bdh.kb.util;

import org.bukkit.Location;
import org.bukkit.World;

public class kbWorld 
{
	public kbWorld(String w, Integer fx2, Integer fy2, Integer fz2, Integer tx2, Integer ty2, Integer tz2) 
	{
		this.fx = fx2;
		this.fy = fy2;
		this.fz = fz2;
		this.tx = tx2;
		this.ty = ty2;
		this.tz = tz2;
		this.world = w;
		
	}
	public Integer fx,fy,fz,tx,ty,tz;
	public String world;
	
	public boolean isIn(Location l)
	{
		return this.isIn(l.getWorld(),l.getBlockX(),l.getBlockY(),l.getBlockZ());
	}
	
	public boolean isIn(World w, int x, int y, int z)
	{
		if(fx <= x && fy <= y && fz <= z && tx >= x && ty >= y && tz >= z && w.getName().equals(this.world))
			return true;
		else
			return false;
	}
}
