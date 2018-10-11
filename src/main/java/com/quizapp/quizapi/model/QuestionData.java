package com.quizapp.quizapi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by abc on 10/6/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
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
