package app.krista.extensions.zzztestsandbox.zzzdeleteme.helloworldext2.catalog;

import app.krista.extension.executor.ExtensionResponse;
import app.krista.extension.executor.ExtensionResponseBuilder;
import app.krista.extension.impl.anno.CatalogRequest;
import app.krista.extension.impl.anno.Domain;
import app.krista.extension.impl.anno.Field;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Greeting catalog requests.
 */
@Domain(id = "catEntryDomain_a11bb761-5f94-4d6f-86d5-d77e9cb47046",
        name = "ZZZ Delete Me",
        ecosystemId = "catEntryEcosystem_7b848154-eb50-4796-a8c3-4fa51c868c61",
        ecosystemName = "ZZZ Test Sandbox",
        ecosystemVersion = "0807ef5d-4442-4852-a367-edbaf38e01ee")
public class GreetingArea {

    private static final String GREETING_MESSAGE = "Hello World";

    @CatalogRequest(
            id = "localDomainRequest_7a3f9c2e-1b4d-4e6a-9f21-5c8d4b7a1e30",
            name = "Say Hello",
            description = "Returns a fixed greeting message.",
            area = "Greeting",
            type = CatalogRequest.Type.QUERY_SYSTEM)
    @Field.Text(name = "Message", required = false)
    public ExtensionResponse sayHello() {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("Message", GREETING_MESSAGE);
        return new ExtensionResponseBuilder().success(out).build();
    }
}
