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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeManualbranchpipelineResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeManualbranchpipelineResponse.ArtifactsItem;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeantcodeAntcodeManualbranchpipelineResponse.BuildsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeantcodeAntcodeManualbranchpipelineResponseUnmarshaller {

	public static ExecLinkeantcodeAntcodeManualbranchpipelineResponse unmarshall(ExecLinkeantcodeAntcodeManualbranchpipelineResponse execLinkeantcodeAntcodeManualbranchpipelineResponse, UnmarshallerContext _ctx) {
		
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setRequestId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.RequestId"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setResultCode(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.ResultCode"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setResultMessage(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.ResultMessage"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setBeginAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.BeginAt"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setCommitId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.CommitId"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setCommitMsg(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.CommitMsg"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setCommitShortId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.CommitShortId"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.CreatedAt"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setEventTriggerType(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.EventTriggerType"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setExecId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.ExecId"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setFinishedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.FinishedAt"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Id"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setLastest(_ctx.booleanValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Lastest"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setPullRequestId(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.PullRequestId"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setPullRequestIid(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.PullRequestIid"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setRef(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Ref"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.ResponseStatusCode"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setStatus(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Status"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setType(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Type"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setUtCover(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.UtCover"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setUtCoverUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.UtCoverUrl"));
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setUtPass(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.UtPass"));

		Author author = new Author();
		author.setAccessLevel(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.AccessLevel"));
		author.setAvatarUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.AvatarUrl"));
		author.setBio(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Bio"));
		author.setCanCreateGroup(_ctx.booleanValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.CanCreateGroup"));
		author.setCanCreateProject(_ctx.booleanValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.CanCreateProject"));
		author.setColorSchemeId(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.ColorSchemeId"));
		author.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.CreatedAt"));
		author.setCurrentSignInAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.CurrentSignInAt"));
		author.setDepartment(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Department"));
		author.setEmail(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Email"));
		author.setExpiresAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.ExpiresAt"));
		author.setExternUid(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.ExternUid"));
		author.setId(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Id"));
		author.setIsAdmin(_ctx.booleanValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.IsAdmin"));
		author.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Name"));
		author.setPrivateToken(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.PrivateToken"));
		author.setProjectsLimit(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.ProjectsLimit"));
		author.setRegistered(_ctx.booleanValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Registered"));
		author.setRole(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Role"));
		author.setState(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.State"));
		author.setThemeId(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.ThemeId"));
		author.setUpdatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.UpdatedAt"));
		author.setUsername(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Username"));
		author.setWebsiteUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.WebsiteUrl"));
		author.setWebUrl(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.WebUrl"));

		List<String> identities = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Identities.Length"); i++) {
			identities.add(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Author.Identities["+ i +"]"));
		}
		author.setIdentities(identities);
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setAuthor(author);

		List<ArtifactsItem> artifacts = new ArrayList<ArtifactsItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts.Length"); i++) {
			ArtifactsItem artifactsItem = new ArtifactsItem();
			artifactsItem.setBuildId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].BuildId"));
			artifactsItem.setBuildSystem(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].BuildSystem"));
			artifactsItem.setBuildType(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].BuildType"));
			artifactsItem.setCreatedAt(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].CreatedAt"));
			artifactsItem.setDescription(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].Description"));
			artifactsItem.setFsPath(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].FsPath"));
			artifactsItem.setFsType(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].FsType"));
			artifactsItem.setId(_ctx.longValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].Id"));
			artifactsItem.setMd5(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].Md5"));
			artifactsItem.setName(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].Name"));
			artifactsItem.setSha(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Artifacts["+ i +"].Sha"));

			artifacts.add(artifactsItem);
		}
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setArtifacts(artifacts);

		List<BuildsItem> builds = new ArrayList<BuildsItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Builds.Length"); i++) {
			BuildsItem buildsItem = new BuildsItem();
			buildsItem.setBuildId(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Builds["+ i +"].BuildId"));
			buildsItem.setBuildSystem(_ctx.stringValue("ExecLinkeantcodeAntcodeManualbranchpipelineResponse.Builds["+ i +"].BuildSystem"));

			builds.add(buildsItem);
		}
		execLinkeantcodeAntcodeManualbranchpipelineResponse.setBuilds(builds);
	 
	 	return execLinkeantcodeAntcodeManualbranchpipelineResponse;
	}
}