package org.launchcode;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {

  private double price;
private String description;
//  private String ItemAge;
  private LocalDate LastUpdated;
  public MenuItem(double price, String description, LocalDate lastUpdated) {
    this.price = price;
    this.description = description;
    LastUpdated = lastUpdated;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getLastUpdated() {
    return LastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    LastUpdated = lastUpdated;
  }
}
