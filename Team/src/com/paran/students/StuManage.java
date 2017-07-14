package com.paran.students;

import java.text.DecimalFormat;
import java.util.List;

public class StuManage {
	
	static DecimalFormat doubleformat = new DecimalFormat("#.##");
	
	public static void yearAverage(List<Student> students, int classYearSelect) { // 학년,반평균

		int classMaxNum = 3;
		double[] avg = new double[classMaxNum];
		double temp = 0; // 점수들을 담을 변수

		for (int i = 0; i < classMaxNum; i++) {
			avg[i] = yearClassNumAverage(students, classYearSelect, i + 1);
			temp = temp + avg[i];
		}
		System.out.println(classYearSelect + "학년 평균 : " + doubleformat.format((temp = temp / classMaxNum)));
	}

	public static double yearClassNumAverage(List<Student> students, int classYearSelect, int classNumSelect) { //반평균 리턴값 넘길 함수
		double avg = 0;
		double count = 0; // 나눌 학생수
		double temp = 0; // 점수들을 담을 변수
		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getStuYear() == classYearSelect) {

				if (students.get(i).getClassNumber() == classNumSelect) {

					temp += students.get(i).getAverage();
					count++;
				}

			}
		}
		avg = temp / count;
		System.out.println(classYearSelect + "학년" + classNumSelect + "반평균 : " + doubleformat.format(avg));
		return avg;
	}

	public static void setRanking(List<Student> students, int classYearSelect) {  //학년석차
		for (int i = 0; i < students.size(); i++){
			students.get(i).setRank(1);
		}
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStuYear() == classYearSelect) {
				for (int j = 0; j < students.size(); j++) {
					if (students.get(j).getStuYear() == classYearSelect) {
						if (students.get(i).getAverage() < students.get(j).getAverage()) {
							students.get(i).setRank(students.get(i).getRank() + 1);
						}
					}
				}
			}
		}
	}
	
	
	public static void setClassNumRanking(List<Student> students, int classYearSelect, int classNumSelect) {
		for (int i = 0; i < students.size(); i++){
			students.get(i).setClassRank(1);
		}
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStuYear() == classYearSelect) {
				if(students.get(i).getClassNumber()==classNumSelect){
					for (int j = 0; j < students.size(); j++) {
						if (students.get(j).getStuYear() == classYearSelect) {
							if(students.get(j).getClassNumber()==classNumSelect){
								if (students.get(i).getAverage() < students.get(j).getAverage()) {
									students.get(i).setClassRank(students.get(i).getClassRank() + 1);
								}
							}
						}
					}
				}
			}
		}
	}
	
	

	public static void showInfoClass(List<Student> students, int schoolSelect, int classYearSelect, int classNumSelect,	int majorSelect) {

		String sub1 = "";
		String sub2 = "";
		int yearNum= 0 ;
		int classNum =0;
		
		StuManage.setClassNumRanking(students,classYearSelect,classNumSelect);
		
		for (int i = 0; i < students.size(); i++) {//학년 전교생수
			if (students.get(i).getStuYear() == classYearSelect) {
				yearNum++;
			}
		}
				
		for (int i = 0; i < students.size(); i++) { //반의 학생수 카운트
			if (students.get(i).getStuYear() == classYearSelect) {
				if (students.get(i).getClassNumber() == classNumSelect) {
				classNum++;
				}
			}
		}
		if (schoolSelect == 1) {
			sub1 = "슬기로운생활 : ";
		} else if (schoolSelect == 2) {
			sub1 = "기술가정 : ";
		} else if (schoolSelect == 3 && majorSelect == 1) { // 문과
			sub1 = "국사 : ";
			sub2 = "법학 : ";
		} else if (schoolSelect == 3 && majorSelect == 2) {
			sub1 = "수학2 : ";
			sub2 = "화학 : ";
		}

		for (int i = 0; i < students.size(); i++) {

			String sub2Score = String.valueOf(students.get(i).getSub2());

			if (students.get(i).getSub2() == 0) {
				sub2Score = "";
			}

			if (students.get(i).getStuYear() == classYearSelect) {
				if (students.get(i).getClassNumber() == classNumSelect) {
					System.out.println(classYearSelect + "학년 " + classNumSelect + "반 " + students.get(i).getStuNumber()
							+ " 번 =>" + "이름 : " + students.get(i).getName() + " 국어 :" + students.get(i).getKoreanScore()
							+ " 영어 :" + students.get(i).getEnglishScore() + " 수학 :" + students.get(i).getMathScore()
							+ " 사회 :" + students.get(i).getSocietyScore() + " 과학 :" + students.get(i).getScienceScore()
							+ " 도덕 :" + students.get(i).getMoralityScore() + " 음악 :" + students.get(i).getMusicScore()
							+ " 체육 :" + students.get(i).getPhysicalEducationScore() + " 미술 :"
							+ students.get(i).getArtScore() + "  " + sub1 + students.get(i).getSub1() + "  " + sub2
							+ sub2Score+ " 평균 : "+doubleformat.format(students.get(i).getAverage())+" 학급내등수 :"+students.get(i).getClassRank()+"/"+classNum + 
							" 전교등수 : "+students.get(i).getRank()+"/"+yearNum);
				}
			}
		}
	}

	public static void showInfoYear(List<Student> students, int schoolSelect, int classYearSelect, int majorSelect) {

		String sub1 = "";
		String sub2 = "";
		int yearNum=0;
		for (int i = 0; i < students.size(); i++) {//학년 전교생수
			if (students.get(i).getStuYear() == classYearSelect) {
				yearNum++;
			}
		}
		if (schoolSelect == 1) {
			sub1 = "슬기로운생활 : ";
		} else if (schoolSelect == 2) {
			sub1 = "기술가정 : ";
		} else if (schoolSelect == 3 && majorSelect == 1) { // 문과
			sub1 = "국사 : ";
			sub2 = "법학 : ";
		} else if (schoolSelect == 3 && majorSelect == 2) {
			sub1 = "수학2 : ";
			sub2 = "화학 : ";
		}
		for (int i = 0; i < students.size(); i++) {

			String sub2Score = String.valueOf(students.get(i).getSub2());

			if (students.get(i).getSub2() == 0) {
				sub2Score = "";
			}
			if (students.get(i).getStuYear() == classYearSelect) {
				System.out.println(classYearSelect + "학년 " + students.get(i).getClassNumber() + "반 "
						+ students.get(i).getStuNumber() + " 번 =>" + "이름 : " + students.get(i).getName() + " 국어 :"
						+ students.get(i).getKoreanScore() + " 영어 :" + students.get(i).getEnglishScore() + " 수학 :"
						+ students.get(i).getMathScore() + " 사회 :" + students.get(i).getSocietyScore() + " 과학 :"
						+ students.get(i).getScienceScore() + " 도덕 :" + students.get(i).getMoralityScore() + " 음악 :"
						+ students.get(i).getMusicScore() + " 체육 :" + students.get(i).getPhysicalEducationScore()
						+ " 미술 :" + students.get(i).getArtScore() + "  " + sub1 + students.get(i).getSub1() + "  "
						+ sub2 + sub2Score + " 평균 : "+doubleformat.format(students.get(i).getAverage())+" 전교등수 : "+students.get(i).getRank()+"/"+yearNum);
			}

		}
	}
	
}
