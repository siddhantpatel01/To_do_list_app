package com.bawp.todoister.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.bawp.todoister.model.Task;
import com.bawp.todoister.utill.TaskRoomDatabase;

import java.util.List;

public class DoisterRepository {
    private final TaskDao taskDao;
    private final LiveData<List<Task>> allTasks;

    public DoisterRepository(Application application) {
        TaskRoomDatabase database = TaskRoomDatabase.getDatabase(application);

        taskDao = database.taskDao();
        allTasks = taskDao.getTasks();
    }

    public LiveData<List<Task>> getAllTasks() {
        return allTasks;

    }

    public void insert(Task task) {
        TaskRoomDatabase.databaseWrierExecuter.execute(() -> taskDao.insertTask(task));
    }

    public LiveData<Task> get(long id) {
        return taskDao.get(id);
    }

    public void update(Task task){
        TaskRoomDatabase.databaseWrierExecuter.execute(()->taskDao.Update(task));
    }

    public void delete(Task task){
        TaskRoomDatabase.databaseWrierExecuter.execute(()-> taskDao.delete(task));
    }


}
