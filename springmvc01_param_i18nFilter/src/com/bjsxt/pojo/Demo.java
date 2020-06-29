package com.bjsxt.pojo;

import java.util.List;

public class Demo {
	
	private People people;
	
	private List<People> peo1;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public List<People> getPeo1() {
		return peo1;
	}

	public void setPeo1(List<People> peo1) {
		this.peo1 = peo1;
	}

	@Override
	public String toString() {
		return "Demo [people=" + people + ", peo1=" + peo1 + "]";
	}
	
	
	
}
