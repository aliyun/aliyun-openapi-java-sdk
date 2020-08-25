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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutVcsmembersResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutVcsmembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutVcsmembersResponseUnmarshaller {

	public static ListLinkeBahamutVcsmembersResponse unmarshall(ListLinkeBahamutVcsmembersResponse listLinkeBahamutVcsmembersResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutVcsmembersResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.RequestId"));
		listLinkeBahamutVcsmembersResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.ResultCode"));
		listLinkeBahamutVcsmembersResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.ResultMessage"));
		listLinkeBahamutVcsmembersResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.ErrorMessage"));
		listLinkeBahamutVcsmembersResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.ErrorMsgParamsMap"));
		listLinkeBahamutVcsmembersResponse.setMessage(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Message"));
		listLinkeBahamutVcsmembersResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutVcsmembersResponse.ResponseStatusCode"));
		listLinkeBahamutVcsmembersResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutVcsmembersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutVcsmembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("ListLinkeBahamutVcsmembersResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		listLinkeBahamutVcsmembersResponse.setResult(result);
	 
	 	return listLinkeBahamutVcsmembersResponse;
	}
}