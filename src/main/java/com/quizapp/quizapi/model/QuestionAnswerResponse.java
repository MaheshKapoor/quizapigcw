package com.quizapp.quizapi.model;

import java.util.List;

/**
 * Created by abc on 9/29/2018.
 */
public class QuestionAnswerResponse {
    private List<QuestionWithAnswer> data;

    public List<QuestionWithAnswer> getData() {
        return data;
    }

    public void setData(List<QuestionWithAnswer> data) {
        this.data = data;
    }
}
