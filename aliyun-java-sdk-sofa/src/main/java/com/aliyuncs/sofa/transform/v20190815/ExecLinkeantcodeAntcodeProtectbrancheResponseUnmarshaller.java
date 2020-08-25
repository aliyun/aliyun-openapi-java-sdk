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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProtectbrancheResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsersItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsersItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeProtectbrancheResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeProtectbrancheResponse unmarshall(ExecLinkeantcodeAntcodeProtectbrancheResponse execLinkeantcodeAntcodeProtectbrancheResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeProtectbrancheResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.RequestId"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.ResultCode"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.ResultMessage"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Id"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setMergeAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.MergeAccessLevel"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Name"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setPushAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.PushAccessLevel"));
		execLinkeantcodeAntcodeProtectbrancheResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.ResponseStatusCode"));

		List<String> matchedBranches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.MatchedBranches.Length"); i++) {
			matchedBranches.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.MatchedBranches["+ i +"]"));
		}
		execLinkeantcodeAntcodeProtectbrancheResponse.setMatchedBranches(matchedBranches);

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		execLinkeantcodeAntcodeProtectbrancheResponse.setCommit(commit);

		List<AllowedMergeUsersItem> allowedMergeUsers = new ArrayList<AllowedMergeUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers.Length"); i++) {
			AllowedMergeUsersItem allowedMergeUsersItem = new AllowedMergeUsersItem();
			allowedMergeUsersItem.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].AccessLevel"));
			allowedMergeUsersItem.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].AvatarUrl"));
			allowedMergeUsersItem.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Bio"));
			allowedMergeUsersItem.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].CanCreateGroup"));
			allowedMergeUsersItem.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].CanCreateProject"));
			allowedMergeUsersItem.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].ColorSchemeId"));
			allowedMergeUsersItem.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].CreatedAt"));
			allowedMergeUsersItem.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].CurrentSignInAt"));
			allowedMergeUsersItem.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Department"));
			allowedMergeUsersItem.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Email"));
			allowedMergeUsersItem.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].ExpiresAt"));
			allowedMergeUsersItem.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].ExternUid"));
			allowedMergeUsersItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Id"));
			allowedMergeUsersItem.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].IsAdmin"));
			allowedMergeUsersItem.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Name"));
			allowedMergeUsersItem.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].PrivateToken"));
			allowedMergeUsersItem.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].ProjectsLimit"));
			allowedMergeUsersItem.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Registered"));
			allowedMergeUsersItem.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Role"));
			allowedMergeUsersItem.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].State"));
			allowedMergeUsersItem.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].ThemeId"));
			allowedMergeUsersItem.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].UpdatedAt"));
			allowedMergeUsersItem.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Username"));
			allowedMergeUsersItem.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].WebsiteUrl"));
			allowedMergeUsersItem.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].WebUrl"));

			List<String> identities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Identities.Length"); j++) {
				identities.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedMergeUsers["+ i +"].Identities["+ j +"]"));
			}
			allowedMergeUsersItem.setIdentities(identities);

			allowedMergeUsers.add(allowedMergeUsersItem);
		}
		execLinkeantcodeAntcodeProtectbrancheResponse.setAllowedMergeUsers(allowedMergeUsers);

		List<AllowedPushUsersItem> allowedPushUsers = new ArrayList<AllowedPushUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers.Length"); i++) {
			AllowedPushUsersItem allowedPushUsersItem = new AllowedPushUsersItem();
			allowedPushUsersItem.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].AccessLevel"));
			allowedPushUsersItem.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].AvatarUrl"));
			allowedPushUsersItem.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Bio"));
			allowedPushUsersItem.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].CanCreateGroup"));
			allowedPushUsersItem.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].CanCreateProject"));
			allowedPushUsersItem.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].ColorSchemeId"));
			allowedPushUsersItem.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].CreatedAt"));
			allowedPushUsersItem.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].CurrentSignInAt"));
			allowedPushUsersItem.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Department"));
			allowedPushUsersItem.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Email"));
			allowedPushUsersItem.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].ExpiresAt"));
			allowedPushUsersItem.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].ExternUid"));
			allowedPushUsersItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Id"));
			allowedPushUsersItem.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].IsAdmin"));
			allowedPushUsersItem.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Name"));
			allowedPushUsersItem.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].PrivateToken"));
			allowedPushUsersItem.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].ProjectsLimit"));
			allowedPushUsersItem.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Registered"));
			allowedPushUsersItem.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Role"));
			allowedPushUsersItem.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].State"));
			allowedPushUsersItem.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].ThemeId"));
			allowedPushUsersItem.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].UpdatedAt"));
			allowedPushUsersItem.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Username"));
			allowedPushUsersItem.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].WebsiteUrl"));
			allowedPushUsersItem.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].WebUrl"));

			List<String> identities1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Identities.Length"); j++) {
				identities1.add(_ctx.stringValue("ExecLinkeantcodeAntcodeProtectbrancheResponse.AllowedPushUsers["+ i +"].Identities["+ j +"]"));
			}
			allowedPushUsersItem.setIdentities1(identities1);

			allowedPushUsers.add(allowedPushUsersItem);
		}
		execLinkeantcodeAntcodeProtectbrancheResponse.setAllowedPushUsers(allowedPushUsers);
	 
	 	return execLinkeantcodeAntcodeProtectbrancheResponse;
	}
}