package journey.log;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "user")
@NamedQuery(name = "Users.findAll", query = "SELECT f FROM user f ORDER BY f.name", hints = @QueryHint(name = "org.hibernate.cacheable", value = "true"))
public class User {
	
	private String uuid;
	
	@JsonProperty("handle_name")
	@Column(name="handle_name", length = 40, unique = true)
	private String handleName;
	
	@JsonProperty("display_name")
	@Column(name="display_name", length = 40)
	private String displayName;
	
	private String password;
	
	public User() {}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getHandleName() {
		return handleName;
	}

	public void setHandleName(String handleName) {
		this.handleName = handleName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
