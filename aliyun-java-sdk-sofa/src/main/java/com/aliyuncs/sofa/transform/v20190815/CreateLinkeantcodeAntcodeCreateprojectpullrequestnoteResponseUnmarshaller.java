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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.DiscussionsItem;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse unmarshall(CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.RequestId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResultCode"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.CommitId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.CreatedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setDiscussionId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.DiscussionId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Id"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setIsAward(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.IsAward"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setLineCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LineCode"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setLineType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LineType"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setNote(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Note"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setNoteableId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.NoteableId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setNoteableType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.NoteableType"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setOutdated(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Outdated"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Path"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ProjectId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setResolvedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.State"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setSystem(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.System"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Type"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.UpdatedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Url"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Labels["+ i +"]"));
		}
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setLabels(labels);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Registered"));
		author.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Role"));
		author.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.State"));
		author.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setAuthor(author);

		LatestStDiff latestStDiff = new LatestStDiff();
		latestStDiff.setAddLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.AddLineNum"));
		latestStDiff.setAmode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.Amode"));
		latestStDiff.setAMode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.AMode"));
		latestStDiff.setBinaryFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.BinaryFile"));
		latestStDiff.setBmode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.Bmode"));
		latestStDiff.setBMode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.BMode"));
		latestStDiff.setCharsetName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.CharsetName"));
		latestStDiff.setCompareDiffId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.CompareDiffId"));
		latestStDiff.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.CreatedAt"));
		latestStDiff.setDeletedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.DeletedFile"));
		latestStDiff.setDelLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.DelLineNum"));
		latestStDiff.setDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.Diff"));
		latestStDiff.setHighlightedDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.HighlightedDiff"));
		latestStDiff.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.Id"));
		latestStDiff.setNewFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.NewFile"));
		latestStDiff.setNewPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.NewPath"));
		latestStDiff.setOldPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.OldPath"));
		latestStDiff.setRenamedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.RenamedFile"));
		latestStDiff.setSuffix(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.Suffix"));
		latestStDiff.setTooLarge(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.TooLarge"));
		latestStDiff.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.LatestStDiff.UpdatedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setLatestStDiff(latestStDiff);

		ResolvedBy resolvedBy = new ResolvedBy();
		resolvedBy.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.AccessLevel"));
		resolvedBy.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.AvatarUrl"));
		resolvedBy.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Bio"));
		resolvedBy.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.CanCreateGroup"));
		resolvedBy.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.CanCreateProject"));
		resolvedBy.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.ColorSchemeId"));
		resolvedBy.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.CreatedAt"));
		resolvedBy.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.CurrentSignInAt"));
		resolvedBy.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Department"));
		resolvedBy.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Email"));
		resolvedBy.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.ExpiresAt"));
		resolvedBy.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.ExternUid"));
		resolvedBy.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Id"));
		resolvedBy.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.IsAdmin"));
		resolvedBy.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Name"));
		resolvedBy.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.PrivateToken"));
		resolvedBy.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.ProjectsLimit"));
		resolvedBy.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Registered"));
		resolvedBy.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Role"));
		resolvedBy.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.State"));
		resolvedBy.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.ThemeId"));
		resolvedBy.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.UpdatedAt"));
		resolvedBy.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Username"));
		resolvedBy.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.WebsiteUrl"));
		resolvedBy.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.ResolvedBy.Identities["+ i +"]"));
		}
		resolvedBy.setIdentities3(identities3);
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setResolvedBy(resolvedBy);

		StDiff stDiff = new StDiff();
		stDiff.setAddLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.AddLineNum"));
		stDiff.setAmode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.Amode"));
		stDiff.setAMode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.AMode"));
		stDiff.setBinaryFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.BinaryFile"));
		stDiff.setBmode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.Bmode"));
		stDiff.setBMode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.BMode"));
		stDiff.setCharsetName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.CharsetName"));
		stDiff.setCompareDiffId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.CompareDiffId"));
		stDiff.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.CreatedAt"));
		stDiff.setDeletedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.DeletedFile"));
		stDiff.setDelLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.DelLineNum"));
		stDiff.setDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.Diff"));
		stDiff.setHighlightedDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.HighlightedDiff"));
		stDiff.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.Id"));
		stDiff.setNewFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.NewFile"));
		stDiff.setNewPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.NewPath"));
		stDiff.setOldPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.OldPath"));
		stDiff.setRenamedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.RenamedFile"));
		stDiff.setSuffix(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.Suffix"));
		stDiff.setTooLarge(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.TooLarge"));
		stDiff.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.StDiff.UpdatedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setStDiff(stDiff);

		List<DiscussionsItem> discussions = new ArrayList<DiscussionsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions.Length"); i++) {
			DiscussionsItem discussionsItem = new DiscussionsItem();
			discussionsItem.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Author"));
			discussionsItem.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].CommitId"));
			discussionsItem.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].CreatedAt"));
			discussionsItem.setDiscussionId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].DiscussionId"));
			discussionsItem.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Id"));
			discussionsItem.setIsAward(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].IsAward"));
			discussionsItem.setLatestStDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].LatestStDiff"));
			discussionsItem.setLineCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].LineCode"));
			discussionsItem.setLineType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].LineType"));
			discussionsItem.setNote(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Note"));
			discussionsItem.setNoteableId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].NoteableId"));
			discussionsItem.setNoteableType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].NoteableType"));
			discussionsItem.setOutdated(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Outdated"));
			discussionsItem.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Path"));
			discussionsItem.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].ProjectId"));
			discussionsItem.setResolvedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].ResolvedAt"));
			discussionsItem.setResolvedBy(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].ResolvedBy"));
			discussionsItem.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].State"));
			discussionsItem.setStDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].StDiff"));
			discussionsItem.setSystem(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].System"));
			discussionsItem.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Type"));
			discussionsItem.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].UpdatedAt"));
			discussionsItem.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Url"));

			List<String> discussions1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Discussions.Length"); j++) {
				discussions1.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Discussions["+ j +"]"));
			}
			discussionsItem.setDiscussions1(discussions1);

			List<String> labels2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Labels.Length"); j++) {
				labels2.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.Discussions["+ i +"].Labels["+ j +"]"));
			}
			discussionsItem.setLabels2(labels2);

			discussions.add(discussionsItem);
		}
		createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse.setDiscussions(discussions);
	 
	 	return createLinkeantcodeAntcodeCreateprojectpullrequestnoteResponse;
	}
}