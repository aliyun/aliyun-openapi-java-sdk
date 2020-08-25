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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutApprepoResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutApprepoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutApprepoResponseUnmarshaller {

	public static UpdateLinkeBahamutApprepoResponse unmarshall(UpdateLinkeBahamutApprepoResponse updateLinkeBahamutApprepoResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutApprepoResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.RequestId"));
		updateLinkeBahamutApprepoResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.ResultCode"));
		updateLinkeBahamutApprepoResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.ResultMessage"));
		updateLinkeBahamutApprepoResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.ErrorMessage"));
		updateLinkeBahamutApprepoResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutApprepoResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Message"));
		updateLinkeBahamutApprepoResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutApprepoResponse.ResponseStatusCode"));
		updateLinkeBahamutApprepoResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutApprepoResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Result.AppName"));
		result.setReadNeedOwnerAudit(_ctx.booleanValue("UpdateLinkeBahamutApprepoResponse.Result.ReadNeedOwnerAudit"));
		result.setReadSecLevel(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Result.ReadSecLevel"));
		result.setRepoName(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Result.RepoName"));
		result.setRepoUrl(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Result.RepoUrl"));
		result.setTenantId(_ctx.longValue("UpdateLinkeBahamutApprepoResponse.Result.TenantId"));
		result.setVisibilityLevel(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Result.VisibilityLevel"));
		result.setWriteNeedOwnerAudit(_ctx.booleanValue("UpdateLinkeBahamutApprepoResponse.Result.WriteNeedOwnerAudit"));
		result.setWriteSecLevel(_ctx.stringValue("UpdateLinkeBahamutApprepoResponse.Result.WriteSecLevel"));
		updateLinkeBahamutApprepoResponse.setResult(result);
	 
	 	return updateLinkeBahamutApprepoResponse;
	}
}