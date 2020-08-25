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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeGroupsidservicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeGroupsidservicesResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeGroupsidservicesResponse unmarshall(CreateLinkeantcodeAntcodeGroupsidservicesResponse createLinkeantcodeAntcodeGroupsidservicesResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeGroupsidservicesResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.RequestId"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.ResultCode"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.ResultMessage"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setAccessLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.AccessLevel"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setAccessUserId(_ctx.longValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.AccessUserId"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setAutoCheckSuite(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.AutoCheckSuite"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.AvatarUrl"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setBuildEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.BuildEvent"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setCallUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.CallUrl"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setChecks(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.Checks"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setChecksDependOn(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.ChecksDependOn"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setCheckResultUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.CheckResultUrl"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setCheckSite(_ctx.longValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.CheckSite"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.CreatedAt"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.Description"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setHomepage(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.Homepage"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.Id"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setIssueEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.IssueEvent"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setMergeRequestEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.MergeRequestEvent"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.Name"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setNoteEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.NoteEvent"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setProperties(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.Properties"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.PushEvent"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setSourceId(_ctx.longValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.SourceId"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.SourceType"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setTagPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.TagPushEvent"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.UpdatedAt"));
		createLinkeantcodeAntcodeGroupsidservicesResponse.setVisibilityLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeGroupsidservicesResponse.VisibilityLevel"));
	 
	 	return createLinkeantcodeAntcodeGroupsidservicesResponse;
	}
}