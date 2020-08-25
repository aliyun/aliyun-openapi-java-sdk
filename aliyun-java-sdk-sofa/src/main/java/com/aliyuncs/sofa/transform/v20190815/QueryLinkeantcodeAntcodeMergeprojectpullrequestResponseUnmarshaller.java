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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse unmarshall(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse queryLinkeantcodeAntcodeMergeprojectpullrequestResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.RequestId"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.ResultCode"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.ResultMessage"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setActiveTime(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.ActiveTime"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setAutoMerge(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.AutoMerge"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setCompareId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.CompareId"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.CreatedAt"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Description"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setFfOnlyEnabled(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.FfOnlyEnabled"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Id"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setIid(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Iid"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setMergeable(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Mergeable"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setMergeCommitMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.MergeCommitMessage"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setMergeCommitSha(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.MergeCommitSha"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setMergeError(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.MergeError"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setMergeStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.MergeStatus"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setReviewed(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Reviewed"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setShouldBeRebased(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.ShouldBeRebased"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.ShouldRemoveSourceBranch"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setSourceBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.SourceBranch"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setSourceProjectId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.SourceProjectId"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setSquashMerge(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.SquashMerge"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.State"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setTargetBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.TargetBranch"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setTargetProjectId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.TargetProjectId"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setTitle(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Title"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedAt"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Url"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.WebUrl"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setWorkInProgress(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.WorkInProgress"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Labels["+ i +"]"));
		}
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setLabels(labels);

		Assignee assignee = new Assignee();
		assignee.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.AccessLevel"));
		assignee.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.AvatarUrl"));
		assignee.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.CreatedAt"));
		assignee.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.Email"));
		assignee.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.ExpiresAt"));
		assignee.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.ExternUid"));
		assignee.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.Id"));
		assignee.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.Name"));
		assignee.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.NotificationLevel"));
		assignee.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.State"));
		assignee.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.UpdatedAt"));
		assignee.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.Username"));
		assignee.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Assignee.WebUrl"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setAssignee(assignee);

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.AvatarUrl"));
		author.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.CreatedAt"));
		author.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.Id"));
		author.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.Name"));
		author.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.NotificationLevel"));
		author.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.State"));
		author.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.Username"));
		author.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Author.WebUrl"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setAuthor(author);

		Review review = new Review();
		review.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.CreatedAt"));
		review.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.Id"));
		review.setIid(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.Iid"));
		review.setRule(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.Rule"));
		review.setRulesType(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.RulesType"));
		review.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.State"));
		review.setStateDetail(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.StateDetail"));
		review.setThresholdClear(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.ThresholdClear"));
		review.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.UpdatedAt"));

		List<String> reviewers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.Reviewers.Length"); i++) {
			reviewers.add(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Review.Reviewers["+ i +"]"));
		}
		review.setReviewers(reviewers);
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setReview(review);

		Source source = new Source();
		source.setArchived(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Archived"));
		source.setArtifacts(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Artifacts"));
		source.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.AvatarUrl"));
		source.setCheckEmail(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.CheckEmail"));
		source.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.CreatedAt"));
		source.setCreatorId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.CreatorId"));
		source.setDefaultBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.DefaultBranch"));
		source.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Description"));
		source.setEncoding(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Encoding"));
		source.setExceptBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.ExceptBranch"));
		source.setHomepage(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Homepage"));
		source.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.HttpUrlToRepo"));
		source.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Id"));
		source.setImportStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.ImportStatus"));
		source.setIsGray(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.IsGray"));
		source.setIsReview(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.IsReview"));
		source.setLastActivityAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.LastActivityAt"));
		source.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Name"));
		source.setNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Namespace"));
		source.setNameWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.NameWithNamespace"));
		source.setOwner(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Owner"));
		source.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Path"));
		source.setPathWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.PathWithNamespace"));
		source.setPermission(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Permission"));
		source.set_Public(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Public"));
		source.setRepositorySize(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.RepositorySize"));
		source.setRepositorySizeLimit(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.RepositorySizeLimit"));
		source.setRunnersToken(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.RunnersToken"));
		source.setSshUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.SshUrlToRepo"));
		source.setVisibility(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.Visibility"));
		source.setVisibilityLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.VisibilityLevel"));
		source.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.WebUrl"));

		List<String> tagList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.TagList.Length"); i++) {
			tagList.add(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Source.TagList["+ i +"]"));
		}
		source.setTagList(tagList);
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setSource(source);

		Target target = new Target();
		target.setArchived(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Archived"));
		target.setArtifacts(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Artifacts"));
		target.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.AvatarUrl"));
		target.setCheckEmail(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.CheckEmail"));
		target.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.CreatedAt"));
		target.setCreatorId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.CreatorId"));
		target.setDefaultBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.DefaultBranch"));
		target.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Description"));
		target.setEncoding(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Encoding"));
		target.setExceptBranch(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.ExceptBranch"));
		target.setHomepage(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Homepage"));
		target.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.HttpUrlToRepo"));
		target.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Id"));
		target.setImportStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.ImportStatus"));
		target.setIsGray(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.IsGray"));
		target.setIsReview(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.IsReview"));
		target.setLastActivityAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.LastActivityAt"));
		target.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Name"));
		target.setNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Namespace"));
		target.setNameWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.NameWithNamespace"));
		target.setOwner(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Owner"));
		target.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Path"));
		target.setPathWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.PathWithNamespace"));
		target.setPermission(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Permission"));
		target.set_Public(_ctx.booleanValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Public"));
		target.setRepositorySize(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.RepositorySize"));
		target.setRepositorySizeLimit(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.RepositorySizeLimit"));
		target.setRunnersToken(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.RunnersToken"));
		target.setSshUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.SshUrlToRepo"));
		target.setVisibility(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.Visibility"));
		target.setVisibilityLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.VisibilityLevel"));
		target.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.WebUrl"));

		List<String> tagList1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.TagList.Length"); i++) {
			tagList1.add(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.Target.TagList["+ i +"]"));
		}
		target.setTagList1(tagList1);
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setTarget(target);

		UpdatedBy updatedBy = new UpdatedBy();
		updatedBy.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.AccessLevel"));
		updatedBy.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.AvatarUrl"));
		updatedBy.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.CreatedAt"));
		updatedBy.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.Email"));
		updatedBy.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.ExpiresAt"));
		updatedBy.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.ExternUid"));
		updatedBy.setId(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.Id"));
		updatedBy.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.Name"));
		updatedBy.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.NotificationLevel"));
		updatedBy.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.State"));
		updatedBy.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.UpdatedAt"));
		updatedBy.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.Username"));
		updatedBy.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeMergeprojectpullrequestResponse.UpdatedBy.WebUrl"));
		queryLinkeantcodeAntcodeMergeprojectpullrequestResponse.setUpdatedBy(updatedBy);
	 
	 	return queryLinkeantcodeAntcodeMergeprojectpullrequestResponse;
	}
}