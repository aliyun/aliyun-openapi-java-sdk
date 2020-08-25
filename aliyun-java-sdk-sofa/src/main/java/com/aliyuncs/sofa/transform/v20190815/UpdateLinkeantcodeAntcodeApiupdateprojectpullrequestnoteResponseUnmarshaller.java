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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.DiscussionsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse unmarshall(UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.RequestId"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResultCode"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResultMessage"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setCommitId(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.CommitId"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.CreatedAt"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setDiscussionId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.DiscussionId"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Id"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setIsAward(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.IsAward"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setLineCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LineCode"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setLineType(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LineType"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setNote(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Note"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setNoteableId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.NoteableId"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setNoteableType(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.NoteableType"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setOutdated(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Outdated"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Path"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ProjectId"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setResolvedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedAt"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.State"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setSystem(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.System"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Type"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Url"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Labels["+ i +"]"));
		}
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setLabels(labels);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Registered"));
		author.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Role"));
		author.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.State"));
		author.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setAuthor(author);

		LatestStDiff latestStDiff = new LatestStDiff();
		latestStDiff.setAddLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.AddLineNum"));
		latestStDiff.setAmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.Amode"));
		latestStDiff.setAMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.AMode"));
		latestStDiff.setBinaryFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.BinaryFile"));
		latestStDiff.setBmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.Bmode"));
		latestStDiff.setBMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.BMode"));
		latestStDiff.setCharsetName(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.CharsetName"));
		latestStDiff.setCompareDiffId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.CompareDiffId"));
		latestStDiff.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.CreatedAt"));
		latestStDiff.setDeletedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.DeletedFile"));
		latestStDiff.setDelLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.DelLineNum"));
		latestStDiff.setDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.Diff"));
		latestStDiff.setHighlightedDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.HighlightedDiff"));
		latestStDiff.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.Id"));
		latestStDiff.setNewFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.NewFile"));
		latestStDiff.setNewPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.NewPath"));
		latestStDiff.setOldPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.OldPath"));
		latestStDiff.setRenamedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.RenamedFile"));
		latestStDiff.setSuffix(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.Suffix"));
		latestStDiff.setTooLarge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.TooLarge"));
		latestStDiff.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.LatestStDiff.UpdatedAt"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setLatestStDiff(latestStDiff);

		ResolvedBy resolvedBy = new ResolvedBy();
		resolvedBy.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.AccessLevel"));
		resolvedBy.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.AvatarUrl"));
		resolvedBy.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Bio"));
		resolvedBy.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.CanCreateGroup"));
		resolvedBy.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.CanCreateProject"));
		resolvedBy.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.ColorSchemeId"));
		resolvedBy.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.CreatedAt"));
		resolvedBy.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.CurrentSignInAt"));
		resolvedBy.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Department"));
		resolvedBy.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Email"));
		resolvedBy.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.ExpiresAt"));
		resolvedBy.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.ExternUid"));
		resolvedBy.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Id"));
		resolvedBy.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.IsAdmin"));
		resolvedBy.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Name"));
		resolvedBy.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.PrivateToken"));
		resolvedBy.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.ProjectsLimit"));
		resolvedBy.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Registered"));
		resolvedBy.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Role"));
		resolvedBy.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.State"));
		resolvedBy.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.ThemeId"));
		resolvedBy.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.UpdatedAt"));
		resolvedBy.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Username"));
		resolvedBy.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.WebsiteUrl"));
		resolvedBy.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.ResolvedBy.Identities["+ i +"]"));
		}
		resolvedBy.setIdentities3(identities3);
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setResolvedBy(resolvedBy);

		StDiff stDiff = new StDiff();
		stDiff.setAddLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.AddLineNum"));
		stDiff.setAmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.Amode"));
		stDiff.setAMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.AMode"));
		stDiff.setBinaryFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.BinaryFile"));
		stDiff.setBmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.Bmode"));
		stDiff.setBMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.BMode"));
		stDiff.setCharsetName(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.CharsetName"));
		stDiff.setCompareDiffId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.CompareDiffId"));
		stDiff.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.CreatedAt"));
		stDiff.setDeletedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.DeletedFile"));
		stDiff.setDelLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.DelLineNum"));
		stDiff.setDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.Diff"));
		stDiff.setHighlightedDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.HighlightedDiff"));
		stDiff.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.Id"));
		stDiff.setNewFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.NewFile"));
		stDiff.setNewPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.NewPath"));
		stDiff.setOldPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.OldPath"));
		stDiff.setRenamedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.RenamedFile"));
		stDiff.setSuffix(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.Suffix"));
		stDiff.setTooLarge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.TooLarge"));
		stDiff.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.StDiff.UpdatedAt"));
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setStDiff(stDiff);

		List<DiscussionsItem> discussions = new ArrayList<DiscussionsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions.Length"); i++) {
			DiscussionsItem discussionsItem = new DiscussionsItem();
			discussionsItem.setAuthor(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Author"));
			discussionsItem.setCommitId(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].CommitId"));
			discussionsItem.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].CreatedAt"));
			discussionsItem.setDiscussionId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].DiscussionId"));
			discussionsItem.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Id"));
			discussionsItem.setIsAward(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].IsAward"));
			discussionsItem.setLatestStDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].LatestStDiff"));
			discussionsItem.setLineCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].LineCode"));
			discussionsItem.setLineType(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].LineType"));
			discussionsItem.setNote(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Note"));
			discussionsItem.setNoteableId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].NoteableId"));
			discussionsItem.setNoteableType(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].NoteableType"));
			discussionsItem.setOutdated(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Outdated"));
			discussionsItem.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Path"));
			discussionsItem.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].ProjectId"));
			discussionsItem.setResolvedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].ResolvedAt"));
			discussionsItem.setResolvedBy(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].ResolvedBy"));
			discussionsItem.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].State"));
			discussionsItem.setStDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].StDiff"));
			discussionsItem.setSystem(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].System"));
			discussionsItem.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Type"));
			discussionsItem.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].UpdatedAt"));
			discussionsItem.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Url"));

			List<String> discussions1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Discussions.Length"); j++) {
				discussions1.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Discussions["+ j +"]"));
			}
			discussionsItem.setDiscussions1(discussions1);

			List<String> labels2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Labels.Length"); j++) {
				labels2.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.Discussions["+ i +"].Labels["+ j +"]"));
			}
			discussionsItem.setLabels2(labels2);

			discussions.add(discussionsItem);
		}
		updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse.setDiscussions(discussions);
	 
	 	return updateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponse;
	}
}