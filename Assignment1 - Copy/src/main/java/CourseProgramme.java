import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgramme 
{
	
	private String name;
	private ArrayList<Module> modules = new ArrayList<Module>();
	private DateTime startDate;
	private DateTime endDate;
	
	public CourseProgramme (String Name,
			DateTime StartDate, DateTime EndDate)
	{
		this.name = Name;
		this.startDate = StartDate;
		this.endDate = EndDate;
	}
	

}
