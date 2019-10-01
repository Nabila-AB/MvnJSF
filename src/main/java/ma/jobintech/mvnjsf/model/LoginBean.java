package ma.jobintech.mvnjsf.model;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean implements Serializable {
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginBean() {
		// TODO Auto-generated constructor stub
	}
	public void validateAField(FacesContext context, UIComponent component, Object value) throws ValidatorException {
	    String inputValue = (String) value;
	    if ( ! inputValue.contains( "#" ) ) {
	        FacesMessage msg = new FacesMessage( "Mauvais format : doit contenir un #" );
	        msg.setSeverity( FacesMessage.SEVERITY_ERROR );
	        throw new ValidatorException(msg);
	    }
	}

	public String returnAction() {
		if(this.password.equals("test"))
			return "success";
		else
			return "Erreur";
	}
}
