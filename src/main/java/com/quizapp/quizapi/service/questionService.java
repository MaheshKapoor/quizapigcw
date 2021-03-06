package com.quizapp.quizapi.service;

import com.quizapp.quizapi.model.Question;
import com.quizapp.quizapi.model.QuestionResponse;
import com.quizapp.quizapi.serviceImpl.IQuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
public class questionService {

    private static final Logger log = LoggerFactory.getLogger(questionService.class);

    @Autowired
    private IQuestionService questionService;

    @RequestMapping(value="/questions", method= RequestMethod.GET)
    @CrossOrigin
    public @ResponseBody
    QuestionResponse getDetails(@RequestParam("id") final String questionSetId ) throws Exception {

        QuestionResponse questions = questionService.getQuestions(questionSetId);
        log.debug("setting question :" + questions );
        return questions;
    }


    @RequestMapping(value="/answers", method= RequestMethod.POST)
    @CrossOrigin
    public @ResponseBody
    List<String> getDetails(@RequestBody  String[] questId, @RequestParam("id") final String questionSetId) throws Exception {

        List<String> answers = questionService.getAnswers(questId, questionSetId);
        log.debug("setting question :" + answers );
        return answers;
    }

}