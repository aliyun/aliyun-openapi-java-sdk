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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutReleasemanagerResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutReleasemanagerResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutReleasemanagerResponseUnmarshaller {

	public static UpdateLinkeBahamutReleasemanagerResponse unmarshall(UpdateLinkeBahamutReleasemanagerResponse updateLinkeBahamutReleasemanagerResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutReleasemanagerResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.RequestId"));
		updateLinkeBahamutReleasemanagerResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.ResultCode"));
		updateLinkeBahamutReleasemanagerResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.ResultMessage"));
		updateLinkeBahamutReleasemanagerResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.ErrorMessage"));
		updateLinkeBahamutReleasemanagerResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutReleasemanagerResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Message"));
		updateLinkeBahamutReleasemanagerResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutReleasemanagerResponse.ResponseStatusCode"));
		updateLinkeBahamutReleasemanagerResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutReleasemanagerResponse.Result.LastModified"));
		result.setLink(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Link"));
		result.setMergeStartTime(_ctx.longValue("UpdateLinkeBahamutReleasemanagerResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("UpdateLinkeBahamutReleasemanagerResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasemanagerResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasemanagerResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("UpdateLinkeBahamutReleasemanagerResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		updateLinkeBahamutReleasemanagerResponse.setResult(result);
	 
	 	return updateLinkeBahamutReleasemanagerResponse;
	}
}