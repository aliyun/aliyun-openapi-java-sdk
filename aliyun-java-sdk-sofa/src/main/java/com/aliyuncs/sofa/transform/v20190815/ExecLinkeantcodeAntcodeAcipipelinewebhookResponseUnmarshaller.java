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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeAcipipelinewebhookResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeAcipipelinewebhookResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeAcipipelinewebhookResponse unmarshall(ExecLinkeantcodeAntcodeAcipipelinewebhookResponse execLinkeantcodeAntcodeAcipipelinewebhookResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.RequestId"));
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.ResultCode"));
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.ResultMessage"));
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setData(_ctx.booleanValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.Data"));
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.Message"));
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeAcipipelinewebhookResponse.setStatus(_ctx.booleanValue("ExecLinkeantcodeAntcodeAcipipelinewebhookResponse.Status"));
	 
	 	return execLinkeantcodeAntcodeAcipipelinewebhookResponse;
	}
}