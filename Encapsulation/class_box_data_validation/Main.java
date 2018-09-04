package encapsulation.first_and_reserve_team.class_box_data_validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double lenght = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        try {


        Box box = new Box(lenght,width,height);

        System.out.println(String.format("Surface Area - %.2f",box.calculateSurfaceArea()));
        System.out.println(String.format("Lateral Surface Area - %.2f",box.calculateLiteralSurfaceArea()));
        System.out.println(String.format("Volume - %.2f",box.calculateVolumeSurfaceArea()));
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
