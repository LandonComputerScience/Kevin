
public class Kevinisknowledgable {

	    public static int getMonth()
	    {
	        double knowledgeGrowth = 0.10;
	        int months = 0;
	        double knowledge = 0;

	        while(knowledge < 0.95)
	        {
	            knowledge = knowledge + (1-knowledge)*knowledgeGrowth;
	            months++;
	        }
	        return months;
	    }
	    public static void main(String [] args)
	    {
	        int months=getMonth();
	        System.out.println("It will take kevin " + months + " months to learn Java for his exam.");

	        int years = months/12;
	        months -= 12*years;

	        System.out.println("It will take Kevin " + years + " years & "+ months+ " months");
	    }

	}


