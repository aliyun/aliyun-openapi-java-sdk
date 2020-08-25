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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseUnmarshaller {

	public static AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse unmarshall(AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.RequestId"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.ResultCode"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.ResultMessage"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.ErrorMessage"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Message"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.ResponseStatusCode"));
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Success"));

		Result result = new Result();
		result.setAutoComplete(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.AutoComplete"));
		result.setBranch(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Branch"));
		result.setCheckQuality(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.CheckQuality"));
		result.setCheckStc(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.CheckStc"));
		result.setCloudWorkspaceId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.CloudWorkspaceId"));
		result.setConfigItemCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.ConfigItemCheck"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Description"));
		result.setDisplayName(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.DisplayName"));
		result.setDockerImageCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.DockerImageCheck"));
		result.setFabricStage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.FabricStage"));
		result.setGreyRelease(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Id"));
		result.setJoint(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Joint"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.LastModified"));
		result.setMavenRepo(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.MavenRepo"));
		result.setMergeRequestAllowed(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.MergeRequestAllowed"));
		result.setMutualCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.MutualCheck"));
		result.setMvnCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.MvnCheck"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Name"));
		result.setPreCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreCheck"));
		result.setPreSetId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreSetId"));
		result.setSerialCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.SerialCheck"));
		result.setShowRelease(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.ShowRelease"));
		result.setSkipApprovalTasks(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.SkipApprovalTasks"));
		result.setSkipCodeChangeCheck(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.SkipCodeChangeCheck"));
		result.setTemplateGroup(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.TemplateGroup"));
		result.setType(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Type"));
		result.setWorkspace(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Workspace"));
		result.setWorkspaceId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.WorkspaceId"));

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> pipelines = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Pipelines.Length"); i++) {
			pipelines.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.Pipelines["+ i +"]"));
		}
		result.setPipelines(pipelines);

		List<String> postGuards = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PostGuards.Length"); i++) {
			postGuards.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PostGuards["+ i +"]"));
		}
		result.setPostGuards(postGuards);

		List<String> postTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PostTasks.Length"); i++) {
			postTasks.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PostTasks["+ i +"]"));
		}
		result.setPostTasks(postTasks);

		List<String> preGuards = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreGuards.Length"); i++) {
			preGuards.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreGuards["+ i +"]"));
		}
		result.setPreGuards(preGuards);

		List<String> preSetPipelineTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreSetPipelineTemplateIds.Length"); i++) {
			preSetPipelineTemplateIds.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreSetPipelineTemplateIds["+ i +"]"));
		}
		result.setPreSetPipelineTemplateIds(preSetPipelineTemplateIds);

		List<String> preTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreTasks.Length"); i++) {
			preTasks.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.PreTasks["+ i +"]"));
		}
		result.setPreTasks(preTasks);

		List<String> revertTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.RevertTasks.Length"); i++) {
			revertTasks.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.Result.RevertTasks["+ i +"]"));
		}
		result.setRevertTasks(revertTasks);
		addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse.setResult(result);
	 
	 	return addLinkeBahamutAdmintenantiditerationtemplateaddstageResponse;
	}
}