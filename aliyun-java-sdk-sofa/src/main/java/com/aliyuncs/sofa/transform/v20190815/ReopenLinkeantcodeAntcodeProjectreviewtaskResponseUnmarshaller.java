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

import com.aliyuncs.sofa.model.v20190815.ReopenLinkeantcodeAntcodeProjectreviewtaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReopenLinkeantcodeAntcodeProjectreviewtaskResponseUnmarshaller {

	public static ReopenLinkeantcodeAntcodeProjectreviewtaskResponse unmarshall(ReopenLinkeantcodeAntcodeProjectreviewtaskResponse reopenLinkeantcodeAntcodeProjectreviewtaskResponse, UnmarshallerContext _ctx) {
		
		reopenLinkeantcodeAntcodeProjectreviewtaskResponse.setRequestId(_ctx.stringValue("ReopenLinkeantcodeAntcodeProjectreviewtaskResponse.RequestId"));
		reopenLinkeantcodeAntcodeProjectreviewtaskResponse.setResultCode(_ctx.stringValue("ReopenLinkeantcodeAntcodeProjectreviewtaskResponse.ResultCode"));
		reopenLinkeantcodeAntcodeProjectreviewtaskResponse.setResultMessage(_ctx.stringValue("ReopenLinkeantcodeAntcodeProjectreviewtaskResponse.ResultMessage"));
		reopenLinkeantcodeAntcodeProjectreviewtaskResponse.setResponseContent(_ctx.stringValue("ReopenLinkeantcodeAntcodeProjectreviewtaskResponse.ResponseContent"));
		reopenLinkeantcodeAntcodeProjectreviewtaskResponse.setResponseStatusCode(_ctx.longValue("ReopenLinkeantcodeAntcodeProjectreviewtaskResponse.ResponseStatusCode"));
	 
	 	return reopenLinkeantcodeAntcodeProjectreviewtaskResponse;
	}
}