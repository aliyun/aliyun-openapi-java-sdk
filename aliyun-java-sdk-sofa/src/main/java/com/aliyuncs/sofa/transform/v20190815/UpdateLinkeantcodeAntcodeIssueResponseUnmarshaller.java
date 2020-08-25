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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeIssueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeIssueResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeIssueResponse unmarshall(UpdateLinkeantcodeAntcodeIssueResponse updateLinkeantcodeAntcodeIssueResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeIssueResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeIssueResponse.RequestId"));
		updateLinkeantcodeAntcodeIssueResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeIssueResponse.ResultCode"));
		updateLinkeantcodeAntcodeIssueResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeIssueResponse.ResultMessage"));
		updateLinkeantcodeAntcodeIssueResponse.setResponseContent(_ctx.stringValue("UpdateLinkeantcodeAntcodeIssueResponse.ResponseContent"));
		updateLinkeantcodeAntcodeIssueResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeIssueResponse.ResponseStatusCode"));
	 
	 	return updateLinkeantcodeAntcodeIssueResponse;
	}
}