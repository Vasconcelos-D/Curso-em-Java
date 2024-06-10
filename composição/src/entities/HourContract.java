package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {	
	}

	public HourContract(Date date, Double valuePerHours, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHours;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHours() {
		return valuePerHour;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHour = valuePerHours;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public double totalValeu() {
		return valuePerHour * hours;
	}
}
