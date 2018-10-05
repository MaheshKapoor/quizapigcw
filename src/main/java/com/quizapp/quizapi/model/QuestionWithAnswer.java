package com.quizapp.quizapi.model;

/**
 * Created by abc on 9/29/2018.
 */
public class QuestionWithAnswer {

    private String QnID;
    private String ImageName;
    private String Qn;
    private String[] Options;
    private String Answer;

    public String[] getOptions() {
        return Options;
    }

    public void setOptions(String[] options) {
        Options = options;
    }

    public String getQnID() {
        return QnID;
    }

    public void setQnID(String qnID) {
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



    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
