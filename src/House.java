
public class House {
	
	StringBuffer sb1 = new StringBuffer("standard material");
	StringBuffer sb2 = new StringBuffer("high standard material");
	StringBuffer sb3 = new StringBuffer("high standard material and fully automated house");
		
	double houseConstruction(StringBuffer sb,double houseArea) {
		double constructionCost = 0.0;
		if(sb.toString().equals(sb1.toString())) {
			constructionCost = houseArea * 1500;
		}
		else if(sb.toString().equals(sb2.toString())) {
			constructionCost = houseArea * 1800;
		}
		else if(sb.toString().equals(sb3.toString())) {
			constructionCost = houseArea * 2500;
		}
		
		return constructionCost;
	}
	
}
