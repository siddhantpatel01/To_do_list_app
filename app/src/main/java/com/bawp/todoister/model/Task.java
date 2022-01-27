package com.bawp.todoister.model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



import java.util.Date;

@Entity(tableName = "task_table")
public class Task {

    @ColumnInfo(name="task_id")
    @PrimaryKey(autoGenerate = true)
    public long taskId;


    public String task;

    public Priority priority;


    @ColumnInfo(name = "due_date")
    public Date duedate;


    @ColumnInfo(name = "created_at")
    public  Date datecreared;


    @ColumnInfo(name = "is_done")
    public boolean isDone;


    public Task(String task, Priority priority, Date duedate, Date datecreared, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.duedate = duedate;
        this.datecreared = datecreared;
        this.isDone = isDone;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Date getDatecreared() {
        return datecreared;
    }

    public void setDatecreared(Date datecreared) {
        this.datecreared = datecreared;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", task='" + task + '\'' +
                ", priority=" + priority +
                ", duedate=" + duedate +
                ", datecreared=" + datecreared +
                ", isDone=" + isDone +
                '}';
    }
}
