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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyaccountResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyaccountResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsergetbyaccountResponseUnmarshaller {

	public static GetLinkeBahamutUsergetbyaccountResponse unmarshall(GetLinkeBahamutUsergetbyaccountResponse getLinkeBahamutUsergetbyaccountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsergetbyaccountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.RequestId"));
		getLinkeBahamutUsergetbyaccountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.ResultCode"));
		getLinkeBahamutUsergetbyaccountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.ResultMessage"));
		getLinkeBahamutUsergetbyaccountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.ErrorMessage"));
		getLinkeBahamutUsergetbyaccountResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUsergetbyaccountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Message"));
		getLinkeBahamutUsergetbyaccountResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUsergetbyaccountResponse.ResponseStatusCode"));
		getLinkeBahamutUsergetbyaccountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsergetbyaccountResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Account"));
		result.setConfirmedTime(_ctx.longValue("GetLinkeBahamutUsergetbyaccountResponse.Result.ConfirmedTime"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Deleted"));
		result.setDepartment(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.EmpId"));
		result.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutUsergetbyaccountResponse.Result.HasConfirmed"));
		result.setId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Id"));
		result.setLastLogin(_ctx.longValue("GetLinkeBahamutUsergetbyaccountResponse.Result.LastLogin"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutUsergetbyaccountResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Name"));
		result.setNick(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Nick"));
		result.setUid(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Uid"));
		result.setUniqueId(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.UniqueId"));
		result.setWw(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeBahamutUsergetbyaccountResponse.Result.Tenants["+ i +"]"));
		}
		result.setTenants(tenants);
		getLinkeBahamutUsergetbyaccountResponse.setResult(result);
	 
	 	return getLinkeBahamutUsergetbyaccountResponse;
	}
}