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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutReleaseResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutReleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutReleaseResponseUnmarshaller {

	public static UpdateLinkeBahamutReleaseResponse unmarshall(UpdateLinkeBahamutReleaseResponse updateLinkeBahamutReleaseResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutReleaseResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.RequestId"));
		updateLinkeBahamutReleaseResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.ResultCode"));
		updateLinkeBahamutReleaseResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.ResultMessage"));
		updateLinkeBahamutReleaseResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.ErrorMessage"));
		updateLinkeBahamutReleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutReleaseResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Message"));
		updateLinkeBahamutReleaseResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutReleaseResponse.ResponseStatusCode"));
		updateLinkeBahamutReleaseResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutReleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutReleaseResponse.Result.LastModified"));
		result.setLink(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Link"));
		result.setMergeStartTime(_ctx.longValue("UpdateLinkeBahamutReleaseResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("UpdateLinkeBahamutReleaseResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("UpdateLinkeBahamutReleaseResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutReleaseResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("UpdateLinkeBahamutReleaseResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		updateLinkeBahamutReleaseResponse.setResult(result);
	 
	 	return updateLinkeBahamutReleaseResponse;
	}
}