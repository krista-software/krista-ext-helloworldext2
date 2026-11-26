# Say Hello

## Overview
Returns a fixed greeting message. Use this request to confirm the extension is installed and callable
from a Krista workflow or agent.

## Request Details
- **Area**: Greeting
- **Type**: QUERY_SYSTEM
- **External API**: N/A — no external system is called; the value is returned directly by the extension.

## Input Parameters
| Parameter | Type | Required | Description |
|---|---|---|---|
| *(none)* | — | — | This request takes no inputs. |

## Output Parameters
| Parameter | Type | Description |
|---|---|---|
| Message | Text | Always the fixed value "Hello World". |

## Example
**Input**: *(none)*
**Output**: `Message = "Hello World"`

## Error Handling
- This request has no external dependency and no failure modes — it always succeeds.
