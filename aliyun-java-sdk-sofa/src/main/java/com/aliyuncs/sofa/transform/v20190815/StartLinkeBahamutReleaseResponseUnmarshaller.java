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

import com.aliyuncs.sofa.model.v20190815.StartLinkeBahamutReleaseResponse;
import com.aliyuncs.sofa.model.v20190815.StartLinkeBahamutReleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartLinkeBahamutReleaseResponseUnmarshaller {

	public static StartLinkeBahamutReleaseResponse unmarshall(StartLinkeBahamutReleaseResponse startLinkeBahamutReleaseResponse, UnmarshallerContext _ctx) {
		
		startLinkeBahamutReleaseResponse.setRequestId(_ctx.stringValue("StartLinkeBahamutReleaseResponse.RequestId"));
		startLinkeBahamutReleaseResponse.setResultCode(_ctx.stringValue("StartLinkeBahamutReleaseResponse.ResultCode"));
		startLinkeBahamutReleaseResponse.setResultMessage(_ctx.stringValue("StartLinkeBahamutReleaseResponse.ResultMessage"));
		startLinkeBahamutReleaseResponse.setErrorMessage(_ctx.stringValue("StartLinkeBahamutReleaseResponse.ErrorMessage"));
		startLinkeBahamutReleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("StartLinkeBahamutReleaseResponse.ErrorMsgParamsMap"));
		startLinkeBahamutReleaseResponse.setMessage(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Message"));
		startLinkeBahamutReleaseResponse.setResponseStatusCode(_ctx.longValue("StartLinkeBahamutReleaseResponse.ResponseStatusCode"));
		startLinkeBahamutReleaseResponse.setSuccess(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("StartLinkeBahamutReleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("StartLinkeBahamutReleaseResponse.Result.LastModified"));
		result.setLink(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Link"));
		result.setMergeStartTime(_ctx.longValue("StartLinkeBahamutReleaseResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("StartLinkeBahamutReleaseResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("StartLinkeBahamutReleaseResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("StartLinkeBahamutReleaseResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("StartLinkeBahamutReleaseResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		startLinkeBahamutReleaseResponse.setResult(result);
	 
	 	return startLinkeBahamutReleaseResponse;
	}
}