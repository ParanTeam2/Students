package com.paran.students;

import java.util.ArrayList;
import java.util.List;


public class School {

	public static void main(String[] args) {
		
		String path ="";
		int schoolSelect = Integer.parseInt((args[0]));  // 1 : 초등학교  2: 중학교  3: 고등학교
		int classYearSelect= 1 ;   // 학년을 정할때
		int classNumSelect = 2 ;   // 반번호정할때
		int majorSelect = 2;  // 1 : 문과   2  : 이과
	
		
		
		switch(schoolSelect){
			case 1: {
				path = "C:\\Student\\element.txt";
				break;
			}
			case 2: {
				path = "C:\\Student\\middle.txt";
				break;
			}
			case 3: {
				path = "C:\\Student\\high.txt";
				break;
			}
			default : {
				System.out.println("학교타입을 잘못 입력했습니다");
			}
		}
		List<Student> students = new ArrayList<Student>();
		DataLoad dL = new DataLoad();
		dL.initStudent(path, students,schoolSelect, majorSelect);
		Teacher teacher = new Teacher(schoolSelect,students,majorSelect,classYearSelect,classNumSelect);
		teacher.teacherShowInfo();
	}

}
