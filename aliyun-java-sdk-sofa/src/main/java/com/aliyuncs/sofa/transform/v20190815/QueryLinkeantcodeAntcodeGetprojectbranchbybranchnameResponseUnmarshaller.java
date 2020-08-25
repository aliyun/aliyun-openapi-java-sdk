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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse unmarshall(QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.RequestId"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.ResultCode"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.ResultMessage"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setMergeAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.MergeAccessLevel"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Name"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.set_Protected(_ctx.booleanValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Protected"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setProtectRule(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.ProtectRule"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setProtectRuleExactMatched(_ctx.booleanValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.ProtectRuleExactMatched"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setPushAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.PushAccessLevel"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setRef(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Ref"));
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse.setCommit(commit);
	 
	 	return queryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponse;
	}
}