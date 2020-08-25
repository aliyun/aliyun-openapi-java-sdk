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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeNamespacesidservicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeNamespacesidservicesResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeNamespacesidservicesResponse unmarshall(UpdateLinkeantcodeAntcodeNamespacesidservicesResponse updateLinkeantcodeAntcodeNamespacesidservicesResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.RequestId"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.ResultCode"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.ResultMessage"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setAccessLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.AccessLevel"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setAccessUserId(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.AccessUserId"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setAutoCheckSuite(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.AutoCheckSuite"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.AvatarUrl"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setBuildEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.BuildEvent"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setCallUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.CallUrl"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setChecks(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.Checks"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setChecksDependOn(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.ChecksDependOn"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setCheckResultUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.CheckResultUrl"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setCheckSite(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.CheckSite"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.CreatedAt"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.Description"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setHomepage(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.Homepage"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.Id"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setIssueEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.IssueEvent"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setMergeRequestEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.MergeRequestEvent"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.Name"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setNoteEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.NoteEvent"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setProperties(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.Properties"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setPushEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.PushEvent"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setSourceId(_ctx.longValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.SourceId"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.SourceType"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setTagPushEvent(_ctx.booleanValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.TagPushEvent"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeNamespacesidservicesResponse.setVisibilityLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeNamespacesidservicesResponse.VisibilityLevel"));
	 
	 	return updateLinkeantcodeAntcodeNamespacesidservicesResponse;
	}
}