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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.DiscussionsItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse unmarshall(AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.RequestId"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResultCode"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResultMessage"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setCommitId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.CommitId"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.CreatedAt"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setDiscussionId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.DiscussionId"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Id"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setIsAward(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.IsAward"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setLineCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LineCode"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setLineType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LineType"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setNote(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Note"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setNoteableId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.NoteableId"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setNoteableType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.NoteableType"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setOutdated(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Outdated"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setPath(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Path"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setProjectId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ProjectId"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setResolvedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedAt"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setState(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.State"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setSystem(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.System"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Type"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.UpdatedAt"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Url"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Labels["+ i +"]"));
		}
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setLabels(labels);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Registered"));
		author.setRole(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Role"));
		author.setState(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.State"));
		author.setThemeId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setAuthor(author);

		LatestStDiff latestStDiff = new LatestStDiff();
		latestStDiff.setAddLineNum(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.AddLineNum"));
		latestStDiff.setAmode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.Amode"));
		latestStDiff.setAMode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.AMode"));
		latestStDiff.setBinaryFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.BinaryFile"));
		latestStDiff.setBmode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.Bmode"));
		latestStDiff.setBMode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.BMode"));
		latestStDiff.setCharsetName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.CharsetName"));
		latestStDiff.setCompareDiffId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.CompareDiffId"));
		latestStDiff.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.CreatedAt"));
		latestStDiff.setDeletedFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.DeletedFile"));
		latestStDiff.setDelLineNum(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.DelLineNum"));
		latestStDiff.setDiff(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.Diff"));
		latestStDiff.setHighlightedDiff(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.HighlightedDiff"));
		latestStDiff.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.Id"));
		latestStDiff.setNewFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.NewFile"));
		latestStDiff.setNewPath(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.NewPath"));
		latestStDiff.setOldPath(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.OldPath"));
		latestStDiff.setRenamedFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.RenamedFile"));
		latestStDiff.setSuffix(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.Suffix"));
		latestStDiff.setTooLarge(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.TooLarge"));
		latestStDiff.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.LatestStDiff.UpdatedAt"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setLatestStDiff(latestStDiff);

		ResolvedBy resolvedBy = new ResolvedBy();
		resolvedBy.setAccessLevel(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.AccessLevel"));
		resolvedBy.setAvatarUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.AvatarUrl"));
		resolvedBy.setBio(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Bio"));
		resolvedBy.setCanCreateGroup(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.CanCreateGroup"));
		resolvedBy.setCanCreateProject(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.CanCreateProject"));
		resolvedBy.setColorSchemeId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.ColorSchemeId"));
		resolvedBy.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.CreatedAt"));
		resolvedBy.setCurrentSignInAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.CurrentSignInAt"));
		resolvedBy.setDepartment(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Department"));
		resolvedBy.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Email"));
		resolvedBy.setExpiresAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.ExpiresAt"));
		resolvedBy.setExternUid(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.ExternUid"));
		resolvedBy.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Id"));
		resolvedBy.setIsAdmin(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.IsAdmin"));
		resolvedBy.setName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Name"));
		resolvedBy.setPrivateToken(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.PrivateToken"));
		resolvedBy.setProjectsLimit(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.ProjectsLimit"));
		resolvedBy.setRegistered(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Registered"));
		resolvedBy.setRole(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Role"));
		resolvedBy.setState(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.State"));
		resolvedBy.setThemeId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.ThemeId"));
		resolvedBy.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.UpdatedAt"));
		resolvedBy.setUsername(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Username"));
		resolvedBy.setWebsiteUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.WebsiteUrl"));
		resolvedBy.setWebUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.ResolvedBy.Identities["+ i +"]"));
		}
		resolvedBy.setIdentities3(identities3);
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setResolvedBy(resolvedBy);

		StDiff stDiff = new StDiff();
		stDiff.setAddLineNum(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.AddLineNum"));
		stDiff.setAmode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.Amode"));
		stDiff.setAMode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.AMode"));
		stDiff.setBinaryFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.BinaryFile"));
		stDiff.setBmode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.Bmode"));
		stDiff.setBMode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.BMode"));
		stDiff.setCharsetName(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.CharsetName"));
		stDiff.setCompareDiffId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.CompareDiffId"));
		stDiff.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.CreatedAt"));
		stDiff.setDeletedFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.DeletedFile"));
		stDiff.setDelLineNum(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.DelLineNum"));
		stDiff.setDiff(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.Diff"));
		stDiff.setHighlightedDiff(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.HighlightedDiff"));
		stDiff.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.Id"));
		stDiff.setNewFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.NewFile"));
		stDiff.setNewPath(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.NewPath"));
		stDiff.setOldPath(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.OldPath"));
		stDiff.setRenamedFile(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.RenamedFile"));
		stDiff.setSuffix(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.Suffix"));
		stDiff.setTooLarge(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.TooLarge"));
		stDiff.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.StDiff.UpdatedAt"));
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setStDiff(stDiff);

		List<DiscussionsItem> discussions = new ArrayList<DiscussionsItem>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions.Length"); i++) {
			DiscussionsItem discussionsItem = new DiscussionsItem();
			discussionsItem.setAuthor(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Author"));
			discussionsItem.setCommitId(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].CommitId"));
			discussionsItem.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].CreatedAt"));
			discussionsItem.setDiscussionId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].DiscussionId"));
			discussionsItem.setId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Id"));
			discussionsItem.setIsAward(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].IsAward"));
			discussionsItem.setLatestStDiff(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].LatestStDiff"));
			discussionsItem.setLineCode(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].LineCode"));
			discussionsItem.setLineType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].LineType"));
			discussionsItem.setNote(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Note"));
			discussionsItem.setNoteableId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].NoteableId"));
			discussionsItem.setNoteableType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].NoteableType"));
			discussionsItem.setOutdated(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Outdated"));
			discussionsItem.setPath(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Path"));
			discussionsItem.setProjectId(_ctx.longValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].ProjectId"));
			discussionsItem.setResolvedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].ResolvedAt"));
			discussionsItem.setResolvedBy(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].ResolvedBy"));
			discussionsItem.setState(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].State"));
			discussionsItem.setStDiff(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].StDiff"));
			discussionsItem.setSystem(_ctx.booleanValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].System"));
			discussionsItem.setType(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Type"));
			discussionsItem.setUpdatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].UpdatedAt"));
			discussionsItem.setUrl(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Url"));

			List<String> discussions1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Discussions.Length"); j++) {
				discussions1.add(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Discussions["+ j +"]"));
			}
			discussionsItem.setDiscussions1(discussions1);

			List<String> labels2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Labels.Length"); j++) {
				labels2.add(_ctx.stringValue("AddLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.Discussions["+ i +"].Labels["+ j +"]"));
			}
			discussionsItem.setLabels2(labels2);

			discussions.add(discussionsItem);
		}
		addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse.setDiscussions(discussions);
	 
	 	return addLinkeantcodeAntcodeProjectsidpullrequestspullrequestidcommentsResponse;
	}
}