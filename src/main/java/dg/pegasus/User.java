package dg.pegasus;

/**
 * User domain object
 * @author gianninasd
 */
public class User {
  
  private int id;
  private String userName;
  private String name;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}