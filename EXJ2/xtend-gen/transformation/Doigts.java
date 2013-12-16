package transformation;

import transformation.Transformation;

public class Doigts {

	public static void main(String[] args) {
		
		Transformation transformer = new Transformation();
		transformer.tranform("questionnaire.ps","questionnaire.ui");
		TransfoModelToText m2t = new TransfoModelToText();
		m2t.transform("myUI.xmi", "questionnaire.html");
		TransfoModelToTextAndroid m2tA = new TransfoModelToTextAndroid();
		m2tA.transform("myUI.xmi", "questionnaire.xml");
	}

}
