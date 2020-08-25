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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeDoprojectbranchmergeResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse unmarshall(ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse execLinkeantcodeAntcodeDoprojectbranchmergeResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.RequestId"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.ResultCode"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.ResultMessage"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setMergeAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.MergeAccessLevel"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Name"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.set_Protected(_ctx.booleanValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Protected"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setProtectRule(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.ProtectRule"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setProtectRuleExactMatched(_ctx.booleanValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.ProtectRuleExactMatched"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setPushAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.PushAccessLevel"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setRef(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Ref"));
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("ExecLinkeantcodeAntcodeDoprojectbranchmergeResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		execLinkeantcodeAntcodeDoprojectbranchmergeResponse.setCommit(commit);
	 
	 	return execLinkeantcodeAntcodeDoprojectbranchmergeResponse;
	}
}