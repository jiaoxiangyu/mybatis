/**        
 * @author: 焦祥宇 
 * @date:   createDate：2017年7月2日 上午10:34:03   
 * @Description:  
 * 
 */  
package mybatis.bean;

/**
 * @author Administrator
 *
 */
public class UserBean {
	private int id;
	private String name;
	private String password;
	
	/**
	 * 
	 */
	public UserBean() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param password
	 */
	public UserBean(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
