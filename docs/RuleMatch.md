
# RuleMatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleId** | **String** |  |  [optional]
**ruleName** | **String** |  |  [optional]
**confidence** | **Double** | Confidence in the rule match, as a percentage.  A higher value means a higher likelihood that the content matches the intent of the rule. |  [optional]
**count** | **Integer** | The number of individual content matches within the rule match. |  [optional]
**contentMatches** | [**List&lt;ContentMatch&gt;**](ContentMatch.md) | A collection of content matches within the overall rule match, if known.  May be empty for certain types of rule. |  [optional]



