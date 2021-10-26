package com.RestfulAPI.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="assignment")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NonNull
	@Column(name="subject")
	private String subject;
	
	@Column(name="title")
	private String title;
	
	@Lob 
	@Column(name="assignment_desc", length=512)
	private String assignmentdesc;
	
	@Column(name="nof_attachments")
	private long nof_attachments;
	
	@Column(name="submission_date")
	private Date submission_date;
	
	@Column(name="is_submitted")
	private long is_submitted;
	
	public Student()
	{
		
	}

	public Student(@NonNull String subject, String title, String assignmentdesc, long nof_attachments,
			Date submission_date, long is_submitted) {
		super();
		this.subject = subject;
		this.title = title;
		this.assignmentdesc = assignmentdesc;
		this.nof_attachments = nof_attachments;
		this.submission_date = submission_date;
		this.is_submitted = is_submitted;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAssignmentdesc() {
		return assignmentdesc;
	}

	public void setAssignmentdesc(String assignmentdesc) {
		this.assignmentdesc = assignmentdesc;
	}

	public long getNof_attachments() {
		return nof_attachments;
	}

	public void setNof_attachments(long nof_attachments) {
		this.nof_attachments = nof_attachments;
	}

	public Date getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(Date submission_date) {
		this.submission_date = submission_date;
	}

	public long getIs_submitted() {
		return is_submitted;
	}

	public void setIs_submitted(long is_submitted) {
		this.is_submitted = is_submitted;
	}

   
	
}
