package com.paran.students;

import java.util.ArrayList;
import java.util.List;


public class School {

	public static void main(String[] args) {
		
		String path ="";
		int schoolSelect = Integer.parseInt((args[0]));  // 1 : 초등학교  2: 중학교  3: 고등학교
		int classYearSelect= 1 ;
		int classNumSelect = 1 ;
		
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
		dL.initStudent(path, students,schoolSelect);
		System.out.println("------------------------------평균-------------------------");
		StuRanking stuRank = new StuRanking();
		stuRank.yearClassNumAverage(students,classYearSelect,classNumSelect);  //학년 반 평균
		stuRank.yearAverage(students, classYearSelect);  // 학년평균
	}

}
