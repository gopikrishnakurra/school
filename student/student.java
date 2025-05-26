package com.student;

import com.school.*;

public class student {
 private String studentName;
 private String grade;
 private school school;
 private double averageMarks;
public student(String studentName, String grade, school school, double averageMarks) {
	super();
	this.studentName = studentName;
	this.grade = grade;
	this.school = school;
	this.averageMarks = averageMarks;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public school getSchool() {
	return school;
}
public void setSchool(school school) {
	this.school = school;
}
public double getAverageMarks() {
	return averageMarks;
}
public void setAverageMarks(double averageMarks) {
	this.averageMarks = averageMarks;
}
@Override
public String toString() {
	return "student [studentName=" + studentName + ", grade=" + grade + ", school=" + school + ", averageMarks="
			+ averageMarks + "]";
}
public static student getsudent(String studentName, String grade, school school, double averageMarks)
{
	return new student(studentName,  grade, school, averageMarks);
}
 
}
