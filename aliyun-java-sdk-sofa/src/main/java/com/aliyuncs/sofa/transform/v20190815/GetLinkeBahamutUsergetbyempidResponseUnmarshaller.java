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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyempidResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyempidResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsergetbyempidResponseUnmarshaller {

	public static GetLinkeBahamutUsergetbyempidResponse unmarshall(GetLinkeBahamutUsergetbyempidResponse getLinkeBahamutUsergetbyempidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsergetbyempidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.RequestId"));
		getLinkeBahamutUsergetbyempidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.ResultCode"));
		getLinkeBahamutUsergetbyempidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.ResultMessage"));
		getLinkeBahamutUsergetbyempidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.ErrorMessage"));
		getLinkeBahamutUsergetbyempidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUsergetbyempidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Message"));
		getLinkeBahamutUsergetbyempidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUsergetbyempidResponse.ResponseStatusCode"));
		getLinkeBahamutUsergetbyempidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsergetbyempidResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Account"));
		result.setConfirmedTime(_ctx.longValue("GetLinkeBahamutUsergetbyempidResponse.Result.ConfirmedTime"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutUsergetbyempidResponse.Result.Created"));
		result.setCustomer(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Customer"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsergetbyempidResponse.Result.Deleted"));
		result.setDepartment(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.EmpId"));
		result.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutUsergetbyempidResponse.Result.HasConfirmed"));
		result.setId(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Id"));
		result.setLastLogin(_ctx.longValue("GetLinkeBahamutUsergetbyempidResponse.Result.LastLogin"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutUsergetbyempidResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Name"));
		result.setNick(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Nick"));
		result.setUid(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Uid"));
		result.setUniqueId(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.UniqueId"));
		result.setWw(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsergetbyempidResponse.Result.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeBahamutUsergetbyempidResponse.Result.Tenants["+ i +"]"));
		}
		result.setTenants(tenants);
		getLinkeBahamutUsergetbyempidResponse.setResult(result);
	 
	 	return getLinkeBahamutUsergetbyempidResponse;
	}
}