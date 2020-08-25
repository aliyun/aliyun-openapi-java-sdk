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

import com.aliyuncs.sofa.model.v20190815.PushLinkeBahamutSubmitreleaeinmultienvResponse;
import com.aliyuncs.sofa.model.v20190815.PushLinkeBahamutSubmitreleaeinmultienvResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushLinkeBahamutSubmitreleaeinmultienvResponseUnmarshaller {

	public static PushLinkeBahamutSubmitreleaeinmultienvResponse unmarshall(PushLinkeBahamutSubmitreleaeinmultienvResponse pushLinkeBahamutSubmitreleaeinmultienvResponse, UnmarshallerContext _ctx) {
		
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setRequestId(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.RequestId"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setResultCode(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.ResultCode"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setResultMessage(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.ResultMessage"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setErrorMessage(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.ErrorMessage"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setErrorMsgParamsMap(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.ErrorMsgParamsMap"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setMessage(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Message"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setResponseStatusCode(_ctx.longValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.ResponseStatusCode"));
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setSuccess(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.LastModified"));
		result.setLink(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Link"));
		result.setMergeStartTime(_ctx.longValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("PushLinkeBahamutSubmitreleaeinmultienvResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		pushLinkeBahamutSubmitreleaeinmultienvResponse.setResult(result);
	 
	 	return pushLinkeBahamutSubmitreleaeinmultienvResponse;
	}
}