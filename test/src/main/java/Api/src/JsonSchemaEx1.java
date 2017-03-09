package src;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import org.junit.Test;
import org.testng.xml.dom.Tag;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

/**
 * Created by admin on 3/1/17.
 */
public class JsonSchemaEx1 {

    @Tag(name="API")
    @Test
    public void schemaTest() throws IOException, ProcessingException {
        File schemaFile = new File("src/main/java/com/Hillel/API/schema2.json");
        File jsonFile = new File("src/main/java/com/Hillel/API/data2.json");
        System.out.println(ValidationUtils.getStatus(schemaFile, jsonFile));
        assertTrue(ValidationUtils.isJsonValid(schemaFile, jsonFile));
    }
}
