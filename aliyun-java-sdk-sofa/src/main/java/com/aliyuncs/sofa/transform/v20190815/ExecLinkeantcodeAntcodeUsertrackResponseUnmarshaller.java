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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUsertrackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeUsertrackResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeUsertrackResponse unmarshall(ExecLinkeantcodeAntcodeUsertrackResponse execLinkeantcodeAntcodeUsertrackResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeUsertrackResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeUsertrackResponse.RequestId"));
		execLinkeantcodeAntcodeUsertrackResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeUsertrackResponse.ResultCode"));
		execLinkeantcodeAntcodeUsertrackResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUsertrackResponse.ResultMessage"));
		execLinkeantcodeAntcodeUsertrackResponse.setData(_ctx.stringValue("ExecLinkeantcodeAntcodeUsertrackResponse.Data"));
		execLinkeantcodeAntcodeUsertrackResponse.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUsertrackResponse.Message"));
		execLinkeantcodeAntcodeUsertrackResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeUsertrackResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeUsertrackResponse.setStatus(_ctx.booleanValue("ExecLinkeantcodeAntcodeUsertrackResponse.Status"));
	 
	 	return execLinkeantcodeAntcodeUsertrackResponse;
	}
}