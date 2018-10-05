package com.quizapp.quizapi.serviceImpl;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.quizapp.quizapi.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.*;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 9/28/2018.
 */
@Service
public class QuestionServiceImpl implements IQuestionService{

    private static final String RESPONSE = "/jsonQuiz/%s.json";
    private static final String DEFAULT_RESPONSE = "/jsonQuiz/sampleQuiz.json";

    private static final Logger log = LoggerFactory.getLogger(QuestionServiceImpl.class);

    @Override
    public QuestionResponse getQuestions(String questionSetId){

        QuestionResponse questionSet = getQuestionSet(questionSetId);

        QuestionResponse randomQuestionSet = getRandomQuestionSet(questionSet, 10);

        return randomQuestionSet;
    }

    public QuestionResponse getRandomQuestionSet (QuestionResponse questionResponse, Number questionCount){
        //TODO random logic
        return questionResponse;
    }

    public QuestionResponse getQuestionSet(String questionSetId){
        QuestionResponse response ;
        log.info("flow for mock : questionSetId"+ questionSetId);
        String fileName = String.format(RESPONSE, questionSetId);
        Gson gson = new Gson();
        if(!questionSetId.isEmpty()){
            log.debug("questionSetId is "+ fileName);
            Reader reader  = new InputStreamReader(QuestionServiceImpl.class.getResourceAsStream(fileName));
            response = gson.fromJson(reader, QuestionResponse.class);
        }else {
            log.debug("questionSetId is null");
            Reader reader  = new InputStreamReader(QuestionServiceImpl.class.getResourceAsStream(DEFAULT_RESPONSE));
            response = gson.fromJson(reader, QuestionResponse.class);
        }

        log.info("response"+response);
        return response;
    }


    @Override
    public List<String> getAnswers(String[] questionId, String questionSetId){

        QuestionAnswerResponse getAnswerSet = getAnswerSet(questionSetId);
        List<String> answers = new ArrayList<String>();
        for (QuestionWithAnswer q:getAnswerSet.getData()) {
            for(int i=0; i<questionId.length;i++){
                if(questionId[i].equalsIgnoreCase(q.getQnID())){
                    answers.add(q.getAnswer());
                    break;
                }
            }
        }


        return answers;
    }

    public QuestionAnswerResponse getAnswerSet(String questionSetId){

        QuestionAnswerResponse response ;
        log.info("flow for mock : questionSetId"+ questionSetId);
        String fileName = String.format(RESPONSE, questionSetId);
        Gson gson = new Gson();
        if(!questionSetId.isEmpty()){
            log.debug("questionSetId is "+ fileName);
            Reader reader  = new InputStreamReader(QuestionServiceImpl.class.getResourceAsStream(fileName));
            response = gson.fromJson(reader, QuestionAnswerResponse.class);
        }else {
            log.debug("questionSetId is null");
            Reader reader  = new InputStreamReader(QuestionServiceImpl.class.getResourceAsStream(DEFAULT_RESPONSE));
            response = gson.fromJson(reader, QuestionAnswerResponse.class);
        }
        log.info("response"+response);
        return response;
    }

}
