package com.eduschool.eduschoolapp.SurveyQusPOJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 8/14/2017.
 */

public class SurveyQusBean {
    @SerializedName("survey_question")
    @Expose
    private List<SurveyQuestion> surveyQuestion = null;

    public List<SurveyQuestion> getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(List<SurveyQuestion> surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

}