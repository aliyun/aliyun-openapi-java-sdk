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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminuserroleResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminuserroleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminuserroleResponseUnmarshaller {

	public static AddLinkeBahamutAdminuserroleResponse unmarshall(AddLinkeBahamutAdminuserroleResponse addLinkeBahamutAdminuserroleResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminuserroleResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.RequestId"));
		addLinkeBahamutAdminuserroleResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.ResultCode"));
		addLinkeBahamutAdminuserroleResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.ResultMessage"));
		addLinkeBahamutAdminuserroleResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.ErrorMessage"));
		addLinkeBahamutAdminuserroleResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminuserroleResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.Message"));
		addLinkeBahamutAdminuserroleResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminuserroleResponse.ResponseStatusCode"));
		addLinkeBahamutAdminuserroleResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminuserroleResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.Result.Account"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdminuserroleResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdminuserroleResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdminuserroleResponse.Result.LastModified"));
		result.setRole(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.Result.Role"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutAdminuserroleResponse.Result.Tenant"));
		addLinkeBahamutAdminuserroleResponse.setResult(result);
	 
	 	return addLinkeBahamutAdminuserroleResponse;
	}
}