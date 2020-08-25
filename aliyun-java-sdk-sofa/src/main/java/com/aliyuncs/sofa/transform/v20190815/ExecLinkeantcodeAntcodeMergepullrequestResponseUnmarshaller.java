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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.Author;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.IssuesItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.LastCommit;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.Review;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.Source;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.Target;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeMergepullrequestResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeMergepullrequestResponse unmarshall(ExecLinkeantcodeAntcodeMergepullrequestResponse execLinkeantcodeAntcodeMergepullrequestResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeMergepullrequestResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.RequestId"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ResultCode"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ResultMessage"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setAction(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Action"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setActiveTime(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ActiveTime"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setAutoMerge(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.AutoMerge"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setCompareId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.CompareId"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.CreatedAt"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setDescription(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Description"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setFfOnlyEnabled(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.FfOnlyEnabled"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Id"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setIid(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Iid"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergeable(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Mergeable"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedAt"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergeCommitMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergeCommitMessage"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergeCommitSha(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergeCommitSha"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergeError(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergeError"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergeStatus(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergeStatus"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setReviewed(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Reviewed"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setReviewAction(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ReviewAction"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setShouldBeRebased(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ShouldBeRebased"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.ShouldRemoveSourceBranch"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setSourceBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.SourceBranch"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setSourceProjectId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.SourceProjectId"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setSquashMerge(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.SquashMerge"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.State"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setTargetBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.TargetBranch"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setTargetProjectId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.TargetProjectId"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Title"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedAt"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Url"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.WebUrl"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setWorkInProgress(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.WorkInProgress"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Labels["+ i +"]"));
		}
		execLinkeantcodeAntcodeMergepullrequestResponse.setLabels(labels);

		Assignee assignee = new Assignee();
		assignee.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.AccessLevel"));
		assignee.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.AvatarUrl"));
		assignee.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Bio"));
		assignee.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.CanCreateGroup"));
		assignee.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.CanCreateProject"));
		assignee.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.ColorSchemeId"));
		assignee.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.CreatedAt"));
		assignee.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.CurrentSignInAt"));
		assignee.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Department"));
		assignee.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Email"));
		assignee.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.ExpiresAt"));
		assignee.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.ExternUid"));
		assignee.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Id"));
		assignee.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.IsAdmin"));
		assignee.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Name"));
		assignee.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.PrivateToken"));
		assignee.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.ProjectsLimit"));
		assignee.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Registered"));
		assignee.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Role"));
		assignee.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.State"));
		assignee.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.ThemeId"));
		assignee.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.UpdatedAt"));
		assignee.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Username"));
		assignee.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.WebsiteUrl"));
		assignee.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Assignee.Identities["+ i +"]"));
		}
		assignee.setIdentities(identities);
		execLinkeantcodeAntcodeMergepullrequestResponse.setAssignee(assignee);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Registered"));
		author.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Role"));
		author.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.State"));
		author.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.WebUrl"));

		List<String> identities1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Identities.Length"); i++) {
			identities1.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities1(identities1);
		execLinkeantcodeAntcodeMergepullrequestResponse.setAuthor(author);

		LastCommit lastCommit = new LastCommit();
		lastCommit.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.LastCommit.Author"));
		lastCommit.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.LastCommit.Id"));
		lastCommit.setMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.LastCommit.Message"));
		lastCommit.setTimestamp(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.LastCommit.Timestamp"));
		lastCommit.setUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.LastCommit.Url"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setLastCommit(lastCommit);

		MergedBy mergedBy = new MergedBy();
		mergedBy.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.AccessLevel"));
		mergedBy.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.AvatarUrl"));
		mergedBy.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Bio"));
		mergedBy.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.CanCreateGroup"));
		mergedBy.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.CanCreateProject"));
		mergedBy.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.ColorSchemeId"));
		mergedBy.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.CreatedAt"));
		mergedBy.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.CurrentSignInAt"));
		mergedBy.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Department"));
		mergedBy.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Email"));
		mergedBy.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.ExpiresAt"));
		mergedBy.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.ExternUid"));
		mergedBy.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Id"));
		mergedBy.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.IsAdmin"));
		mergedBy.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Name"));
		mergedBy.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.PrivateToken"));
		mergedBy.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.ProjectsLimit"));
		mergedBy.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Registered"));
		mergedBy.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Role"));
		mergedBy.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.State"));
		mergedBy.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.ThemeId"));
		mergedBy.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.UpdatedAt"));
		mergedBy.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Username"));
		mergedBy.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.WebsiteUrl"));
		mergedBy.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.WebUrl"));

		List<String> identities2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Identities.Length"); i++) {
			identities2.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.MergedBy.Identities["+ i +"]"));
		}
		mergedBy.setIdentities2(identities2);
		execLinkeantcodeAntcodeMergepullrequestResponse.setMergedBy(mergedBy);

		Review review = new Review();
		review.setAuthor(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Author"));
		review.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.CreatedAt"));
		review.setDescription(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Description"));
		review.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Id"));
		review.setIid(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Iid"));
		review.setRule(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Rule"));
		review.setRulesType(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.RulesType"));
		review.setSourceBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.SourceBranch"));
		review.setSourceProject(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.SourceProject"));
		review.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.State"));
		review.setStateDetail(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.StateDetail"));
		review.setTargetBranch(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.TargetBranch"));
		review.setTargetProject(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.TargetProject"));
		review.setThresholdClear(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.ThresholdClear"));
		review.setTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Title"));
		review.setType(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Type"));
		review.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.UpdatedAt"));

		List<String> reviewers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Reviewers.Length"); i++) {
			reviewers.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Reviewers["+ i +"]"));
		}
		review.setReviewers(reviewers);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Review.Tasks["+ i +"]"));
		}
		review.setTasks(tasks);
		execLinkeantcodeAntcodeMergepullrequestResponse.setReview(review);

		Source source = new Source();
		source.setHttpUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.HttpUrl"));
		source.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.Id"));
		source.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.Name"));
		source.setNameWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.NameWithNamespace"));
		source.setPath(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.Path"));
		source.setPathWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.PathWithNamespace"));
		source.setSshUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.SshUrl"));
		source.setVisibilityLevel(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.VisibilityLevel"));
		source.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Source.WebUrl"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setSource(source);

		Target target = new Target();
		target.setHttpUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.HttpUrl"));
		target.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.Id"));
		target.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.Name"));
		target.setNameWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.NameWithNamespace"));
		target.setPath(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.Path"));
		target.setPathWithNamespace(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.PathWithNamespace"));
		target.setSshUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.SshUrl"));
		target.setVisibilityLevel(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.VisibilityLevel"));
		target.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Target.WebUrl"));
		execLinkeantcodeAntcodeMergepullrequestResponse.setTarget(target);

		UpdatedBy updatedBy = new UpdatedBy();
		updatedBy.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.AccessLevel"));
		updatedBy.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.AvatarUrl"));
		updatedBy.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Bio"));
		updatedBy.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.CanCreateGroup"));
		updatedBy.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.CanCreateProject"));
		updatedBy.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.ColorSchemeId"));
		updatedBy.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.CreatedAt"));
		updatedBy.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.CurrentSignInAt"));
		updatedBy.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Department"));
		updatedBy.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Email"));
		updatedBy.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.ExpiresAt"));
		updatedBy.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.ExternUid"));
		updatedBy.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Id"));
		updatedBy.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.IsAdmin"));
		updatedBy.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Name"));
		updatedBy.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.PrivateToken"));
		updatedBy.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.ProjectsLimit"));
		updatedBy.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Registered"));
		updatedBy.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Role"));
		updatedBy.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.State"));
		updatedBy.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.ThemeId"));
		updatedBy.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.UpdatedAt"));
		updatedBy.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Username"));
		updatedBy.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.WebsiteUrl"));
		updatedBy.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.WebUrl"));

		List<String> identities3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Identities.Length"); i++) {
			identities3.add(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.UpdatedBy.Identities["+ i +"]"));
		}
		updatedBy.setIdentities3(identities3);
		execLinkeantcodeAntcodeMergepullrequestResponse.setUpdatedBy(updatedBy);

		List<IssuesItem> issues = new ArrayList<IssuesItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues.Length"); i++) {
			IssuesItem issuesItem = new IssuesItem();
			issuesItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].Id"));
			issuesItem.setIssueId(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].IssueId"));
			issuesItem.setIssueProvider(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].IssueProvider"));
			issuesItem.setIssueSite(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].IssueSite"));
			issuesItem.setIssueTitle(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].IssueTitle"));
			issuesItem.setIssueType(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].IssueType"));
			issuesItem.setIssueUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].IssueUrl"));
			issuesItem.setPullRequestId(_ctx.longValue("ExecLinkeantcodeAntcodeMergepullrequestResponse.Issues["+ i +"].PullRequestId"));

			issues.add(issuesItem);
		}
		execLinkeantcodeAntcodeMergepullrequestResponse.setIssues(issues);
	 
	 	return execLinkeantcodeAntcodeMergepullrequestResponse;
	}
}