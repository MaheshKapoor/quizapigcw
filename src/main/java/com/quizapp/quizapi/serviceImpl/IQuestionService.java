package com.quizapp.quizapi.serviceImpl;

import com.quizapp.quizapi.model.Question;
import com.quizapp.quizapi.model.QuestionResponse;

import java.util.List;

/**
 * Created by abc on 9/28/2018.
 */
public interface IQuestionService {
    QuestionResponse getQuestions(String questionSetId) throws Exception;
    List getAnswers(String[] questionId, String questionSetId) throws Exception;
}