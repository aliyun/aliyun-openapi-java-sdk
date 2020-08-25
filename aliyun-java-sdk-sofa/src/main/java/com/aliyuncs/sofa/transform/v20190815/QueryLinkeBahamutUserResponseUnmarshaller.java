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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUserResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUserResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutUserResponseUnmarshaller {

	public static QueryLinkeBahamutUserResponse unmarshall(QueryLinkeBahamutUserResponse queryLinkeBahamutUserResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutUserResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutUserResponse.RequestId"));
		queryLinkeBahamutUserResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutUserResponse.ResultCode"));
		queryLinkeBahamutUserResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutUserResponse.ResultMessage"));
		queryLinkeBahamutUserResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutUserResponse.ErrorMessage"));
		queryLinkeBahamutUserResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutUserResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutUserResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutUserResponse.Message"));
		queryLinkeBahamutUserResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutUserResponse.ResponseStatusCode"));
		queryLinkeBahamutUserResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutUserResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutUserResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("QueryLinkeBahamutUserResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("QueryLinkeBahamutUserResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("QueryLinkeBahamutUserResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutUserResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("QueryLinkeBahamutUserResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		queryLinkeBahamutUserResponse.setResult(result);
	 
	 	return queryLinkeBahamutUserResponse;
	}
}