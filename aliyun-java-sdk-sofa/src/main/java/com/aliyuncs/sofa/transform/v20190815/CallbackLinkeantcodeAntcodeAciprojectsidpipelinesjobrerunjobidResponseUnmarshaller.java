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

import com.aliyuncs.sofa.model.v20190815.CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponseUnmarshaller {

	public static CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse unmarshall(CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse, UnmarshallerContext _ctx) {
		
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setRequestId(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.RequestId"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setResultCode(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.ResultCode"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setResultMessage(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.ResultMessage"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setErrorCode(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.ErrorCode"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setErrorMsg(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.ErrorMsg"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setLogUrl(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.LogUrl"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setResponseStatusCode(_ctx.longValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.ResponseStatusCode"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setResult(_ctx.stringValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.Result"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setSuccess(_ctx.booleanValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.Success"));
		callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.setTimestamp(_ctx.longValue("CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse.Timestamp"));
	 
	 	return callbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidResponse;
	}
}