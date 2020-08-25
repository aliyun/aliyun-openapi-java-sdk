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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleasebyexternalidResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleasebyexternalidResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutReleasebyexternalidResponseUnmarshaller {

	public static GetLinkeBahamutReleasebyexternalidResponse unmarshall(GetLinkeBahamutReleasebyexternalidResponse getLinkeBahamutReleasebyexternalidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutReleasebyexternalidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.RequestId"));
		getLinkeBahamutReleasebyexternalidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.ResultCode"));
		getLinkeBahamutReleasebyexternalidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.ResultMessage"));
		getLinkeBahamutReleasebyexternalidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.ErrorMessage"));
		getLinkeBahamutReleasebyexternalidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutReleasebyexternalidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Message"));
		getLinkeBahamutReleasebyexternalidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutReleasebyexternalidResponse.ResponseStatusCode"));
		getLinkeBahamutReleasebyexternalidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutReleasebyexternalidResponse.Result.LastModified"));
		result.setMergeStartTime(_ctx.longValue("GetLinkeBahamutReleasebyexternalidResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("GetLinkeBahamutReleasebyexternalidResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyexternalidResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyexternalidResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("GetLinkeBahamutReleasebyexternalidResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		getLinkeBahamutReleasebyexternalidResponse.setResult(result);
	 
	 	return getLinkeBahamutReleasebyexternalidResponse;
	}
}