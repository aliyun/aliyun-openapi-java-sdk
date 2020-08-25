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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeSnippetnoteResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeSnippetnoteResponse.Author;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeSnippetnoteResponse.DiscussionsItem;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeSnippetnoteResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeSnippetnoteResponse unmarshall(CreateLinkeantcodeAntcodeSnippetnoteResponse createLinkeantcodeAntcodeSnippetnoteResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeSnippetnoteResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.RequestId"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResultCode"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResultMessage"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.CommitId"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.CreatedAt"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setDiscussionId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.DiscussionId"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Id"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setIsAward(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.IsAward"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setLineCode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LineCode"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setLineType(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LineType"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setNote(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Note"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setNoteableId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.NoteableId"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setNoteableType(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.NoteableType"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setOutdated(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Outdated"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Path"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ProjectId"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setResolvedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedAt"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.State"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setSystem(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.System"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Type"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.UpdatedAt"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Url"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Labels["+ i +"]"));
		}
		createLinkeantcodeAntcodeSnippetnoteResponse.setLabels(labels);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Registered"));
		author.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Role"));
		author.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.State"));
		author.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		createLinkeantcodeAntcodeSnippetnoteResponse.setAuthor(author);

		LatestStDiff latestStDiff = new LatestStDiff();
		latestStDiff.setAddLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.AddLineNum"));
		latestStDiff.setAmode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.Amode"));
		latestStDiff.setAMode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.AMode"));
		latestStDiff.setBinaryFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.BinaryFile"));
		latestStDiff.setBmode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.Bmode"));
		latestStDiff.setBMode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.BMode"));
		latestStDiff.setCharsetName(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.CharsetName"));
		latestStDiff.setCompareDiffId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.CompareDiffId"));
		latestStDiff.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.CreatedAt"));
		latestStDiff.setDeletedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.DeletedFile"));
		latestStDiff.setDelLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.DelLineNum"));
		latestStDiff.setDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.Diff"));
		latestStDiff.setHighlightedDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.HighlightedDiff"));
		latestStDiff.setId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.Id"));
		latestStDiff.setNewFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.NewFile"));
		latestStDiff.setNewPath(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.NewPath"));
		latestStDiff.setOldPath(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.OldPath"));
		latestStDiff.setRenamedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.RenamedFile"));
		latestStDiff.setSuffix(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.Suffix"));
		latestStDiff.setTooLarge(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.TooLarge"));
		latestStDiff.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.LatestStDiff.UpdatedAt"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setLatestStDiff(latestStDiff);

		ResolvedBy resolvedBy = new ResolvedBy();
		resolvedBy.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.AccessLevel"));
		resolvedBy.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.AvatarUrl"));
		resolvedBy.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Bio"));
		resolvedBy.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.CanCreateGroup"));
		resolvedBy.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.CanCreateProject"));
		resolvedBy.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.ColorSchemeId"));
		resolvedBy.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.CreatedAt"));
		resolvedBy.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.CurrentSignInAt"));
		resolvedBy.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Department"));
		resolvedBy.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Email"));
		resolvedBy.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.ExpiresAt"));
		resolvedBy.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.ExternUid"));
		resolvedBy.setId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Id"));
		resolvedBy.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.IsAdmin"));
		resolvedBy.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Name"));
		resolvedBy.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.PrivateToken"));
		resolvedBy.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.ProjectsLimit"));
		resolvedBy.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Registered"));
		resolvedBy.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Role"));
		resolvedBy.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.State"));
		resolvedBy.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.ThemeId"));
		resolvedBy.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.UpdatedAt"));
		resolvedBy.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Username"));
		resolvedBy.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.WebsiteUrl"));
		resolvedBy.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.ResolvedBy.Identities["+ i +"]"));
		}
		resolvedBy.setIdentities3(identities3);
		createLinkeantcodeAntcodeSnippetnoteResponse.setResolvedBy(resolvedBy);

		StDiff stDiff = new StDiff();
		stDiff.setAddLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.AddLineNum"));
		stDiff.setAmode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.Amode"));
		stDiff.setAMode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.AMode"));
		stDiff.setBinaryFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.BinaryFile"));
		stDiff.setBmode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.Bmode"));
		stDiff.setBMode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.BMode"));
		stDiff.setCharsetName(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.CharsetName"));
		stDiff.setCompareDiffId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.CompareDiffId"));
		stDiff.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.CreatedAt"));
		stDiff.setDeletedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.DeletedFile"));
		stDiff.setDelLineNum(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.DelLineNum"));
		stDiff.setDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.Diff"));
		stDiff.setHighlightedDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.HighlightedDiff"));
		stDiff.setId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.Id"));
		stDiff.setNewFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.NewFile"));
		stDiff.setNewPath(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.NewPath"));
		stDiff.setOldPath(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.OldPath"));
		stDiff.setRenamedFile(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.RenamedFile"));
		stDiff.setSuffix(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.Suffix"));
		stDiff.setTooLarge(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.TooLarge"));
		stDiff.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.StDiff.UpdatedAt"));
		createLinkeantcodeAntcodeSnippetnoteResponse.setStDiff(stDiff);

		List<DiscussionsItem> discussions = new ArrayList<DiscussionsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions.Length"); i++) {
			DiscussionsItem discussionsItem = new DiscussionsItem();
			discussionsItem.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Author"));
			discussionsItem.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].CommitId"));
			discussionsItem.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].CreatedAt"));
			discussionsItem.setDiscussionId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].DiscussionId"));
			discussionsItem.setId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Id"));
			discussionsItem.setIsAward(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].IsAward"));
			discussionsItem.setLatestStDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].LatestStDiff"));
			discussionsItem.setLineCode(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].LineCode"));
			discussionsItem.setLineType(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].LineType"));
			discussionsItem.setNote(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Note"));
			discussionsItem.setNoteableId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].NoteableId"));
			discussionsItem.setNoteableType(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].NoteableType"));
			discussionsItem.setOutdated(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Outdated"));
			discussionsItem.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Path"));
			discussionsItem.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].ProjectId"));
			discussionsItem.setResolvedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].ResolvedAt"));
			discussionsItem.setResolvedBy(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].ResolvedBy"));
			discussionsItem.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].State"));
			discussionsItem.setStDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].StDiff"));
			discussionsItem.setSystem(_ctx.booleanValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].System"));
			discussionsItem.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Type"));
			discussionsItem.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].UpdatedAt"));
			discussionsItem.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Url"));

			List<String> discussions1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Discussions.Length"); j++) {
				discussions1.add(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Discussions["+ j +"]"));
			}
			discussionsItem.setDiscussions1(discussions1);

			List<String> labels2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Labels.Length"); j++) {
				labels2.add(_ctx.stringValue("CreateLinkeantcodeAntcodeSnippetnoteResponse.Discussions["+ i +"].Labels["+ j +"]"));
			}
			discussionsItem.setLabels2(labels2);

			discussions.add(discussionsItem);
		}
		createLinkeantcodeAntcodeSnippetnoteResponse.setDiscussions(discussions);
	 
	 	return createLinkeantcodeAntcodeSnippetnoteResponse;
	}
}