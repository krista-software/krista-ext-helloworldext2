package app.krista.extensions.zzztestsandbox.zzzdeleteme.helloworldext2.catalog;

import app.krista.extension.executor.ExtensionResponse;
import app.krista.extension.executor.ExtensionResponseBuilder;
import app.krista.extension.impl.anno.CatalogRequest;
import app.krista.extension.impl.anno.Domain;
import app.krista.extension.impl.anno.Field;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Setup area - the standard Test Connection + Health Check requests.
 *
 * This extension has no external system to reach, so Test Connection always succeeds and Health
 * Check reports JVM health only.
 */
@Domain(id = "catEntryDomain_a11bb761-5f94-4d6f-86d5-d77e9cb47046",
        name = "ZZZ Delete Me",
        ecosystemId = "catEntryEcosystem_7b848154-eb50-4796-a8c3-4fa51c868c61",
        ecosystemName = "ZZZ Test Sandbox",
        ecosystemVersion = "0807ef5d-4442-4852-a367-edbaf38e01ee")
public class SetupArea {

    @CatalogRequest(
            id = "localDomainRequest_2d6e8f41-9a3b-4c5d-8e72-1f4a9b6c3d05",
            name = "Test Connection",
            description = "Validate connectivity and authentication",
            area = "SetUp",
            type = CatalogRequest.Type.QUERY_SYSTEM,
            tool = true)
    @Field.Boolean(name = "Success", required = false)
    @Field.Text(name = "Message", required = false)
    public ExtensionResponse testConnection() {
        Map<String, Object> out = new LinkedHashMap<>();
        out.put("Success", true);
        out.put("Message", "Connected. This extension has no external system to reach.");
        return new ExtensionResponseBuilder().success(out).build();
    }

    @CatalogRequest(
            id = "localDomainRequest_5b1c7e93-4f2a-4d8b-9c6e-3a7d5f1b8e42",
            name = "Health Check",
            description = "Check extension and system health",
            area = "SetUp",
            type = CatalogRequest.Type.CHANGE_SYSTEM,
            tool = true)
    @Field.Boolean(name = "Is Healthy", required = false)
    @Field(name = "Heap Used MB", type = "Number", required = false)
    @Field.Text(name = "Details", required = false)
    public ExtensionResponse healthCheck() {
        Map<String, Object> out = new LinkedHashMap<>();
        MemoryMXBean memBean = ManagementFactory.getMemoryMXBean();
        long heapUsedMb = memBean.getHeapMemoryUsage().getUsed() / (1024 * 1024);
        out.put("Is Healthy", true);
        out.put("Heap Used MB", (double) heapUsedMb);
        out.put("Details", "OK");
        return new ExtensionResponseBuilder().success(out).build();
    }
}
