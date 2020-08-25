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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeUnprotectbranchbynameResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse unmarshall(ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse execLinkeantcodeAntcodeUnprotectbranchbynameResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.RequestId"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.ResultCode"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.ResultMessage"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setMergeAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.MergeAccessLevel"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Name"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.set_Protected(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Protected"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setProtectRule(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.ProtectRule"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setProtectRuleExactMatched(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.ProtectRuleExactMatched"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setPushAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.PushAccessLevel"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setRef(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Ref"));
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbranchbynameResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		execLinkeantcodeAntcodeUnprotectbranchbynameResponse.setCommit(commit);
	 
	 	return execLinkeantcodeAntcodeUnprotectbranchbynameResponse;
	}
}