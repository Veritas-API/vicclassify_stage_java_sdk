
# ContentMatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset** | **Long** | The offset (in characters) of the match within the classified text.  The classified text is the text conversion of the original document, so this offset may not be directly usable by a client with only access to the original document. |  [optional]
**length** | **Long** | The length of the content match, in characters. |  [optional]
**location** | **String** |  |  [optional]
**content** | **String** | Content that matched the rule (e.g. a word or phrase), where available. |  [optional]
**context** | **String** | The matching content with some surrounding context, where available. |  [optional]



