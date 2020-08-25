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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeProjectsserviceResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeProjectsserviceResponse unmarshall(AddLinkeantcodeAntcodeProjectsserviceResponse addLinkeantcodeAntcodeProjectsserviceResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeProjectsserviceResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.RequestId"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.ResultCode"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.ResultMessage"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setAccessLevel(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.AccessLevel"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setAccessUserId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsserviceResponse.AccessUserId"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setAutoCheckSuite(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.AutoCheckSuite"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.AvatarUrl"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setBuildEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.BuildEvent"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setCallUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.CallUrl"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setChecks(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.Checks"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setChecksDependOn(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.ChecksDependOn"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setCheckResultUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.CheckResultUrl"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setCheckSite(_ctx.longValue("AddLinkeantcodeAntcodeProjectsserviceResponse.CheckSite"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.CreatedAt"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setDescription(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.Description"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setHomepage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.Homepage"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsserviceResponse.Id"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setIssueEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.IssueEvent"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setMergeRequestEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.MergeRequestEvent"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.Name"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setNoteEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.NoteEvent"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setProperties(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.Properties"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.PushEvent"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeProjectsserviceResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setSourceId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsserviceResponse.SourceId"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setSourceType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.SourceType"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setTagPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsserviceResponse.TagPushEvent"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.UpdatedAt"));
		addLinkeantcodeAntcodeProjectsserviceResponse.setVisibilityLevel(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsserviceResponse.VisibilityLevel"));
	 
	 	return addLinkeantcodeAntcodeProjectsserviceResponse;
	}
}