package id.co.indivara.jdt11.employeesjpa.exception;

import java.util.Date;

public class DetailMasalah {
    private Date timeStamp;
    private String message;
    private String details;

    public DetailMasalah(Date timeStamp, String message ,String details){
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
