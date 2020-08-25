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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeCommitreviewResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeCommitreviewResponse.Author;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeCommitreviewResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeCommitreviewResponse unmarshall(QueryLinkeantcodeAntcodeCommitreviewResponse queryLinkeantcodeAntcodeCommitreviewResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeCommitreviewResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.RequestId"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.ResultCode"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.ResultMessage"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setBody(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Body"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.CreatedAt"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Id"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setPending(_ctx.booleanValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Pending"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setPullRequestId(_ctx.longValue("QueryLinkeantcodeAntcodeCommitreviewResponse.PullRequestId"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeCommitreviewResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.UpdatedAt"));

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.AvatarUrl"));
		author.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.CreatedAt"));
		author.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.Id"));
		author.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.Name"));
		author.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.NotificationLevel"));
		author.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.State"));
		author.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.Username"));
		author.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeCommitreviewResponse.Author.WebUrl"));
		queryLinkeantcodeAntcodeCommitreviewResponse.setAuthor(author);
	 
	 	return queryLinkeantcodeAntcodeCommitreviewResponse;
	}
}