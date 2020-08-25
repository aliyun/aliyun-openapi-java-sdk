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

import com.aliyuncs.sofa.model.v20190815.EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableLinkeantcodeAntcodeNamespacesidinstallationsResponseUnmarshaller {

	public static EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse unmarshall(EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse enableLinkeantcodeAntcodeNamespacesidinstallationsResponse, UnmarshallerContext _ctx) {
		
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setRequestId(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.RequestId"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setResultCode(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.ResultCode"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setResultMessage(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.ResultMessage"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setAccessLevel(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.AccessLevel"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setAccessUserId(_ctx.longValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.AccessUserId"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setAutoCheckSuite(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.AutoCheckSuite"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setAvatarUrl(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.AvatarUrl"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setBuildEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.BuildEvent"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setCallUrl(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.CallUrl"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setChecks(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.Checks"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setChecksDependOn(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.ChecksDependOn"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setCheckResultUrl(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.CheckResultUrl"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setCheckSite(_ctx.longValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.CheckSite"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setCreatedAt(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.CreatedAt"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setDescription(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.Description"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setHomepage(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.Homepage"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setId(_ctx.longValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.Id"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setIssueEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.IssueEvent"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setMergeRequestEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.MergeRequestEvent"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setName(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.Name"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setNoteEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.NoteEvent"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setProperties(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.Properties"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setPushEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.PushEvent"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setResponseStatusCode(_ctx.longValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.ResponseStatusCode"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setSourceId(_ctx.longValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.SourceId"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setSourceType(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.SourceType"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setTagPushEvent(_ctx.booleanValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.TagPushEvent"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setUpdatedAt(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.UpdatedAt"));
		enableLinkeantcodeAntcodeNamespacesidinstallationsResponse.setVisibilityLevel(_ctx.stringValue("EnableLinkeantcodeAntcodeNamespacesidinstallationsResponse.VisibilityLevel"));
	 
	 	return enableLinkeantcodeAntcodeNamespacesidinstallationsResponse;
	}
}