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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponseUnmarshaller {

	public static CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse unmarshall(CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setRequestId(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.RequestId"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setResultCode(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.ResultCode"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setResultMessage(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.ResultMessage"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setErrorCode(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.ErrorCode"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setErrorMsg(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.ErrorMsg"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setLogUrl(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.LogUrl"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.ResponseStatusCode"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setResult(_ctx.stringValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.Result"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setSuccess(_ctx.booleanValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.Success"));
		cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.setTimestamp(_ctx.longValue("CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse.Timestamp"));
	 
	 	return cancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidResponse;
	}
}