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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidinstallationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeProjectsidinstallationsResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeProjectsidinstallationsResponse unmarshall(AddLinkeantcodeAntcodeProjectsidinstallationsResponse addLinkeantcodeAntcodeProjectsidinstallationsResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.RequestId"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.ResultCode"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.ResultMessage"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setAccessLevel(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.AccessLevel"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setAccessUserId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.AccessUserId"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setAutoCheckSuite(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.AutoCheckSuite"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.AvatarUrl"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setBuildEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.BuildEvent"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setCallUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.CallUrl"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setChecks(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.Checks"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setChecksDependOn(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.ChecksDependOn"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setCheckResultUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.CheckResultUrl"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setCheckSite(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.CheckSite"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.CreatedAt"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setDescription(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.Description"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setHomepage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.Homepage"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.Id"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setIssueEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.IssueEvent"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setMergeRequestEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.MergeRequestEvent"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.Name"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setNoteEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.NoteEvent"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setProperties(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.Properties"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.PushEvent"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setSourceId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.SourceId"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setSourceType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.SourceType"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setTagPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.TagPushEvent"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.UpdatedAt"));
		addLinkeantcodeAntcodeProjectsidinstallationsResponse.setVisibilityLevel(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidinstallationsResponse.VisibilityLevel"));
	 
	 	return addLinkeantcodeAntcodeProjectsidinstallationsResponse;
	}
}