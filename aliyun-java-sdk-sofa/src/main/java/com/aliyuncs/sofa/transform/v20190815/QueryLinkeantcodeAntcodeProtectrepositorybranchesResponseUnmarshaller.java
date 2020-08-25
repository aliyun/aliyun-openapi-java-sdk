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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsersItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsersItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProtectrepositorybranchesResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse unmarshall(QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse queryLinkeantcodeAntcodeProtectrepositorybranchesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.RequestId"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.ResultCode"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Id"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setMergeAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.MergeAccessLevel"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Name"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setPushAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.PushAccessLevel"));
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.ResponseStatusCode"));

		List<String> matchedBranches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.MatchedBranches.Length"); i++) {
			matchedBranches.add(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.MatchedBranches["+ i +"]"));
		}
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setMatchedBranches(matchedBranches);

		Commit commit = new Commit();
		commit.setAuthoredDate(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setCommit(commit);

		List<AllowedMergeUsersItem> allowedMergeUsers = new ArrayList<AllowedMergeUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers.Length"); i++) {
			AllowedMergeUsersItem allowedMergeUsersItem = new AllowedMergeUsersItem();
			allowedMergeUsersItem.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].AvatarUrl"));
			allowedMergeUsersItem.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].CreatedAt"));
			allowedMergeUsersItem.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Email"));
			allowedMergeUsersItem.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ExternUid"));
			allowedMergeUsersItem.setId(_ctx.longValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Id"));
			allowedMergeUsersItem.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Name"));
			allowedMergeUsersItem.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].NotificationLevel"));
			allowedMergeUsersItem.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].State"));
			allowedMergeUsersItem.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].UpdatedAt"));
			allowedMergeUsersItem.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Username"));
			allowedMergeUsersItem.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].WebUrl"));

			allowedMergeUsers.add(allowedMergeUsersItem);
		}
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setAllowedMergeUsers(allowedMergeUsers);

		List<AllowedPushUsersItem> allowedPushUsers = new ArrayList<AllowedPushUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers.Length"); i++) {
			AllowedPushUsersItem allowedPushUsersItem = new AllowedPushUsersItem();
			allowedPushUsersItem.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].AvatarUrl"));
			allowedPushUsersItem.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].CreatedAt"));
			allowedPushUsersItem.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Email"));
			allowedPushUsersItem.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ExternUid"));
			allowedPushUsersItem.setId(_ctx.longValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Id"));
			allowedPushUsersItem.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Name"));
			allowedPushUsersItem.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].NotificationLevel"));
			allowedPushUsersItem.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].State"));
			allowedPushUsersItem.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].UpdatedAt"));
			allowedPushUsersItem.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Username"));
			allowedPushUsersItem.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeProtectrepositorybranchesResponse.AllowedPushUsers["+ i +"].WebUrl"));

			allowedPushUsers.add(allowedPushUsersItem);
		}
		queryLinkeantcodeAntcodeProtectrepositorybranchesResponse.setAllowedPushUsers(allowedPushUsers);
	 
	 	return queryLinkeantcodeAntcodeProtectrepositorybranchesResponse;
	}
}