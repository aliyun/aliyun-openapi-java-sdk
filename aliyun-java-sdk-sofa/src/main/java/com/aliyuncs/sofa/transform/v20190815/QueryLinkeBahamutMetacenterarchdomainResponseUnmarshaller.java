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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutMetacenterarchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutMetacenterarchdomainResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutMetacenterarchdomainResponseUnmarshaller {

	public static QueryLinkeBahamutMetacenterarchdomainResponse unmarshall(QueryLinkeBahamutMetacenterarchdomainResponse queryLinkeBahamutMetacenterarchdomainResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutMetacenterarchdomainResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.RequestId"));
		queryLinkeBahamutMetacenterarchdomainResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.ResultCode"));
		queryLinkeBahamutMetacenterarchdomainResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.ResultMessage"));
		queryLinkeBahamutMetacenterarchdomainResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.ErrorMessage"));
		queryLinkeBahamutMetacenterarchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutMetacenterarchdomainResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Message"));
		queryLinkeBahamutMetacenterarchdomainResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutMetacenterarchdomainResponse.ResponseStatusCode"));
		queryLinkeBahamutMetacenterarchdomainResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutMetacenterarchdomainResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setBuId(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].BuId"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].ParentId"));
			resultItem.setSynacId(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].SynacId"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("QueryLinkeBahamutMetacenterarchdomainResponse.Result["+ i +"].TestOwner"));

			result.add(resultItem);
		}
		queryLinkeBahamutMetacenterarchdomainResponse.setResult(result);
	 
	 	return queryLinkeBahamutMetacenterarchdomainResponse;
	}
}