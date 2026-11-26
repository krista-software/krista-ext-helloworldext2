# Test Connection

## Overview
Confirms the extension is installed and loaded correctly. Since HelloWorldExt2 has no external system
to reach, this always succeeds.

## Request Details
- **Area**: Setup
- **Type**: QUERY_SYSTEM
- **External API**: N/A — no external system is called.
- **Ask Agent (MCP)**: Enabled (callable by the Krista AI agent)

## Input Parameters
| Parameter | Type | Required | Description |
|---|---|---|---|
| *(none)* | — | — | This request takes no inputs. |

## Output Parameters
| Parameter | Type | Description |
|---|---|---|
| Success | Boolean | Always `true` — there is no external connectivity to fail. |
| Message | Text | A confirmation message. |

## Example
**Input**: *(none)*
**Output**: `Success = true`, `Message = "Connected. This extension has no external system to reach."`

## Error Handling
- This request has no external dependency and no failure modes — it always succeeds.
