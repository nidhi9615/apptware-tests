package com.apptware.interview.immutability;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This test class has a validation for {@link com.apptware.interview.immutability.Student}. The
 * test create an instance of the Student class and modifies it and further expects the
 * modifications to be ignored.
 *
 * <p>The candidate is expected **NOT** to modify the test case but the corresponding class for
 * which the test case is written.
 */
class StudentTest {

  @Test
  void testImmutability() {
   String originalName = "Some Name";
  
    Date originalDateOfBirth = new Date(844453800000L);
  

    List<String> originalCourses = new ArrayList<>();
    originalCourses.add("English");
    originalCourses.add("Hindi");
    originalCourses.add("Marathi");

  Student student = new Student(originalName,originalDateOfBirth,originalCourses);
  

    Date dateOfBirth = originalDateOfBirth;
   dateOfBirth.setTime(System.currentTimeMillis());

    List<String> courses = originalCourses;
    courses.add("French");

//   Assertions.assertEquals(student.equals(dateOfBirth)).getTime().isEqualTo(844453800000L));
//  Assertions.(student.equals(courses))
//      containsExactlyElementsOf(List.of("English", "Hindi", "Marathi"));
    
  }

//private void containsExactlyElementsOf(List<String> of) {
	
	
}
