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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeInstallationsserfviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeInstallationsserfviceResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeInstallationsserfviceResponse unmarshall(DeleteLinkeantcodeAntcodeInstallationsserfviceResponse deleteLinkeantcodeAntcodeInstallationsserfviceResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.RequestId"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.ResultCode"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setAccessLevel(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.AccessLevel"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setAccessUserId(_ctx.longValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.AccessUserId"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setAutoCheckSuite(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.AutoCheckSuite"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setAvatarUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.AvatarUrl"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setBuildEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.BuildEvent"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setCallUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.CallUrl"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setChecks(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.Checks"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setChecksDependOn(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.ChecksDependOn"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setCheckResultUrl(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.CheckResultUrl"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setCheckSite(_ctx.longValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.CheckSite"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.Description"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setHomepage(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.Homepage"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.Id"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setIssueEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.IssueEvent"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setMergeRequestEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.MergeRequestEvent"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.Name"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setNoteEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.NoteEvent"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setProperties(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.Properties"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setPushEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.PushEvent"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.SourceId"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.SourceType"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setTagPushEvent(_ctx.booleanValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.TagPushEvent"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.UpdatedAt"));
		deleteLinkeantcodeAntcodeInstallationsserfviceResponse.setVisibilityLevel(_ctx.stringValue("DeleteLinkeantcodeAntcodeInstallationsserfviceResponse.VisibilityLevel"));
	 
	 	return deleteLinkeantcodeAntcodeInstallationsserfviceResponse;
	}
}