package com.promotion.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PERSON")
public class Company implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOGO")
	private String logo;
	
	@Column(name="birthday_msg")
	private String birthdayMsg;
	
	@Column(name="aniversary_msg")
	private String aniversaryMsg;
	
	@Column(name="common_msg")
	private String commonMsg;
	
	@Column(name="logo_image")
	private String logoImage;
	
	@Column(name="create_date")
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getBirthdayMsg() {
		return birthdayMsg;
	}

	public void setBirthdayMsg(String birthdayMsg) {
		this.birthdayMsg = birthdayMsg;
	}

	public String getAniversaryMsg() {
		return aniversaryMsg;
	}

	public void setAniversaryMsg(String aniversaryMsg) {
		this.aniversaryMsg = aniversaryMsg;
	}

	public String getCommonMsg() {
		return commonMsg;
	}

	public void setCommonMsg(String commonMsg) {
		this.commonMsg = commonMsg;
	}

	public String getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", birthdayMsg=" + birthdayMsg + ", aniversaryMsg="
				+ aniversaryMsg + ", commonMsg=" + commonMsg + ", createDate=" + createDate + "]";
	}
	
	
}
