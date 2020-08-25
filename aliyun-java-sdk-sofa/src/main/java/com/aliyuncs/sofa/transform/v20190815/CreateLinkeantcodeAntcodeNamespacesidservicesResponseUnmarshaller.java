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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeNamespacesidservicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeNamespacesidservicesResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeNamespacesidservicesResponse unmarshall(CreateLinkeantcodeAntcodeNamespacesidservicesResponse createLinkeantcodeAntcodeNamespacesidservicesResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.RequestId"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.ResultCode"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.ResultMessage"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setAccessLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.AccessLevel"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setAccessUserId(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.AccessUserId"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setAutoCheckSuite(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.AutoCheckSuite"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.AvatarUrl"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setBuildEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.BuildEvent"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setCallUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.CallUrl"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setChecks(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.Checks"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setChecksDependOn(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.ChecksDependOn"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setCheckResultUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.CheckResultUrl"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setCheckSite(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.CheckSite"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.CreatedAt"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.Description"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setHomepage(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.Homepage"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.Id"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setIssueEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.IssueEvent"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setMergeRequestEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.MergeRequestEvent"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.Name"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setNoteEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.NoteEvent"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setProperties(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.Properties"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.PushEvent"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setSourceId(_ctx.longValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.SourceId"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.SourceType"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setTagPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.TagPushEvent"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.UpdatedAt"));
		createLinkeantcodeAntcodeNamespacesidservicesResponse.setVisibilityLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeNamespacesidservicesResponse.VisibilityLevel"));
	 
	 	return createLinkeantcodeAntcodeNamespacesidservicesResponse;
	}
}