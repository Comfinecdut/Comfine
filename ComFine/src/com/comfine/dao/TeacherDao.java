package com.comfine.dao;



import java.util.List;

import com.comfine.javabean.Teacher;

public interface TeacherDao {
public Teacher getTeacherById(int id);
public void create(Teacher teacher);
public void delete(int id);
public List<Teacher> getAllTeachers(); 
}
