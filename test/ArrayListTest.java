import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest
{
  /*
    Description: addedElementToArrayListIndex test method, checks if the functionality
    of the add method in the ArrayList class.
    How: In order to check this out, a string is added to the arraylist after
    which, the test checks if  the arraylist contains a string equal to
    the string that has been added previously.
    Result: The string has been added to the arraylist.
   */
  @Test
  public void addedElementToArrayList() {
    ArrayList<String> list = new ArrayList<>();
    list.add("smth2");

    assertTrue(list.contains("smth2"));
  }

  /*
    Description: The test method addedElementToArrayListAtIndex tests if
    a string is added to the arraylist and if it is added to the correct
    position.
    How: Three strings are added to the arraylist after which the test method
    asserts if the list contains one of the strings and if that string is at
    the position that was added.
    Result: The string has been added to the arraylist at the correct position.
   */
  @Test
  public void addedElementToArrayListAtIndex() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    assertTrue(list.contains("smth2") && list.indexOf("smth2") == 1);
  }

  /*
    Description: The test method setElementTo examines if a string is replaced
    at the correct position after calling the set method from arraylist class.
    How: After adding multiple elements in the arraylist, the set method is
    being called, and the test method checks if the string is at the position
    that has been set to.
    Result: The position of the string has been changed successfully.
   */
  @Test
  public void setElementTo() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    list.set(0, "smth3");

    assertTrue(list.indexOf("smth3") == 0 );
  }

  /*
    Description: The getElement method tests if the get method in the arraylist
    returns the value of the string at the given position.
    How: After adding three strings to the arraylist, the test method asserts
    if the given string value is equal to the string value of the position given
    in the get method.
    Result: The two string values are equal.
   */
  @Test
  public void getElement() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    assertEquals("smth3", list.get(2));
  }

  /*
    Description: The removeElement test, checks if the remove method from the
    arraylist class removes the value that corresponds to the given position
    after calling the method.
    How: After adding three values to the arraylist the test method calls the
    remove method then checks is an exception is thrown. If an exception is
    thrown that means that the value still exists in the arraylist.
    Result: An exception has been thrown after calling the method.
   */
  @Test
  public void removeElement() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    list.remove(2);

    try {
      list.get(2);
    } catch (Exception e) {
      System.out.println("Doesnt work");
    }
  }

  /*
    Description: The getIndexOf test method tests if after giving a position as an
    argument the indexOf method from the arraylist class returns the correct
    string value.
    How: After the adding 3 strings to the arraylist, the test class calles the
    indexOf method from the arraylist and checks if the returned string value is
    equal to the expected.
    Result: The two string values are the same.
 */
  @Test
  public void getIndexOf() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    assertEquals(1,list.indexOf("smth2"));
  }

  /*
    Description: The doesItContain method checks if the arraylist contains a given
    string value.
    How: After adding three string values and calling the contains method from the
    arraylist class, the test method asserts if the expected boolean value is
    equal to the given one from the method.
    Result: The two boolean values are equal.
 */
  @Test
  public void doesItContain() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    assertEquals(true ,list.contains("smth3"));
  }

  /*
    Description: The emptyList test method tests the functionality of the isEmpty
    method from arrayList class works
    How: After adding 2 elements in the arraylist, the test method asserts if
    the boolean returned from the isEmpty method is false.
    Result: The two booleans are equal.
 */
  @Test
  public void emptyList() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");

    assertEquals(false, list.isEmpty());
  }

  /*
    Description: The isListFull method checks if the isFull method returns true
    when the list is full.
    How: After adding three string values to the arraylist the test method
    asserts if the value that is expected is given after calling the arraylist
    method.
    Result: The given value is different that the expected one.
 */
  @Test
  public void isListFull() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    assertEquals(false, list.isFull());
  }

  /*
    Description: The getSizeOfList method checks if the correct number of elements
    is given, after calling the getSize method from the arraylist class.
    How: After adding three strings values in the arraylist, the test method
    asserts if the size given after calling the getSize method is 3.
    Result: The size method gives the correct number of elements.
 */
  @Test
  public void getSizeOfList() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");
    list.add(2,"smth3");

    assertEquals(3, list.size());
  }

  /*
    Description: The getToString test method checks if the toString method in
    the arraylist class returns the string values at all position as one big
    string.
    How: After adding 2 string values to the arraylist, the test method checks
    if the expected string after toString method, is equal to the one created
    after actually calling the method.
    Result: The string values are equal.
 */
  @Test
  public void getToString() {
    ArrayList<String> list = new ArrayList<>();
    list.add(0,"smth1");
    list.add(1,"smth2");

    assertEquals("{smth1, smth2}", list.toString());
  }


}