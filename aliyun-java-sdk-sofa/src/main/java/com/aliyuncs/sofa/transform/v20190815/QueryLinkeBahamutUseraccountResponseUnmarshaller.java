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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUseraccountResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUseraccountResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutUseraccountResponseUnmarshaller {

	public static QueryLinkeBahamutUseraccountResponse unmarshall(QueryLinkeBahamutUseraccountResponse queryLinkeBahamutUseraccountResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutUseraccountResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.RequestId"));
		queryLinkeBahamutUseraccountResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.ResultCode"));
		queryLinkeBahamutUseraccountResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.ResultMessage"));
		queryLinkeBahamutUseraccountResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.ErrorMessage"));
		queryLinkeBahamutUseraccountResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutUseraccountResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Message"));
		queryLinkeBahamutUseraccountResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutUseraccountResponse.ResponseStatusCode"));
		queryLinkeBahamutUseraccountResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutUseraccountResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutUseraccountResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("QueryLinkeBahamutUseraccountResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		queryLinkeBahamutUseraccountResponse.setResult(result);
	 
	 	return queryLinkeBahamutUseraccountResponse;
	}
}