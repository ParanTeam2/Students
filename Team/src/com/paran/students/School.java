package com.paran.students;

import java.util.ArrayList;
import java.util.List;


public class School {

	public static void main(String[] args) {
		String path ="";
		int schoolSelect = Integer.parseInt((args[0]));  // 1 : 초등학교  2: 중학교  3: 고등학교
		int classYearSelect= 3 ;   // 학년을 정할때
		int classNumSelect = 3 ;   // 반번호정할때
		int majorSelect = 2 ;  // 1 : 문과   2  : 이과
	
		
		
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
		
		System.out.println("\n--------------------------------------------------------------평균--------------------------------------------------------------------------\n");
		StuManage.yearAverage(students, classYearSelect);
		StuManage.setRanking(students, classYearSelect);
		
		System.out.println("\n---------------------------------------------------------"+classYearSelect+"학년 " + classNumSelect + "반 정보"+"------------------------------------------------------------------------\n");
		StuManage.showInfoClass(students, schoolSelect, classYearSelect, classNumSelect, majorSelect); //선택한 학년 반의 정보보기 
		
		
		System.out.println("\n--------------------------------------------------------"+classYearSelect+"학년 전체 정보"+"-------------------------------------------------------------------------\n");
		StuManage.showInfoYear(students, schoolSelect, classYearSelect, majorSelect); //선택한 학년 정보보기
		
	}

}
