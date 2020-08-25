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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse unmarshall(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.RequestId"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.ResultCode"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.ResultMessage"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setActiveTime(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.ActiveTime"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setAutoMerge(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.AutoMerge"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setCompareId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.CompareId"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.CreatedAt"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Description"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setFfOnlyEnabled(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.FfOnlyEnabled"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Id"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setIid(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Iid"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setMergeable(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Mergeable"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setMergeCommitMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.MergeCommitMessage"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setMergeCommitSha(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.MergeCommitSha"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setMergeError(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.MergeError"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setMergeStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.MergeStatus"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setReviewed(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Reviewed"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setShouldBeRebased(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.ShouldBeRebased"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.ShouldRemoveSourceBranch"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setSourceBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.SourceBranch"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setSourceProjectId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.SourceProjectId"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setSquashMerge(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.SquashMerge"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.State"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setTargetBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.TargetBranch"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setTargetProjectId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.TargetProjectId"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Title"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedAt"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Url"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.WebUrl"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setWorkInProgress(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.WorkInProgress"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Labels["+ i +"]"));
		}
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setLabels(labels);

		Assignee assignee = new Assignee();
		assignee.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.AccessLevel"));
		assignee.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.AvatarUrl"));
		assignee.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.CreatedAt"));
		assignee.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.Email"));
		assignee.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.ExpiresAt"));
		assignee.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.ExternUid"));
		assignee.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.Id"));
		assignee.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.Name"));
		assignee.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.NotificationLevel"));
		assignee.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.State"));
		assignee.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.UpdatedAt"));
		assignee.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.Username"));
		assignee.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Assignee.WebUrl"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setAssignee(assignee);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.AvatarUrl"));
		author.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.CreatedAt"));
		author.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.Id"));
		author.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.Name"));
		author.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.NotificationLevel"));
		author.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.State"));
		author.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.Username"));
		author.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Author.WebUrl"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setAuthor(author);

		Review review = new Review();
		review.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.CreatedAt"));
		review.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.Id"));
		review.setIid(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.Iid"));
		review.setRule(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.Rule"));
		review.setRulesType(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.RulesType"));
		review.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.State"));
		review.setStateDetail(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.StateDetail"));
		review.setThresholdClear(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.ThresholdClear"));
		review.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.UpdatedAt"));

		List<String> reviewers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.Reviewers.Length"); i++) {
			reviewers.add(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Review.Reviewers["+ i +"]"));
		}
		review.setReviewers(reviewers);
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setReview(review);

		Source source = new Source();
		source.setArchived(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Archived"));
		source.setArtifacts(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Artifacts"));
		source.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.AvatarUrl"));
		source.setCheckEmail(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.CheckEmail"));
		source.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.CreatedAt"));
		source.setCreatorId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.CreatorId"));
		source.setDefaultBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.DefaultBranch"));
		source.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Description"));
		source.setEncoding(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Encoding"));
		source.setExceptBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.ExceptBranch"));
		source.setHomepage(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Homepage"));
		source.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.HttpUrlToRepo"));
		source.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Id"));
		source.setImportStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.ImportStatus"));
		source.setIsGray(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.IsGray"));
		source.setIsReview(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.IsReview"));
		source.setLastActivityAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.LastActivityAt"));
		source.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Name"));
		source.setNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Namespace"));
		source.setNameWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.NameWithNamespace"));
		source.setOwner(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Owner"));
		source.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Path"));
		source.setPathWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.PathWithNamespace"));
		source.setPermission(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Permission"));
		source.set_Public(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Public"));
		source.setRepositorySize(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.RepositorySize"));
		source.setRepositorySizeLimit(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.RepositorySizeLimit"));
		source.setRunnersToken(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.RunnersToken"));
		source.setSshUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.SshUrlToRepo"));
		source.setVisibility(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.Visibility"));
		source.setVisibilityLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.VisibilityLevel"));
		source.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.WebUrl"));

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Source.TagList["+ i +"]"));
		}
		source.setTagList(tagList);
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setSource(source);

		Target target = new Target();
		target.setArchived(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Archived"));
		target.setArtifacts(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Artifacts"));
		target.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.AvatarUrl"));
		target.setCheckEmail(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.CheckEmail"));
		target.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.CreatedAt"));
		target.setCreatorId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.CreatorId"));
		target.setDefaultBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.DefaultBranch"));
		target.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Description"));
		target.setEncoding(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Encoding"));
		target.setExceptBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.ExceptBranch"));
		target.setHomepage(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Homepage"));
		target.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.HttpUrlToRepo"));
		target.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Id"));
		target.setImportStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.ImportStatus"));
		target.setIsGray(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.IsGray"));
		target.setIsReview(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.IsReview"));
		target.setLastActivityAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.LastActivityAt"));
		target.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Name"));
		target.setNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Namespace"));
		target.setNameWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.NameWithNamespace"));
		target.setOwner(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Owner"));
		target.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Path"));
		target.setPathWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.PathWithNamespace"));
		target.setPermission(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Permission"));
		target.set_Public(_ctx.booleanValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Public"));
		target.setRepositorySize(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.RepositorySize"));
		target.setRepositorySizeLimit(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.RepositorySizeLimit"));
		target.setRunnersToken(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.RunnersToken"));
		target.setSshUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.SshUrlToRepo"));
		target.setVisibility(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.Visibility"));
		target.setVisibilityLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.VisibilityLevel"));
		target.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.WebUrl"));

		List<String> tagList1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.TagList.Length"); i++) {
			tagList1.add(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.Target.TagList["+ i +"]"));
		}
		target.setTagList1(tagList1);
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setTarget(target);

		UpdatedBy updatedBy = new UpdatedBy();
		updatedBy.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.AccessLevel"));
		updatedBy.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.AvatarUrl"));
		updatedBy.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.CreatedAt"));
		updatedBy.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.Email"));
		updatedBy.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.ExpiresAt"));
		updatedBy.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.ExternUid"));
		updatedBy.setId(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.Id"));
		updatedBy.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.Name"));
		updatedBy.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.NotificationLevel"));
		updatedBy.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.State"));
		updatedBy.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.UpdatedAt"));
		updatedBy.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.Username"));
		updatedBy.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.UpdatedBy.WebUrl"));
		queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse.setUpdatedBy(updatedBy);
	 
	 	return queryLinkeantcodeAntcodeRebaseprojectpullrequestResponse;
	}
}