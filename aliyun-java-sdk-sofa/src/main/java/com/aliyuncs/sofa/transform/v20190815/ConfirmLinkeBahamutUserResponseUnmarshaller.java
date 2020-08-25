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

import com.aliyuncs.sofa.model.v20190815.ConfirmLinkeBahamutUserResponse;
import com.aliyuncs.sofa.model.v20190815.ConfirmLinkeBahamutUserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmLinkeBahamutUserResponseUnmarshaller {

	public static ConfirmLinkeBahamutUserResponse unmarshall(ConfirmLinkeBahamutUserResponse confirmLinkeBahamutUserResponse, UnmarshallerContext _ctx) {
		
		confirmLinkeBahamutUserResponse.setRequestId(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.RequestId"));
		confirmLinkeBahamutUserResponse.setResultCode(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.ResultCode"));
		confirmLinkeBahamutUserResponse.setResultMessage(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.ResultMessage"));
		confirmLinkeBahamutUserResponse.setErrorMessage(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.ErrorMessage"));
		confirmLinkeBahamutUserResponse.setErrorMsgParamsMap(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.ErrorMsgParamsMap"));
		confirmLinkeBahamutUserResponse.setMessage(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Message"));
		confirmLinkeBahamutUserResponse.setResponseStatusCode(_ctx.longValue("ConfirmLinkeBahamutUserResponse.ResponseStatusCode"));
		confirmLinkeBahamutUserResponse.setSuccess(_ctx.booleanValue("ConfirmLinkeBahamutUserResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Account"));
		result.setConfirmedTime(_ctx.longValue("ConfirmLinkeBahamutUserResponse.Result.ConfirmedTime"));
		result.setCreated(_ctx.longValue("ConfirmLinkeBahamutUserResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("ConfirmLinkeBahamutUserResponse.Result.Deleted"));
		result.setDepartment(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.EmpId"));
		result.setHasConfirmed(_ctx.booleanValue("ConfirmLinkeBahamutUserResponse.Result.HasConfirmed"));
		result.setId(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Id"));
		result.setLastLogin(_ctx.longValue("ConfirmLinkeBahamutUserResponse.Result.LastLogin"));
		result.setLastModified(_ctx.longValue("ConfirmLinkeBahamutUserResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Name"));
		result.setNick(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Nick"));
		result.setUid(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Uid"));
		result.setUniqueId(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.UniqueId"));
		result.setWw(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ConfirmLinkeBahamutUserResponse.Result.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("ConfirmLinkeBahamutUserResponse.Result.Tenants["+ i +"]"));
		}
		result.setTenants(tenants);
		confirmLinkeBahamutUserResponse.setResult(result);
	 
	 	return confirmLinkeBahamutUserResponse;
	}
}