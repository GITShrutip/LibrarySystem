package LMS.ModalEntity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

/**
* @Author :: Shruti Ponkshe
**/
@Entity
public class parameter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	String p_name;
	@ElementCollection
	@CollectionTable(name="paralisttable", joinColumns = @JoinColumn(name="entity_id"))
	List<String> paralist;
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public List<String> getParalist() {
		return paralist;
	}
	public void setParalist(List<String> paralist) {
		this.paralist = paralist;
	}

	
}
