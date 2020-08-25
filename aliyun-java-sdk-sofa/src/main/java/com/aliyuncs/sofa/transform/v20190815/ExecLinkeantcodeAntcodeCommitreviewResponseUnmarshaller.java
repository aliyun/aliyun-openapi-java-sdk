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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeCommitreviewResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeCommitreviewResponse.Author;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeCommitreviewResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeCommitreviewResponse unmarshall(ExecLinkeantcodeAntcodeCommitreviewResponse execLinkeantcodeAntcodeCommitreviewResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeCommitreviewResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.RequestId"));
		execLinkeantcodeAntcodeCommitreviewResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ResultCode"));
		execLinkeantcodeAntcodeCommitreviewResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ResultMessage"));
		execLinkeantcodeAntcodeCommitreviewResponse.setBody(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Body"));
		execLinkeantcodeAntcodeCommitreviewResponse.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.CreatedAt"));
		execLinkeantcodeAntcodeCommitreviewResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Id"));
		execLinkeantcodeAntcodeCommitreviewResponse.setPending(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Pending"));
		execLinkeantcodeAntcodeCommitreviewResponse.setPullRequestId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.PullRequestId"));
		execLinkeantcodeAntcodeCommitreviewResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeCommitreviewResponse.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.UpdatedAt"));

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Registered"));
		author.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Role"));
		author.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.State"));
		author.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		execLinkeantcodeAntcodeCommitreviewResponse.setAuthor(author);

		List<ReviewNotesItem> reviewNotes = new ArrayList<ReviewNotesItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes.Length"); i++) {
			ReviewNotesItem reviewNotesItem = new ReviewNotesItem();
			reviewNotesItem.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Author"));
			reviewNotesItem.setCommitId(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].CommitId"));
			reviewNotesItem.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].CreatedAt"));
			reviewNotesItem.setDiscussionId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].DiscussionId"));
			reviewNotesItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Id"));
			reviewNotesItem.setIsAward(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].IsAward"));
			reviewNotesItem.setLatestStDiff(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].LatestStDiff"));
			reviewNotesItem.setLineCode(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].LineCode"));
			reviewNotesItem.setLineType(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].LineType"));
			reviewNotesItem.setNote(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Note"));
			reviewNotesItem.setNoteableId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].NoteableId"));
			reviewNotesItem.setNoteableType(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].NoteableType"));
			reviewNotesItem.setOutdated(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Outdated"));
			reviewNotesItem.setPath(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Path"));
			reviewNotesItem.setProjectId(_ctx.longValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].ProjectId"));
			reviewNotesItem.setResolvedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].ResolvedAt"));
			reviewNotesItem.setResolvedBy(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].ResolvedBy"));
			reviewNotesItem.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].State"));
			reviewNotesItem.setStDiff(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].StDiff"));
			reviewNotesItem.setSystem(_ctx.booleanValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].System"));
			reviewNotesItem.setType(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Type"));
			reviewNotesItem.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].UpdatedAt"));
			reviewNotesItem.setUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Url"));

			List<String> discussions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Discussions.Length"); j++) {
				discussions.add(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Discussions["+ j +"]"));
			}
			reviewNotesItem.setDiscussions(discussions);

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("ExecLinkeantcodeAntcodeCommitreviewResponse.ReviewNotes["+ i +"].Labels["+ j +"]"));
			}
			reviewNotesItem.setLabels(labels);

			reviewNotes.add(reviewNotesItem);
		}
		execLinkeantcodeAntcodeCommitreviewResponse.setReviewNotes(reviewNotes);
	 
	 	return execLinkeantcodeAntcodeCommitreviewResponse;
	}
}