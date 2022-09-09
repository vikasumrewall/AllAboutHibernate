package com.hibernate.bidirectional.onetomanyandmanytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_bi")
public class QuestionBidirectional {
	
	@Id
	@Column(name = "question_id")
	private int questionId;
	
	private String question;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="question_id")
	private List<AnswerBidirectional> answerBidirectional;
	
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
	
	
	
	
	
	
	public List<AnswerBidirectional> getAnswerBidirectional() {
		return answerBidirectional;
	}
	public void setAnswerBidirectional(List<AnswerBidirectional> answerBidirectional) {
		this.answerBidirectional = answerBidirectional;
	}
	public QuestionBidirectional(int questionId, String question, List<AnswerBidirectional> answerBidirectional) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answerBidirectional = answerBidirectional;
	}
	public QuestionBidirectional() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
