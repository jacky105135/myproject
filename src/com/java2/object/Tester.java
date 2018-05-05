package com.java2.object;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
		
	}

}
class Employee{
	String name;
	String email;
	int experience;
	
	public Employee(String name,String email,int experience){
		this.name = name;
		this.email = email;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getExperience() {
		return experience;
	}
}

class Developer extends Employee{

	String MainLanguage;
	String[] skills;

	public Developer(String name, String email, int experience,String MainLanguage,String[] skills) {
		super(name, email, experience);
		this.MainLanguage = MainLanguage;
		this.skills = skills;
	}
	public String getMainLanguage() {
		return MainLanguage;
	}
	public String[] getSkills() {
		return skills;
	}
}

class DataAnalyst extends Employee{
	
	boolean PhD;
	String[] methods;
	
	public DataAnalyst(String name, String email, int experience,boolean PhD,String[] methods) {
		super(name, email, experience);
		this.PhD = PhD;
		this.methods = methods;
	}
	public boolean isPhD() {
		return PhD;
	}
	public String[] getMethods() {
		return methods;
	}
}
