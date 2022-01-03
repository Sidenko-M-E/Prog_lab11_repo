#include <conio.h>
#include <iostream>
#include "Fio.h"
#include "Human.h"
#include "Student.h"
#include "Teacher.h"
#include "Faculty.h"

int main()
{
	cout << "--------Fio class--------\n";
	cout << "Arrays of objects\n";
	cout << "One-dimensional array:\n";
	int i, j, count;
	Fio arrFio[5]
	{
		Fio("Sidenko"),
		Fio("Baranov"),
		Fio("Suslov"),
		Fio("Petriakov"),
		Fio("Anosov")
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 5; i++)
	{
		cout << "[" << i << "]";
		arrFio[i].Display();
		if (arrFio[i].GetSurname().find_first_of("S") == 0)
			count++;
	}
	cout << "\nNumber of surnames which had started with 'S': " << count << endl;

	cout << "\nTwo-dimensional array:\n";
	Fio fios[2][2]
	{
		Fio("Lisizin"),
		Fio("Kutepov"),
		Fio("Shurov"),
		Fio("Kulagin")
	};
	
	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 2; i++)
		for (j = 0; j < 2; j++)
		{
			cout << "[" << i << "][" << j << "]";
			fios[i][j].Display();
			if (fios[i][j].GetSurname().find_first_of("A") == 0)
				count++;
		}
	cout << "\nNumber of surnames which had started with 'A': " << count << endl;



	cout << "\n--------Human class--------\n";
	cout << "Arrays of objects\n";
	cout << "One-dimensional array:\n";
	Human arrHuman[5];
	for (i = 0; i < 5; i++)
	{
		arrHuman[i] = Human(i, rand()%20+25, rand()%40+160, rand()%40+80, 'M', arrFio[i]);
	}

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 5; i++)
	{
		cout << "[" << i << "]";
		arrHuman[i].Display();
		if (arrHuman[i].GetAge() > 45)
			count++;
	}
	cout << "\nNumber of humans with age more than 45: " << count << endl;

	cout << "\nTwo-dimensional array:\n";
	Human humans[2][2];
	for (i = 0; i < 2; i++)
		for (j = 0; j < 2; j++)
		{
			humans[i][j] = Human(i + j * 2, rand()%50+10, rand()%30+170, rand()%40+60, 'M', arrFio[i]);
		}

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 2; i++)
		for (j = 0; j < 2; j++)
		{
			cout << "[" << i << "][" << j << "]";
			humans[i][j].Display();
			if (humans[i][j].GetHeight() < 185)
				count++;
		}
	cout << "\nNumber of humans with height less than 185: " << count << endl;


	
	cout << "\n--------Student class--------\n";
	cout << "Arrays of objects\n";
	cout << "One-dimensional array:\n";
	Student arrStudent[5]
	{
		Student(rand() % 4, "Bachelor", "HS-03", "FoHS", arrHuman[0]),
		Student(rand() % 4, "Bachelor", "FI-03", "FoMS", arrHuman[1]),
		Student(rand() % 4, "Master", "IT-03", "FoIT", arrHuman[2]),
		Student(rand() % 4, "Bachelor", "CS-03", "FoCS", arrHuman[3]),
		Student(rand() % 4, "Master", "JK-03", "FoJK", arrHuman[4])
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 5; i++)
	{
		cout << "[" << i << "]";
		arrStudent[i].Display();
		if (arrStudent[i].GetCourse() == 3)
			count++;
	}
	cout << "\nNumber of students on 3 course: " << count << endl;

	cout << "\nTwo-dimensional array:\n";
	Student students[2][2]
	{
		Student(rand()%4, "Master", "HS-03", "FoHS", humans[0][0]),
		Student(rand()%4, "Bachelor", "MS-03", "FoMS", humans[0][1]),
		Student(rand()%4, "Master", "IT-03", "FoIT", humans[1][0]),
		Student(rand()%4, "Bachelor", "CS-03", "FoCS", humans[1][1])
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 2; i++)
		for (j = 0; j < 2; j++)
		{
			cout << "[" << i << "][" << j << "]";
			students[i][j].Display();
			if (students[i][j].GetFacultyName() == "FoMS")
				count++;
		}
	cout << "\nNumber of students on FoMS faculty: \n" << count << endl;


	
	cout << "\n--------Teacher class--------\n";
	cout << "Arrays of objects\n";
	cout << "One-dimensional array:\n";
	Teacher arrTeacher[5]
	{
		Teacher(rand()%40, "Doctor", "FoIT", arrHuman[0]),
		Teacher(rand()%40, "Candidate", "FoCS", arrHuman[1]),
		Teacher(rand()%40, "Doctor", "FoHS", arrHuman[2]),
		Teacher(rand()%40, "Candidate", "FoHS", arrHuman[3]),
		Teacher(rand()%40, "Candidate", "FoMS", arrHuman[4])
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 5; i++)
	{
		cout << "[" << i << "]";
		arrTeacher[i].Display();
		if (arrTeacher[i].GetWorkExp() > 20)
			count++;
	}
	cout << "\nNumber of teachers with working experience more than 20 years: " << count << endl;

	cout << "\nTwo-dimensional array:\n";
	Teacher teachers[2][2]
	{
		Teacher(rand()%40, "Candidate", "FoMS", humans[0][0]),
		Teacher(rand()%40, "Doctor", "FoCS", humans[0][1]),
		Teacher(rand()%40, "Candidate", "FoHS", humans[1][0]),
		Teacher(rand()%40, "Doctor", "FoIT", humans[1][1])
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 2; i++)
		for (j = 0; j < 2; j++)
		{
			cout << "[" << i << "][" << j << "]";
			teachers[i][j].Display();
			if (teachers[i][j].GetFacultyName() == "FoHS")
				count++;

		}
	cout << "\nNumber of teachers on FoHS faculty: " << count << endl;
	

	
	cout << "\n------Faculty class----------\n";
	cout << "Arrays of objects\n";
	cout << "One-dimensional array:\n";
	Faculty arrFaculty[5]
	{
		Faculty("FoMS", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoIT", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoCS", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoIT", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoHS", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10)
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 5; i++)
	{
		cout << "[" << i << "]";
		arrFaculty[i].Display();
		if (arrFaculty[i].GetQuantityOfTeachers() > 20)
			count++;
	}
	cout << "\nNumber of faculties with more than 15 teachers: " << count << endl;

	cout << "\nTwo-dimensional array:\n";
	Faculty faculties[2][2]
	{
		Faculty("FoCS", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoHS", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoMS", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10),
		Faculty("FoIT", rand() % 50 + 150, rand() % 150, 30, rand() % 20 + 10, rand() % 10 + 10, 20, rand() % 20 + 10)
	};

	cout << "Array content:\n";
	count = 0;
	for (i = 0; i < 2; i++)
		for (j = 0; j < 2; j++)
		{
			cout << "[" << i << "][" << j << "]";
			faculties[i][j].Display();
			if (faculties[i][j].GetQuantityOfStudents() > 170)
				count++;
		}
	cout << "\nNumber of faculties with more than 170 students: " << count << endl;
	cout << "\nPress any key to exit.\n";
	_getch();
}
