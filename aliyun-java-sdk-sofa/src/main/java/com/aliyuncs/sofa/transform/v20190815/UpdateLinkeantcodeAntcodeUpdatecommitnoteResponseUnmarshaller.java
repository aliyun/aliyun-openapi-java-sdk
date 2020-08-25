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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.DiscussionsItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse unmarshall(UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse updateLinkeantcodeAntcodeUpdatecommitnoteResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setCommitId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.CommitId"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.CreatedAt"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setDiscussionId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.DiscussionId"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Id"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setIsAward(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.IsAward"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setLineCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LineCode"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setLineType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LineType"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setNote(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Note"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setNoteableId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.NoteableId"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setNoteableType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.NoteableType"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setOutdated(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Outdated"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Path"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ProjectId"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setResolvedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedAt"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.State"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setSystem(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.System"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Type"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Url"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Labels["+ i +"]"));
		}
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setLabels(labels);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Registered"));
		author.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Role"));
		author.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.State"));
		author.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setAuthor(author);

		LatestStDiff latestStDiff = new LatestStDiff();
		latestStDiff.setAddLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.AddLineNum"));
		latestStDiff.setAmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.Amode"));
		latestStDiff.setAMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.AMode"));
		latestStDiff.setBinaryFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.BinaryFile"));
		latestStDiff.setBmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.Bmode"));
		latestStDiff.setBMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.BMode"));
		latestStDiff.setCharsetName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.CharsetName"));
		latestStDiff.setCompareDiffId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.CompareDiffId"));
		latestStDiff.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.CreatedAt"));
		latestStDiff.setDeletedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.DeletedFile"));
		latestStDiff.setDelLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.DelLineNum"));
		latestStDiff.setDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.Diff"));
		latestStDiff.setHighlightedDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.HighlightedDiff"));
		latestStDiff.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.Id"));
		latestStDiff.setNewFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.NewFile"));
		latestStDiff.setNewPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.NewPath"));
		latestStDiff.setOldPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.OldPath"));
		latestStDiff.setRenamedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.RenamedFile"));
		latestStDiff.setSuffix(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.Suffix"));
		latestStDiff.setTooLarge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.TooLarge"));
		latestStDiff.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.LatestStDiff.UpdatedAt"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setLatestStDiff(latestStDiff);

		ResolvedBy resolvedBy = new ResolvedBy();
		resolvedBy.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.AccessLevel"));
		resolvedBy.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.AvatarUrl"));
		resolvedBy.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Bio"));
		resolvedBy.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.CanCreateGroup"));
		resolvedBy.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.CanCreateProject"));
		resolvedBy.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.ColorSchemeId"));
		resolvedBy.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.CreatedAt"));
		resolvedBy.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.CurrentSignInAt"));
		resolvedBy.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Department"));
		resolvedBy.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Email"));
		resolvedBy.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.ExpiresAt"));
		resolvedBy.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.ExternUid"));
		resolvedBy.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Id"));
		resolvedBy.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.IsAdmin"));
		resolvedBy.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Name"));
		resolvedBy.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.PrivateToken"));
		resolvedBy.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.ProjectsLimit"));
		resolvedBy.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Registered"));
		resolvedBy.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Role"));
		resolvedBy.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.State"));
		resolvedBy.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.ThemeId"));
		resolvedBy.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.UpdatedAt"));
		resolvedBy.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Username"));
		resolvedBy.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.WebsiteUrl"));
		resolvedBy.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.ResolvedBy.Identities["+ i +"]"));
		}
		resolvedBy.setIdentities3(identities3);
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setResolvedBy(resolvedBy);

		StDiff stDiff = new StDiff();
		stDiff.setAddLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.AddLineNum"));
		stDiff.setAmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.Amode"));
		stDiff.setAMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.AMode"));
		stDiff.setBinaryFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.BinaryFile"));
		stDiff.setBmode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.Bmode"));
		stDiff.setBMode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.BMode"));
		stDiff.setCharsetName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.CharsetName"));
		stDiff.setCompareDiffId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.CompareDiffId"));
		stDiff.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.CreatedAt"));
		stDiff.setDeletedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.DeletedFile"));
		stDiff.setDelLineNum(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.DelLineNum"));
		stDiff.setDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.Diff"));
		stDiff.setHighlightedDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.HighlightedDiff"));
		stDiff.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.Id"));
		stDiff.setNewFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.NewFile"));
		stDiff.setNewPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.NewPath"));
		stDiff.setOldPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.OldPath"));
		stDiff.setRenamedFile(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.RenamedFile"));
		stDiff.setSuffix(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.Suffix"));
		stDiff.setTooLarge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.TooLarge"));
		stDiff.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.StDiff.UpdatedAt"));
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setStDiff(stDiff);

		List<DiscussionsItem> discussions = new ArrayList<DiscussionsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions.Length"); i++) {
			DiscussionsItem discussionsItem = new DiscussionsItem();
			discussionsItem.setAuthor(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Author"));
			discussionsItem.setCommitId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].CommitId"));
			discussionsItem.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].CreatedAt"));
			discussionsItem.setDiscussionId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].DiscussionId"));
			discussionsItem.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Id"));
			discussionsItem.setIsAward(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].IsAward"));
			discussionsItem.setLatestStDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].LatestStDiff"));
			discussionsItem.setLineCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].LineCode"));
			discussionsItem.setLineType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].LineType"));
			discussionsItem.setNote(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Note"));
			discussionsItem.setNoteableId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].NoteableId"));
			discussionsItem.setNoteableType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].NoteableType"));
			discussionsItem.setOutdated(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Outdated"));
			discussionsItem.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Path"));
			discussionsItem.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].ProjectId"));
			discussionsItem.setResolvedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].ResolvedAt"));
			discussionsItem.setResolvedBy(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].ResolvedBy"));
			discussionsItem.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].State"));
			discussionsItem.setStDiff(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].StDiff"));
			discussionsItem.setSystem(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].System"));
			discussionsItem.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Type"));
			discussionsItem.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].UpdatedAt"));
			discussionsItem.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Url"));

			List<String> discussions1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Discussions.Length"); j++) {
				discussions1.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Discussions["+ j +"]"));
			}
			discussionsItem.setDiscussions1(discussions1);

			List<String> labels2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Labels.Length"); j++) {
				labels2.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse.Discussions["+ i +"].Labels["+ j +"]"));
			}
			discussionsItem.setLabels2(labels2);

			discussions.add(discussionsItem);
		}
		updateLinkeantcodeAntcodeUpdatecommitnoteResponse.setDiscussions(discussions);
	 
	 	return updateLinkeantcodeAntcodeUpdatecommitnoteResponse;
	}
}