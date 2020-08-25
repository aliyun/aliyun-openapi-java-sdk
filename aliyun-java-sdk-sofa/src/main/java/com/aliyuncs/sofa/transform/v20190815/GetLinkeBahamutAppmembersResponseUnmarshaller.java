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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppmembersResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppmembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppmembersResponseUnmarshaller {

	public static GetLinkeBahamutAppmembersResponse unmarshall(GetLinkeBahamutAppmembersResponse getLinkeBahamutAppmembersResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppmembersResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.RequestId"));
		getLinkeBahamutAppmembersResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.ResultCode"));
		getLinkeBahamutAppmembersResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.ResultMessage"));
		getLinkeBahamutAppmembersResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.ErrorMessage"));
		getLinkeBahamutAppmembersResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppmembersResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Message"));
		getLinkeBahamutAppmembersResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppmembersResponse.ResponseStatusCode"));
		getLinkeBahamutAppmembersResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppmembersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppmembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("GetLinkeBahamutAppmembersResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		getLinkeBahamutAppmembersResponse.setResult(result);
	 
	 	return getLinkeBahamutAppmembersResponse;
	}
}