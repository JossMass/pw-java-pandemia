package pe.edu.upc.pandemia.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Countries")
public class Country {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Integer id;

	@Column(name = "country_name", length = 40)
	private String name;

	@ManyToOne
	@JoinColumn(name = "region_id", nullable = false) // Foreign Key
	private Region region; // Region_Id

	//@OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
	//private List<Location> locations;

	// -- Constructor, Getter y Setter
	public Country() {
		super();
		//locations = new ArrayList<Location>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	//public List<Location> getLocations() {
		//return locations;
	//}

	//public void setLocations(List<Location> locations) {
		//this.locations = locations;
	//}

}
