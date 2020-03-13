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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUsersbyacountResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutUsersbyacountResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutUsersbyacountResponseUnmarshaller {

	public static QueryLinkeBahamutUsersbyacountResponse unmarshall(QueryLinkeBahamutUsersbyacountResponse queryLinkeBahamutUsersbyacountResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutUsersbyacountResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.RequestId"));
		queryLinkeBahamutUsersbyacountResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.ResultCode"));
		queryLinkeBahamutUsersbyacountResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.ResultMessage"));
		queryLinkeBahamutUsersbyacountResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.ErrorMessage"));
		queryLinkeBahamutUsersbyacountResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Message"));
		queryLinkeBahamutUsersbyacountResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutUsersbyacountResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutUsersbyacountResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Account"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].EmpId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("QueryLinkeBahamutUsersbyacountResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		queryLinkeBahamutUsersbyacountResponse.setResult(result);
	 
	 	return queryLinkeBahamutUsersbyacountResponse;
	}
}