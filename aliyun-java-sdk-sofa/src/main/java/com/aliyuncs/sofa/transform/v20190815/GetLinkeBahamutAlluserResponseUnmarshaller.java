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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAlluserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAlluserResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAlluserResponseUnmarshaller {

	public static GetLinkeBahamutAlluserResponse unmarshall(GetLinkeBahamutAlluserResponse getLinkeBahamutAlluserResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAlluserResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAlluserResponse.RequestId"));
		getLinkeBahamutAlluserResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAlluserResponse.ResultCode"));
		getLinkeBahamutAlluserResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAlluserResponse.ResultMessage"));
		getLinkeBahamutAlluserResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAlluserResponse.ErrorMessage"));
		getLinkeBahamutAlluserResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAlluserResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAlluserResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Message"));
		getLinkeBahamutAlluserResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAlluserResponse.ResponseStatusCode"));
		getLinkeBahamutAlluserResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAlluserResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAlluserResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("GetLinkeBahamutAlluserResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		getLinkeBahamutAlluserResponse.setResult(result);
	 
	 	return getLinkeBahamutAlluserResponse;
	}
}