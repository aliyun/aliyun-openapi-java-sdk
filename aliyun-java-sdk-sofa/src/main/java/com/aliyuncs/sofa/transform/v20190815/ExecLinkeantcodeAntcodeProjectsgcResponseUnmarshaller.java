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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProjectsgcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeProjectsgcResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeProjectsgcResponse unmarshall(ExecLinkeantcodeAntcodeProjectsgcResponse execLinkeantcodeAntcodeProjectsgcResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeProjectsgcResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectsgcResponse.RequestId"));
		execLinkeantcodeAntcodeProjectsgcResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectsgcResponse.ResultCode"));
		execLinkeantcodeAntcodeProjectsgcResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectsgcResponse.ResultMessage"));
		execLinkeantcodeAntcodeProjectsgcResponse.setData(_ctx.booleanValue("ExecLinkeantcodeAntcodeProjectsgcResponse.Data"));
		execLinkeantcodeAntcodeProjectsgcResponse.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectsgcResponse.Message"));
		execLinkeantcodeAntcodeProjectsgcResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeProjectsgcResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeProjectsgcResponse.setStatus(_ctx.booleanValue("ExecLinkeantcodeAntcodeProjectsgcResponse.Status"));
	 
	 	return execLinkeantcodeAntcodeProjectsgcResponse;
	}
}