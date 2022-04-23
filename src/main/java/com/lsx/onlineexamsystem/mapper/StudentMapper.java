package com.lsx.onlineexamsystem.mapper;

import com.lsx.onlineexamsystem.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentMapper {
    List<Student> queryAll();

    Student check(Student student);

    @Select("select count(*) from student")
    int queryCOuntALlstu();

    void AddStudent(Student student);

    Student getStudentById(Integer id);

    void EditStudent(Student student);

    @Delete("delete from student where student_id=#{id}")
    void deleteById(Integer id);

    String queryNotice();

    void addNotice(Student student);
}
