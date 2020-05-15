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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUsersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUsersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutUsersResponseUnmarshaller {

	public static QueryLinkeBahamutUsersResponse unmarshall(QueryLinkeBahamutUsersResponse queryLinkeBahamutUsersResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutUsersResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutUsersResponse.RequestId"));
		queryLinkeBahamutUsersResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutUsersResponse.ResultCode"));
		queryLinkeBahamutUsersResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutUsersResponse.ResultMessage"));
		queryLinkeBahamutUsersResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutUsersResponse.ErrorMessage"));
		queryLinkeBahamutUsersResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Message"));
		queryLinkeBahamutUsersResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutUsersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutUsersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Account"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].EmpId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("QueryLinkeBahamutUsersResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		queryLinkeBahamutUsersResponse.setResult(result);
	 
	 	return queryLinkeBahamutUsersResponse;
	}
}