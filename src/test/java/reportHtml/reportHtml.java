package reportHtml;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class reportHtml {
    public static void main(String[] args){
        String ruta="C:\\testAppYouTube\\build\\reports\\cucumber\\";
        File reportOutPut=new File(ruta+"finalReports");

        List<String> jsonFiles =new ArrayList();
        jsonFiles.add(ruta+"reports.json");
        Configuration configuration=new Configuration(reportOutPut,"Proyecto ");
        configuration.setBuildNumber("v50.0");
        configuration.addClassifications("SO","Windows");
        configuration.addClassifications("owner","RRPS");
        configuration.addClassifications("Branch","cucumber");
        configuration.addClassifications("Type Report","Local");
        ReportBuilder reportBuilder=new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();

    }
}
