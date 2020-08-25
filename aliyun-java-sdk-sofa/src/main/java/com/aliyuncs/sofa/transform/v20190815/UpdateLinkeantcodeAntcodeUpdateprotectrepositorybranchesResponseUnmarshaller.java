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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsersItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsersItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse unmarshall(UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Id"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setMergeAccessLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.MergeAccessLevel"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Name"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setPushAccessLevel(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.PushAccessLevel"));
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.ResponseStatusCode"));

		List<String> matchedBranches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.MatchedBranches.Length"); i++) {
			matchedBranches.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.MatchedBranches["+ i +"]"));
		}
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setMatchedBranches(matchedBranches);

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setCommit(commit);

		List<AllowedMergeUsersItem> allowedMergeUsers = new ArrayList<AllowedMergeUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers.Length"); i++) {
			AllowedMergeUsersItem allowedMergeUsersItem = new AllowedMergeUsersItem();
			allowedMergeUsersItem.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].AccessLevel"));
			allowedMergeUsersItem.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].AvatarUrl"));
			allowedMergeUsersItem.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Bio"));
			allowedMergeUsersItem.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].CanCreateGroup"));
			allowedMergeUsersItem.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].CanCreateProject"));
			allowedMergeUsersItem.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ColorSchemeId"));
			allowedMergeUsersItem.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].CreatedAt"));
			allowedMergeUsersItem.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].CurrentSignInAt"));
			allowedMergeUsersItem.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Department"));
			allowedMergeUsersItem.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Email"));
			allowedMergeUsersItem.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ExpiresAt"));
			allowedMergeUsersItem.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ExternUid"));
			allowedMergeUsersItem.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Id"));
			allowedMergeUsersItem.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].IsAdmin"));
			allowedMergeUsersItem.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Name"));
			allowedMergeUsersItem.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].PrivateToken"));
			allowedMergeUsersItem.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ProjectsLimit"));
			allowedMergeUsersItem.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Registered"));
			allowedMergeUsersItem.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Role"));
			allowedMergeUsersItem.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].State"));
			allowedMergeUsersItem.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].ThemeId"));
			allowedMergeUsersItem.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].UpdatedAt"));
			allowedMergeUsersItem.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Username"));
			allowedMergeUsersItem.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].WebsiteUrl"));
			allowedMergeUsersItem.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].WebUrl"));

			List<String> identities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Identities.Length"); j++) {
				identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedMergeUsers["+ i +"].Identities["+ j +"]"));
			}
			allowedMergeUsersItem.setIdentities(identities);

			allowedMergeUsers.add(allowedMergeUsersItem);
		}
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setAllowedMergeUsers(allowedMergeUsers);

		List<AllowedPushUsersItem> allowedPushUsers = new ArrayList<AllowedPushUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers.Length"); i++) {
			AllowedPushUsersItem allowedPushUsersItem = new AllowedPushUsersItem();
			allowedPushUsersItem.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].AccessLevel"));
			allowedPushUsersItem.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].AvatarUrl"));
			allowedPushUsersItem.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Bio"));
			allowedPushUsersItem.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].CanCreateGroup"));
			allowedPushUsersItem.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].CanCreateProject"));
			allowedPushUsersItem.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ColorSchemeId"));
			allowedPushUsersItem.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].CreatedAt"));
			allowedPushUsersItem.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].CurrentSignInAt"));
			allowedPushUsersItem.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Department"));
			allowedPushUsersItem.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Email"));
			allowedPushUsersItem.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ExpiresAt"));
			allowedPushUsersItem.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ExternUid"));
			allowedPushUsersItem.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Id"));
			allowedPushUsersItem.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].IsAdmin"));
			allowedPushUsersItem.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Name"));
			allowedPushUsersItem.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].PrivateToken"));
			allowedPushUsersItem.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ProjectsLimit"));
			allowedPushUsersItem.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Registered"));
			allowedPushUsersItem.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Role"));
			allowedPushUsersItem.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].State"));
			allowedPushUsersItem.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].ThemeId"));
			allowedPushUsersItem.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].UpdatedAt"));
			allowedPushUsersItem.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Username"));
			allowedPushUsersItem.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].WebsiteUrl"));
			allowedPushUsersItem.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].WebUrl"));

			List<String> identities1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Identities.Length"); j++) {
				identities1.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.AllowedPushUsers["+ i +"].Identities["+ j +"]"));
			}
			allowedPushUsersItem.setIdentities1(identities1);

			allowedPushUsers.add(allowedPushUsersItem);
		}
		updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse.setAllowedPushUsers(allowedPushUsers);
	 
	 	return updateLinkeantcodeAntcodeUpdateprotectrepositorybranchesResponse;
	}
}