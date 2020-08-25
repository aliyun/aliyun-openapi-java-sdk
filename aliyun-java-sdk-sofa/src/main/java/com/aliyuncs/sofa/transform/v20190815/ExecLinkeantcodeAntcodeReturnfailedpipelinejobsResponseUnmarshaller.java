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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse unmarshall(ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.RequestId"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.ResultCode"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.ResultMessage"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setErrorCode(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.ErrorCode"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setErrorMsg(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.ErrorMsg"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setLogUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.LogUrl"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setResult(_ctx.stringValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.Result"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setSuccess(_ctx.booleanValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.Success"));
		execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.setTimestamp(_ctx.longValue("ExecLinkeantcodeAntcodeReturnfailedpipelinejobsResponse.Timestamp"));
	 
	 	return execLinkeantcodeAntcodeReturnfailedpipelinejobsResponse;
	}
}