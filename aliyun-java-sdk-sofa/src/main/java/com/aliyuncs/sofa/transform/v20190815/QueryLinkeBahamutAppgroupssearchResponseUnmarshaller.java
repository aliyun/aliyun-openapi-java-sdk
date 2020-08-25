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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppgroupssearchResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppgroupssearchResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppgroupssearchResponseUnmarshaller {

	public static QueryLinkeBahamutAppgroupssearchResponse unmarshall(QueryLinkeBahamutAppgroupssearchResponse queryLinkeBahamutAppgroupssearchResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppgroupssearchResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.RequestId"));
		queryLinkeBahamutAppgroupssearchResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.ResultCode"));
		queryLinkeBahamutAppgroupssearchResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.ResultMessage"));
		queryLinkeBahamutAppgroupssearchResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.ErrorMessage"));
		queryLinkeBahamutAppgroupssearchResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppgroupssearchResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Message"));
		queryLinkeBahamutAppgroupssearchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppgroupssearchResponse.ResponseStatusCode"));
		queryLinkeBahamutAppgroupssearchResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppgroupssearchResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppgroupssearchResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Creator"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].LastModified"));
			resultItem.setModifiyUser(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].ModifiyUser"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Name"));
			resultItem.setRemark(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Remark"));
			resultItem.setTenant(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Tenant"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Type"));

			List<String> admins = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Admins.Length"); j++) {
				admins.add(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].Admins["+ j +"]"));
			}
			resultItem.setAdmins(admins);

			List<String> appList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].AppList.Length"); j++) {
				appList.add(_ctx.stringValue("QueryLinkeBahamutAppgroupssearchResponse.Result["+ i +"].AppList["+ j +"]"));
			}
			resultItem.setAppList(appList);

			result.add(resultItem);
		}
		queryLinkeBahamutAppgroupssearchResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppgroupssearchResponse;
	}
}