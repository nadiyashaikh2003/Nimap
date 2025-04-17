package basicProgram;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelEx1 {
    public static void main(String[] args) {
        System.out.println("** Program Starts **");
        try {

            FileInputStream fis = new FileInputStream("./src/main/resources/textData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);

            int totalSheets = wb.getNumberOfSheets();
            System.out.println("Total Sheets : " + totalSheets);

            String sheetName0 = wb.getSheetName(0);
            System.out.println("0th sheet Name : " + sheetName0);
            System.out.println("**********************");
            for(int i=0; i<totalSheets; i++) {
                String sheetName = wb.getSheetName(i);
                System.out.println("sheet Name at "+i+" : " + sheetName);
            }
 
            int index = wb.getSheetIndex("OnlyStringTypes");
            System.out.println("index : " + index);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}



