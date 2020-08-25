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

import com.aliyuncs.sofa.model.v20190815.EnableLinkeantcodeAntcodeGroupsidinstallationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableLinkeantcodeAntcodeGroupsidinstallationsResponseUnmarshaller {

	public static EnableLinkeantcodeAntcodeGroupsidinstallationsResponse unmarshall(EnableLinkeantcodeAntcodeGroupsidinstallationsResponse enableLinkeantcodeAntcodeGroupsidinstallationsResponse, UnmarshallerContext _ctx) {
		
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setRequestId(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.RequestId"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setResultCode(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.ResultCode"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setResultMessage(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.ResultMessage"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setAccessLevel(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.AccessLevel"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setAccessUserId(_ctx.longValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.AccessUserId"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setAutoCheckSuite(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.AutoCheckSuite"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setAvatarUrl(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.AvatarUrl"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setBuildEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.BuildEvent"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setCallUrl(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.CallUrl"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setChecks(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.Checks"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setChecksDependOn(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.ChecksDependOn"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setCheckResultUrl(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.CheckResultUrl"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setCheckSite(_ctx.longValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.CheckSite"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setCreatedAt(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.CreatedAt"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setDescription(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.Description"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setHomepage(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.Homepage"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setId(_ctx.longValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.Id"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setIssueEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.IssueEvent"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setMergeRequestEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.MergeRequestEvent"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setName(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.Name"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setNoteEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.NoteEvent"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setProperties(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.Properties"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setPushEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.PushEvent"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setResponseStatusCode(_ctx.longValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.ResponseStatusCode"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setSourceId(_ctx.longValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.SourceId"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setSourceType(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.SourceType"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setTagPushEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.TagPushEvent"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setUpdatedAt(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.UpdatedAt"));
		enableLinkeantcodeAntcodeGroupsidinstallationsResponse.setVisibilityLevel(_ctx.stringValue("EnableLinkeantcodeAntcodeGroupsidinstallationsResponse.VisibilityLevel"));
	 
	 	return enableLinkeantcodeAntcodeGroupsidinstallationsResponse;
	}
}