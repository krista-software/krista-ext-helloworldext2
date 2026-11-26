# Health Check

## Overview
Reports basic JVM health for the running extension instance.

## Request Details
- **Area**: Setup
- **Type**: CHANGE_SYSTEM
- **External API**: N/A — no external system is called.
- **Ask Agent (MCP)**: Enabled (callable by the Krista AI agent)

## Input Parameters
| Parameter | Type | Required | Description |
|---|---|---|---|
| *(none)* | — | — | This request takes no inputs. |

## Output Parameters
| Parameter | Type | Description |
|---|---|---|
| Is Healthy | Boolean | Always `true` for this extension. |
| Heap Used MB | Number | Current JVM heap usage, in megabytes. |
| Details | Text | A short status message. |

## Example
**Input**: *(none)*
**Output**: `Is Healthy = true`, `Heap Used MB = 128.0`, `Details = "OK"`

## Error Handling
- This request has no external dependency and no failure modes — it always succeeds.
