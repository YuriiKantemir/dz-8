package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsGroup {


    private Student monitor;
    private Map<Integer, Student> students;
    private Map<Integer, Task> tasks;
    private Map<Integer, ArrayList<Integer>> completedTasksIdsByUserIds;

    StudentsGroup(Student monitor) {
        this.monitor=monitor;
        this.addStudent(monitor);
    }
    public void setMonitor(Student monitor) {
        this.monitor = monitor;
    }
    public void addStudent(Student student) {
        this.students.put(student.getId(), student);
    }
    public void removeStudent(Integer studentId) {
        this.students.remove(studentId);
    }
    public void addTask(Task task) {
        this.tasks.put(task.getId(), task);
    }
    public void markTaskAsComplete(Integer studentId, Integer taskId) {
        ArrayList<Integer> completedTasksIds = this.completedTasksIdsByUserIds.containsKey(studentId)
                ? this.completedTasksIdsByUserIds.get(studentId)
                : new ArrayList<Integer>();
        completedTasksIds.add(taskId);
        this.completedTasksIdsByUserIds.put(studentId,completedTasksIds);

    }
}
