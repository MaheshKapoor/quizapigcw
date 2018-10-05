package com.quizapp.quizapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by abc on 9/28/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Question {
private int QnID;
private String ImageName;
private String Qn;
private String[] Options;

    public String[] getOptions() {
        return Options;
    }

    public void setOptions(String[] options) {
        Options = options;
    }

    public int getQnID() {
        return QnID;
    }

    public void setQnID(int qnID) {
        QnID = qnID;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }

    public String getQn() {
        return Qn;
    }

    public void setQn(String qn) {
        Qn = qn;
    }

}
