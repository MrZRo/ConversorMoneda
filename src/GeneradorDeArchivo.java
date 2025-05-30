import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.time.LocalDate;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GeneradorDeArchivo {
    public void guardarJson(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("Se convirtio de "+moneda.base_code()+" a "
                +moneda.target_code()+" el cual tiene un valor de "+moneda.conversion_rate()+" .A fecha "
                +LocalDate.now()+" y en horas "+ DateTimeFormatter.ofPattern("HH-mm-ss") +".json");
        escritura.write(gson.toJson(moneda));

    }
}