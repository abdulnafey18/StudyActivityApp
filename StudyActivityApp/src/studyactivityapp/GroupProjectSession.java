/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyactivityapp;

/**
 *
 * @author abdul.nafey18
 */
//GroupProjectSession is a subclass which inherits variables from super class StudyActivity
//declare variables
public class GroupProjectSession extends StudyActivity {
    private String teammates;
    private String assessmentname;
//super constructor
    public GroupProjectSession(String day, String module, int time, int duration) {
        super(day, module, time, duration);
    }
    
    public GroupProjectSession(){
        super();
    }
//get & set methods
    public String getTeammates() {
        return teammates;
    }

    public void setTeammates(String teammates) {
        this.teammates = teammates;
    }

    public String getAssessmentname() {
        return assessmentname;
    }

    public void setAssessmentname(String assessmentname) {
        this.assessmentname = assessmentname;
    }
//Override method
    @Override
    public String getDetails(){
        return "Saved data for Group Project Session:-\n"+super.getDetails()+"\nTeam Mates:"+teammates+"\nAssessment Name:"+assessmentname;
    }
}
