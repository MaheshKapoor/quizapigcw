package com.quizapp.quizapi.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Created by abc on 10/4/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionAnswerResponse {
    private QuestionData data;

    public QuestionData getData() {
        return data;
    }

    public void setData(QuestionData data) {
        this.data = data;
    }
}
