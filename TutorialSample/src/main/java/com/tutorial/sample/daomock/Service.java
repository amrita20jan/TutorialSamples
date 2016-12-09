package com.tutorial.sample.daomock;

public class Service {
	Dao lDao;
	
	//Service(){}
	
	Service(Dao lDao){
		this.lDao=lDao;
	}
	
	public String fetchKey(int id){ 
		Entity entity=lDao.findbyId(id);
		return entity.getfName()+" "+entity.getlName();
		
	}
	
	public String fetchKeyByName(String name){
		Entity entity = lDao.findByName(name);
		return entity.getfName() + " " +entity.getlName();
	}
}
