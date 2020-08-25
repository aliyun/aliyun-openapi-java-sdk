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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.IssuesItem;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.LastCommit;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse unmarshall(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setAction(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Action"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setActiveTime(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ActiveTime"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setAutoMerge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.AutoMerge"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setCompareId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.CompareId"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.CreatedAt"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Description"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setFfOnlyEnabled(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.FfOnlyEnabled"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Id"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setIid(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Iid"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergeable(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Mergeable"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedAt"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergeCommitMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergeCommitMessage"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergeCommitSha(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergeCommitSha"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergeError(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergeError"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergeStatus(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergeStatus"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setReviewed(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Reviewed"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setReviewAction(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ReviewAction"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setShouldBeRebased(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ShouldBeRebased"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.ShouldRemoveSourceBranch"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setSourceBranch(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.SourceBranch"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setSourceProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.SourceProjectId"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setSquashMerge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.SquashMerge"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.State"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setTargetBranch(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.TargetBranch"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setTargetProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.TargetProjectId"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Title"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Url"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.WebUrl"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setWorkInProgress(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.WorkInProgress"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Labels["+ i +"]"));
		}
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setLabels(labels);

		Assignee assignee = new Assignee();
		assignee.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.AccessLevel"));
		assignee.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.AvatarUrl"));
		assignee.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Bio"));
		assignee.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.CanCreateGroup"));
		assignee.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.CanCreateProject"));
		assignee.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.ColorSchemeId"));
		assignee.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.CreatedAt"));
		assignee.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.CurrentSignInAt"));
		assignee.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Department"));
		assignee.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Email"));
		assignee.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.ExpiresAt"));
		assignee.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.ExternUid"));
		assignee.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Id"));
		assignee.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.IsAdmin"));
		assignee.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Name"));
		assignee.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.PrivateToken"));
		assignee.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.ProjectsLimit"));
		assignee.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Registered"));
		assignee.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Role"));
		assignee.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.State"));
		assignee.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.ThemeId"));
		assignee.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.UpdatedAt"));
		assignee.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Username"));
		assignee.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.WebsiteUrl"));
		assignee.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Assignee.Identities["+ i +"]"));
		}
		assignee.setIdentities(identities);
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setAssignee(assignee);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Registered"));
		author.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Role"));
		author.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.State"));
		author.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.WebUrl"));

		List<String> identities1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Identities.Length"); i++) {
			identities1.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities1(identities1);
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setAuthor(author);

		LastCommit lastCommit = new LastCommit();
		lastCommit.setAuthor(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.LastCommit.Author"));
		lastCommit.setId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.LastCommit.Id"));
		lastCommit.setMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.LastCommit.Message"));
		lastCommit.setTimestamp(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.LastCommit.Timestamp"));
		lastCommit.setUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.LastCommit.Url"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setLastCommit(lastCommit);

		MergedBy mergedBy = new MergedBy();
		mergedBy.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.AccessLevel"));
		mergedBy.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.AvatarUrl"));
		mergedBy.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Bio"));
		mergedBy.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.CanCreateGroup"));
		mergedBy.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.CanCreateProject"));
		mergedBy.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.ColorSchemeId"));
		mergedBy.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.CreatedAt"));
		mergedBy.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.CurrentSignInAt"));
		mergedBy.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Department"));
		mergedBy.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Email"));
		mergedBy.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.ExpiresAt"));
		mergedBy.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.ExternUid"));
		mergedBy.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Id"));
		mergedBy.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.IsAdmin"));
		mergedBy.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Name"));
		mergedBy.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.PrivateToken"));
		mergedBy.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.ProjectsLimit"));
		mergedBy.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Registered"));
		mergedBy.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Role"));
		mergedBy.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.State"));
		mergedBy.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.ThemeId"));
		mergedBy.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.UpdatedAt"));
		mergedBy.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Username"));
		mergedBy.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.WebsiteUrl"));
		mergedBy.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.WebUrl"));

		List<String> identities2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Identities.Length"); i++) {
			identities2.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.MergedBy.Identities["+ i +"]"));
		}
		mergedBy.setIdentities2(identities2);
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setMergedBy(mergedBy);

		Review review = new Review();
		review.setAuthor(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Author"));
		review.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.CreatedAt"));
		review.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Description"));
		review.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Id"));
		review.setIid(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Iid"));
		review.setRule(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Rule"));
		review.setRulesType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.RulesType"));
		review.setSourceBranch(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.SourceBranch"));
		review.setSourceProject(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.SourceProject"));
		review.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.State"));
		review.setStateDetail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.StateDetail"));
		review.setTargetBranch(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.TargetBranch"));
		review.setTargetProject(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.TargetProject"));
		review.setThresholdClear(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.ThresholdClear"));
		review.setTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Title"));
		review.setType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Type"));
		review.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.UpdatedAt"));

		List<String> reviewers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Reviewers.Length"); i++) {
			reviewers.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Reviewers["+ i +"]"));
		}
		review.setReviewers(reviewers);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Review.Tasks["+ i +"]"));
		}
		review.setTasks(tasks);
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setReview(review);

		Source source = new Source();
		source.setHttpUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.HttpUrl"));
		source.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.Id"));
		source.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.Name"));
		source.setNameWithNamespace(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.NameWithNamespace"));
		source.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.Path"));
		source.setPathWithNamespace(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.PathWithNamespace"));
		source.setSshUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.SshUrl"));
		source.setVisibilityLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.VisibilityLevel"));
		source.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Source.WebUrl"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setSource(source);

		Target target = new Target();
		target.setHttpUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.HttpUrl"));
		target.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.Id"));
		target.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.Name"));
		target.setNameWithNamespace(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.NameWithNamespace"));
		target.setPath(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.Path"));
		target.setPathWithNamespace(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.PathWithNamespace"));
		target.setSshUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.SshUrl"));
		target.setVisibilityLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.VisibilityLevel"));
		target.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Target.WebUrl"));
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setTarget(target);

		UpdatedBy updatedBy = new UpdatedBy();
		updatedBy.setAccessLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.AccessLevel"));
		updatedBy.setAvatarUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.AvatarUrl"));
		updatedBy.setBio(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Bio"));
		updatedBy.setCanCreateGroup(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.CanCreateGroup"));
		updatedBy.setCanCreateProject(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.CanCreateProject"));
		updatedBy.setColorSchemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.ColorSchemeId"));
		updatedBy.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.CreatedAt"));
		updatedBy.setCurrentSignInAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.CurrentSignInAt"));
		updatedBy.setDepartment(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Department"));
		updatedBy.setEmail(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Email"));
		updatedBy.setExpiresAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.ExpiresAt"));
		updatedBy.setExternUid(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.ExternUid"));
		updatedBy.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Id"));
		updatedBy.setIsAdmin(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.IsAdmin"));
		updatedBy.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Name"));
		updatedBy.setPrivateToken(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.PrivateToken"));
		updatedBy.setProjectsLimit(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.ProjectsLimit"));
		updatedBy.setRegistered(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Registered"));
		updatedBy.setRole(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Role"));
		updatedBy.setState(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.State"));
		updatedBy.setThemeId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.ThemeId"));
		updatedBy.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.UpdatedAt"));
		updatedBy.setUsername(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Username"));
		updatedBy.setWebsiteUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.WebsiteUrl"));
		updatedBy.setWebUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.UpdatedBy.Identities["+ i +"]"));
		}
		updatedBy.setIdentities3(identities3);
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setUpdatedBy(updatedBy);

		List<IssuesItem> issues = new ArrayList<IssuesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues.Length"); i++) {
			IssuesItem issuesItem = new IssuesItem();
			issuesItem.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].Id"));
			issuesItem.setIssueId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].IssueId"));
			issuesItem.setIssueProvider(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].IssueProvider"));
			issuesItem.setIssueSite(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].IssueSite"));
			issuesItem.setIssueTitle(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].IssueTitle"));
			issuesItem.setIssueType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].IssueType"));
			issuesItem.setIssueUrl(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].IssueUrl"));
			issuesItem.setPullRequestId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.Issues["+ i +"].PullRequestId"));

			issues.add(issuesItem);
		}
		updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse.setIssues(issues);
	 
	 	return updateLinkeantcodeAntcodeUpdateprojectpullrequestResponse;
	}
}