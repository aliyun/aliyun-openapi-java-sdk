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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodePullrequestissueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodePullrequestissueResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodePullrequestissueResponse unmarshall(CreateLinkeantcodeAntcodePullrequestissueResponse createLinkeantcodeAntcodePullrequestissueResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodePullrequestissueResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.RequestId"));
		createLinkeantcodeAntcodePullrequestissueResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.ResultCode"));
		createLinkeantcodeAntcodePullrequestissueResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.ResultMessage"));
		createLinkeantcodeAntcodePullrequestissueResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodePullrequestissueResponse.Id"));
		createLinkeantcodeAntcodePullrequestissueResponse.setIssueId(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.IssueId"));
		createLinkeantcodeAntcodePullrequestissueResponse.setIssueProvider(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.IssueProvider"));
		createLinkeantcodeAntcodePullrequestissueResponse.setIssueSite(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.IssueSite"));
		createLinkeantcodeAntcodePullrequestissueResponse.setIssueTitle(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.IssueTitle"));
		createLinkeantcodeAntcodePullrequestissueResponse.setIssueType(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.IssueType"));
		createLinkeantcodeAntcodePullrequestissueResponse.setIssueUrl(_ctx.stringValue("CreateLinkeantcodeAntcodePullrequestissueResponse.IssueUrl"));
		createLinkeantcodeAntcodePullrequestissueResponse.setPullRequestId(_ctx.longValue("CreateLinkeantcodeAntcodePullrequestissueResponse.PullRequestId"));
		createLinkeantcodeAntcodePullrequestissueResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodePullrequestissueResponse.ResponseStatusCode"));
	 
	 	return createLinkeantcodeAntcodePullrequestissueResponse;
	}
}