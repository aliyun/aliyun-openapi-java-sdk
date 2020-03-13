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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutArchdomainsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutArchdomainsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutArchdomainsResponseUnmarshaller {

	public static QueryLinkeBahamutArchdomainsResponse unmarshall(QueryLinkeBahamutArchdomainsResponse queryLinkeBahamutArchdomainsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutArchdomainsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.RequestId"));
		queryLinkeBahamutArchdomainsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.ResultCode"));
		queryLinkeBahamutArchdomainsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.ResultMessage"));
		queryLinkeBahamutArchdomainsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.ErrorMessage"));
		queryLinkeBahamutArchdomainsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutArchdomainsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Message"));
		queryLinkeBahamutArchdomainsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutArchdomainsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutArchdomainsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBakOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].BakOwner"));
			resultItem.setBakTestOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].BakTestOwner"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Description"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].ExternalId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].LastModified"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Name"));
			resultItem.setOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].Owner"));
			resultItem.setParentId(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].ParentId"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].TenantId"));
			resultItem.setTestOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].TestOwner"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> linkcGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].LinkcGroups.Length"); j++) {
				linkcGroups.add(_ctx.stringValue("QueryLinkeBahamutArchdomainsResponse.Result["+ i +"].LinkcGroups["+ j +"]"));
			}
			resultItem.setLinkcGroups(linkcGroups);

			result.add(resultItem);
		}
		queryLinkeBahamutArchdomainsResponse.setResult(result);
	 
	 	return queryLinkeBahamutArchdomainsResponse;
	}
}