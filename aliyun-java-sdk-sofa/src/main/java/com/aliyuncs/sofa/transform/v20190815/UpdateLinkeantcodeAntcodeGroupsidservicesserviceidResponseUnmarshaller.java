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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse unmarshall(UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.RequestId"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.ResultCode"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.ResultMessage"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setAccessLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.AccessLevel"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setAccessUserId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.AccessUserId"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setAutoCheckSuite(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.AutoCheckSuite"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setBuildEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.BuildEvent"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setCallUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.CallUrl"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setChecks(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.Checks"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setChecksDependOn(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.ChecksDependOn"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setCheckResultUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.CheckResultUrl"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setCheckSite(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.CheckSite"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.CreatedAt"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.Description"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setHomepage(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.Homepage"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.Id"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setIssueEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.IssueEvent"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setMergeRequestEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.MergeRequestEvent"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.Name"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setNoteEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.NoteEvent"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setProperties(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.Properties"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setPushEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.PushEvent"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setSourceId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.SourceId"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.SourceType"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setTagPushEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.TagPushEvent"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.setVisibilityLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupsidservicesserviceidResponse.VisibilityLevel"));
	 
	 	return updateLinkeantcodeAntcodeGroupsidservicesserviceidResponse;
	}
}