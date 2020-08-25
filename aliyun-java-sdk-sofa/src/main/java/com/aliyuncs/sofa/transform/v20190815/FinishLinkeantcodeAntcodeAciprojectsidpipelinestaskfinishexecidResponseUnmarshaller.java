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

import com.aliyuncs.sofa.model.v20190815.FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponseUnmarshaller {

	public static FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse unmarshall(FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse, UnmarshallerContext _ctx) {
		
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setRequestId(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.RequestId"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setResultCode(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.ResultCode"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setResultMessage(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.ResultMessage"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setErrorCode(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.ErrorCode"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setErrorMsg(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.ErrorMsg"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setLogUrl(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.LogUrl"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setResponseStatusCode(_ctx.longValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.ResponseStatusCode"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setResult(_ctx.stringValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.Result"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setSuccess(_ctx.booleanValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.Success"));
		finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.setTimestamp(_ctx.longValue("FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse.Timestamp"));
	 
	 	return finishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidResponse;
	}
}