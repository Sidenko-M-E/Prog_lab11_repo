#pragma once
#include "Human.h"


class Student {
private:
	int course;
	string eduProg;
	string group;
	string facultyName;

public:
	Human humanField;

	void HardSetCourse(int buf);
	void HardSetEduProg(string bufString);
	void HardSetGroup(string bufString);
	void HardSetFacultyName(string bufString);

	bool SetCourse(int buf);
	bool SetEduProg(string bufString);
	bool SetGroup(string bufString);
	bool SetFacultyName(string bufString);

	int GetCourse();
	string GetEduProg();
	string GetGroup();
	string GetFacultyName();

	Student();
	Student(Human bufHuman);
	Student(int bufCourse, string bufEduProg, string bufGroup, string bufFacultyName, Human bufHuman);

	void Read();
	void Display();
};
