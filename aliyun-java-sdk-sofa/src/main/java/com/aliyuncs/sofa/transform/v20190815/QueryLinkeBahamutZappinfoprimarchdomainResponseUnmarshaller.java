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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutZappinfoprimarchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutZappinfoprimarchdomainResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutZappinfoprimarchdomainResponseUnmarshaller {

	public static QueryLinkeBahamutZappinfoprimarchdomainResponse unmarshall(QueryLinkeBahamutZappinfoprimarchdomainResponse queryLinkeBahamutZappinfoprimarchdomainResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutZappinfoprimarchdomainResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.RequestId"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.ResultCode"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.ResultMessage"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.ErrorMessage"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Message"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.ResponseStatusCode"));
		queryLinkeBahamutZappinfoprimarchdomainResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setBuId(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].BuId"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].ParentId"));
			resultItem.setSynacId(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].SynacId"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("QueryLinkeBahamutZappinfoprimarchdomainResponse.Result["+ i +"].TestOwner"));

			result.add(resultItem);
		}
		queryLinkeBahamutZappinfoprimarchdomainResponse.setResult(result);
	 
	 	return queryLinkeBahamutZappinfoprimarchdomainResponse;
	}
}