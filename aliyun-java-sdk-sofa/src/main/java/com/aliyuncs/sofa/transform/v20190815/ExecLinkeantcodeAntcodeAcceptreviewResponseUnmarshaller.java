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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeAcceptreviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeAcceptreviewResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeAcceptreviewResponse unmarshall(ExecLinkeantcodeAntcodeAcceptreviewResponse execLinkeantcodeAntcodeAcceptreviewResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeAcceptreviewResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeAcceptreviewResponse.RequestId"));
		execLinkeantcodeAntcodeAcceptreviewResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeAcceptreviewResponse.ResultCode"));
		execLinkeantcodeAntcodeAcceptreviewResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeAcceptreviewResponse.ResultMessage"));
		execLinkeantcodeAntcodeAcceptreviewResponse.setResponseContent(_ctx.stringValue("ExecLinkeantcodeAntcodeAcceptreviewResponse.ResponseContent"));
		execLinkeantcodeAntcodeAcceptreviewResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeAcceptreviewResponse.ResponseStatusCode"));
	 
	 	return execLinkeantcodeAntcodeAcceptreviewResponse;
	}
}