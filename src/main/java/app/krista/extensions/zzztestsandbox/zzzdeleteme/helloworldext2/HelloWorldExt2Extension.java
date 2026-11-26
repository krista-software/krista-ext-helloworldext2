package app.krista.extensions.zzztestsandbox.zzzdeleteme.helloworldext2;

import app.krista.extension.executor.Invoker;
import app.krista.extension.impl.anno.Extension;
import app.krista.extension.impl.anno.InvokerRequest;
import app.krista.extension.impl.anno.Java;
import app.krista.extension.impl.anno.StaticResource;

import javax.inject.Inject;
import java.util.Map;

/**
 * HelloWorldExt2 extension entry point.
 *
 * This extension has no external system to connect to (authentication = "none"), so it declares no
 * connection {@code @Field}s and no Authentication tab — only the bundled Documentation tab.
 */
@Extension(name = "HelloWorldExt2", version = "1.0.0")
@StaticResource(path = "docs", file = "docs")
@Java(version = Java.Version.JAVA_21)
public final class HelloWorldExt2Extension {

    private final Invoker invoker;

    @Inject
    public HelloWorldExt2Extension(Invoker invoker) {
        this.invoker = invoker;
    }

    @InvokerRequest(InvokerRequest.Type.CUSTOM_TABS)
    public Map<String, String> customTabs() {
        return Map.of("Documentation", "static/docs");
    }

    @InvokerRequest(InvokerRequest.Type.TEST_CONNECTION)
    public void testConnection() {
        // No external system to reach - nothing to validate.
    }
}
