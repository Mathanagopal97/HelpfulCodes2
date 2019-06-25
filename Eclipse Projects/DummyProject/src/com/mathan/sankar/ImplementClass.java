package com.mathan.sankar;

import java.util.ArrayList;

public class ImplementClass {
	ArrayList<MainClass> mc = new ArrayList<>();
	
	public void add(int id,String name)
	{
		MainClass mc1 = new MainClass();
		mc1.setId(id);
		mc1.setName(name);
		mc.add(mc1);
	}
		
	public void DisplayAll(){
		for(MainClass mc1:mc) {
			System.out.println("Id: "+mc1.getId()+" Name: "+mc1.getName());
		}
	}
	
	public void delete(int index) {
		int id=0;
		for(MainClass mc2:mc) {
			if(index==mc2.getId())
				break;
			id++;
		}
		mc.remove(id);
	}
	
	public void update(int id,String name) {
		MainClass mc1 = null;
		for(MainClass mc2:mc) {
			if(id==mc2.getId()) {
				mc1=mc2;break;
			}
				
		}
		mc1.setName(name);
		
	}
}
