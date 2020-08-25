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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.IssuesItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.LastCommit;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeRebasepullrequestResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeRebasepullrequestResponse unmarshall(ExecLinkeantcodeAntcodeRebasepullrequestResponse execLinkeantcodeAntcodeRebasepullrequestResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeRebasepullrequestResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.RequestId"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ResultCode"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ResultMessage"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setAction(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Action"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setActiveTime(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ActiveTime"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setAutoMerge(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.AutoMerge"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setCompareId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.CompareId"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.CreatedAt"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setDescription(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Description"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setFfOnlyEnabled(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.FfOnlyEnabled"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Id"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setIid(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Iid"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergeable(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Mergeable"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedAt"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergeCommitMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergeCommitMessage"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergeCommitSha(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergeCommitSha"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergeError(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergeError"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergeStatus(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergeStatus"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setReviewed(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Reviewed"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setReviewAction(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ReviewAction"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setShouldBeRebased(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ShouldBeRebased"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.ShouldRemoveSourceBranch"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setSourceBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.SourceBranch"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setSourceProjectId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.SourceProjectId"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setSquashMerge(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.SquashMerge"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.State"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setTargetBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.TargetBranch"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setTargetProjectId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.TargetProjectId"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Title"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedAt"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Url"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.WebUrl"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setWorkInProgress(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.WorkInProgress"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Labels["+ i +"]"));
		}
		execLinkeantcodeAntcodeRebasepullrequestResponse.setLabels(labels);

		Assignee assignee = new Assignee();
		assignee.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.AccessLevel"));
		assignee.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.AvatarUrl"));
		assignee.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Bio"));
		assignee.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.CanCreateGroup"));
		assignee.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.CanCreateProject"));
		assignee.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.ColorSchemeId"));
		assignee.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.CreatedAt"));
		assignee.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.CurrentSignInAt"));
		assignee.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Department"));
		assignee.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Email"));
		assignee.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.ExpiresAt"));
		assignee.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.ExternUid"));
		assignee.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Id"));
		assignee.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.IsAdmin"));
		assignee.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Name"));
		assignee.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.PrivateToken"));
		assignee.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.ProjectsLimit"));
		assignee.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Registered"));
		assignee.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Role"));
		assignee.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.State"));
		assignee.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.ThemeId"));
		assignee.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.UpdatedAt"));
		assignee.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Username"));
		assignee.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.WebsiteUrl"));
		assignee.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Assignee.Identities["+ i +"]"));
		}
		assignee.setIdentities(identities);
		execLinkeantcodeAntcodeRebasepullrequestResponse.setAssignee(assignee);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Registered"));
		author.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Role"));
		author.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.State"));
		author.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.WebUrl"));

		List<String> identities1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Identities.Length"); i++) {
			identities1.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities1(identities1);
		execLinkeantcodeAntcodeRebasepullrequestResponse.setAuthor(author);

		LastCommit lastCommit = new LastCommit();
		lastCommit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.LastCommit.Author"));
		lastCommit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.LastCommit.Id"));
		lastCommit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.LastCommit.Message"));
		lastCommit.setTimestamp(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.LastCommit.Timestamp"));
		lastCommit.setUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.LastCommit.Url"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setLastCommit(lastCommit);

		MergedBy mergedBy = new MergedBy();
		mergedBy.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.AccessLevel"));
		mergedBy.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.AvatarUrl"));
		mergedBy.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Bio"));
		mergedBy.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.CanCreateGroup"));
		mergedBy.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.CanCreateProject"));
		mergedBy.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.ColorSchemeId"));
		mergedBy.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.CreatedAt"));
		mergedBy.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.CurrentSignInAt"));
		mergedBy.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Department"));
		mergedBy.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Email"));
		mergedBy.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.ExpiresAt"));
		mergedBy.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.ExternUid"));
		mergedBy.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Id"));
		mergedBy.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.IsAdmin"));
		mergedBy.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Name"));
		mergedBy.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.PrivateToken"));
		mergedBy.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.ProjectsLimit"));
		mergedBy.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Registered"));
		mergedBy.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Role"));
		mergedBy.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.State"));
		mergedBy.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.ThemeId"));
		mergedBy.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.UpdatedAt"));
		mergedBy.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Username"));
		mergedBy.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.WebsiteUrl"));
		mergedBy.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.WebUrl"));

		List<String> identities2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Identities.Length"); i++) {
			identities2.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.MergedBy.Identities["+ i +"]"));
		}
		mergedBy.setIdentities2(identities2);
		execLinkeantcodeAntcodeRebasepullrequestResponse.setMergedBy(mergedBy);

		Review review = new Review();
		review.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Author"));
		review.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.CreatedAt"));
		review.setDescription(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Description"));
		review.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Id"));
		review.setIid(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Iid"));
		review.setRule(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Rule"));
		review.setRulesType(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.RulesType"));
		review.setSourceBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.SourceBranch"));
		review.setSourceProject(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.SourceProject"));
		review.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.State"));
		review.setStateDetail(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.StateDetail"));
		review.setTargetBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.TargetBranch"));
		review.setTargetProject(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.TargetProject"));
		review.setThresholdClear(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.ThresholdClear"));
		review.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Title"));
		review.setType(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Type"));
		review.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.UpdatedAt"));

		List<String> reviewers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Reviewers.Length"); i++) {
			reviewers.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Reviewers["+ i +"]"));
		}
		review.setReviewers(reviewers);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Review.Tasks["+ i +"]"));
		}
		review.setTasks(tasks);
		execLinkeantcodeAntcodeRebasepullrequestResponse.setReview(review);

		Source source = new Source();
		source.setHttpUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.HttpUrl"));
		source.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.Id"));
		source.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.Name"));
		source.setNameWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.NameWithNamespace"));
		source.setPath(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.Path"));
		source.setPathWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.PathWithNamespace"));
		source.setSshUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.SshUrl"));
		source.setVisibilityLevel(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.VisibilityLevel"));
		source.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Source.WebUrl"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setSource(source);

		Target target = new Target();
		target.setHttpUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.HttpUrl"));
		target.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.Id"));
		target.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.Name"));
		target.setNameWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.NameWithNamespace"));
		target.setPath(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.Path"));
		target.setPathWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.PathWithNamespace"));
		target.setSshUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.SshUrl"));
		target.setVisibilityLevel(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.VisibilityLevel"));
		target.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Target.WebUrl"));
		execLinkeantcodeAntcodeRebasepullrequestResponse.setTarget(target);

		UpdatedBy updatedBy = new UpdatedBy();
		updatedBy.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.AccessLevel"));
		updatedBy.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.AvatarUrl"));
		updatedBy.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Bio"));
		updatedBy.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.CanCreateGroup"));
		updatedBy.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.CanCreateProject"));
		updatedBy.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.ColorSchemeId"));
		updatedBy.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.CreatedAt"));
		updatedBy.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.CurrentSignInAt"));
		updatedBy.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Department"));
		updatedBy.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Email"));
		updatedBy.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.ExpiresAt"));
		updatedBy.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.ExternUid"));
		updatedBy.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Id"));
		updatedBy.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.IsAdmin"));
		updatedBy.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Name"));
		updatedBy.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.PrivateToken"));
		updatedBy.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.ProjectsLimit"));
		updatedBy.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Registered"));
		updatedBy.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Role"));
		updatedBy.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.State"));
		updatedBy.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.ThemeId"));
		updatedBy.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.UpdatedAt"));
		updatedBy.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Username"));
		updatedBy.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.WebsiteUrl"));
		updatedBy.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.UpdatedBy.Identities["+ i +"]"));
		}
		updatedBy.setIdentities3(identities3);
		execLinkeantcodeAntcodeRebasepullrequestResponse.setUpdatedBy(updatedBy);

		List<IssuesItem> issues = new ArrayList<IssuesItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues.Length"); i++) {
			IssuesItem issuesItem = new IssuesItem();
			issuesItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].Id"));
			issuesItem.setIssueId(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].IssueId"));
			issuesItem.setIssueProvider(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].IssueProvider"));
			issuesItem.setIssueSite(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].IssueSite"));
			issuesItem.setIssueTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].IssueTitle"));
			issuesItem.setIssueType(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].IssueType"));
			issuesItem.setIssueUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].IssueUrl"));
			issuesItem.setPullRequestId(_ctx.longValue("ExecLinkeantcodeAntcodeRebasepullrequestResponse.Issues["+ i +"].PullRequestId"));

			issues.add(issuesItem);
		}
		execLinkeantcodeAntcodeRebasepullrequestResponse.setIssues(issues);
	 
	 	return execLinkeantcodeAntcodeRebasepullrequestResponse;
	}
}