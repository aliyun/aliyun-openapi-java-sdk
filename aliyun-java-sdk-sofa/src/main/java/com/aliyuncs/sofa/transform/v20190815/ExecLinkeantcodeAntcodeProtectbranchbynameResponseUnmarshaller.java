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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProtectbranchbynameResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeProtectbranchbynameResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeProtectbranchbynameResponse unmarshall(ExecLinkeantcodeAntcodeProtectbranchbynameResponse execLinkeantcodeAntcodeProtectbranchbynameResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.RequestId"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.ResultCode"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.ResultMessage"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setMergeAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.MergeAccessLevel"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Name"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.set_Protected(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Protected"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setProtectRule(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.ProtectRule"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setProtectRuleExactMatched(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.ProtectRuleExactMatched"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setPushAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.PushAccessLevel"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setRef(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Ref"));
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbranchbynameResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		execLinkeantcodeAntcodeProtectbranchbynameResponse.setCommit(commit);
	 
	 	return execLinkeantcodeAntcodeProtectbranchbynameResponse;
	}
}