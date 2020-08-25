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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnprotectbrancheResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsersItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsersItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeUnprotectbrancheResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeUnprotectbrancheResponse unmarshall(ExecLinkeantcodeAntcodeUnprotectbrancheResponse execLinkeantcodeAntcodeUnprotectbrancheResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.RequestId"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.ResultCode"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.ResultMessage"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Id"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setMergeAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.MergeAccessLevel"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Name"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setPushAccessLevel(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.PushAccessLevel"));
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.ResponseStatusCode"));

		List<String> matchedBranches = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.MatchedBranches.Length"); i++) {
			matchedBranches.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.MatchedBranches["+ i +"]"));
		}
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setMatchedBranches(matchedBranches);

		Commit commit = new Commit();
		commit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.Author"));
		commit.setAuthoredDate(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.AuthoredDate"));
		commit.setAuthorEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.AuthorEmail"));
		commit.setAuthorName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.AuthorName"));
		commit.setCommittedDate(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.CommittedDate"));
		commit.setCommitter(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.Committer"));
		commit.setCommitterEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.CommitterEmail"));
		commit.setCommitterName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.CommitterName"));
		commit.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.CreatedAt"));
		commit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.Id"));
		commit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.Message"));
		commit.setShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.ShortId"));
		commit.setSignature(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.Signature"));
		commit.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.Title"));

		List<String> checkSuites = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.CheckSuites.Length"); i++) {
			checkSuites.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.CheckSuites["+ i +"]"));
		}
		commit.setCheckSuites(checkSuites);

		List<String> parentIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.ParentIds.Length"); i++) {
			parentIds.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.Commit.ParentIds["+ i +"]"));
		}
		commit.setParentIds(parentIds);
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setCommit(commit);

		List<AllowedMergeUsersItem> allowedMergeUsers = new ArrayList<AllowedMergeUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers.Length"); i++) {
			AllowedMergeUsersItem allowedMergeUsersItem = new AllowedMergeUsersItem();
			allowedMergeUsersItem.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].AccessLevel"));
			allowedMergeUsersItem.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].AvatarUrl"));
			allowedMergeUsersItem.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Bio"));
			allowedMergeUsersItem.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].CanCreateGroup"));
			allowedMergeUsersItem.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].CanCreateProject"));
			allowedMergeUsersItem.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].ColorSchemeId"));
			allowedMergeUsersItem.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].CreatedAt"));
			allowedMergeUsersItem.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].CurrentSignInAt"));
			allowedMergeUsersItem.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Department"));
			allowedMergeUsersItem.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Email"));
			allowedMergeUsersItem.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].ExpiresAt"));
			allowedMergeUsersItem.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].ExternUid"));
			allowedMergeUsersItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Id"));
			allowedMergeUsersItem.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].IsAdmin"));
			allowedMergeUsersItem.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Name"));
			allowedMergeUsersItem.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].PrivateToken"));
			allowedMergeUsersItem.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].ProjectsLimit"));
			allowedMergeUsersItem.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Registered"));
			allowedMergeUsersItem.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Role"));
			allowedMergeUsersItem.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].State"));
			allowedMergeUsersItem.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].ThemeId"));
			allowedMergeUsersItem.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].UpdatedAt"));
			allowedMergeUsersItem.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Username"));
			allowedMergeUsersItem.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].WebsiteUrl"));
			allowedMergeUsersItem.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].WebUrl"));

			List<String> identities = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Identities.Length"); j++) {
				identities.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedMergeUsers["+ i +"].Identities["+ j +"]"));
			}
			allowedMergeUsersItem.setIdentities(identities);

			allowedMergeUsers.add(allowedMergeUsersItem);
		}
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setAllowedMergeUsers(allowedMergeUsers);

		List<AllowedPushUsersItem> allowedPushUsers = new ArrayList<AllowedPushUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers.Length"); i++) {
			AllowedPushUsersItem allowedPushUsersItem = new AllowedPushUsersItem();
			allowedPushUsersItem.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].AccessLevel"));
			allowedPushUsersItem.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].AvatarUrl"));
			allowedPushUsersItem.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Bio"));
			allowedPushUsersItem.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].CanCreateGroup"));
			allowedPushUsersItem.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].CanCreateProject"));
			allowedPushUsersItem.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].ColorSchemeId"));
			allowedPushUsersItem.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].CreatedAt"));
			allowedPushUsersItem.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].CurrentSignInAt"));
			allowedPushUsersItem.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Department"));
			allowedPushUsersItem.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Email"));
			allowedPushUsersItem.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].ExpiresAt"));
			allowedPushUsersItem.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].ExternUid"));
			allowedPushUsersItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Id"));
			allowedPushUsersItem.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].IsAdmin"));
			allowedPushUsersItem.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Name"));
			allowedPushUsersItem.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].PrivateToken"));
			allowedPushUsersItem.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].ProjectsLimit"));
			allowedPushUsersItem.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Registered"));
			allowedPushUsersItem.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Role"));
			allowedPushUsersItem.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].State"));
			allowedPushUsersItem.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].ThemeId"));
			allowedPushUsersItem.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].UpdatedAt"));
			allowedPushUsersItem.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Username"));
			allowedPushUsersItem.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].WebsiteUrl"));
			allowedPushUsersItem.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].WebUrl"));

			List<String> identities1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Identities.Length"); j++) {
				identities1.add(_ctx.stringValue("ExecLinkeantcodeAntcodeUnprotectbrancheResponse.AllowedPushUsers["+ i +"].Identities["+ j +"]"));
			}
			allowedPushUsersItem.setIdentities1(identities1);

			allowedPushUsers.add(allowedPushUsersItem);
		}
		execLinkeantcodeAntcodeUnprotectbrancheResponse.setAllowedPushUsers(allowedPushUsers);
	 
	 	return execLinkeantcodeAntcodeUnprotectbrancheResponse;
	}
}