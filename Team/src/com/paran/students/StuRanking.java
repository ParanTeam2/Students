package com.paran.students;

import java.util.List;

public class StuRanking {
	
	public void yearAverage(List<Student> students, int classYearSelect){   //학년 , 반 평균
		
		int avg = 0;
		int count = 0; // 나눌 학생수
		int temp = 0;  // 점수들을 담을 변수
		
		for(int i = 0; i<students.size(); i++){
			
			if(students.get(i).getStuYear()==classYearSelect){
				
				temp += students.get(i).getKoreanScore()+students.get(i).getEnglishScore()+students.get(i).getMathScore()+students.get(i).getSocietyScore()+students.get(i).getScienceScore()+students.get(i).getMoralityScore()+
						students.get(i).getMusicScore()+students.get(i).getPhysicalEducationScore()+students.get(i).getArtScore()+students.get(i).getSub1();	
				
				count++;
				
				}
				
			
			
		}
		
	 avg = (temp/count)/9;  //과목이 9개 
 	 System.out.println(classYearSelect +"학년 평균 : "+avg);
	}
	
	
	
	
	
	
	public void yearClassNumAverage(List<Student> students, int classYearSelect ,int classNumSelect){   //학년 , 반 평균
		
		int avg = 0;
		int count = 0; // 나눌 학생수
		int temp = 0;  // 점수들을 담을 변수
		
		for(int i = 0; i<students.size(); i++){
			
			if(students.get(i).getStuYear()==classYearSelect){
				
				if(students.get(i).getClassNumber()==classNumSelect){
								
				temp += students.get(i).getKoreanScore()+students.get(i).getEnglishScore()+students.get(i).getMathScore()+students.get(i).getSocietyScore()+students.get(i).getScienceScore()+students.get(i).getMoralityScore()+
						students.get(i).getMusicScore()+students.get(i).getPhysicalEducationScore()+students.get(i).getArtScore()+students.get(i).getSub1();	
				
				count++;
				
				}
				
			}
			
		}
		
	 avg = (temp/count)/9;  //과목이 9개 
 	 System.out.println(classYearSelect +"학년"+classNumSelect+"반평균 : "+avg);
	}
}
