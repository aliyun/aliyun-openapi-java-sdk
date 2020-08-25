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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjecttagResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuitesItem;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjecttagResponse.Commit;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjecttagResponse.Release;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjecttagResponse.Tagger;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeProjecttagResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeProjecttagResponse unmarshall(CreateLinkeantcodeAntcodeProjecttagResponse createLinkeantcodeAntcodeProjecttagResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeProjecttagResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.RequestId"));
		createLinkeantcodeAntcodeProjecttagResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.ResultCode"));
		createLinkeantcodeAntcodeProjecttagResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.ResultMessage"));
		createLinkeantcodeAntcodeProjecttagResponse.setMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Message"));
		createLinkeantcodeAntcodeProjecttagResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Name"));
		createLinkeantcodeAntcodeProjecttagResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeProjecttagResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.Title"));

		List<String> checkSuites1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites1.add(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites1(checkSuites1);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		createLinkeantcodeAntcodeProjecttagResponse.setCommit(commit);

		Release release = new Release();
		release.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Release.Description"));
		release.setTagName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Release.TagName"));
		createLinkeantcodeAntcodeProjecttagResponse.setRelease(release);

		Tagger tagger = new Tagger();
		tagger.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Tagger.Email"));
		tagger.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Tagger.Name"));
		tagger.setWhen(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.Tagger.When"));
		createLinkeantcodeAntcodeProjecttagResponse.setTagger(tagger);

		List<CheckSuitesItem> checkSuites = new ArrayList<CheckSuitesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites.Length"); i++) {
			CheckSuitesItem checkSuitesItem = new CheckSuitesItem();
			checkSuitesItem.setAfterSha(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].AfterSha"));
			checkSuitesItem.setBeforeSha(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].BeforeSha"));
			checkSuitesItem.setConclusion(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].Conclusion"));
			checkSuitesItem.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].CreatedAt"));
			checkSuitesItem.setEventType(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].EventType"));
			checkSuitesItem.setHeadBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].HeadBranch"));
			checkSuitesItem.setHeadSha(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].HeadSha"));
			checkSuitesItem.setId(_ctx.longValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].Id"));
			checkSuitesItem.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].ProjectId"));
			checkSuitesItem.setPullRequestId(_ctx.longValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].PullRequestId"));
			checkSuitesItem.setService(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].Service"));
			checkSuitesItem.setServiceId(_ctx.longValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].ServiceId"));
			checkSuitesItem.setStatus(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].Status"));
			checkSuitesItem.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].UpdatedAt"));

			List<String> checkRuns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].CheckRuns.Length"); j++) {
				checkRuns.add(_ctx.stringValue("CreateLinkeantcodeAntcodeProjecttagResponse.CheckSuites["+ i +"].CheckRuns["+ j +"]"));
			}
			checkSuitesItem.setCheckRuns(checkRuns);

			checkSuites.add(checkSuitesItem);
		}
		createLinkeantcodeAntcodeProjecttagResponse.setCheckSuites(checkSuites);
	 
	 	return createLinkeantcodeAntcodeProjecttagResponse;
	}
}