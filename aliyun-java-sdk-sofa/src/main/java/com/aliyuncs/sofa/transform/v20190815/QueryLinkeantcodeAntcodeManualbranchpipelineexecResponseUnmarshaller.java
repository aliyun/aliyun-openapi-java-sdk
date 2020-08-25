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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.ArtifactsItem;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.BuildsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse unmarshall(QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse queryLinkeantcodeAntcodeManualbranchpipelineexecResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.RequestId"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.ResultCode"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.ResultMessage"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setBeginAt(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.BeginAt"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setCommitId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.CommitId"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setCommitMsg(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.CommitMsg"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setCommitShortId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.CommitShortId"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.CreatedAt"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setEventTriggerType(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.EventTriggerType"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setExecId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.ExecId"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setFinishedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.FinishedAt"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Id"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setLastest(_ctx.booleanValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Lastest"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setPullRequestId(_ctx.longValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.PullRequestId"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setPullRequestIid(_ctx.longValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.PullRequestIid"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setRef(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Ref"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setStatus(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Status"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setType(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Type"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setUtCover(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.UtCover"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setUtCoverUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.UtCoverUrl"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setUtPass(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.UtPass"));

		Author author = new Author();
		author.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.AvatarUrl"));
		author.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.CreatedAt"));
		author.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.Email"));
		author.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.Id"));
		author.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.Name"));
		author.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.NotificationLevel"));
		author.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.State"));
		author.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.Username"));
		author.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Author.WebUrl"));
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setAuthor(author);

		List<ArtifactsItem> artifacts = new ArrayList<ArtifactsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts.Length"); i++) {
			ArtifactsItem artifactsItem = new ArtifactsItem();
			artifactsItem.setBuildId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].BuildId"));
			artifactsItem.setBuildSystem(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].BuildSystem"));
			artifactsItem.setBuildType(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].BuildType"));
			artifactsItem.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].CreatedAt"));
			artifactsItem.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].Description"));
			artifactsItem.setFsPath(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].FsPath"));
			artifactsItem.setFsType(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].FsType"));
			artifactsItem.setId(_ctx.longValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].Id"));
			artifactsItem.setMd5(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].Md5"));
			artifactsItem.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].Name"));
			artifactsItem.setSha(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Artifacts["+ i +"].Sha"));

			artifacts.add(artifactsItem);
		}
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setArtifacts(artifacts);

		List<BuildsItem> builds = new ArrayList<BuildsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Builds.Length"); i++) {
			BuildsItem buildsItem = new BuildsItem();
			buildsItem.setBuildId(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Builds["+ i +"].BuildId"));
			buildsItem.setBuildSystem(_ctx.stringValue("QueryLinkeantcodeAntcodeManualbranchpipelineexecResponse.Builds["+ i +"].BuildSystem"));

			builds.add(buildsItem);
		}
		queryLinkeantcodeAntcodeManualbranchpipelineexecResponse.setBuilds(builds);
	 
	 	return queryLinkeantcodeAntcodeManualbranchpipelineexecResponse;
	}
}