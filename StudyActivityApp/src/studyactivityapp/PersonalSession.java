/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studyactivityapp;

/**
 *
 * @author abdul.nafey18
 */
//PersonalSession is a subclass which inherits variables from super class StudyActivity
//declare variable
public class PersonalSession extends StudyActivity {
    private String topic;
//super constructor
    public PersonalSession(String day, String module, int time, int duration) {
        super(day, module, time, duration);
    }
    
    public PersonalSession(){
        super();
    }
//get & set methods
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
//Override method
    @Override
    public String getDetails(){
        return "Saved data for Personal Session:-\n"+super.getDetails()+"\nStudy Topic:"+topic;
    }
}
