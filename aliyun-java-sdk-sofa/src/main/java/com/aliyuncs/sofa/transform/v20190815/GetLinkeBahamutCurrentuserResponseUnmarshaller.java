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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCurrentuserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCurrentuserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCurrentuserResponseUnmarshaller {

	public static GetLinkeBahamutCurrentuserResponse unmarshall(GetLinkeBahamutCurrentuserResponse getLinkeBahamutCurrentuserResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCurrentuserResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.RequestId"));
		getLinkeBahamutCurrentuserResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.ResultCode"));
		getLinkeBahamutCurrentuserResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.ResultMessage"));
		getLinkeBahamutCurrentuserResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.ErrorMessage"));
		getLinkeBahamutCurrentuserResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCurrentuserResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Message"));
		getLinkeBahamutCurrentuserResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCurrentuserResponse.ResponseStatusCode"));
		getLinkeBahamutCurrentuserResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCurrentuserResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Account"));
		result.setConfirmedTime(_ctx.longValue("GetLinkeBahamutCurrentuserResponse.Result.ConfirmedTime"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutCurrentuserResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutCurrentuserResponse.Result.Deleted"));
		result.setDepartment(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.EmpId"));
		result.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutCurrentuserResponse.Result.HasConfirmed"));
		result.setId(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Id"));
		result.setLastLogin(_ctx.longValue("GetLinkeBahamutCurrentuserResponse.Result.LastLogin"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutCurrentuserResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Name"));
		result.setNick(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Nick"));
		result.setUid(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Uid"));
		result.setUniqueId(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.UniqueId"));
		result.setWw(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutCurrentuserResponse.Result.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeBahamutCurrentuserResponse.Result.Tenants["+ i +"]"));
		}
		result.setTenants(tenants);
		getLinkeBahamutCurrentuserResponse.setResult(result);
	 
	 	return getLinkeBahamutCurrentuserResponse;
	}
}