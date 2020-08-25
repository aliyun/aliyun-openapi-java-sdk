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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeApicreatereviewResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeApicreatereviewResponse.Author;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeApicreatereviewResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeApicreatereviewResponse unmarshall(CreateLinkeantcodeAntcodeApicreatereviewResponse createLinkeantcodeAntcodeApicreatereviewResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeApicreatereviewResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.RequestId"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ResultCode"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ResultMessage"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setBody(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Body"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.CreatedAt"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Id"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setPending(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Pending"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setPullRequestId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.PullRequestId"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeApicreatereviewResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.UpdatedAt"));

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Registered"));
		author.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Role"));
		author.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.State"));
		author.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		createLinkeantcodeAntcodeApicreatereviewResponse.setAuthor(author);

		List<ReviewNotesItem> reviewNotes = new ArrayList<ReviewNotesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes.Length"); i++) {
			ReviewNotesItem reviewNotesItem = new ReviewNotesItem();
			reviewNotesItem.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Author"));
			reviewNotesItem.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].CommitId"));
			reviewNotesItem.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].CreatedAt"));
			reviewNotesItem.setDiscussionId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].DiscussionId"));
			reviewNotesItem.setId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Id"));
			reviewNotesItem.setIsAward(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].IsAward"));
			reviewNotesItem.setLatestStDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].LatestStDiff"));
			reviewNotesItem.setLineCode(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].LineCode"));
			reviewNotesItem.setLineType(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].LineType"));
			reviewNotesItem.setNote(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Note"));
			reviewNotesItem.setNoteableId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].NoteableId"));
			reviewNotesItem.setNoteableType(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].NoteableType"));
			reviewNotesItem.setOutdated(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Outdated"));
			reviewNotesItem.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Path"));
			reviewNotesItem.setProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].ProjectId"));
			reviewNotesItem.setResolvedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].ResolvedAt"));
			reviewNotesItem.setResolvedBy(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].ResolvedBy"));
			reviewNotesItem.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].State"));
			reviewNotesItem.setStDiff(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].StDiff"));
			reviewNotesItem.setSystem(_ctx.booleanValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].System"));
			reviewNotesItem.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Type"));
			reviewNotesItem.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].UpdatedAt"));
			reviewNotesItem.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Url"));

			List<String> discussions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Discussions.Length"); j++) {
				discussions.add(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Discussions["+ j +"]"));
			}
			reviewNotesItem.setDiscussions(discussions);

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("CreateLinkeantcodeAntcodeApicreatereviewResponse.ReviewNotes["+ i +"].Labels["+ j +"]"));
			}
			reviewNotesItem.setLabels(labels);

			reviewNotes.add(reviewNotesItem);
		}
		createLinkeantcodeAntcodeApicreatereviewResponse.setReviewNotes(reviewNotes);
	 
	 	return createLinkeantcodeAntcodeApicreatereviewResponse;
	}
}