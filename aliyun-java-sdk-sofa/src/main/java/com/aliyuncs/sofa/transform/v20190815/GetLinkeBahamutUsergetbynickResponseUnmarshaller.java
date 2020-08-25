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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbynickResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbynickResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsergetbynickResponseUnmarshaller {

	public static GetLinkeBahamutUsergetbynickResponse unmarshall(GetLinkeBahamutUsergetbynickResponse getLinkeBahamutUsergetbynickResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsergetbynickResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.RequestId"));
		getLinkeBahamutUsergetbynickResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.ResultCode"));
		getLinkeBahamutUsergetbynickResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.ResultMessage"));
		getLinkeBahamutUsergetbynickResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.ErrorMessage"));
		getLinkeBahamutUsergetbynickResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUsergetbynickResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Message"));
		getLinkeBahamutUsergetbynickResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUsergetbynickResponse.ResponseStatusCode"));
		getLinkeBahamutUsergetbynickResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsergetbynickResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Account"));
		result.setConfirmedTime(_ctx.longValue("GetLinkeBahamutUsergetbynickResponse.Result.ConfirmedTime"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutUsergetbynickResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsergetbynickResponse.Result.Deleted"));
		result.setDepartment(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.EmpId"));
		result.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutUsergetbynickResponse.Result.HasConfirmed"));
		result.setId(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Id"));
		result.setLastLogin(_ctx.longValue("GetLinkeBahamutUsergetbynickResponse.Result.LastLogin"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutUsergetbynickResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Name"));
		result.setNick(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Nick"));
		result.setUid(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Uid"));
		result.setUniqueId(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.UniqueId"));
		result.setWw(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsergetbynickResponse.Result.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeBahamutUsergetbynickResponse.Result.Tenants["+ i +"]"));
		}
		result.setTenants(tenants);
		getLinkeBahamutUsergetbynickResponse.setResult(result);
	 
	 	return getLinkeBahamutUsergetbynickResponse;
	}
}