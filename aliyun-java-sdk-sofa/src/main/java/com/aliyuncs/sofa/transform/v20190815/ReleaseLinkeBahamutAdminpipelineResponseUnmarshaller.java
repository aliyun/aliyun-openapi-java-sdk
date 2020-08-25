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

import com.aliyuncs.sofa.model.v20190815.ReleaseLinkeBahamutAdminpipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseLinkeBahamutAdminpipelineResponseUnmarshaller {

	public static ReleaseLinkeBahamutAdminpipelineResponse unmarshall(ReleaseLinkeBahamutAdminpipelineResponse releaseLinkeBahamutAdminpipelineResponse, UnmarshallerContext _ctx) {
		
		releaseLinkeBahamutAdminpipelineResponse.setRequestId(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.RequestId"));
		releaseLinkeBahamutAdminpipelineResponse.setResultCode(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.ResultCode"));
		releaseLinkeBahamutAdminpipelineResponse.setResultMessage(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.ResultMessage"));
		releaseLinkeBahamutAdminpipelineResponse.setErrorMessage(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.ErrorMessage"));
		releaseLinkeBahamutAdminpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.ErrorMsgParamsMap"));
		releaseLinkeBahamutAdminpipelineResponse.setMessage(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.Message"));
		releaseLinkeBahamutAdminpipelineResponse.setResponseStatusCode(_ctx.longValue("ReleaseLinkeBahamutAdminpipelineResponse.ResponseStatusCode"));
		releaseLinkeBahamutAdminpipelineResponse.setResult(_ctx.stringValue("ReleaseLinkeBahamutAdminpipelineResponse.Result"));
		releaseLinkeBahamutAdminpipelineResponse.setSuccess(_ctx.booleanValue("ReleaseLinkeBahamutAdminpipelineResponse.Success"));
	 
	 	return releaseLinkeBahamutAdminpipelineResponse;
	}
}