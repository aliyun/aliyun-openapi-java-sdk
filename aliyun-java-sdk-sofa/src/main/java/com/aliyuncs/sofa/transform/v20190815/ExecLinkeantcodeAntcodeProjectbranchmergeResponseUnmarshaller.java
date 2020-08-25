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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProjectbranchmergeResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeProjectbranchmergeResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeProjectbranchmergeResponse unmarshall(ExecLinkeantcodeAntcodeProjectbranchmergeResponse execLinkeantcodeAntcodeProjectbranchmergeResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.RequestId"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.ResultCode"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.ResultMessage"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setMergeAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.MergeAccessLevel"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Name"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.set_Protected(_ctx.booleanValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Protected"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setProtectRule(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.ProtectRule"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setProtectRuleExactMatched(_ctx.booleanValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.ProtectRuleExactMatched"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setPushAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.PushAccessLevel"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setRef(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Ref"));
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProjectbranchmergeResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		execLinkeantcodeAntcodeProjectbranchmergeResponse.setCommit(commit);
	 
	 	return execLinkeantcodeAntcodeProjectbranchmergeResponse;
	}
}