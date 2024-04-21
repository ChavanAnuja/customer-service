package org.customer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class CustomerRequest {

  @NotNull(message = "Username should not be Null")
  @NotBlank(message = "Username should not be Blank")
  private String firstName;

  @NotNull(message = "Lastname should not be Null")
  @NotBlank(message = "Lastname should not be Blank")
  private String lastName;

  private String middleName;
  private String dateOfBirth;
  private String addressLine1;
  private String addressLine2;
  private String zip;
  private String city;
  private String state;
  private String country;

  // @Min(value=10,message="Minium digits should be 10")
  // @Max(value=10,message="maximum digits should be 10")
  private String mobilePhone;

  // @Min(value=10,message="Minium digits should be 10")
  // @Max(value=12,message="maximum digits should be 12")
  private String homePhone;

  private String workPhone;

  @NotNull(message = "Email Id is Mendatory")
  @NotBlank(message = "Email Id should not be Blank")
  @Email(message = "Invalid email formate")
  private String emailID;

  private long customerId;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastNaame) {
    this.lastName = lastNaame;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getEmailID() {
    return emailID;
  }

  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }
}
