package py.edu.uc.lp3.domain;

import javax.persistence.Entity;

/**
 * @author afeltes
 *
 */
@Entity
public class MEC extends BaseInstitute {
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
