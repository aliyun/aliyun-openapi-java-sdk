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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminuserroleResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminuserroleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminuserroleResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminuserroleResponse unmarshall(UpdateLinkeBahamutAdminuserroleResponse updateLinkeBahamutAdminuserroleResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminuserroleResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.RequestId"));
		updateLinkeBahamutAdminuserroleResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.ResultCode"));
		updateLinkeBahamutAdminuserroleResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.ResultMessage"));
		updateLinkeBahamutAdminuserroleResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.ErrorMessage"));
		updateLinkeBahamutAdminuserroleResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminuserroleResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.Message"));
		updateLinkeBahamutAdminuserroleResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminuserroleResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminuserroleResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminuserroleResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.Result.Account"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAdminuserroleResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAdminuserroleResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAdminuserroleResponse.Result.LastModified"));
		result.setRole(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.Result.Role"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutAdminuserroleResponse.Result.Tenant"));
		updateLinkeBahamutAdminuserroleResponse.setResult(result);
	 
	 	return updateLinkeBahamutAdminuserroleResponse;
	}
}