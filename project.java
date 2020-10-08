import java.util.*;  //importing package
class health         //main class health
{
	enum doctors       //enum class doctors for storing doctor names, fees, id and specialization
	{
		orthodontist("Dr. Arnav","500",1),   
		optometrist("Dr. Vikas","400",2),
		paediatrician("Dr. Mukul","800",3),
		neurologist("Dr. Nisha","550",4),
		gynaecologist("Dr. Aiza","600",5);

		private final String d_name;               //declaring variables for name, fees and id
		private final String fee;
    private final int d_id;

		doctors(String name, String fees, int id)  //parameterized constructor
		{
			d_name = name;          
			fee = fees;
      d_id = id;
		}
		public String getname()   //function to call the name 
		{
			return d_name;
		}
		public String getfee()    //function to call the fees
		{
			return fee;
		}
    public int getid()        //function to call the id
    {
      return d_id;
    }
	}
	static int p_id = 1;                    //declaring and initializing the patient id
	public static void main(String arg[])   //main function
	{
		int m,z;                     //declaring and initialzing some varaiables
    String p_name=new String();  //new string for storing patient name
    int p_age=0;                 // for storing patient age
		do                           // do this whole until the loop is finished and condition is met in while part
		{ 
       int x;                                   //variable to store no. of patients 
       String ar[]=new String[10];              //making array to store patient names
       int arr[]=new int[10];                   //making array to store patient ages
       int arrr[]=new int[10];                  //making array to store patient id
       Scanner sc = new Scanner(System.in);     //for user input

       System.out.println("\t\t------WELCOME TO HEALTH CARE APPLICATION------");
       System.out.println(" ");
       System.out.print("\t\tEnter no. of patients : ");
       x=sc.nextInt(); 
       System.out.println(" ");
       for (z=1;z<=x;z++)                       //for loop for no. of patients
       {
       System.out.print("\t\tEnter the " + z + " patient's first name : "); 
       p_name = sc.next();
       ar[z]=p_name;

       System.out.print("\t\tEnter the "+z+ " patient's age : ");
       p_age = sc.nextInt();
       arr[z]=p_age;

       System.out.print("\t\tThe patient id of "+z+ " is generated as : ");
       arrr[z]=p_id++;
       System.out.println(arrr[z]);
       System.out.println(" ");
       }

       System.out.println(" ");
       System.out.println("\t\t\tPATIENT DETAILS : ");
       System.out.println("\t\t\t-----------------");
       System.out.println("\tName\t\t\tAge\t\t\tID");
       System.out.println("\t----\t\t\t---\t\t\t---");

       for(z=1;z<=x;z++)                                   //priniting patient details
       {
         System.out.printf("\t%s\t\t\t%d\t\t\t%d\n",ar[z],arr[z],arrr[z]);
       }

       System.out.println(" ");   
		   System.out.println("\t\tPlease take a look at the specialists available.");
		   System.out.println(" ");
       System.out.println("\tSpecialization\t\tName\t\t\tConsultation fees\t\t\tID");
       System.out.println("\t--------------\t\t----\t\t\t-----------------\t\t\t--");
       for(doctors specialization : doctors.values())     //printing doctors with details
       {
        	System.out.printf("\t%s\t\t%s\t\t\t",specialization,specialization.getname());
          System.out.printf("%s\t\t\t\t%d\n",specialization.getfee(),specialization.getid());
       }

       for(z=1;z<=x;z++)                                  //for appointment of doctor to each patient
       {
          System.out.println(" ");
          System.out.println("\t\tNow select the specialist for "+z+" patient.");
          System.out.println(" ");
          System.out.print("Press 1 for the Orthodontist.\nPress 2 for the Optometrist.\n");
          System.out.print("Press 3 for the Paediatrician.\nPress 4 for the Neurologist.\n");
          System.out.print("Press 5 for the Gynaecologist.\n");
          int n;                   //variable to store option value
          String r="a",s="b";      // default values for both strings to be used in specialization and fees
          n = sc.nextInt();
       
          switch(n)
          {
       	     case 1:
       	     System.out.println("Thank you! You have opted for : ");
             break;

       	     case 2:
       	     System.out.println("Thank you! You have opted for : ");
       	     break;

       	     case 3:
             System.out.println("Thank you! u have opted for : ");
             break;

             case 4:
             System.out.println("Thank you! u have opted for : ");
             break;

             case 5:
             System.out.println("Thank you! u have opted for : ");
             break;

             default:
             do                                           //compile until the valid option is filled.
             {
                System.out.println("Invalid option!");
                System.out.println("Enter the value again:");
                n=sc.nextInt();
             }
             while(n<=0 || n>5);
             System.out.println("Thank you! You have opted for :");
          }

          for(doctors specialization : doctors.values())  //fetching details
          if(n==specialization.getid())
          {
             System.out.println("\t\tName : "+specialization.getname());
             r=specialization.getname();
             System.out.println("\t\tFees : "+specialization.getfee());
             s=specialization.getfee();
          }
          System.out.println(" ");
          System.out.println("\t\t\t\tAPPOINTMENT SLIP"); //printing the appointment slip
          System.out.println("\t\t\t\t----------------");
          Date d1 = new Date();                           //adding date and time 
          Calendar cl = Calendar.getInstance();
          cl.setTime(d1);
          System.out.println("\t\tDate and Time        : " +d1.toString());  
          System.out.println("\t\tPatient name         : " +ar[z]);
          System.out.println("\t\tPatient age          : " +arr[z]);
          System.out.println("\t\tPatient id           : " +arrr[z]);
          System.out.println("\t\tSpecialist appointed : " +r); 
          System.out.println("\t\tSpecialization ID    : " +n);
          System.out.println("\t\tConsultation fee     : " +s);
       }
       System.out.println("Do you want to continue? Press 1 for YES and any other integer for NO.");
       m = sc.nextInt();
		}
    while(m==1);
	}
}