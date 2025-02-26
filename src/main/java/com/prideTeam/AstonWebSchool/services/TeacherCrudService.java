package com.prideTeam.AstonWebSchool.services;

import com.prideTeam.AstonWebSchool.entity.Teacher;

import java.util.List;

public interface TeacherCrudService {
    Teacher save(Teacher teacher);

    Teacher getById(Integer teacherId);

    List<Teacher> getAll();

    void update(Teacher teacher, Integer id);

    void delete(Integer teacherId);
}
