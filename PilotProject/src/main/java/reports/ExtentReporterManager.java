package reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterManager {

	static ExtentReports extent;

	public static ExtentReports getReporter() {
		if (extent == null) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setReportName("TestNG Pilot Report");
			spark.config().setDocumentTitle("Test NG Pilot Project");
			extent.attachReporter(spark);
		}
		return extent;
	}

}
