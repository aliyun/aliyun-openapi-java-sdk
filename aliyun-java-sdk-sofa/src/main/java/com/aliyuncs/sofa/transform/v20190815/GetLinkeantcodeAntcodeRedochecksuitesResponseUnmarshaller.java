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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeRedochecksuitesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRunsItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeRedochecksuitesResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeantcodeAntcodeRedochecksuitesResponseUnmarshaller {

	public static GetLinkeantcodeAntcodeRedochecksuitesResponse unmarshall(GetLinkeantcodeAntcodeRedochecksuitesResponse getLinkeantcodeAntcodeRedochecksuitesResponse, UnmarshallerContext _ctx) {
		
		getLinkeantcodeAntcodeRedochecksuitesResponse.setRequestId(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.RequestId"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setResultCode(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.ResultCode"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setResultMessage(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.ResultMessage"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setAfterSha(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.AfterSha"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setBeforeSha(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.BeforeSha"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setConclusion(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Conclusion"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setCreatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CreatedAt"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setEventType(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.EventType"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setHeadBranch(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.HeadBranch"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setHeadSha(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.HeadSha"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Id"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setProjectId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.ProjectId"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setPullRequestId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.PullRequestId"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.ResponseStatusCode"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setServiceId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.ServiceId"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setStatus(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Status"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setUpdatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.UpdatedAt"));

		Service service = new Service();
		service.setAccessLevel(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.AccessLevel"));
		service.setAccessUserId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.AccessUserId"));
		service.setAutoCheckSuite(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.AutoCheckSuite"));
		service.setAvatarUrl(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.AvatarUrl"));
		service.setBuildEvent(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.BuildEvent"));
		service.setCallUrl(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.CallUrl"));
		service.setChecks(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.Checks"));
		service.setChecksDependOn(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.ChecksDependOn"));
		service.setCheckResultUrl(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.CheckResultUrl"));
		service.setCheckSite(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.CheckSite"));
		service.setCreatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.CreatedAt"));
		service.setDescription(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.Description"));
		service.setHomepage(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.Homepage"));
		service.setId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.Id"));
		service.setIssueEvent(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.IssueEvent"));
		service.setMergeRequestEvent(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.MergeRequestEvent"));
		service.setName(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.Name"));
		service.setNoteEvent(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.NoteEvent"));
		service.setProperties(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.Properties"));
		service.setPushEvent(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.PushEvent"));
		service.setSourceId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.SourceId"));
		service.setSourceType(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.SourceType"));
		service.setTagPushEvent(_ctx.booleanValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.TagPushEvent"));
		service.setUpdatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.UpdatedAt"));
		service.setVisibilityLevel(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.Service.VisibilityLevel"));
		getLinkeantcodeAntcodeRedochecksuitesResponse.setService(service);

		List<CheckRunsItem> checkRuns = new ArrayList<CheckRunsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns.Length"); i++) {
			CheckRunsItem checkRunsItem = new CheckRunsItem();
			checkRunsItem.setCompletedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].CompletedAt"));
			checkRunsItem.setConclusion(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Conclusion"));
			checkRunsItem.setContext(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Context"));
			checkRunsItem.setCreatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].CreatedAt"));
			checkRunsItem.setDetailUrl(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].DetailUrl"));
			checkRunsItem.setExternalId(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].ExternalId"));
			checkRunsItem.setId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Id"));
			checkRunsItem.setStartedAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].StartedAt"));
			checkRunsItem.setStatus(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Status"));
			checkRunsItem.setSuiteId(_ctx.longValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].SuiteId"));
			checkRunsItem.setSummary(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Summary"));
			checkRunsItem.setTitle(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Title"));
			checkRunsItem.setUpdateAt(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].UpdateAt"));

			List<String> annotations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Annotations.Length"); j++) {
				annotations.add(_ctx.stringValue("GetLinkeantcodeAntcodeRedochecksuitesResponse.CheckRuns["+ i +"].Annotations["+ j +"]"));
			}
			checkRunsItem.setAnnotations(annotations);

			checkRuns.add(checkRunsItem);
		}
		getLinkeantcodeAntcodeRedochecksuitesResponse.setCheckRuns(checkRuns);
	 
	 	return getLinkeantcodeAntcodeRedochecksuitesResponse;
	}
}