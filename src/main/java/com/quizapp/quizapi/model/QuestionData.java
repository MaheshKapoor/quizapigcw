package com.quizapp.quizapi.model;


import java.util.List;

/**
 * Created by abc on 10/6/2018.
 */
public class QuestionData {
    private ExtraDetails extraDetails;
    private List<QuestionWithAnswer> questions;

    public ExtraDetails getExtraDetails() {
        return extraDetails;
    }

    public void setExtraDetails(ExtraDetails extraDetails) {
        this.extraDetails = extraDetails;
    }

    public List<QuestionWithAnswer> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionWithAnswer> questions) {
        this.questions = questions;
    }
}
