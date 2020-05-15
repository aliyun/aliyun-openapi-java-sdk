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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsertokenResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsertokenResponse.Result;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsertokenResponse.Result.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsertokenResponseUnmarshaller {

	public static GetLinkeBahamutUsertokenResponse unmarshall(GetLinkeBahamutUsertokenResponse getLinkeBahamutUsertokenResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsertokenResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.RequestId"));
		getLinkeBahamutUsertokenResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.ResultCode"));
		getLinkeBahamutUsertokenResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.ResultMessage"));
		getLinkeBahamutUsertokenResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.ErrorMessage"));
		getLinkeBahamutUsertokenResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Message"));
		getLinkeBahamutUsertokenResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsertokenResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.Account"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutUsertokenResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsertokenResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutUsertokenResponse.Result.LastModified"));
		result.setToken(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.Token"));

		User user = new User();
		user.setAccount(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Account"));
		user.setCreated(_ctx.longValue("GetLinkeBahamutUsertokenResponse.Result.User.Created"));
		user.setCustomer(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Customer"));
		user.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsertokenResponse.Result.User.Deleted"));
		user.setDepartment(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Department"));
		user.setEmail(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Email"));
		user.setEmpId(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.EmpId"));
		user.setId(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Id"));
		user.setLastLogin(_ctx.longValue("GetLinkeBahamutUsertokenResponse.Result.User.LastLogin"));
		user.setLastModified(_ctx.longValue("GetLinkeBahamutUsertokenResponse.Result.User.LastModified"));
		user.setName(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Name"));
		user.setNick(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Nick"));
		user.setUid(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Uid"));
		user.setUniqueId(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.UniqueId"));
		user.setWw(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsertokenResponse.Result.User.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeBahamutUsertokenResponse.Result.User.Tenants["+ i +"]"));
		}
		user.setTenants(tenants);
		result.setUser(user);
		getLinkeBahamutUsertokenResponse.setResult(result);
	 
	 	return getLinkeBahamutUsertokenResponse;
	}
}