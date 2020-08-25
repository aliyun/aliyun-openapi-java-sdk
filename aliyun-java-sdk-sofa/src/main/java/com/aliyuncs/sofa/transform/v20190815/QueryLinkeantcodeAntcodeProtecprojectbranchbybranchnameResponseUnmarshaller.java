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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse unmarshall(QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.RequestId"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.ResultCode"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setMergeAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.MergeAccessLevel"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Name"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.set_Protected(_ctx.booleanValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Protected"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setProtectRule(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.ProtectRule"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setProtectRuleExactMatched(_ctx.booleanValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.ProtectRuleExactMatched"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setPushAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.PushAccessLevel"));
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.ResponseStatusCode"));

		Commit commit = new Commit();
		commit.setAuthoredDate(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("QueryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse.setCommit(commit);
	 
	 	return queryLinkeantcodeAntcodeProtecprojectbranchbybranchnameResponse;
	}
}