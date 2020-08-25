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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.IssuesItem;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.LastCommit;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse unmarshall(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse createLinkeantcodeAntcodeCreateprojectpullrequestResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.RequestId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ResultCode"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setAction(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Action"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setActiveTime(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ActiveTime"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setAutoMerge(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.AutoMerge"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setCompareId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.CompareId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.CreatedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Description"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setFfOnlyEnabled(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.FfOnlyEnabled"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Id"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setIid(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Iid"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergeable(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Mergeable"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergeCommitMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergeCommitMessage"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergeCommitSha(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergeCommitSha"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergeError(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergeError"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergeStatus(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergeStatus"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setReviewed(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Reviewed"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setReviewAction(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ReviewAction"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setShouldBeRebased(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ShouldBeRebased"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.ShouldRemoveSourceBranch"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setSourceBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.SourceBranch"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setSourceProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.SourceProjectId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setSquashMerge(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.SquashMerge"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.State"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setTargetBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.TargetBranch"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setTargetProjectId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.TargetProjectId"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Title"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedAt"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Url"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.WebUrl"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setWorkInProgress(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.WorkInProgress"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Labels["+ i +"]"));
		}
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setLabels(labels);

		Assignee assignee = new Assignee();
		assignee.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.AccessLevel"));
		assignee.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.AvatarUrl"));
		assignee.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Bio"));
		assignee.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.CanCreateGroup"));
		assignee.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.CanCreateProject"));
		assignee.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.ColorSchemeId"));
		assignee.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.CreatedAt"));
		assignee.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.CurrentSignInAt"));
		assignee.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Department"));
		assignee.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Email"));
		assignee.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.ExpiresAt"));
		assignee.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.ExternUid"));
		assignee.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Id"));
		assignee.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.IsAdmin"));
		assignee.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Name"));
		assignee.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.PrivateToken"));
		assignee.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.ProjectsLimit"));
		assignee.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Registered"));
		assignee.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Role"));
		assignee.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.State"));
		assignee.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.ThemeId"));
		assignee.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.UpdatedAt"));
		assignee.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Username"));
		assignee.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.WebsiteUrl"));
		assignee.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Assignee.Identities["+ i +"]"));
		}
		assignee.setIdentities(identities);
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setAssignee(assignee);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Registered"));
		author.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Role"));
		author.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.State"));
		author.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.WebUrl"));

		List<String> identities1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Identities.Length"); i++) {
			identities1.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities1(identities1);
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setAuthor(author);

		LastCommit lastCommit = new LastCommit();
		lastCommit.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.LastCommit.Author"));
		lastCommit.setId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.LastCommit.Id"));
		lastCommit.setMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.LastCommit.Message"));
		lastCommit.setTimestamp(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.LastCommit.Timestamp"));
		lastCommit.setUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.LastCommit.Url"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setLastCommit(lastCommit);

		MergedBy mergedBy = new MergedBy();
		mergedBy.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.AccessLevel"));
		mergedBy.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.AvatarUrl"));
		mergedBy.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Bio"));
		mergedBy.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.CanCreateGroup"));
		mergedBy.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.CanCreateProject"));
		mergedBy.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.ColorSchemeId"));
		mergedBy.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.CreatedAt"));
		mergedBy.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.CurrentSignInAt"));
		mergedBy.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Department"));
		mergedBy.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Email"));
		mergedBy.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.ExpiresAt"));
		mergedBy.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.ExternUid"));
		mergedBy.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Id"));
		mergedBy.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.IsAdmin"));
		mergedBy.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Name"));
		mergedBy.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.PrivateToken"));
		mergedBy.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.ProjectsLimit"));
		mergedBy.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Registered"));
		mergedBy.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Role"));
		mergedBy.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.State"));
		mergedBy.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.ThemeId"));
		mergedBy.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.UpdatedAt"));
		mergedBy.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Username"));
		mergedBy.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.WebsiteUrl"));
		mergedBy.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.WebUrl"));

		List<String> identities2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Identities.Length"); i++) {
			identities2.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.MergedBy.Identities["+ i +"]"));
		}
		mergedBy.setIdentities2(identities2);
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setMergedBy(mergedBy);

		Review review = new Review();
		review.setAuthor(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Author"));
		review.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.CreatedAt"));
		review.setDescription(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Description"));
		review.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Id"));
		review.setIid(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Iid"));
		review.setRule(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Rule"));
		review.setRulesType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.RulesType"));
		review.setSourceBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.SourceBranch"));
		review.setSourceProject(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.SourceProject"));
		review.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.State"));
		review.setStateDetail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.StateDetail"));
		review.setTargetBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.TargetBranch"));
		review.setTargetProject(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.TargetProject"));
		review.setThresholdClear(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.ThresholdClear"));
		review.setTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Title"));
		review.setType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Type"));
		review.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.UpdatedAt"));

		List<String> reviewers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Reviewers.Length"); i++) {
			reviewers.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Reviewers["+ i +"]"));
		}
		review.setReviewers(reviewers);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Review.Tasks["+ i +"]"));
		}
		review.setTasks(tasks);
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setReview(review);

		Source source = new Source();
		source.setHttpUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.HttpUrl"));
		source.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.Id"));
		source.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.Name"));
		source.setNameWithNamespace(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.NameWithNamespace"));
		source.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.Path"));
		source.setPathWithNamespace(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.PathWithNamespace"));
		source.setSshUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.SshUrl"));
		source.setVisibilityLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.VisibilityLevel"));
		source.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Source.WebUrl"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setSource(source);

		Target target = new Target();
		target.setHttpUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.HttpUrl"));
		target.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.Id"));
		target.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.Name"));
		target.setNameWithNamespace(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.NameWithNamespace"));
		target.setPath(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.Path"));
		target.setPathWithNamespace(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.PathWithNamespace"));
		target.setSshUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.SshUrl"));
		target.setVisibilityLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.VisibilityLevel"));
		target.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Target.WebUrl"));
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setTarget(target);

		UpdatedBy updatedBy = new UpdatedBy();
		updatedBy.setAccessLevel(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.AccessLevel"));
		updatedBy.setAvatarUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.AvatarUrl"));
		updatedBy.setBio(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Bio"));
		updatedBy.setCanCreateGroup(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.CanCreateGroup"));
		updatedBy.setCanCreateProject(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.CanCreateProject"));
		updatedBy.setColorSchemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.ColorSchemeId"));
		updatedBy.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.CreatedAt"));
		updatedBy.setCurrentSignInAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.CurrentSignInAt"));
		updatedBy.setDepartment(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Department"));
		updatedBy.setEmail(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Email"));
		updatedBy.setExpiresAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.ExpiresAt"));
		updatedBy.setExternUid(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.ExternUid"));
		updatedBy.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Id"));
		updatedBy.setIsAdmin(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.IsAdmin"));
		updatedBy.setName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Name"));
		updatedBy.setPrivateToken(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.PrivateToken"));
		updatedBy.setProjectsLimit(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.ProjectsLimit"));
		updatedBy.setRegistered(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Registered"));
		updatedBy.setRole(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Role"));
		updatedBy.setState(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.State"));
		updatedBy.setThemeId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.ThemeId"));
		updatedBy.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.UpdatedAt"));
		updatedBy.setUsername(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Username"));
		updatedBy.setWebsiteUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.WebsiteUrl"));
		updatedBy.setWebUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.UpdatedBy.Identities["+ i +"]"));
		}
		updatedBy.setIdentities3(identities3);
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setUpdatedBy(updatedBy);

		List<IssuesItem> issues = new ArrayList<IssuesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues.Length"); i++) {
			IssuesItem issuesItem = new IssuesItem();
			issuesItem.setId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].Id"));
			issuesItem.setIssueId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].IssueId"));
			issuesItem.setIssueProvider(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].IssueProvider"));
			issuesItem.setIssueSite(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].IssueSite"));
			issuesItem.setIssueTitle(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].IssueTitle"));
			issuesItem.setIssueType(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].IssueType"));
			issuesItem.setIssueUrl(_ctx.stringValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].IssueUrl"));
			issuesItem.setPullRequestId(_ctx.longValue("CreateLinkeantcodeAntcodeCreateprojectpullrequestResponse.Issues["+ i +"].PullRequestId"));

			issues.add(issuesItem);
		}
		createLinkeantcodeAntcodeCreateprojectpullrequestResponse.setIssues(issues);
	 
	 	return createLinkeantcodeAntcodeCreateprojectpullrequestResponse;
	}
}