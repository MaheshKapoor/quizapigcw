package com.quizapp.quizapi.model;

import java.util.List;

/**
 * Created by abc on 9/28/2018.
 */
public class QuestionResponse {

   private List<Question> data;

    public List<Question> getData() {
        return data;
    }

    public void setData(List<Question> data) {
        this.data = data;
    }
}
