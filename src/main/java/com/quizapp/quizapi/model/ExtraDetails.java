package com.quizapp.quizapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Created by abc on 10/6/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtraDetails {
    private String quizTitle;
    private String previousSet;
    private String nextSet;
    private String numberOfQuestion;
    private List<ReferralLink> referralLink;

    public String getQuizTitle() {
        return quizTitle;
    }

    public void setQuizTitle(String quizTitle) {
        this.quizTitle = quizTitle;
    }

    public String getPreviousSet() {
        return previousSet;
    }

    public void setPreviousSet(String previousSet) {
        this.previousSet = previousSet;
    }

    public String getNextSet() {
        return nextSet;
    }

    public void setNextSet(String nextSet) {
        this.nextSet = nextSet;
    }

    public String getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(String numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    public List<ReferralLink> getReferralLink() {
        return referralLink;
    }

    public void setReferralLink(List<ReferralLink> referralLink) {
        this.referralLink = referralLink;
    }
}



