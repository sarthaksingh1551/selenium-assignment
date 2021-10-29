package signup.dataprovider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class SignupDataProvider
{
    public PersonalInformation dataForCreatingNewAccount() throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(
            "/Users/zop5748/Desktop/SeleniumAssignment1/src/test/resources/create_account_credentials.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(1);
        Cell email = row.getCell(0);
        Cell fName = row.getCell(1);
        Cell lName = row.getCell(2);
        Cell password = row.getCell(3);
        Cell address = row.getCell(4);
        Cell city = row.getCell(5);
        Cell zipCode = row.getCell(6);
        Cell mobileNumber = row.getCell(7);
        Cell alias = row.getCell(8);

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setEmail(email.getStringCellValue());
        personalInformation.setfName(fName.getStringCellValue());
        personalInformation.setlName(lName.getStringCellValue());
        personalInformation.setPassword(password.getStringCellValue());
        personalInformation.setAddress(address.getStringCellValue());
        personalInformation.setCity(city.getStringCellValue());
        personalInformation.setZipCode((int) zipCode.getNumericCellValue());
        personalInformation.setMobileNumber((int) mobileNumber.getNumericCellValue());
        personalInformation.setAlias(alias.getStringCellValue());

        return personalInformation;
    }

    @DataProvider (name = "data-provider")
    public Object[][] dpMethod() throws IOException
    {
        return new Object[][]{{dataForCreatingNewAccount()}};
    }

}
