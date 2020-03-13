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

import com.aliyuncs.sofa.model.v20190815.AllLinkeBahamutAppmembersResponse;
import com.aliyuncs.sofa.model.v20190815.AllLinkeBahamutAppmembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllLinkeBahamutAppmembersResponseUnmarshaller {

	public static AllLinkeBahamutAppmembersResponse unmarshall(AllLinkeBahamutAppmembersResponse allLinkeBahamutAppmembersResponse, UnmarshallerContext _ctx) {
		
		allLinkeBahamutAppmembersResponse.setRequestId(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.RequestId"));
		allLinkeBahamutAppmembersResponse.setResultCode(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.ResultCode"));
		allLinkeBahamutAppmembersResponse.setResultMessage(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.ResultMessage"));
		allLinkeBahamutAppmembersResponse.setErrorMessage(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.ErrorMessage"));
		allLinkeBahamutAppmembersResponse.setMessage(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Message"));
		allLinkeBahamutAppmembersResponse.setSuccess(_ctx.booleanValue("AllLinkeBahamutAppmembersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AllLinkeBahamutAppmembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Account"));
			resultItem.setCreated(_ctx.longValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].EmpId"));
			resultItem.setId(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("AllLinkeBahamutAppmembersResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		allLinkeBahamutAppmembersResponse.setResult(result);
	 
	 	return allLinkeBahamutAppmembersResponse;
	}
}