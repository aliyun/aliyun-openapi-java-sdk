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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminpipelineexistediterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminpipelineexistediterationResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminpipelineexistediterationResponse unmarshall(UpdateLinkeBahamutAdminpipelineexistediterationResponse updateLinkeBahamutAdminpipelineexistediterationResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminpipelineexistediterationResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.RequestId"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.ResultCode"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.ResultMessage"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.ErrorMessage"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.Message"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setResult(_ctx.booleanValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.Result"));
		updateLinkeBahamutAdminpipelineexistediterationResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminpipelineexistediterationResponse.Success"));
	 
	 	return updateLinkeBahamutAdminpipelineexistediterationResponse;
	}
}