package driver123;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import jxl.*;
import jxl.write.*;
import jxl.write.Number;
import jxl.write.biff.RowsExceededException;

 public class GenerateExcel {
  @Test
  public static void  main() throws IOException, RowsExceededException, WriteException {
	  String Duty = "Finite Heading";
 String filename  = "E:\\Excel_1\\ExcelProgram\\File20.xls";
 WritableWorkbook workbook = Workbook.createWorkbook(new File(filename));
 WritableSheet sheet = workbook.createSheet("selenium", 0);
 WritableSheet sheet1 = workbook.createSheet("java", 1);
 WritableSheet sheet2 = workbook.createSheet("webdriver", 2);
 Label label = new Label(0,0,Duty);
 sheet.addCell(label);
 //sheet1.addCell(label);
 //sheet2.addCell(label);
 Number number = new Number(0,1,3.1459);
 sheet.addCell(number);
 //sheet1.addCell(number);
// sheet2.addCell(number);
//return filename;
 workbook.write(); 
 workbook.close();
  }
}
