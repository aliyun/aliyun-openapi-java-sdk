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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeStartprojectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeStartprojectResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeStartprojectResponse unmarshall(ExecLinkeantcodeAntcodeStartprojectResponse execLinkeantcodeAntcodeStartprojectResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeStartprojectResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeStartprojectResponse.RequestId"));
		execLinkeantcodeAntcodeStartprojectResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeStartprojectResponse.ResultCode"));
		execLinkeantcodeAntcodeStartprojectResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeStartprojectResponse.ResultMessage"));
		execLinkeantcodeAntcodeStartprojectResponse.setData(_ctx.booleanValue("ExecLinkeantcodeAntcodeStartprojectResponse.Data"));
		execLinkeantcodeAntcodeStartprojectResponse.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeStartprojectResponse.Message"));
		execLinkeantcodeAntcodeStartprojectResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeStartprojectResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeStartprojectResponse.setStatus(_ctx.booleanValue("ExecLinkeantcodeAntcodeStartprojectResponse.Status"));
	 
	 	return execLinkeantcodeAntcodeStartprojectResponse;
	}
}