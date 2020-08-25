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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectbranchResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreateprojectbranchResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreateprojectbranchResponse unmarshall(CreateLinkeantcodeAntcodeCreateprojectbranchResponse createLinkeantcodeAntcodeCreateprojectbranchResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.RequestId"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.ResultCode"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setMergeAccessLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.MergeAccessLevel"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Name"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.set_Protected(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Protected"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setProtectRule(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.ProtectRule"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setProtectRuleExactMatched(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.ProtectRuleExactMatched"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setPushAccessLevel(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.PushAccessLevel"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setRef(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Ref"));
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectbranchResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		createLinkeantcodeAntcodeCreateprojectbranchResponse.setCommit(commit);
	 
	 	return createLinkeantcodeAntcodeCreateprojectbranchResponse;
	}
}