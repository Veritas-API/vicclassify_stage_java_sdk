# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.VeritasInformationClassifierVICApi;

import java.io.File;
import java.util.*;

public class VeritasInformationClassifierVICApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: Bearer
        HttpBasicAuth Bearer = (HttpBasicAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setUsername("YOUR USERNAME");
        Bearer.setPassword("YOUR PASSWORD");

        VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
        String tenantId = "tenantId_example"; // String | The tenant identifier
        List<String> policyId = Arrays.asList("policyId_example"); // List<String> | One or more policies to use for the classification.  If not specified (and the 'policy' parameter is not specified), the tenant's default policies are used.
        String policy = "policy_example"; // String | A policy to use for the classification (json).  Normally the policies are specified by policyId, which is a reference to a stored policy.  However this option allows a policy to be supplied by value, which is useful (for example) for testing policies before storing them.
        List<String> metadata = Arrays.asList("metadata_example"); // List<String> | One or more items of document metadata to use for classification (along with any content provided).   Each item of metadata is specified as a field/value pair separated by a colon, for example auth:Sue Bloggs.   Note that tools such as Swagger may send each field/value pair as a separate form part, but this is not necessary. It is more efficient to send each pair LF-delimited in a single form part.
        String metadataFile = "metadataFile_example"; // String | Full path to text file containing metadata to use for classification.  Each piece of metadata is specified as a field/value pair separated by a colon, for example auth:Sue Bloggs.  Multiple items of metadata are separated by a line feed (or CRLF). Multi-valued metadata must be specified as separate field/value pairs, for example recp:Sue\\nrecp:Bob.  The text MUST be UTF-8 or UTF-16LE.  The file SHOULD have a byte order mark indicating the encoding.  If the encoding cannot be determined, UTF-8 is assumed.
        String documentName = "documentName_example"; // String | The document name and extension or full path. If known should include at least name and/or . prefixed extension.   If not supplying the document content in the request body then the document's full and accessible path is required.
        Boolean includeMatches = true; // Boolean | If true, the response contains details about the document matches used to determine the classification.  This may have a significant impact on classification performance.
        Integer maxContentMatchesPerRule = 56; // Integer | The maximum number of content matches to include in the match details.   Only relevant if includeMatches is true.   This setting does not affect classification - it only affects the verbosity of the match information returned with the results.
        Boolean skipTextExtraction = true; // Boolean | If true, the content to classify is assumed to be text and no text extraction is performed.   **This optimization should only be used when the client is sure that the content is text.**   The text MUST be UTF-8 or UTF-16LE. If the content is specified by reference to a file, the file SHOULD have a byte order mark indicating the encoding.  If the encoding cannot be determined, UTF-8 is assumed.
        Boolean skipWhitespaceCollapse = true; // Boolean | If true, the content to classify does not have its whitespace collapsed before classification.   **This optimization should only be used when the client is sure that whitespace has already been collapsed.**   Whitespace collapsing means that all sequences or two or more whitespace characters are replaced by a single space character.   This flag is only valid is skipTextExtraction is true.
        File file = new File("/path/to/file.txt"); // File | The document's binary or text content. Optional when documentName is the document's full and accessible path.   If multiple files are specified, the first is considered the primary document and the remaining files as attachments.
        try {
            ClassificationResultCollection result = apiInstance.classify(tenantId, policyId, policy, metadata, metadataFile, documentName, includeMatches, maxContentMatchesPerRule, skipTextExtraction, skipWhitespaceCollapse, file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VeritasInformationClassifierVICApi#classify");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://veritas-nonprod-stage.apigee.net/vic/v1/classification*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*VeritasInformationClassifierVICApi* | [**classify**](docs/VeritasInformationClassifierVICApi.md#classify) | **POST** /classify | Determine a document&#39;s classification(s)


## Documentation for Models

 - [ClassificationPolicy](docs/ClassificationPolicy.md)
 - [ClassificationResult](docs/ClassificationResult.md)
 - [ClassificationResultCollection](docs/ClassificationResultCollection.md)
 - [ContentMatch](docs/ContentMatch.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [RuleMatch](docs/RuleMatch.md)
 - [Tag](docs/Tag.md)
 - [TagProperty](docs/TagProperty.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



