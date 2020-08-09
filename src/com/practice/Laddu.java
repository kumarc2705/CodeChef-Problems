package com.practice;
import java.util.*;
public class Laddu {
	enum activity{CONTEST_WON,TOP_CONTRIBUTOR,BUG_FOUND,CONTEST_HOSTED};
	public static void main(String [] args) {
		int T=0;
		List <String> activityarray = new ArrayList<String>();
		List<Integer> output = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		String [][] activityrankarray;
		LadduInput input = new LadduInput();
		if(sc.hasNext()) {
			T=sc.nextInt();
			sc.nextLine();
		}
		for(int i=0;i<T;i++) {
			output.add(0);
			if(sc.hasNext()) {
					input.setNoOfActivities(sc.nextInt());
					if(sc.hasNext()) {
						input.setOrigin(sc.next());
						sc.nextLine();
				for(int j=0;j<input.getNoOfActivities();j++) {
					int N = input.getNoOfActivities();
					activityrankarray = new String[N][];
					if(sc.hasNext()) {
/*						activityarray.add(sc.nextLine());
						activityrankarray[j]=activityarray.get(j).split(" ");*/
						String a= sc.next();
							output.set(i,output.get(i)+findTotalPoints(a,sc));
					}
				}
				if(input.getOrigin().equals("INDIAN")) {
					output.set(i,output.get(i)/200);
				}else {
					output.set(i,output.get(i)/400);
				}
			}
			}
	}
	sc.close();
	int i=0;
	for(Integer op : output) {
		if(i!=output.size()-1) {
			System.out.println(op);
		}else {
			System.out.print(op);
		}
		i++;
	}
}
public static int findTotalPoints(String str,Scanner sc) {

	int points = 0;
	if(str.equals(activity.CONTEST_WON.toString())) {
		int a=sc.nextInt();
		sc.nextLine();
		if(a<=20) {
			points= 320-a;
		}
		else {
			points=300;
		}
	}else if(str.equals(activity.TOP_CONTRIBUTOR.toString())) {
		points=300;
	}else if(str.equals(activity.BUG_FOUND.toString())) {
		points=sc.nextInt();
		sc.nextLine();
	}else if(str.equals(activity.CONTEST_HOSTED.toString())) {
		points=50;
	}
	return points;
}
}

   final class LadduInput{
	String origin;
	int noOfActivities;
	
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin=origin;
	}
	public int getNoOfActivities() {
		return this.noOfActivities;
	}
	public void setNoOfActivities(int noOfActivities) {
		this.noOfActivities=noOfActivities;
	}
}
