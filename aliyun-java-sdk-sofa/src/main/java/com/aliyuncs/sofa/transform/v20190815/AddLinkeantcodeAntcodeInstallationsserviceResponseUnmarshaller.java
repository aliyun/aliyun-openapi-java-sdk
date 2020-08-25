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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeInstallationsserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeInstallationsserviceResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeInstallationsserviceResponse unmarshall(AddLinkeantcodeAntcodeInstallationsserviceResponse addLinkeantcodeAntcodeInstallationsserviceResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeInstallationsserviceResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.RequestId"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.ResultCode"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.ResultMessage"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setAccessLevel(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.AccessLevel"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setAccessUserId(_ctx.longValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.AccessUserId"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setAutoCheckSuite(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.AutoCheckSuite"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.AvatarUrl"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setBuildEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.BuildEvent"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setCallUrl(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.CallUrl"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setChecks(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.Checks"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setChecksDependOn(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.ChecksDependOn"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setCheckResultUrl(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.CheckResultUrl"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setCheckSite(_ctx.longValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.CheckSite"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.CreatedAt"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setDescription(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.Description"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setHomepage(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.Homepage"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.Id"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setIssueEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.IssueEvent"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setMergeRequestEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.MergeRequestEvent"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setName(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.Name"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setNoteEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.NoteEvent"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setProperties(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.Properties"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.PushEvent"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setSourceId(_ctx.longValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.SourceId"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setSourceType(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.SourceType"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setTagPushEvent(_ctx.booleanValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.TagPushEvent"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.UpdatedAt"));
		addLinkeantcodeAntcodeInstallationsserviceResponse.setVisibilityLevel(_ctx.stringValue("AddLinkeantcodeAntcodeInstallationsserviceResponse.VisibilityLevel"));
	 
	 	return addLinkeantcodeAntcodeInstallationsserviceResponse;
	}
}