package com.apptware.interview.serialization;

import java.io.Serializable;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;



//import org.junit.platform.commons.util.StringUtils;


//@Data
//@NoArgsConstructor
public class Adult implements Serializable{

  private String firstName;
  private String lastName;
  private Integer age;

  /**
   * This class has a constructor validation that restricts illegal Adult instances which doesn't
   * work during deserialization. Modify the code in this file so that we can also restrict illegal
   * Adult instances during deserialization.
   */
  public Adult(String firstName, String lastName, Integer age) {
    if (StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName)) {
      throw new IllegalArgumentException("Firstname or Lastname CANNOT be blank.");
    }

    if (Objects.isNull(age) || age < 18) {
      throw new IllegalArgumentException("Inappropriate Age for an Adult.");
    }

    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
}
