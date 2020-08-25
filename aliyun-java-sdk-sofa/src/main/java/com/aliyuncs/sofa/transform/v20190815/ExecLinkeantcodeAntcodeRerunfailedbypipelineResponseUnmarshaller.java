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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeRerunfailedbypipelineResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse unmarshall(ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse execLinkeantcodeAntcodeRerunfailedbypipelineResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.RequestId"));
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.ResultCode"));
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.ResultMessage"));
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setData(_ctx.booleanValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.Data"));
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.Message"));
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeRerunfailedbypipelineResponse.setStatus(_ctx.booleanValue("ExecLinkeantcodeAntcodeRerunfailedbypipelineResponse.Status"));
	 
	 	return execLinkeantcodeAntcodeRerunfailedbypipelineResponse;
	}
}