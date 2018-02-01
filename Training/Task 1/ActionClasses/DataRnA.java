package test.EPAM_Task1.ActionClasses;
import test.EPAM_Task1.EntityClasses.Dot;
import test.EPAM_Task1.EntityClasses.Surface;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class DataRnA {
    private ArrayList<String[]> list = new ArrayList<>();
    private int lineNum = 1;

    //read from file entire data and return a list of arrays
    //includes checker for "if 9 digits", "double or not" and "surface or not"
    public ArrayList dataReader(String s) {
        try (BufferedReader br = new BufferedReader(new FileReader(s))){
            String line;
            String sep[];
            while ((line = br.readLine()) != null) {
                sep = line.split(" ");
                if (lineChecker(sep, lineNum)) {
                    list.add(sep);
                }
                lineNum++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //checker for "if 9 digits", "double or not" and "surface or not"
    public boolean lineChecker(String[] x, int lineNumber) {

        // Is there 9 entries?
        if (!(x.length == 9)) {
            System.out.println("Error on line " + lineNumber + ": Not enough digits for 3 surfaces. 9 needed");
            return false;
        }


        // Are they double-type?
        for (String s : x) {
            try {
                Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Error on line " + lineNumber + ": Not a double Exception: " + s);
                return false;
            }
        }

        // Is it a surface?
        Dot a = new Dot(Double.parseDouble(x[0]), Double.parseDouble(x[1]), Double.parseDouble(x[2]));
        Dot b = new Dot(Double.parseDouble(x[3]), Double.parseDouble(x[4]), Double.parseDouble(x[5]));
        Dot c = new Dot(Double.parseDouble(x[6]), Double.parseDouble(x[7]), Double.parseDouble(x[8]));
        if ((a.equals(b) || b.equals(c) || a.equals(c))) {
            System.out.println("Error on line " + lineNumber + ": not s surface");
            return false;
        }
        return true;
    }

    // reads file and returns list of surfaces
    public ArrayList<Surface> surfacesListCreator(ArrayList<String[]> listOfData) {

        ArrayList<Surface> surfList = new ArrayList<>();
            for (String sep[] : listOfData) {
                Dot a = new Dot(Double.parseDouble(sep[0]), Double.parseDouble(sep[1]), Double.parseDouble(sep[2]));
                Dot b = new Dot(Double.parseDouble(sep[3]), Double.parseDouble(sep[4]), Double.parseDouble(sep[5]));
                Dot c = new Dot(Double.parseDouble(sep[6]), Double.parseDouble(sep[7]), Double.parseDouble(sep[8]));
                Surface sur = new Surface(a, b, c);
                surfList.add(sur);
            }

        return surfList;
    }

    // get angle with Axis -> Axis 2 = OXY, 1 = OXZ, 0 = OYZ
    // cos = (0*A + 0*B + 1*C)/((sqrt(0*0+0*0+1*1)*sqrt(A*A+B*B+C*C))
    public double angleFinder(double[] d, int Axis){
        double cos = (1 * d[Axis] / (1 * Math.sqrt(d[0] * d[0] + d[1] * d[1] + d[2] * d[2])));
        return Math.toDegrees(Math.acos(cos));
    }

    // Outputs angles and if surface has 90 angle with one of the axis.
    public void anglesDataProvider(double[] d) {
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("OXY angle is " + df.format(angleFinder(d, 2)));
        System.out.println("OXZ angle is " + df.format(angleFinder(d, 1)));
        System.out.println("OYZ angle is " + df.format(angleFinder(d, 0)));
        if (angleFinder(d, 2) == 180.0000000) {
            System.out.println("Плоскость перпендикулярна оси OXY");
        } else if (angleFinder(d, 1) == 180.0000000) {
            System.out.println("Плоскость перпендикулярна оси OXZ");
        } else if (angleFinder(d, 0) == 180.0000000) {
            System.out.println("Плоскость перпендикулярна оси OYZ");
        } else System.out.println("Плоскость не перпендикулярна ни одной из осей");

    }
}
