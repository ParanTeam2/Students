package com.paran.students;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	int schoolSelect ;
	int majorSelect;
	int classYearSelect;
	int classNumSelect;
	List<Student> students;
	StuRanking stuRank = new StuRanking();
	
	public Teacher(int schoolSelect,List<Student> students ,int majorSelect,int classYearSelect,int classNumSelect){		
		this.schoolSelect = schoolSelect;
		this.majorSelect=majorSelect;
		this.classYearSelect = classYearSelect;
		this.classNumSelect = classNumSelect;
		this.students = students;
		System.out.println("------------------------------평균-------------------------");
		stuRank.yearClassNumAverage(students,classYearSelect,classNumSelect);  //학년 반 평균
		stuRank.yearAverage(students, classYearSelect);  // 학년평균
				
	}
	
	public void teacherShowInfo(){
		
		String sub1 ="";
		String sub2 ="";
		
		
		if(schoolSelect ==1 ){
			sub1 = "슬기로운생활 : ";
		}else if(schoolSelect == 2){
			sub1 = "기술가정 : ";
		}else if(schoolSelect == 3 && majorSelect == 1){ //문과
			sub1 = "국사 : ";
			sub2 = "법학 : ";
		}else if(schoolSelect == 3 && majorSelect == 2){
			sub1 = "수학2 : ";
			sub2 = "화학 : ";
		}
		
		for(int i=0; i< students.size(); i++){	
			
			String sub2Score = String.valueOf(students.get(i).getSub2());
			
			if(students.get(i).getSub2()==0){
				sub2Score = "";
			}
			
			if(students.get(i).getStuYear()==classYearSelect){
				if(students.get(i).getClassNumber()==classNumSelect){
					System.out.println("이름 : "+students.get(i).getName()+" 학년 : "+students.get(i).getStuYear()+" 반 : "+students.get(i).getClassNumber()+" 번호 : "+students.get(i).getStuNumber()+
							" 국어 :"+students.get(i).getKoreanScore()+" 영어 :"+students.get(i).getEnglishScore()+" 수학 :"+students.get(i).getMathScore()+" 사회 :"+students.get(i).getSocietyScore()+
							" 과학 :"+students.get(i).getScienceScore()+" 도덕 :"+students.get(i).getMoralityScore()+" 음악 :"+ students.get(i).getMusicScore()+" 체육 :"+students.get(i).getPhysicalEducationScore()+
							" 미술 :"+students.get(i).getArtScore()+"  "+sub1+students.get(i).getSub1()+"  "+sub2+sub2Score);
				}
							
			}
		}

	}
}