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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRunsItem;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse unmarshall(CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.RequestId"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.ResultCode"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.ResultMessage"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setAfterSha(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.AfterSha"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setBeforeSha(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.BeforeSha"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setConclusion(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Conclusion"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CreatedAt"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setEventType(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.EventType"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setHeadBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.HeadBranch"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setHeadSha(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.HeadSha"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Id"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.ProjectId"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setPullRequestId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.PullRequestId"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setServiceId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.ServiceId"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setStatus(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Status"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.UpdatedAt"));

		Service service = new Service();
		service.setAccessLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.AccessLevel"));
		service.setAccessUserId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.AccessUserId"));
		service.setAutoCheckSuite(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.AutoCheckSuite"));
		service.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.AvatarUrl"));
		service.setBuildEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.BuildEvent"));
		service.setCallUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.CallUrl"));
		service.setChecks(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.Checks"));
		service.setChecksDependOn(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.ChecksDependOn"));
		service.setCheckResultUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.CheckResultUrl"));
		service.setCheckSite(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.CheckSite"));
		service.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.CreatedAt"));
		service.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.Description"));
		service.setHomepage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.Homepage"));
		service.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.Id"));
		service.setIssueEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.IssueEvent"));
		service.setMergeRequestEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.MergeRequestEvent"));
		service.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.Name"));
		service.setNoteEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.NoteEvent"));
		service.setProperties(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.Properties"));
		service.setPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.PushEvent"));
		service.setSourceId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.SourceId"));
		service.setSourceType(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.SourceType"));
		service.setTagPushEvent(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.TagPushEvent"));
		service.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.UpdatedAt"));
		service.setVisibilityLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.Service.VisibilityLevel"));
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setService(service);

		List<CheckRunsItem> checkRuns = new ArrayList<CheckRunsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns.Length"); i++) {
			CheckRunsItem checkRunsItem = new CheckRunsItem();
			checkRunsItem.setCompletedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].CompletedAt"));
			checkRunsItem.setConclusion(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Conclusion"));
			checkRunsItem.setContext(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Context"));
			checkRunsItem.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].CreatedAt"));
			checkRunsItem.setDetailUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].DetailUrl"));
			checkRunsItem.setExternalId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].ExternalId"));
			checkRunsItem.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Id"));
			checkRunsItem.setStartedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].StartedAt"));
			checkRunsItem.setStatus(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Status"));
			checkRunsItem.setSuiteId(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].SuiteId"));
			checkRunsItem.setSummary(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Summary"));
			checkRunsItem.setTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Title"));
			checkRunsItem.setUpdateAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].UpdateAt"));

			List<String> annotations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Annotations.Length"); j++) {
				annotations.add(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.CheckRuns["+ i +"].Annotations["+ j +"]"));
			}
			checkRunsItem.setAnnotations(annotations);

			checkRuns.add(checkRunsItem);
		}
		createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse.setCheckRuns(checkRuns);
	 
	 	return createLinkeantcodeAntcodeProjectsprojectidchecksuitesResponse;
	}
}