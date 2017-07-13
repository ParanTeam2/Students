package com.paran.students;

abstract public class Student {
	
	abstract int getSub1();
	abstract void setSub1(int sub1);
	abstract int getSub2();
	abstract void setSub2(int sub2);
	
	
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
	
	private int wisdomAndLifeScore; //슬기로운생활

	public ElementStudent(String name ,int stuYear, int classNumber , int stuNumber , int koreanScore, int englishScore, int mathScore, int societyScore, int scienceScore,int moralityScore,  int musicScore, int physicalEducationScore, int artScore , int wisdomAndLifeScore) {
		super(name,stuYear,classNumber,stuNumber,koreanScore, englishScore, mathScore, societyScore, scienceScore, moralityScore, musicScore, physicalEducationScore, artScore);
		
		this.wisdomAndLifeScore = wisdomAndLifeScore;
		showInfo();
	}
	

	public void showInfo(){
		System.out.println("이름 : "+super.getName()+"학년 : "+super.getStuYear()+" 반 : "+super.getClassNumber()+" 번호 : "+super.getStuNumber()+" 국어 : "+ super.getKoreanScore() + " 영어 : "+ super.getEnglishScore()+ " 수학 : "+ super.getMathScore()+ " 사회 : "+ super.getSocietyScore()+ " 과학 : "+ super.getScienceScore() + " 도덕 : " + super.getMoralityScore()+ " 음악 : " + super.getMusicScore()+ " 체육 : " + super.getPhysicalEducationScore() + " 미술 : "+super.getArtScore() + " 슬기로운생활 : "+ wisdomAndLifeScore);
	}


	@Override
	int getSub1() {
		// TODO Auto-generated method stub
		return wisdomAndLifeScore;
	}


	@Override
	void setSub1(int sub1) {
		this.wisdomAndLifeScore = sub1;
		
	}


	@Override
	int getSub2() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	void setSub2(int sub2) {
		// TODO Auto-generated method stub
		
	}

	
}

class MiddleStudent extends Student{
	
	private int techniqueHomeScore;  //기술가정
	
	public MiddleStudent(String name ,int stuYear, int classNumber , int stuNumber ,int koreanScore, int englishScore, int mathScore, int societyScore, int scienceScore,int moralityScore,  int musicScore, int physicalEducationScore, int artScore , int techniqueHomeScore) {
		super(name,stuYear,classNumber,stuNumber,koreanScore, musicScore, mathScore, societyScore, scienceScore, moralityScore, englishScore,	physicalEducationScore, artScore);
		this.techniqueHomeScore = techniqueHomeScore;
		showInfo();
	}
	
	public void showInfo(){
		System.out.println("이름 : "+super.getName()+" 학년 : "+super.getStuYear()+" 반 : "+super.getClassNumber()+" 번호 : "+super.getStuNumber()+ " 국어 : "+ super.getKoreanScore() + " 영어 : "+ super.getEnglishScore()+ 
				" 수학 : "+ super.getMathScore()+ " 사회 : "+ super.getSocietyScore()+ " 과학 : "+ super.getScienceScore() + " 기술가정 : "+ techniqueHomeScore);
	}

	@Override
	int getSub1() {
		
		return techniqueHomeScore;
	}

	@Override
	void setSub1(int sub1) {
		this.techniqueHomeScore = sub1;
		
	}

	@Override
	int getSub2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void setSub2(int sub2) {
		// TODO Auto-generated method stub
		
	}

	
}

class HighStudent extends Student{
	
		private	int koreanHistory;
		private int law;
		private int math2;
		private int chemical;
		private int major;
	
		public HighStudent(String name ,int stuYear, int classNumber , int stuNumber ,int koreanScore, int englishScore, int mathScore, int societyScore, int scienceScore, int moralityScore, int musicScore, int physicalEducationScore, int artScore , int major ,int[] majorScore) {
			super(name,stuYear,classNumber,stuNumber,koreanScore, musicScore, mathScore, societyScore, scienceScore, moralityScore, englishScore,	physicalEducationScore, artScore);
			
			this.major = major;
			
			if(major==1){
				this.koreanHistory = majorScore[0];
				this.law = majorScore[1];
				liberalArtsShowInfo();
				
			}
			else if(major==2){
				this.math2 = majorScore[0];
				this.chemical = majorScore[1];				
				naturalSciencesShowInfo();
			}
			
		}
		
		
		
		private void liberalArtsShowInfo(){ //문과
			System.out.println("문과 => "+"이름 : "+super.getName()+" 학년 : "+super.getStuYear()+" 반 : "+super.getClassNumber()+" 번호 : "+super.getStuNumber()+ " 국어 : "+ super.getKoreanScore() + " 영어 : "+ super.getEnglishScore()+ " 수학 : "+ super.getMathScore() + 
					" 사회 : "+ super.getSocietyScore() + " 과학 : "+ super.getScienceScore() +" 국사 : "+koreanHistory + " 법학 : " + law);
		}
		
		
		private void naturalSciencesShowInfo(){//이과 
			System.out.println("이과 => "+"이름 : "+super.getName()+" 학년 : "+super.getStuYear()+" 반 : "+super.getClassNumber()+" 번호 : "+super.getStuNumber()+" 국어 : "+ super.getKoreanScore() + " 영어 : "+ super.getEnglishScore()+ " 수학 : "+ super.getMathScore() + 
					" 사회 : "+ super.getSocietyScore() + " 과학 : "+ super.getScienceScore() + " 수학2 : "+ math2 + " 화학 : " + chemical );
		}

		

		@Override
		int getSub1() {
			if(major==1){
				return koreanHistory;
			}else{
				return math2;
			}
		}



		@Override
		void setSub1(int sub1) {
			if(major==1){
				this.koreanHistory=sub1;
			}else{
				this.math2=sub1;
			}
			
		}



		@Override
		int getSub2() {
			if(major==1){
				return law;
			}else{
				return chemical;
			}
		}



		@Override
		void setSub2(int sub2) {
			if(major==1){
				this.law=sub2;
			}else{
				this.chemical=sub2;
			}
			
		}
}


