package com.shinowit.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the teacher database table.
 * 
 */
@Entity
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="teacher_id")
	private int teacherId;

	private String name;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="teacher")
	private List<Student> students;

	public Teacher() {
	}

	public int getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setTeacher(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setTeacher(null);

		return student;
	}

}