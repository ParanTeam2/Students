package com.paran.students;

public class Student {
	
	
	private String name;				//이름
	private int stuYear;                //학년
	private int classNumber;			//반
	private int stuNumber;				//번호
	
	/* 공통과목 */
	private int koreanScore;			//국어	
	private int englishScore;			//영어
	private int mathScore;				//수학
	private int societyScore;			//사회
	private int scienceScore;			//과학
	private int moralityScore;			//도덕
	private int musicScore;				//음악	
	private int physicalEducationScore;	//체육
	private int artScore;				//미술
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public int getStuYear() {
		return stuYear;
	}


	public void setStuYear(int stuYear) {
		this.stuYear = stuYear;
	}


	public int getClassNumber() {
		return classNumber;
	}


	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}


	public int getStuNumber() {
		return stuNumber;
	}


	public void setStuNumber(int stuNumber) {
		this.stuNumber = stuNumber;
	}


	public int getKoreanScore() {
		return koreanScore;
	}


	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}


	public int getMusicScore() {
		return musicScore;
	}


	public void setMusicScore(int musicScore) {
		this.musicScore = musicScore;
	}


	public int getMathScore() {
		return mathScore;
	}


	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}


	public int getSocietyScore() {
		return societyScore;
	}


	public void setSocietyScore(int societyScore) {
		this.societyScore = societyScore;
	}


	public int getScienceScore() {
		return scienceScore;
	}


	public void setScienceScore(int scienceScore) {
		this.scienceScore = scienceScore;
	}


	public int getMoralityScore() {
		return moralityScore;
	}


	public void setMoralityScore(int moralityScore) {
		this.moralityScore = moralityScore;
	}


	public int getEnglishScore() {
		return englishScore;
	}


	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}


	public int getPhysicalEducationScore() {
		return physicalEducationScore;
	}


	public void setPhysicalEducationScore(int physicalEducationScore) {
		this.physicalEducationScore = physicalEducationScore;
	}


	public int getArtScore() {
		return artScore;
	}


	public void setArtScore(int artScore) {
		this.artScore = artScore;
	}
	
	
	
	public Student(String name,int stuYear , int classNumber , int stuNumber, int koreanScore,int englishScore,int mathScore,int societyScore,int scienceScore,int moralityScore,int musicScore,int physicalEducationScore,int artScore){
		setName(name);
		setStuYear(stuYear);
		setClassNumber(classNumber);
		setStuNumber(stuNumber);
		setKoreanScore(koreanScore);
		setMusicScore(musicScore);
		setMathScore(mathScore);
		setSocietyScore(societyScore);
		setScienceScore(scienceScore);
		setMoralityScore(moralityScore);
		setEnglishScore(englishScore);
		setPhysicalEducationScore(physicalEducationScore);
		setArtScore(artScore);
	
	}
	
	
	
	}

class ElementStudent extends Student{
	
	int wisdomAndLifeScore; //슬기로운생활

	public ElementStudent(String name ,int stuYear, int classNumber , int stuNumber , int koreanScore, int englishScore, int mathScore, int societyScore, int scienceScore,int moralityScore,  int musicScore, int physicalEducationScore, int artScore , int wisdomAndLifeScore) {
		super(name,stuYear,classNumber,stuNumber,koreanScore, englishScore, mathScore, societyScore, scienceScore, moralityScore, musicScore, physicalEducationScore, artScore);
		
		this.wisdomAndLifeScore = wisdomAndLifeScore;
		showInfo();
	}
	

	public void showInfo(){
		System.out.println("이름 : "+super.getName()+"학년 : "+super.getStuYear()+" 반 : "+super.getClassNumber()+" 번호 : "+super.getStuNumber()+" 국어 : "+ super.getKoreanScore() + " 영어 : "+ super.getEnglishScore()+ " 수학 : "+ super.getMathScore()+ " 사회 : "+ super.getSocietyScore()+ " 과학 : "+ super.getScienceScore() + " 도덕 : " + super.getMoralityScore()+ " 음악 : " + super.getMusicScore()+ " 체육 : " + super.getPhysicalEducationScore() + " 미술 : "+super.getArtScore() + " 슬기로운생활 : "+ wisdomAndLifeScore);
	}
	
}

class MiddleStudent extends Student{
	
	int techniqueHomeScore;  //기술가정
	
	public MiddleStudent(String name ,int stuYear, int classNumber , int stuNumber ,int koreanScore, int englishScore, int mathScore, int societyScore, int scienceScore,int moralityScore,  int musicScore, int physicalEducationScore, int artScore , int techniqueHomeScore) {
		super(name,stuYear,classNumber,stuNumber,koreanScore, musicScore, mathScore, societyScore, scienceScore, moralityScore, englishScore,	physicalEducationScore, artScore);
		this.techniqueHomeScore = techniqueHomeScore;
		showInfo();
	}
	
	public void showInfo(){
		System.out.println("이름 : "+super.getName()+" 반 : "+super.getClassNumber()+" 번호 : "+super.getStuNumber()+ " 국어 : "+ super.getKoreanScore() + "영어 : "+ super.getEnglishScore()+ "수학 : "+ super.getMathScore()+ "사회 : "+ super.getSocietyScore()+ "과학 : "+ super.getScienceScore() + "기술가정"+ techniqueHomeScore);
	}
}

class HighStudent extends Student{
	
		public HighStudent(String name ,int stuYear, int classNumber , int stuNumber ,int koreanScore, int englishScore, int mathScore, int societyScore, int scienceScore, int moralityScore, int musicScore, int physicalEducationScore, int artScore , int major ) {
			super(name,stuYear,classNumber,stuNumber,koreanScore, musicScore, mathScore, societyScore, scienceScore, moralityScore, englishScore,	physicalEducationScore, artScore);
		
			if(major==1){
				liberalArts();
				
				//showInfo(koreanHistoryScore,lawScore);
			}
			else{
				naturalSciences();
				//showInfo(math2Score,chemistryScore,biologyScore);
			}
			
		}
		
		
		
		public void liberalArts(){ //문과
			
		}
		
		
		public void naturalSciences(){//이과
			
		}

		
		private void showInfo(int koreanHistoryScore, int lawScore) {
			System.out.println("문과 : "+ " 국어 : "+ super.getKoreanScore() + "영어 : "+ super.getEnglishScore()+ "수학 : "+ super.getMathScore() + 
					"사회 : "+ super.getSocietyScore() + "과학 : "+ super.getScienceScore() +"국사 : "+koreanHistoryScore + "법학 : " + lawScore);			
		}


		private void showInfo(int math2Score, int chemistryScore, int biologyScore) {
			System.out.println("국어 : "+ super.getKoreanScore() + "영어 : "+ super.getEnglishScore()+ "수학 : "+ super.getMathScore() + 
					"사회 : "+ super.getSocietyScore() + "과학 : "+ super.getScienceScore() + "수2 : "+math2Score + "화학 : " + chemistryScore + "생물학 : " + biologyScore);
			
		}
	
	
}

