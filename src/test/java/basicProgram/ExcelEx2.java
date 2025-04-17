package basicProgram;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ExcelEx2 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {

            FileInputStream fis = new FileInputStream("./src/test/resources/textData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);

            Sheet s = wb.getSheet("OnlyStringTypes");

            int lastRowNum = s.getLastRowNum();
            System.out.println("lastRowNum : " + lastRowNum);

            int physicalNumberOfRows = s.getPhysicalNumberOfRows();
            System.out.println("physicalNumberOfRows : " + physicalNumberOfRows);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}

