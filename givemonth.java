
public class givemonth {

	public static void main(String[] args) {
		int monthNum(String monthName){
			String month_names[]=new String[12];

			month_names[0]="January";
			month_names[1]="February";
			month_names[2]="March";
			month_names[3]="April";
			month_names[4]="May";
			month_names[5]="June";
			month_names[6]="July";
			month_names[7]="August";
			month_names[8]="September";
			month_names[9]="October";
			month_names[10]="November";
			month_names[11]="December";

			for(int i=0; i<12; i++){
				if(monthName.equals(month_names[i]))
					return i;
			}

		return -1;

		
	}

	class whichMonth{
		public static void main(String args[]){
			givemonth gM=new givemonth();
			int month_days[]=new int[12];

			for(int i=0; i<12; i++){
				if(i==1)
					month_days[i]=28; // February

				else if(i<=6){
					if(i%2==0)
						month_days[i]=31;
					else
						month_days[i]=30;
				}

				else if(i>=7){ // flip the number of days from month number 8
					if(i%2==0)
						month_days[i]=30;
					else
						month_days[i]=31;
				}
			}

			System.out.println("Enter name of the month: ");
			String monthName=System.console().readLine();
			int mNum=gM.monthNum(monthName);

			if(mNum==-1)
				System.out.println("Requested month doesn't exist!!");
			else
				System.out.println(monthName+" has "+month_days[mNum]+" days.");
		}
	

	}

}
