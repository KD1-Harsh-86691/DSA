package com.sunbeam;

import java.util.Scanner;

class employees {
	int empid;
	String name;

	public employees() {
	}

	public employees(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("[empid=" + empid + ", name=" + name + "]");
	}

	public static employees searchbyEmpid(employees emp[], Scanner sc) {
		System.out.println("Enter id to search");
		int id = sc.nextInt();
		for (employees e : emp)
			if (id == e.getEmpid())
				return e;
		return null;

	}

	public static employees searchbyEmpName(employees emp[], Scanner sc) {
		System.out.println("Enter name to be search");
		String name = sc.next();
		for (employees em : emp)
			if (name.equals(em.getName()))
				return em;
		return null;

	}

	public static void main(String[] args) {
		employees emp[] = { (new employees(1, "Harsh")), (new employees(2, "Messi")), (new employees(3, "Neymar")),
				(new employees(4, "Pogba")), (new employees(5, "Suarez")) };
		employees e;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Search by empid");
			System.out.println("2.Search by name");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				e = searchbyEmpid(emp, sc);
				e.display();
				break;
			case 2:
				e = searchbyEmpName(emp, sc);
				e.display();
				break;

			default:
				break;
			}
		}

	}
}