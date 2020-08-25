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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminpipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminpipelineResponseUnmarshaller {

	public static AddLinkeBahamutAdminpipelineResponse unmarshall(AddLinkeBahamutAdminpipelineResponse addLinkeBahamutAdminpipelineResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminpipelineResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.RequestId"));
		addLinkeBahamutAdminpipelineResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.ResultCode"));
		addLinkeBahamutAdminpipelineResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.ResultMessage"));
		addLinkeBahamutAdminpipelineResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.ErrorMessage"));
		addLinkeBahamutAdminpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminpipelineResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.Message"));
		addLinkeBahamutAdminpipelineResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminpipelineResponse.ResponseStatusCode"));
		addLinkeBahamutAdminpipelineResponse.setResult(_ctx.stringValue("AddLinkeBahamutAdminpipelineResponse.Result"));
		addLinkeBahamutAdminpipelineResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminpipelineResponse.Success"));
	 
	 	return addLinkeBahamutAdminpipelineResponse;
	}
}