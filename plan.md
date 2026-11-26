# Implementation Plan — HelloWorldExt2

## Summary
A minimal, self-contained Krista extension with a single capability: a request that takes no
inputs and always returns the fixed text **"Hello World"**. It does not call any external system,
so it needs no credentials and no authentication setup.

| | |
|---|---|
| Extension title | HelloWorldExt2 |
| Module name | `helloworldext2` |
| Version | 1.0.0 |
| Package | `app.krista.extensions.zzztestsandbox.zzzdeleteme.helloworldext2` |
| Ecosystem | ZZZ Test Sandbox |
| Domain | ZZZ Delete Me |
| Auth pattern | **NONE** (confirmed by the user) |

## Authentication
The user explicitly chose **"none"** in the wizard. This extension makes no outbound calls to any
external system, so that's the correct choice — there are no secured connection fields and no
Authentication tab requirement. The Setup screen (if the framework scaffolds one by convention)
will have nothing to configure and no real connection to test.

## Area: Greeting

| Request | Type | Inputs | Output | External endpoint | Reused or new |
|---|---|---|---|---|---|
| Say Hello | QUERY_SYSTEM | *(none)* | `Message` (Text) = `"Hello World"` | N/A — no external call, value returned directly | **New** |

Tests planned:
- Calling **Say Hello** with no inputs returns `Message = "Hello World"`.
- The response contains only the `Message` field and no other data.

No `@Entity` is created: the output is a single ad-hoc scalar message, not a domain object with a
stable shape, so per the framework's field-type guidance it's declared as a typed `Text` field
rather than an `Entity`/`FreeForm`.

## Capabilities
| Capability | Included? |
|---|---|
| Entity search | No |
| Webhooks | No |
| MCP (`tool = true`) | No |
| Solutions tab | No |
| File handling | No |

None of these apply — there is exactly one static, inputless request.

## Domain reuse
`domain-catalog.json` reported `"found": false` for **ZZZ Test Sandbox / ZZZ Delete Me** — this
ecosystem/domain has never been published to the catalog, so there is nothing existing to compare
against or reuse. The one request in this build ("Say Hello") is **entirely new**.

## Placeholder IDs — must replace before deploy
Because this ecosystem/domain combination has no prior published entries, the following will be
minted as **stable placeholder values** so the code compiles, and must be swapped for the real
Krista-registered values before this extension can bind/deploy:
- `@Domain` id (`domainId`)
- `ecosystemId`
- `ecosystemVersion`

These are flagged here and will be flagged again in the final build report.
