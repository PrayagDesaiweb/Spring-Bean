package com.prayagdesai.Bean;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "good fortune";
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hi here I am the daily workout of the Track Coach";
	}
	
	


}
