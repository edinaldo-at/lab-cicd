package fiap.devops.cicd.labcicd.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Task {

    @Id
    private Integer id;
    private String description;
    private Date eventDate;
    private Boolean isDone;

    public Task() {
        super();
    }

    public Task(Integer id, String description, Date eventDate, Boolean isDone) {
        this.id = id;
        this.description = description;
        this.eventDate = eventDate;
        this.isDone = isDone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}
