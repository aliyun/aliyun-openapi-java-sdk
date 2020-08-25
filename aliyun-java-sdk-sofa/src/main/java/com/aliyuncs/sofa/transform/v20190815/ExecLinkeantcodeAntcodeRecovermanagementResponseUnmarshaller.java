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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRecovermanagementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeRecovermanagementResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeRecovermanagementResponse unmarshall(ExecLinkeantcodeAntcodeRecovermanagementResponse execLinkeantcodeAntcodeRecovermanagementResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeRecovermanagementResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.RequestId"));
		execLinkeantcodeAntcodeRecovermanagementResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.ResultCode"));
		execLinkeantcodeAntcodeRecovermanagementResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.ResultMessage"));
		execLinkeantcodeAntcodeRecovermanagementResponse.setData(_ctx.booleanValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.Data"));
		execLinkeantcodeAntcodeRecovermanagementResponse.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.Message"));
		execLinkeantcodeAntcodeRecovermanagementResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeRecovermanagementResponse.setStatus(_ctx.booleanValue("ExecLinkeantcodeAntcodeRecovermanagementResponse.Status"));
	 
	 	return execLinkeantcodeAntcodeRecovermanagementResponse;
	}
}