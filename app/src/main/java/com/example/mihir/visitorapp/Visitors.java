package com.example.mihir.visitorapp;

/**
 * Created by mihir on 21-Oct-15.
 */
public class Visitors {

    private int _id;
    private String _visitorName;
    private String _visitorCompany;
    private String _timeIn;
    private String _TimeOut;
    private String _personSee;

    public Visitors(String _visitorName, String _visitorCompany, String _timeIn, String _TimeOut, String _personSee) {
        this._visitorName = _visitorName;
        this._visitorCompany = _visitorCompany;
        this._timeIn = _timeIn;
        this._TimeOut = _TimeOut;
        this._personSee = _personSee;
    }

    public Visitors() {
        //empty
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_visitorName(String _visitorName) {
        this._visitorName = _visitorName;
    }

    public void set_visitorCompany(String _visitorCompany) {
        this._visitorCompany = _visitorCompany;
    }

    public void set_timeIn(String _timeIn) {
        this._timeIn = _timeIn;
    }

    public void set_TimeOut(String _TimeOut) {
        this._TimeOut = _TimeOut;
    }

    public void set_personSee(String _personSee) {
        this._personSee = _personSee;
    }

    public int get_id() {
        return _id;
    }

    public String get_visitorName() {
        return _visitorName;
    }

    public String get_timeIn() {
        return _timeIn;
    }

    public String get_visitorCompany() {
        return _visitorCompany;
    }

    public String get_TimeOut() {
        return _TimeOut;
    }

    public String get_personSee() {
        return _personSee;
    }
}
