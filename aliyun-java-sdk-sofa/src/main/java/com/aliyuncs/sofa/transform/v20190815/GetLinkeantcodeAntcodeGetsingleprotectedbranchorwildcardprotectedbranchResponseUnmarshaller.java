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

import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsersItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsersItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponseUnmarshaller {

	public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse unmarshall(GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse, UnmarshallerContext _ctx) {
		
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setRequestId(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.RequestId"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setResultCode(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.ResultCode"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setResultMessage(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.ResultMessage"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setId(_ctx.longValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Id"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setMergeAccessLevel(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.MergeAccessLevel"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setName(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Name"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setPushAccessLevel(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.PushAccessLevel"));
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setResponseStatusCode(_ctx.longValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.ResponseStatusCode"));

		List<String> matchedBranches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.MatchedBranches.Length"); i++) {
			matchedBranches.add(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.MatchedBranches["+ i +"]"));
		}
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setMatchedBranches(matchedBranches);

		Commit commit = new Commit();
		commit.setAuthoredDate(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.CommittedDate"));
		commit.setCommitterEmail(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.ShortId"));
		commit.setTitle(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.Title"));

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setCommit(commit);

		List<AllowedMergeUsersItem> allowedMergeUsers = new ArrayList<AllowedMergeUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers.Length"); i++) {
			AllowedMergeUsersItem allowedMergeUsersItem = new AllowedMergeUsersItem();
			allowedMergeUsersItem.setAvatarUrl(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].AvatarUrl"));
			allowedMergeUsersItem.setCreatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].CreatedAt"));
			allowedMergeUsersItem.setEmail(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].Email"));
			allowedMergeUsersItem.setExternUid(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].ExternUid"));
			allowedMergeUsersItem.setId(_ctx.longValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].Id"));
			allowedMergeUsersItem.setName(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].Name"));
			allowedMergeUsersItem.setNotificationLevel(_ctx.longValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].NotificationLevel"));
			allowedMergeUsersItem.setState(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].State"));
			allowedMergeUsersItem.setUpdatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].UpdatedAt"));
			allowedMergeUsersItem.setUsername(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].Username"));
			allowedMergeUsersItem.setWebUrl(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedMergeUsers["+ i +"].WebUrl"));

			allowedMergeUsers.add(allowedMergeUsersItem);
		}
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setAllowedMergeUsers(allowedMergeUsers);

		List<AllowedPushUsersItem> allowedPushUsers = new ArrayList<AllowedPushUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers.Length"); i++) {
			AllowedPushUsersItem allowedPushUsersItem = new AllowedPushUsersItem();
			allowedPushUsersItem.setAvatarUrl(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].AvatarUrl"));
			allowedPushUsersItem.setCreatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].CreatedAt"));
			allowedPushUsersItem.setEmail(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].Email"));
			allowedPushUsersItem.setExternUid(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].ExternUid"));
			allowedPushUsersItem.setId(_ctx.longValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].Id"));
			allowedPushUsersItem.setName(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].Name"));
			allowedPushUsersItem.setNotificationLevel(_ctx.longValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].NotificationLevel"));
			allowedPushUsersItem.setState(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].State"));
			allowedPushUsersItem.setUpdatedAt(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].UpdatedAt"));
			allowedPushUsersItem.setUsername(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].Username"));
			allowedPushUsersItem.setWebUrl(_ctx.stringValue("GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.AllowedPushUsers["+ i +"].WebUrl"));

			allowedPushUsers.add(allowedPushUsersItem);
		}
		getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse.setAllowedPushUsers(allowedPushUsers);
	 
	 	return getLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchResponse;
	}
}