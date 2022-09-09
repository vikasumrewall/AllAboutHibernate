package com.hibernate.bidirectional.onetomanyandmanytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity@Table(name = "answer_bi")
public class AnswerBidirectional {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;	
	
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	public AnswerBidirectional() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnswerBidirectional(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	
	
}
