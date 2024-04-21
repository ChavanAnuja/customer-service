package org.customer.dto;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Component
public class CustomerResponse {

  @NotNull(message = "Status not be Null")
  private String status;

  @NotNull(message = "Message not be Null")
  private String message;

  private long customerCode;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(long customerCode) {
    this.customerCode = customerCode;
  }
}
