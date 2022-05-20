package com.example.demo.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Cnt_person")
public class Cnt_person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name ="name")
	private String name;

	@Column(name ="office")
	private String office;

	@Column(name ="designation")
	private String designation;

	@Column(name ="remark")
	private String remark;

	@Column(name ="contactid")
	private int contactid;

	@Column(name ="cnt_typeid")
	private int cnt_typeid;

	@Column(name ="l_act")
	private int l_act;

	@Column(name ="createdby")
	private String createdby;

	@Column(name ="updatedby")
	private String updatedby;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="createOn")
	private Calendar createOn;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="updatedOn")
	private Calendar updatedOn;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="cnt_type")
	private Cnt_type cnt_type;
}
