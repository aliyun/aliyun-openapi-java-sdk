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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeantcodeAntcodeInstallationsserviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeantcodeAntcodeInstallationsserviceResponseUnmarshaller {

	public static RemoveLinkeantcodeAntcodeInstallationsserviceResponse unmarshall(RemoveLinkeantcodeAntcodeInstallationsserviceResponse removeLinkeantcodeAntcodeInstallationsserviceResponse, UnmarshallerContext _ctx) {
		
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setRequestId(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.RequestId"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setResultCode(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.ResultCode"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setResultMessage(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.ResultMessage"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setAccessLevel(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.AccessLevel"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setAccessUserId(_ctx.longValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.AccessUserId"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setAutoCheckSuite(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.AutoCheckSuite"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setAvatarUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.AvatarUrl"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setBuildEvent(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.BuildEvent"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setCallUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.CallUrl"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setChecks(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.Checks"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setChecksDependOn(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.ChecksDependOn"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setCheckResultUrl(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.CheckResultUrl"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setCheckSite(_ctx.longValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.CheckSite"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setCreatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.CreatedAt"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setDescription(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.Description"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setHomepage(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.Homepage"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setId(_ctx.longValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.Id"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setIssueEvent(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.IssueEvent"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setMergeRequestEvent(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.MergeRequestEvent"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setName(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.Name"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setNoteEvent(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.NoteEvent"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setProperties(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.Properties"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setPushEvent(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.PushEvent"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.ResponseStatusCode"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setSourceId(_ctx.longValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.SourceId"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setSourceType(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.SourceType"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setTagPushEvent(_ctx.booleanValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.TagPushEvent"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setUpdatedAt(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.UpdatedAt"));
		removeLinkeantcodeAntcodeInstallationsserviceResponse.setVisibilityLevel(_ctx.stringValue("RemoveLinkeantcodeAntcodeInstallationsserviceResponse.VisibilityLevel"));
	 
	 	return removeLinkeantcodeAntcodeInstallationsserviceResponse;
	}
}