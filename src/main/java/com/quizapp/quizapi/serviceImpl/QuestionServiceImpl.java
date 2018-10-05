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

    private static final String RESPONSE = "/jsonQuiz/sampleQuiz.json";

    private static final Logger log = LoggerFactory.getLogger(QuestionServiceImpl.class);

    @Override
    public QuestionResponse getQuestions(String category){

        QuestionResponse questionSet = getQuestionSet(category);

        QuestionResponse randomQuestionSet = getRandomQuestionSet(questionSet, 10);

        return randomQuestionSet;
    }

    public QuestionResponse getRandomQuestionSet (QuestionResponse questionResponse, Number questionCount){
        //TODO random logic
        //for(int i=0; i<questionResponse.getData().size();i++){
            //random logic
        //}
        return questionResponse;
    }

    public QuestionResponse getQuestionSet(String category){

        QuestionResponse response ;

        log.info("flow for mock : getFeaturePartner");

        if(category != null){
            log.debug("category is "+ category);

        }else {
            log.debug("category is null");


        }
        Reader reader = new InputStreamReader(QuestionServiceImpl.class.getResourceAsStream(RESPONSE));
        JsonParser jsonParser = new JsonParser();
        //JsonObject response = (JsonObject) jsonParser.parse(reader);

        Gson gson = new Gson();

        response = gson.fromJson(reader, QuestionResponse.class);

        log.info("response"+response);


        return response;
    }


    @Override
    public List<String> getAnswers(String[] questionId){

        QuestionAnswerResponse getAnswerSet = getAnswerSet();
        List<String> answers = new ArrayList<String>();
        for (QuestionWithAnswer q:getAnswerSet.getData()) {
            answers.add(q.getAnswer());
        }


        return answers;
    }

    public QuestionAnswerResponse getAnswerSet(){

        QuestionAnswerResponse response ;

        log.info("flow for mock : getFeaturePartner");


        Reader reader = new InputStreamReader(QuestionServiceImpl.class.getResourceAsStream(RESPONSE));
        JsonParser jsonParser = new JsonParser();
        //JsonObject response = (JsonObject) jsonParser.parse(reader);

        Gson gson = new Gson();

        response = gson.fromJson(reader, QuestionAnswerResponse.class);

        log.info("response"+response);


        return response;
    }

}
