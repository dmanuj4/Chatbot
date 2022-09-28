
/**
 * Write a description of class CG here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.net.URI;
import java.awt.Desktop;
import javax.swing.*;

class ChatterBot{
     static String stg;
     public  static void medical() throws java.IOException
    {
        Scanner sc = new Scanner(System.in);
        boolean r = true;
        System.out.println("In this field here you have three options: \n **Doctors are medical professionals who treat patients in hospitals. Physicians diagnose a patient, and prescribes medicines and treatment for disease, while surgeons perform operations. Allopathic medicine is one of the largest and most extensive field of study and research with many different specialties.** \n #Apart from allopathic you also go for options of homeopathic.#");
        System.out.println("Do you want more details ? \n yes \n no \n Bye to exit ");
        while(r==true){
        String S= sc.nextLine();
        if( S.equalsIgnoreCase("yes")){
          System.out.println("**Physicians**");
          System.out.println("Educate clients for prevention and control of disease \n Diagnose different ailments and  disease\nPrescribing medicines and treatment \n Advise patients for follow up \nKeep a record of diagnosis and treatment of each patient");
          System.out.println("Specialize in different medical specialities such as cardiology, rheumatology etc.Training is for 3 years after the basic degree (MBBS). Super specialization requires further study");
          System.out.println("Work in large hospitals to offer treatment in all branches covered under the medical specialties, in multi-speciality hospitals, clinics, nursing homes or are in defence or government hospitals to provide similar medical cover.");
          System.out.println("** Surgeons**");
          System.out.println("Examine patients \n Order  different diagnostic tests to help them in the diagnosis \n Go through patient report \n Schedule surgery");
          System.out.println("Perform operations on all organs of the body as general surgeons");
          System.out.println("As specialist surgeons specialize in one of the many branches such as as Orthopaedic, ENT, cardiothorasic, neurosurgeons etc. They are trained to perform operations of the most complex nature with sophisticated surgical tools and equipment");
          System.out.println("Follow up patients after surgery and treat any complications if needed.");
          System.out.println("Work in large hospitals to offer treatment in all branches covered under the surgical specialties, in multi-speciality hospitals, clinics, nursing homes or are in defence or government hospitals to provide similar medical cover");
          System.out.println("May teach and examine junior doctors or carry out research.");
          System.out.println("**Doctors**");
          System.out.println("Doctors also work in a number of non-clinical branches of study such as anatomy and physiology, biochemistry, microbiology which apply themselves to the study and research in various branches of medicine.");
          System.out.println("\n \t \t  WHAT ELSE DO YOU WANNA KNOW ");
          System.out.println("\n \t \t 1)COLLEGES \n \t \t 2)EXAMS \n \t \t 3)COACHINGS");
          String sd= sc.nextLine();
          if(sd.equalsIgnoreCase("colleges")){
              Desktop d =Desktop.getDesktop();
              try
              {
                  d.browse(new URI("https://www.shiksha.com/college/aiims-delhi-all-india-institute-of-medical-sciences-gautam-nagar-24433/course-bachelor-of-medicine-and-bachelor-of-surgery-mbbs-62474"));
              }
              catch (java.io.IOException ioe)
              {
                  ioe.printStackTrace();
              }
              
              
              
          }
          continue;
         }
         else if (S.equalsIgnoreCase("no")){
             System.out.println("\n \t \t  WHAT ELSE DO YOU WANNA KNOW ");
          System.out.println("\n \t \t 1)COLLEGES \n \t \t 2)EXAMS \n \t \t 3)COACHINGS");
        }
          else{
              r=false;
          }
         }
    }
    public  static void field()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the field you are interested into : \n 1)ENGINEERING \n 2) MEDICAL \n 3) ARTS \n 4) COMMERCIAL \n 5) LAW \n 6) OTHERS ");
        stg = sc.nextLine();
        if(stg.equalsIgnoreCase("medical")){
            try
            {
                ChatterBot.medical();
            }
            catch (java.net.URISyntaxException urise)
            {
                urise.printStackTrace();
            }
        }
        else if (stg.equalsIgnoreCase("arts")){
            try
            {
                ChatterBot.arts();
            }
            catch (java.net.URISyntaxException urise)
            {
                urise.printStackTrace();
            }
        }
        else if (stg.equalsIgnoreCase("commerce")){
            try
            {
                ChatterBot.commerce();
            }
            catch (java.net.URISyntaxException urise)
            {
                urise.printStackTrace();
            }
        }
        else if (stg.equalsIgnoreCase("engineering")){
            try
            {
                ChatterBot.engineering();
            }
            catch (java.net.URISyntaxException urise)
            {
                urise.printStackTrace();
            }
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hey there I'am a LetsED bot for your guidance.Say YES for counselling");
        boolean running=true;
        String input;
        String s;
        
        
        while(running == true){
            
            System.out.println(" ");
            input=sc.nextLine();
            
            
            if((input.equalsIgnoreCase("hi"))||(input.equalsIgnoreCase("hello"))){
                System.out.println("Hi There \n Say yes for guidance");
                
            }
            else if((input.equalsIgnoreCase("bye"))){
                System.out.println("Bye");
                running=false;
            }
            else if (input.equalsIgnoreCase("yes")){
                ChatterBot.field();
                
            }
            else{
                System.out.println("Sorry Iam not able to understand");
                JFrame frame = new JFrame();
                JButton button= new JButton();
            }
        }
    }
    public static void arts() throws java.net.URISyntaxException {
            Scanner sc = new Scanner(System.in);
            boolean rt= true;
            while(rt = true){
    System.out.println("Humanities are academic disciplines that study aspects of human society and culture.\nSome of the subject in Arts and Humanities are:");
    
    System.out.println("\n HISTORY \n Geography \n PYSCOLOGY \n SOCIOLOGY \n POLITICAL SCIENCE \n PHILOSOPHY \n ECONOMICS \n LAW"); 
    
   System.out.println("PLease specipy your choices to know in detail  about \n COLLEGES \n CAREER OPPORTUNITIES");
   String s = sc.nextLine();
    if((s.equalsIgnoreCase("career"))||(s.equalsIgnoreCase("career opportunities"))||(s.equalsIgnoreCase("opportunities")))
    {
   System.out.println("Career options in Arts and humanities can include some of the most interesting and coveted jobs in the market.\nThe humanities job list consists of diverse roles like:");
   
   System.out.println("1. Psychologist\n2. Lawyer\n3. Foreign language expert\n4. Data Linguist\n5. Historian\n6. Art director\n7. Travel agent \n8. Teacher\n9. Human resource specialist \n10. Archaeologist");
   break;
}
    else if(s.equalsIgnoreCase("colleges")){
        
        Desktop d =Desktop.getDesktop();
              try
              {
                  d.browse(new URI("https://collegedunia.com/arts-colleges"));
              }
              catch (java.io.IOException ioe)
              {
                  ioe.printStackTrace();
              }
            break;
    }
    
    else
    {
        System.out.println("Sorry Iam unable to understand ");
        System.exit(0);
        break;
    }
}

    }
    public static void commerce() throws java.net.URISyntaxException {
        Scanner sc = new Scanner(System.in);
    System.out.println("Commerce education is that area of education which develops the required knowledge, skills and attitudes for the handling of Trade, Commerce and Industry.\nThe recent commerce education has emerged in the form of Chartered Accountant, Cost and works accountant, Company secretary and Business administrator.");
    System.out.println("1. Accountancy \n2. Business Studies \n3. Economics  \n4. Statistics\n");
    System.out.println("*WHAT ELSE DO YOU WANNA KNOW* \n DETAILS \n COLLEGES \n CAREER OPPURTUNITIES ");
    String S = sc.nextLine();
    if(S.equalsIgnoreCase("DETAILS"))
    {
        System.out.println("Commerce is simply defined as the study of finance, trade, economy, and business activities. For those of you interested in dealing with analyzing data,\ndealing with numbers, and learning the tricks of the trade, this field is the ideal one to pursue. It involves a detailed insight into an array of \nacademic disciplines like Business, Management, Economics, Accountancy, amongst others. Regarded as one of the most popular streams after Science,\nCommerce offers a plethora of career opportunities to explore in both the public and private sectors. You can either discover job prospects in the\ncorporate sector like CA, CS, Managerial profiles, etc. or you can delve deeper into the realm of research by perusing other commerce subjects like\nEconomics, Micro Finance, Information Technology, amongst others.");
    }
    else if(S.equalsIgnoreCase("COLLEGES"))
    {
      Desktop d =Desktop.getDesktop();
              try
              {
                  d.browse(new URI("https://collegedunia.com/commerce-colleges"));
              }
              catch (java.io.IOException ioe)
              {
                  ioe.printStackTrace();
              }
    }
    else if((S.equalsIgnoreCase("career"))||(S.equalsIgnoreCase("opportunities"))||(S.equalsIgnoreCase("career opportunities")))
    {
        System.out.println("Commerce is a diverse career choice; it includes several lucrative options like finance, banking, economics, stock, actuarial science, and accountancy.\nAfter completing 12th commerce, there are many popular courses like Bachelor of Commerce, BSc in Economics, BSc in Finance, BSc in Maths, BSc Statistics,\nChartered Accountancy, Company Secretary, and BSc in Actuarial Science. Bachelor of Commerce or BCom is the most popular course for commerce students.");
    }
    else
    {
        System.out.println("Sorry Iam unable to understand ");
        
    }
}
 public static void engineering() throws java.net.URISyntaxException {
         Scanner sc = new Scanner(System.in);
    System.out.println("Engineering is a discipline dedicated to problem solving. Our built environment and infrastructure, the devices we use to communicate, the processes that manufacture \nour medicines, have all been designed, assembled or managed by an engineer.");
    System.out.println("Various branches of engineering are");
    System.out.println("1. Aerospace/aeronautical engineering  \n2. Chemical engineering \n3. Civil engineering  \n4. Computer Science Engineering \n5. Electrical/electronic engineering \n6. Mechanical engineering \n7. Engineering management \n8. AI/ML ");
    System.out.println(" WHAT ELSE DO  YOU WANT TO KNOW \n Details \n colleges \n career opportunities");
    String Stg = sc.nextLine();
    if(Stg.equalsIgnoreCase("detail"))
    {
        System.out.println("1. Highly valuable degree and good salary.\n2. Variety in branches of engineering, which one can choose as per preference.\n3. If one later wishes to switch careers or do an MBA post engineering, engineers have an edge over students of other fields as their skillset, and the hard work they go through is well recognized.");
    }
    else if((Stg.equalsIgnoreCase("colleges")||(Stg.equalsIgnoreCase("college"))))
    {
        Desktop d =Desktop.getDesktop();
              try
              {
                  d.browse(new URI("https://engineering.careers360.com/colleges/ranking"));
              }
              catch (java.io.IOException ioe)
              {
                  ioe.printStackTrace();
              }
    }
    else if((Stg.equalsIgnoreCase("career"))||(Stg.equalsIgnoreCase("opportunites"))||(Stg.equalsIgnoreCase("career opportunies")))
    
    {
        Desktop d =Desktop.getDesktop();
              try
              {
                  d.browse(new URI("https://in.indeed.com/career-advice/finding-a-job/types-of-engineering-careers"));
              }
              catch (java.io.IOException ioe)
              {
                  ioe.printStackTrace();
              }
    }
    else
    {
        System.out.println("Sorry I am not able to understand.");
    
    }
    System.out.println("To know more you can ask by clicking on the respective no-\n");
                    System.out.println("1.What Is the Hardest Engineering Major?\n" +
                            "2.Is engineering a good career?\n" +
                            "3.Which is the highest paid job in the world?\n" +
                            "4.Is engineering hard to study?\n" +
                            "5.What can an engineer earn?\n" +
                            "6.What engineers do all day?\n" +
                            "7.Are engineers paid well?\n" +
                            "8.Is engineering a stressful job?\n" +
                            "9.Is engineering a boring?\n" +
                            "10.Why do most engineers quit?\n" +
                            "11.Exit");
                    int a = sc.nextInt();
                    int k=1;
                    switch (a) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Engineering has historically been one of the highest paying careers anyone can pursue.\n" +
                                    " In many polls and surveys, " +
                                    "engineering-related jobs still \n command some of the highest incomes of all.");
                            break;
                        case 4:
                            System.out.println("Engineering ranks among one of the hardest degrees you can do. The degree \n" +
                                    "requires you to have everything from logic and common sense to a \n" +
                                    "tremendous amount of patience when things don't go your way.\n" +
                                    " Engineering can be very difficult because you're essentially becoming a “professional problem solver”.");
                            break;
                        case 3:
                            System.out.println("Top on the list of highest paying engineering degrees is petroleum engineering and then comes computer science engineering");
                            break;
                        case 5:
                            System.out.println("An Engineer in the UK earns an average of £48,000 gross per year, \n" +
                                    "which is about £3,000 net per month. The starting salary of an Engineer in the UK \n" +
                                    "is around £24,000\n" +
                                    " gross per year. The highest salary of an Engineer in the UK can reach\n" +
                                    " and exceed £150,000 gross per year.");
                            break;
                        case 6:
                            System.out.println("Most of what engineers do on a daily basis can fall into four categories:\n" +
                                    " communicating, problem solving, analyzing, and planning. Depending on an engineer's\n " +
                                    "industry and role, their day will typically consist of a various mix of these functions.");
                            break;
                        case 7:
                            System.out.println("Year after year, engineering jobs are paid the highest average starting salary.\n " +
                                    "According to the U.S. Bureau of Labor Statistics (BLS) engineers have a median annual wage of\n " +
                                    "$100,640 and the engineering field projects " +
                                    "to have employment growth of 6 percent from 2020 to\n 2030—nearly 146,000 new jobs over the next decade.");
                            break;
                        case 8:
                            System.out.println("Yes, mechanical engineering is a stressful job.\n" +
                                    "According to the Bureau of Labor Studies, more than one-third of mechanical\n " +
                                    "engineers work over 40 hours a week");
                            break;
                        case 9:
                            System.out.println("The survey, by job board CV Library, found that engineering was a duller profession\n" +
                                    " to be part of than manufacturing or construction. Doing the same thing every day was cited \n" +
                                    "by almost one in four " +
                                    "engineers polled as a reason for boredom, with the tediousness \n" + "of routine tasks also a major factor.");
                            break;
                        case 10:
                            System.out.println("Why do most engineers quit?\n" +
                                    "The number one reason that engineers quit their jobs is that there aren't advancement opportunities.\n " +
                                    "If an engineer believes that they are stuck in a dead-end job, they will look for\n" +
                                    " a chance to grow in other places.");
                            break;

                        case 11:
                            k=0;
                            break;
                        default:
                            System.out.println("Inappropriate input");
                    }

 }
   

    

    
    

}

