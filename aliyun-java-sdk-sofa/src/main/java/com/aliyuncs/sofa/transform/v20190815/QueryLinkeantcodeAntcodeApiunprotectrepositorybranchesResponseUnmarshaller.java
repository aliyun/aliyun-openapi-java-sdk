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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsersItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsersItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse unmarshall(QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.RequestId"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.ResultCode"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.ResultMessage"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Id"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setMergeAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.MergeAccessLevel"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Name"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setPushAccessLevel(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.PushAccessLevel"));
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.ResponseStatusCode"));

		List<String> matchedBranches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.MatchedBranches.Length"); i++) {
			matchedBranches.add(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.MatchedBranches["+ i +"]"));
		}
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setMatchedBranches(matchedBranches);

		Commit commit = new Commit();
		commit.setAuthoredDate(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setCommit(commit);

		List<AllowedMergeUsersItem> allowedMergeUsers = new ArrayList<AllowedMergeUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers.Length"); i++) {
			AllowedMergeUsersItem allowedMergeUsersItem = new AllowedMergeUsersItem();
			allowedMergeUsersItem.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].AvatarUrl"));
			allowedMergeUsersItem.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].CreatedAt"));
			allowedMergeUsersItem.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Email"));
			allowedMergeUsersItem.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ExternUid"));
			allowedMergeUsersItem.setId(_ctx.longValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Id"));
			allowedMergeUsersItem.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Name"));
			allowedMergeUsersItem.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].NotificationLevel"));
			allowedMergeUsersItem.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].State"));
			allowedMergeUsersItem.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].UpdatedAt"));
			allowedMergeUsersItem.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Username"));
			allowedMergeUsersItem.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].WebUrl"));

			allowedMergeUsers.add(allowedMergeUsersItem);
		}
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setAllowedMergeUsers(allowedMergeUsers);

		List<AllowedPushUsersItem> allowedPushUsers = new ArrayList<AllowedPushUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers.Length"); i++) {
			AllowedPushUsersItem allowedPushUsersItem = new AllowedPushUsersItem();
			allowedPushUsersItem.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].AvatarUrl"));
			allowedPushUsersItem.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].CreatedAt"));
			allowedPushUsersItem.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Email"));
			allowedPushUsersItem.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ExternUid"));
			allowedPushUsersItem.setId(_ctx.longValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Id"));
			allowedPushUsersItem.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Name"));
			allowedPushUsersItem.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].NotificationLevel"));
			allowedPushUsersItem.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].State"));
			allowedPushUsersItem.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].UpdatedAt"));
			allowedPushUsersItem.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Username"));
			allowedPushUsersItem.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].WebUrl"));

			allowedPushUsers.add(allowedPushUsersItem);
		}
		queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse.setAllowedPushUsers(allowedPushUsers);
	 
	 	return queryLinkeantcodeAntcodeApiunprotectrepositorybranchesResponse;
	}
}