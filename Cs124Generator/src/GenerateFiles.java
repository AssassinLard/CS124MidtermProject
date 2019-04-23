import processors.PojoProcessor;

public class GenerateFiles {

	public static void main(String[] args) throws Exception
	{
		Parser p;
		
		p = new Parser("input/BasicInformation.txt");
		p.parse();

		p = new Parser("input/StudentHealthAssessment.txt");
		p.parse();
		
			p = new Parser("input/NurseRegistration.txt");
		p.parse();

	}
}
