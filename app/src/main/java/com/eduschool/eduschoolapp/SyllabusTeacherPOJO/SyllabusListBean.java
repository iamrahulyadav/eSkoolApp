package com.eduschool.eduschoolapp.SyllabusTeacherPOJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Dinesh  on 31/08/2017.
 */

public class SyllabusListBean {
    @SerializedName("syllabus_list")
    @Expose
    private List<SyllabusList> syllabusList = null;

    public List<SyllabusList> getSyllabusList() {
        return syllabusList;
    }

    public void setSyllabusList(List<SyllabusList> syllabusList) {
        this.syllabusList = syllabusList;
    }

}
