package org.opentutorials.javatutorials.progenitor;

class Students implements Cloneable {
	String name;

	Students(String name) {
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class ObjectDemo2 {

	public static void main(String[] args) {
		Students s1 = new Students("egoing");
		try {
			Students s2 = (Students) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
