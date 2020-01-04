package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "food", schema = "revfit")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Food {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	
	@Column(name = "foodname")
	private String foodName;
	
	@Column(name = "calories")
	private int calories;
	
	@Column(name = "carbs")
	private int carbs;
	
	@Column(name = "fat")
	private int fat;
	
	@Column(name = "protein")
	private int protein;
	
	@Column(name = "fiber")
	private int fiber;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(int foodId, String foodName, int calories, int carbs, int fat, int protein, int fiber) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.calories = calories;
		this.carbs = carbs;
		this.fat = fat;
		this.protein = protein;
		this.fiber = fiber;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFiber() {
		return fiber;
	}

	public void setFiber(int fiber) {
		this.fiber = fiber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + carbs;
		result = prime * result + fat;
		result = prime * result + fiber;
		result = prime * result + foodId;
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
		result = prime * result + protein;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (calories != other.calories)
			return false;
		if (carbs != other.carbs)
			return false;
		if (fat != other.fat)
			return false;
		if (fiber != other.fiber)
			return false;
		if (foodId != other.foodId)
			return false;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
			return false;
		if (protein != other.protein)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", calories=" + calories + ", carbs=" + carbs
				+ ", fat=" + fat + ", protein=" + protein + ", fiber=" + fiber + "]";
	}
	
	
}
