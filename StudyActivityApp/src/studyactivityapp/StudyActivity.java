/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyactivityapp;

import java.io.Serializable;

/**
 *
 * @author abdul.nafey18
 */
//declare variables
public class StudyActivity implements Serializable{
    protected String day;
    protected String module;
    protected int time;
    protected int duration;
//overloaded constructor
    public StudyActivity(String day, String module, int time, int duration) {
        this.day = day;
        this.module = module;
        this.time = time;
        this.duration = duration;
    }
//default constructor
    public StudyActivity(){
        day="";
        module="";
        time=0;
        duration=0;
    }
//get & set methods
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public String getDetails(){
        return "Day:"+day+"\nModule Name:"+module+"\nTime:"+time+"\nDuration in Minutes:"+duration;
    }
}
