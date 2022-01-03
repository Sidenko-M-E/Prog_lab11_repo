package Prog_lab11_java;

import java.util.Random;

public class Demo{
	public static void main(String[] args)
	{
		System.out.print("--------Fio class--------\n");
		System.out.print("Arrays of objects\n");
		System.out.print("One-dimensional array:\n");
		int i, j, count;
		Fio[] arrFio = new Fio[5];
		arrFio[0] = new Fio("Sidenko");
		arrFio[1] = new Fio("Baranov");
		arrFio[2] = new Fio("Suslov");
		arrFio[3] = new Fio("Petriakov");
		arrFio[4] = new Fio("Anosov");

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 5; i++)
		{
			System.out.printf("[%d]",i);
			arrFio[i].display();
			if (arrFio[i].getSurname().startsWith("S"))
				count++;
		}
		System.out.printf("\nNumber of surnames which had started with 'S': %d\n", count);

		System.out.print("\nTwo-dimensional array:\n");
		Fio[][] fios = new Fio[2][2];
		fios[0][0] = new Fio("Lisizin");
		fios[0][1] = new Fio("Kutepov");
		fios[1][0] = new Fio("Shurov");
		fios[1][1] = new Fio("Kulagin");

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
			{
				System.out.printf("[%d][%d]",i,j);
				fios[i][j].display();
				if (fios[i][j].getSurname().startsWith("A"))
				count++;
			}
		System.out.printf("\nNumber of surnames which had started with 'A': %d\n", count);



		System.out.print("\n--------Human class--------\n");
		System.out.print("Arrays of objects\n");
		System.out.print("One-dimensional array:\n");
		Random rnd = new Random();
		rnd.setSeed(251);
		Human[] arrHuman = new Human[5];
		for (i = 0; i < 5; i++)
		{
			arrHuman[i] = new Human(i, rnd.nextInt(10, 60),
					rnd.nextInt(176, 200), rnd.nextInt(60, 100),
					'M', arrFio[i]);
		}

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 5; i++)
		{
			System.out.printf("[%d]",i);
			arrHuman[i].display();
			if (arrHuman[i].getAge() > 45)
				count++;
		}
		System.out.printf("\nNumber of humans with age more than 45: %d\n", count);

		System.out.print("\nTwo-dimensional array:\n");
		Human[][] humans = new Human[2][2];
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
			{
				humans[i][j] = new Human(i + j * 2, rnd.nextInt(10, 60),
						rnd.nextInt(170, 200), rnd.nextInt(60, 100),
						'M', arrFio[i]);
			}

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
			{
				System.out.printf("[%d][%d]",i,j);
				humans[i][j].display();
				if (humans[i][j].getHeight() < 185)
				count++;
			}
		System.out.printf("\nNumber of humans with height less than 185: %d\n", count);



		System.out.print("\n--------Student class--------\n");
		System.out.print("Arrays of objects\n");
		System.out.print("One-dimensional array:\n");
		Student[] arrStudent = new Student[5];
		arrStudent[0] = new Student(rnd.nextInt(4), "Bachelor", "HS-03", "FoHS", arrHuman[0]);
		arrStudent[1] = new Student(rnd.nextInt(4), "Bachelor", "FI-03", "FoMS", arrHuman[1]);
		arrStudent[2] = new Student(rnd.nextInt(4), "Master", "IT-03", "FoIT", arrHuman[2]);
		arrStudent[3] = new Student(rnd.nextInt(4), "Bachelor", "CS-03", "FoCS", arrHuman[3]);
		arrStudent[4] = new Student(rnd.nextInt(4), "Master", "JK-03", "FoJK", arrHuman[4]);

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 5; i++)
		{
			System.out.printf("[%d]",i);
			arrStudent[i].display();
			if (arrStudent[i].getCourse() == 3)
				count++;
		}
		System.out.printf("\nNumber of students on 3 course: %d\n", count);

		System.out.print("\nTwo-dimensional array:\n");
		Student[][] students = new Student[2][2];
		students[0][0] = new Student(rnd.nextInt(4), "Master", "HS-03", "FoHS", humans[0][0]);
		students[0][1] = new Student(rnd.nextInt(4), "Bachelor", "MS-03", "FoMS", humans[0][1]);
		students[1][0] = new Student(rnd.nextInt(4), "Master", "IT-03", "FoIT", humans[1][0]);
		students[1][1] = new Student(rnd.nextInt(4), "Bachelor", "CS-03", "FoCS", humans[1][1]);

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
			{
				System.out.printf("[%d][%d]",i,j);
				students[i][j].display();
				if (students[i][j].getFacultyName().equals("FoMS"))
				count++;
			}
		System.out.printf("\nNumber of students on FoMS faculty: %d\n", count);



		System.out.print("\n--------Teacher class--------\n");
		System.out.print("Arrays of objects\n");
		System.out.print("One-dimensional array:\n");
		Teacher[] arrTeacher = new Teacher[5];
		arrTeacher[0] = new Teacher(rnd.nextInt(0, 40), "Doctor", "FoIT", arrHuman[0]);
		arrTeacher[1] = new Teacher(rnd.nextInt(0, 40), "Candidate", "FoCS", arrHuman[1]);
		arrTeacher[2] = new Teacher(rnd.nextInt(0, 40), "Doctor", "FoHS", arrHuman[2]);
		arrTeacher[3] = new Teacher(rnd.nextInt(0, 40), "Candidate", "FoHS", arrHuman[3]);
		arrTeacher[4] = new Teacher(rnd.nextInt(0, 40), "Candidate", "FoMS", arrHuman[4]);

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 5; i++)
		{
			System.out.printf("[%d]",i);
			arrTeacher[i].display();
			if (arrTeacher[i].getWorkExp() > 20)
				count++;
		}
		System.out.printf("\nNumber of teachers with working experience more than 20 years: %d\n", count);

		System.out.print("\nTwo-dimensional array:\n");
		Teacher[][] teachers = new Teacher[2][2];
		teachers[0][0] = new Teacher(rnd.nextInt(0, 40), "Candidate", "FoMS", humans[0][0]);
		teachers[0][1] = new Teacher(rnd.nextInt(0, 40), "Doctor", "FoCS", humans[0][1]);
		teachers[1][0] = new Teacher(rnd.nextInt(0, 40), "Candidate", "FoHS", humans[1][0]);
		teachers[1][1] = new Teacher(rnd.nextInt(0, 40), "Doctor", "FoIT", humans[1][1]);

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
			{
				System.out.printf("[%d][%d]",i,j);
				teachers[i][j].display();
				if (teachers[i][j].getFacultyName().equals("FoHS"))
				count++;
			}
		System.out.printf("\nNumber of teachers on FoHS faculty: %d\n", count);



		System.out.print("\n--------Faculty class--------\n");
		System.out.print("Arrays of objects\n");
		System.out.print("One-dimensional array:\n");
		Faculty[] arrFaculty = new Faculty[5];
		arrFaculty[0] = new Faculty("FoMS", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		arrFaculty[1] = new Faculty("FoIT", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		arrFaculty[2] = new Faculty("FoCS", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		arrFaculty[3] = new Faculty("FoIT", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		arrFaculty[4] = new Faculty("FoHS", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 5; i++)
		{
			System.out.printf("[%d]",i);
			arrFaculty[i].display();
			if (arrFaculty[i].getQuantityOfTeachers() > 20)
				count++;
		}
		System.out.printf("\nNumber of faculties with more than 15 teachers: %d\n", count);

		System.out.print("\nTwo-dimensional array:\n");
		Faculty[][] faculties = new Faculty[2][2];
		faculties[0][0] = new Faculty("FoCS", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		faculties[0][1] = new Faculty("FoHS", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		faculties[1][0] = new Faculty("FoMS", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));
		faculties[1][1] = new Faculty("FoIT", rnd.nextInt(150, 200), rnd.nextInt(0, 150),
				30, rnd.nextInt(10, 30), rnd.nextInt(10, 20),
				20, rnd.nextInt(10, 30));

		System.out.print("Array content:\n");
		count = 0;
		for (i = 0; i < 2; i++)
			for (j = 0; j < 2; j++)
			{
				System.out.printf("[%d][%d]",i,j);
				faculties[i][j].display();
				if (faculties[i][j].getQuantityOfStudents() > 170)
				count++;
			}
		System.out.printf("\nNumber of faculties with more than 170 students: %d\n", count);
	}
}