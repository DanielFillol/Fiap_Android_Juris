package br.fiap.acid.juris;

public class JurisData {

    private String id,lawsuit_number, lawsuit_class, lawsuit_judge, lawsuit_city, lawsuit_city_jurisdiction, trial_date, publication_date, secrecy, lawsuit_court, lawsuit_link_pdf_decision, decision_complete, decision_short, lawsuit_court_jurisdiction, juris_type;

    public JurisData(String id, String lawsuit_number, String lawsuit_class, String lawsuit_judge, String lawsuit_city, String lawsuit_city_jurisdiction, String trial_date, String publication_date, String secrecy, String lawsuit_court, String lawsuit_link_pdf_decision, String decision_complete, String decision_short, String lawsuit_court_jurisdiction, String juris_type){
        this.id = id;
        this.lawsuit_number = lawsuit_number;
        this.lawsuit_class =  lawsuit_class;
        this.lawsuit_judge =  lawsuit_judge;
        this.lawsuit_city = lawsuit_city;
        this.lawsuit_city_jurisdiction =  lawsuit_city_jurisdiction;
        this.trial_date =  trial_date;
        this.publication_date =  publication_date;
        this.secrecy = secrecy;
        this.lawsuit_court =  lawsuit_court;
        this.lawsuit_link_pdf_decision =  lawsuit_link_pdf_decision;
        this.decision_complete =  decision_complete;
        this.decision_short =  decision_short;
        this.lawsuit_court_jurisdiction =  lawsuit_court_jurisdiction;
        this.juris_type = juris_type;
    }

    public String getId() {
        return id;
    }

    public String getLawsuit_number() {
        return lawsuit_number;
    }

    public String getLawsuit_class() {
        return lawsuit_class;
    }

    public String getLawsuit_judge() {
        return lawsuit_judge;
    }

    public String getLawsuit_city() {
        return lawsuit_city;
    }

    public String getLawsuit_city_jurisdiction() {
        return lawsuit_city_jurisdiction;
    }

    public String getTrial_date() {
        return trial_date;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public String getSecrecy() {
        return secrecy;
    }

    public String getLawsuit_court() {
        return lawsuit_court;
    }

    public String getLawsuit_link_pdf_decision() {
        return lawsuit_link_pdf_decision;
    }

    public String getDecision_complete() {
        return decision_complete;
    }

    public String getDecision_short() {
        return decision_short;
    }

    public String getLawsuit_court_jurisdiction() {
        return lawsuit_court_jurisdiction;
    }

    public String getJuris_type() {
        return juris_type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLawsuit_number(String lawsuit_number) {
        this.lawsuit_number = lawsuit_number;
    }

    public void setLawsuit_class(String lawsuit_class) {
        this.lawsuit_class = lawsuit_class;
    }

    public void setLawsuit_judge(String lawsuit_judge) {
        this.lawsuit_judge = lawsuit_judge;
    }

    public void setLawsuit_city(String lawsuit_city) {
        this.lawsuit_city = lawsuit_city;
    }

    public void setLawsuit_city_jurisdiction(String lawsuit_city_jurisdiction) {
        this.lawsuit_city_jurisdiction = lawsuit_city_jurisdiction;
    }

    public void setTrial_date(String trial_date) {
        this.trial_date = trial_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public void setSecrecy(String secrecy) {
        this.secrecy = secrecy;
    }

    public void setLawsuit_court(String lawsuit_court) {
        this.lawsuit_court = lawsuit_court;
    }

    public void setLawsuit_link_pdf_decision(String lawsuit_link_pdf_decision) {
        this.lawsuit_link_pdf_decision = lawsuit_link_pdf_decision;
    }

    public void setDecision_complete(String decision_complete) {
        this.decision_complete = decision_complete;
    }

    public void setDecision_short(String decision_short) {
        this.decision_short = decision_short;
    }

    public void setLawsuit_court_jurisdiction(String lawsuit_court_jurisdiction) {
        this.lawsuit_court_jurisdiction = lawsuit_court_jurisdiction;
    }

    public void setJuris_type(String juris_type) {
        this.juris_type = juris_type;
    }
}
