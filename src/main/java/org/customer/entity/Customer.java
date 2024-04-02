package org.customer.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {

  @Valid
  @GeneratedValue
  @Id
  @Column(nullable = false, insertable = false, updatable = false)
  private long customer_code;

  @Column private String first_name;

  @Column private String last_name;

  @Column private String middle_name;

  @Column private String date_of_birth;

  @Column private String address_line1;

  @Column private String address_line2;

  @Column private String zip;

  @Column private String city;

  @Column private String state;

  @Column private String country;

  @Column(nullable = false, insertable = true, updatable = false)
  private LocalDateTime created_date;

  @Column(nullable = false, insertable = true, updatable = false)
  private LocalDateTime updated_date;

  @Column(updatable = true, nullable = false)
  private long customer_id;

  @Column(name = "mobile")
  private String mobile;

  @Column private String home_phone;

  @Column private String work_phone;

  @Column(unique = true)
  private String email_id;

  public static Customer getInstance() {
    return new Customer();
  }

  public long getCustomer_code() {
    return customer_code;
  }

  public Customer setCustomer_code(long customer_code) {
    this.customer_code = customer_code;

    return this;
  }

  public String getFirst_name() {
    return first_name;
  }

  public Customer setFirst_name(String first_name) {
    this.first_name = first_name;
    return this;
  }

  public String getLast_name() {
    return last_name;
  }

  public Customer setLast_name(String last_name) {
    this.last_name = last_name;

    return this;
  }

  public String getMiddle_name() {
    return middle_name;
  }

  public Customer setMiddle_name(String middle_name) {
    this.middle_name = middle_name;
    return this;
  }

  public String getDate_of_birth() {
    return date_of_birth;
  }

  public Customer setDate_of_birth(String date_of_birth) {
    this.date_of_birth = date_of_birth;

    return this;
  }

  public String getAddress_line1() {
    return address_line1;
  }

  public Customer setAddress_line1(String address_line1) {
    this.address_line1 = address_line1;
    return this;
  }

  public String getAddress_line2() {
    return address_line2;
  }

  public Customer setAddress_line2(String address_line2) {
    this.address_line2 = address_line2;

    return this;
  }

  public String getZip() {
    return zip;
  }

  public Customer setZip(String zip) {
    this.zip = zip;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Customer setCity(String city) {
    this.city = city;

    return this;
  }

  public String getState() {
    return state;
  }

  public Customer setState(String state) {
    this.state = state;

    return this;
  }

  public String getCountry() {
    return country;
  }

  public Customer setCountry(String country) {
    this.country = country;

    return this;
  }

  public String getMobile_phone() {
    return mobile;
  }

  public Customer setMobile_phone(String mobile_phone) {
    this.mobile = mobile_phone;

    return this;
  }

  public String getHome_phone() {
    return home_phone;
  }

  public Customer setHome_phone(String home_phone) {
    this.home_phone = home_phone;

    return this;
  }

  public String getWork_phone() {
    return work_phone;
  }

  public Customer setWork_phone(String work_phone) {
    this.work_phone = work_phone;

    return this;
  }

  public String getEmail_id() {
    return email_id;
  }

  public Customer setEmail_id(String email_id) {
    this.email_id = email_id;

    return this;
  }

  public long getCustomer_id() {
    return customer_id;
  }

  public Customer setCustomer_id(long customer_id) {
    this.customer_id = customer_id;

    return this;
  }

  public LocalDateTime getCreated_date() {
    return created_date;
  }

  public Customer setCreated_date(LocalDateTime created_date) {
    this.created_date = created_date;
    return this;
  }

  public LocalDateTime getUpdated_date() {
    return updated_date;
  }

  public Customer setUpdated_date(LocalDateTime updated_date) {
    this.updated_date = updated_date;
    return this;
  }
}
