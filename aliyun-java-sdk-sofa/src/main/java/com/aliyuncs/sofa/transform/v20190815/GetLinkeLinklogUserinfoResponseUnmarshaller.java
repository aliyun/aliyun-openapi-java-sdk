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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogUserinfoResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogUserinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogUserinfoResponseUnmarshaller {

	public static GetLinkeLinklogUserinfoResponse unmarshall(GetLinkeLinklogUserinfoResponse getLinkeLinklogUserinfoResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogUserinfoResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.RequestId"));
		getLinkeLinklogUserinfoResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.ResultCode"));
		getLinkeLinklogUserinfoResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.ResultMessage"));
		getLinkeLinklogUserinfoResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.ErrorMsg"));
		getLinkeLinklogUserinfoResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.ResponseContentRange"));
		getLinkeLinklogUserinfoResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.ResponseContentType"));
		getLinkeLinklogUserinfoResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogUserinfoResponse.ResponseStatusCode"));
		getLinkeLinklogUserinfoResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogUserinfoResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Account"));
		result.setCustomer(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Customer"));
		result.setDepartment(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Department"));
		result.setEmail(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Email"));
		result.setEmpId(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.EmpId"));
		result.setLastLogin(_ctx.longValue("GetLinkeLinklogUserinfoResponse.Result.LastLogin"));
		result.setName(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Name"));
		result.setNick(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Nick"));
		result.setTenant(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Tenant"));
		result.setUserAuthType(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.UserAuthType"));
		result.setWorkspace(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Workspace"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogUserinfoResponse.Result.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeLinklogUserinfoResponse.Result.Tenants["+ i +"]"));
		}
		result.setTenants(tenants);
		getLinkeLinklogUserinfoResponse.setResult(result);
	 
	 	return getLinkeLinklogUserinfoResponse;
	}
}