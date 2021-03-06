package CSVFiles;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AmitDeokar
{

    void calculateTotalSales() throws IOException, CsvException {

        Reader reader= Files.newBufferedReader(Paths.get("Car_sales.csv"));


        CSVParser parser=new CSVParserBuilder()
                .withSeparator(',')
                .build();

        CSVReader obj=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        List<String[]> data=obj.readAll() ;

        //Write a method for calculating and printing the total sales
        // from Manufacturer “Buick” for model “Century”
        List<String[]> Tsale=new LinkedList<>();
        data.stream()
                .forEach(x->{
                    if(x[0].equals("Buick") )
                    {
                        if (x[1].equals("Century"))
                            System.out.println(x[2]);

                    } }) ;

    }

    public static void main(String[] args) throws IOException, CsvException
    {
        AmitDeokar ad=new AmitDeokar() ;
        ad.calculateTotalSales() ;
    }
}
