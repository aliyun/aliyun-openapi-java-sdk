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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAdminiterationtemplateeditstageResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutAdminiterationtemplateeditstageResponseUnmarshaller {

	public static SaveLinkeBahamutAdminiterationtemplateeditstageResponse unmarshall(SaveLinkeBahamutAdminiterationtemplateeditstageResponse saveLinkeBahamutAdminiterationtemplateeditstageResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.RequestId"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.ResultCode"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.ResultMessage"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.ErrorMessage"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Message"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.ResponseStatusCode"));
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Success"));

		Result result = new Result();
		result.setAutoComplete(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.AutoComplete"));
		result.setBranch(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Branch"));
		result.setCheckQuality(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.CheckQuality"));
		result.setCheckStc(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.CheckStc"));
		result.setCloudWorkspaceId(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.CloudWorkspaceId"));
		result.setConfigItemCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.ConfigItemCheck"));
		result.setCreated(_ctx.longValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Description"));
		result.setDisplayName(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.DisplayName"));
		result.setDockerImageCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.DockerImageCheck"));
		result.setFabricStage(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.FabricStage"));
		result.setGreyRelease(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Id"));
		result.setJoint(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Joint"));
		result.setLastModified(_ctx.longValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.LastModified"));
		result.setMavenRepo(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.MavenRepo"));
		result.setMergeRequestAllowed(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.MergeRequestAllowed"));
		result.setMutualCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.MutualCheck"));
		result.setMvnCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.MvnCheck"));
		result.setName(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Name"));
		result.setPreCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreCheck"));
		result.setPreSetId(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreSetId"));
		result.setSerialCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.SerialCheck"));
		result.setShowRelease(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.ShowRelease"));
		result.setSkipApprovalTasks(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.SkipApprovalTasks"));
		result.setSkipCodeChangeCheck(_ctx.booleanValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.SkipCodeChangeCheck"));
		result.setTemplateGroup(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.TemplateGroup"));
		result.setType(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Type"));
		result.setWorkspace(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Workspace"));
		result.setWorkspaceId(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.WorkspaceId"));

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> pipelines = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Pipelines.Length"); i++) {
			pipelines.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.Pipelines["+ i +"]"));
		}
		result.setPipelines(pipelines);

		List<String> postGuards = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PostGuards.Length"); i++) {
			postGuards.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PostGuards["+ i +"]"));
		}
		result.setPostGuards(postGuards);

		List<String> postTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PostTasks.Length"); i++) {
			postTasks.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PostTasks["+ i +"]"));
		}
		result.setPostTasks(postTasks);

		List<String> preGuards = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreGuards.Length"); i++) {
			preGuards.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreGuards["+ i +"]"));
		}
		result.setPreGuards(preGuards);

		List<String> preSetPipelineTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreSetPipelineTemplateIds.Length"); i++) {
			preSetPipelineTemplateIds.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreSetPipelineTemplateIds["+ i +"]"));
		}
		result.setPreSetPipelineTemplateIds(preSetPipelineTemplateIds);

		List<String> preTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreTasks.Length"); i++) {
			preTasks.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.PreTasks["+ i +"]"));
		}
		result.setPreTasks(preTasks);

		List<String> revertTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.RevertTasks.Length"); i++) {
			revertTasks.add(_ctx.stringValue("SaveLinkeBahamutAdminiterationtemplateeditstageResponse.Result.RevertTasks["+ i +"]"));
		}
		result.setRevertTasks(revertTasks);
		saveLinkeBahamutAdminiterationtemplateeditstageResponse.setResult(result);
	 
	 	return saveLinkeBahamutAdminiterationtemplateeditstageResponse;
	}
}