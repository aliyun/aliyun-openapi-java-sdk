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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeantcodeAntcodePipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeantcodeAntcodePipelineResponseUnmarshaller {

	public static CancelLinkeantcodeAntcodePipelineResponse unmarshall(CancelLinkeantcodeAntcodePipelineResponse cancelLinkeantcodeAntcodePipelineResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeantcodeAntcodePipelineResponse.setRequestId(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.RequestId"));
		cancelLinkeantcodeAntcodePipelineResponse.setResultCode(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.ResultCode"));
		cancelLinkeantcodeAntcodePipelineResponse.setResultMessage(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.ResultMessage"));
		cancelLinkeantcodeAntcodePipelineResponse.setErrorCode(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.ErrorCode"));
		cancelLinkeantcodeAntcodePipelineResponse.setErrorMsg(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.ErrorMsg"));
		cancelLinkeantcodeAntcodePipelineResponse.setLogUrl(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.LogUrl"));
		cancelLinkeantcodeAntcodePipelineResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeantcodeAntcodePipelineResponse.ResponseStatusCode"));
		cancelLinkeantcodeAntcodePipelineResponse.setResult(_ctx.stringValue("CancelLinkeantcodeAntcodePipelineResponse.Result"));
		cancelLinkeantcodeAntcodePipelineResponse.setSuccess(_ctx.booleanValue("CancelLinkeantcodeAntcodePipelineResponse.Success"));
		cancelLinkeantcodeAntcodePipelineResponse.setTimestamp(_ctx.longValue("CancelLinkeantcodeAntcodePipelineResponse.Timestamp"));
	 
	 	return cancelLinkeantcodeAntcodePipelineResponse;
	}
}