
# ClassificationPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policyId** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**policyHash** | **String** | A hash of the policy body and any associated custom patterns.  This can be used to track significant changes to the policy that may warrant re-classification of documents.  Note that built-in pattern bodies are NOT included in the hash, as they are not expected to change significantly over time. |  [optional]



