package test.EPAM_Task1.TestDirectory;

import org.junit.Assert;
import org.junit.Test;
import test.EPAM_Task1.ActionClasses.DataRnA;
import test.EPAM_Task1.EntityClasses.Dot;
import test.EPAM_Task1.EntityClasses.Surface;

import java.util.ArrayList;

public class DataRnATest {

    DataRnA d = new DataRnA();

    @Test
    public void testDataReader() throws Exception {
        String dataLoc = "C:\\Users\\WorkBase\\Dropbox\\HWS\\Parser\\src\\test\\EPAM_Task1\\testData";
        ArrayList<String[]> methodResult = d.dataReader(dataLoc);
        ArrayList<String[]> expectedResult = new ArrayList();
        String[] testData = {"0", "1", "13", "0", "3", "6.0", "0", "0", "2"};
        expectedResult.add(testData);
        Assert.assertArrayEquals(expectedResult.get(0), methodResult.get(0));
    }

    @Test
    public void testSurfacesListCreator() {
        ArrayList<String[]> dataList = new ArrayList<>();
        String[] dataString = {"0", "1", "13", "0", "3", "6.0", "0", "0", "2"};
        dataList.add(dataString);
        ArrayList<Surface> expectedResult = d.surfacesListCreator(dataList);
        ArrayList<Surface> methodResult = new ArrayList<>();
        methodResult.add(new Surface(new Dot(0, 1, 13), new Dot(0, 3, 6.0), new Dot(0, 0, 2)));
        Assert.assertEquals(expectedResult.get(0), methodResult.get(0));
    }

    @Test
    public void angleFinder() {
        Double expectedResult = Math.toDegrees(Math.acos(1/Math.sqrt(21)));
        double[] testData = {4, -2, 1};
        Double methodResult = d.angleFinder(testData, 2);
        Assert.assertEquals(expectedResult, methodResult);
    }

    @Test
    public void testLineChecker() {
        boolean actualResult = false; //Dot a = Dot c
        String[] testData = {"1", "2", "3", "1", "5", "3", "1", "2", "3"};
        int line = 1;
        boolean methodResult = d.lineChecker(testData, line);
        Assert.assertEquals(actualResult, methodResult);
    }

}
