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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminpipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminpipelineResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminpipelineResponse unmarshall(UpdateLinkeBahamutAdminpipelineResponse updateLinkeBahamutAdminpipelineResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminpipelineResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.RequestId"));
		updateLinkeBahamutAdminpipelineResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.ResultCode"));
		updateLinkeBahamutAdminpipelineResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.ResultMessage"));
		updateLinkeBahamutAdminpipelineResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.ErrorMessage"));
		updateLinkeBahamutAdminpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminpipelineResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.Message"));
		updateLinkeBahamutAdminpipelineResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminpipelineResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminpipelineResponse.setResult(_ctx.stringValue("UpdateLinkeBahamutAdminpipelineResponse.Result"));
		updateLinkeBahamutAdminpipelineResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminpipelineResponse.Success"));
	 
	 	return updateLinkeBahamutAdminpipelineResponse;
	}
}