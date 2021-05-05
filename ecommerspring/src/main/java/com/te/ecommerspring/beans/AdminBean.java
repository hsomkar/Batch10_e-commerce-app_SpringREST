package com.te.ecommerspring.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "admin")
public class AdminBean implements Serializable {
	@Id
	@Column
	private Integer aid;
	@Column
	private String password;
}
