package application;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Double salaray) {
		this.id = id;
		this.name = name;
		this.salary = salaray;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalaray() {
		return salary;
	}

	public void setSalaray(Double salaray) {
		this.salary = salaray;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return   id
				+ ", "
				+ name
				+ ", "
				+ String.format("%2.2f", salary);
	}

}
