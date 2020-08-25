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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutReleasedependencyResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutReleasedependencyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutReleasedependencyResponseUnmarshaller {

	public static UpdateLinkeBahamutReleasedependencyResponse unmarshall(UpdateLinkeBahamutReleasedependencyResponse updateLinkeBahamutReleasedependencyResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutReleasedependencyResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.RequestId"));
		updateLinkeBahamutReleasedependencyResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.ResultCode"));
		updateLinkeBahamutReleasedependencyResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.ResultMessage"));
		updateLinkeBahamutReleasedependencyResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.ErrorMessage"));
		updateLinkeBahamutReleasedependencyResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutReleasedependencyResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Message"));
		updateLinkeBahamutReleasedependencyResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutReleasedependencyResponse.ResponseStatusCode"));
		updateLinkeBahamutReleasedependencyResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutReleasedependencyResponse.Result.LastModified"));
		result.setLink(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Link"));
		result.setMergeStartTime(_ctx.longValue("UpdateLinkeBahamutReleasedependencyResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("UpdateLinkeBahamutReleasedependencyResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("UpdateLinkeBahamutReleasedependencyResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleasedependencyResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("UpdateLinkeBahamutReleasedependencyResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		updateLinkeBahamutReleasedependencyResponse.setResult(result);
	 
	 	return updateLinkeBahamutReleasedependencyResponse;
	}
}