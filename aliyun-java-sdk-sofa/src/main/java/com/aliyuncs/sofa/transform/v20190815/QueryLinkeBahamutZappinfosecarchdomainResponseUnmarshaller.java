/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutZappinfosecarchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutZappinfosecarchdomainResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutZappinfosecarchdomainResponseUnmarshaller {

	public static QueryLinkeBahamutZappinfosecarchdomainResponse unmarshall(QueryLinkeBahamutZappinfosecarchdomainResponse queryLinkeBahamutZappinfosecarchdomainResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutZappinfosecarchdomainResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.RequestId"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.ResultCode"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.ResultMessage"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.ErrorMessage"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Message"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutZappinfosecarchdomainResponse.ResponseStatusCode"));
		queryLinkeBahamutZappinfosecarchdomainResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setBuId(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].BuId"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].ParentId"));
			resultItem.setSynacId(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].SynacId"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("QueryLinkeBahamutZappinfosecarchdomainResponse.Result["+ i +"].TestOwner"));

			result.add(resultItem);
		}
		queryLinkeBahamutZappinfosecarchdomainResponse.setResult(result);
	 
	 	return queryLinkeBahamutZappinfosecarchdomainResponse;
	}
}