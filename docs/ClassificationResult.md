
# ClassificationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policyId** | **String** | The identity of the policy that was matched against. |  [optional]
**policyName** | **String** | The name of the policy that was matched against. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | Suggested tags to represent the policy match.  A client may want to attach the tags to the original document as a way of recording the classification result. |  [optional]
**ruleMatches** | [**List&lt;RuleMatch&gt;**](RuleMatch.md) | Collection of rule matches giving details of how the classification was determined. Optional, so may not be populated. |  [optional]



