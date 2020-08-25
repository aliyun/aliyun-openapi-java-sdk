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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse unmarshall(QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.RequestId"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.ResultCode"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setMergeAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.MergeAccessLevel"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Name"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.set_Protected(_ctx.booleanValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Protected"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setProtectRule(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.ProtectRule"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setProtectRuleExactMatched(_ctx.booleanValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.ProtectRuleExactMatched"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setPushAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.PushAccessLevel"));
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthoredDate(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse.setCommit(commit);
	 
	 	return queryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponse;
	}
}