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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppResponse.Paginator;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppResponseUnmarshaller {

	public static QueryLinkeBahamutAppResponse unmarshall(QueryLinkeBahamutAppResponse queryLinkeBahamutAppResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppResponse.RequestId"));
		queryLinkeBahamutAppResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppResponse.ResultCode"));
		queryLinkeBahamutAppResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppResponse.ResultMessage"));
		queryLinkeBahamutAppResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppResponse.ErrorMessage"));
		queryLinkeBahamutAppResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppResponse.Message"));
		queryLinkeBahamutAppResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppResponse.ResponseStatusCode"));
		queryLinkeBahamutAppResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("QueryLinkeBahamutAppResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("QueryLinkeBahamutAppResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("QueryLinkeBahamutAppResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("QueryLinkeBahamutAppResponse.Paginator.PageSize"));
		queryLinkeBahamutAppResponse.setPaginator(paginator);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroupName(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].AppGroupName"));
			resultItem.setAppType(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].AppType"));
			resultItem.setFirstArchDomain(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].FirstArchDomain"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].Name"));
			resultItem.setRecentLiveTime(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].RecentLiveTime"));
			resultItem.setSecondArchDomain(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].SecondArchDomain"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].Status"));

			List<String> owners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppResponse.Result["+ i +"].Owners.Length"); j++) {
				owners.add(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].Owners["+ j +"]"));
			}
			resultItem.setOwners(owners);

			List<String> ownerObjs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppResponse.Result["+ i +"].OwnerObjs.Length"); j++) {
				ownerObjs.add(_ctx.stringValue("QueryLinkeBahamutAppResponse.Result["+ i +"].OwnerObjs["+ j +"]"));
			}
			resultItem.setOwnerObjs(ownerObjs);

			result.add(resultItem);
		}
		queryLinkeBahamutAppResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppResponse;
	}
}