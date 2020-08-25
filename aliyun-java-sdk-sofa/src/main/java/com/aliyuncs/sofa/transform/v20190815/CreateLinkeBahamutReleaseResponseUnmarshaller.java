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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutReleaseResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutReleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutReleaseResponseUnmarshaller {

	public static CreateLinkeBahamutReleaseResponse unmarshall(CreateLinkeBahamutReleaseResponse createLinkeBahamutReleaseResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutReleaseResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.RequestId"));
		createLinkeBahamutReleaseResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.ResultCode"));
		createLinkeBahamutReleaseResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.ResultMessage"));
		createLinkeBahamutReleaseResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.ErrorMessage"));
		createLinkeBahamutReleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.ErrorMsgParamsMap"));
		createLinkeBahamutReleaseResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Message"));
		createLinkeBahamutReleaseResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutReleaseResponse.ResponseStatusCode"));
		createLinkeBahamutReleaseResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Success"));

		Result result = new Result();
		result.setAfterFastDevDate(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.AfterFastDevDate"));
		result.setAoneReleaseId(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.AoneReleaseId"));
		result.setAppGroup(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.AppGroup"));
		result.setAttachable(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.Attachable"));
		result.setBetaRelease(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.BetaRelease"));
		result.setContainPreInMultiEnv(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.ContainPreInMultiEnv"));
		result.setCreated(_ctx.longValue("CreateLinkeBahamutReleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Creator"));
		result.setDailyRelease(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.DailyRelease"));
		result.setDeadlines(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Deadlines"));
		result.setDeleted(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.Deleted"));
		result.setDependencies(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Dependencies"));
		result.setExternalId(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.ExternalId"));
		result.setGreenChannelId(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.GreenChannelId"));
		result.setGreenChannelName(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.GreenChannelName"));
		result.setGreenChannelPortalUrl(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.GreenChannelPortalUrl"));
		result.setHasCreatedAppReleaseDetail(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.HasCreatedAppReleaseDetail"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Id"));
		result.setIterationType(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.IterationType"));
		result.setLastModified(_ctx.longValue("CreateLinkeBahamutReleaseResponse.Result.LastModified"));
		result.setLink(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Link"));
		result.setMergeStartTime(_ctx.longValue("CreateLinkeBahamutReleaseResponse.Result.MergeStartTime"));
		result.setMultiEnvProd(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.MultiEnvProd"));
		result.setMultiEnvRelease(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.MultiEnvRelease"));
		result.setName(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Name"));
		result.setReleaseDate(_ctx.longValue("CreateLinkeBahamutReleaseResponse.Result.ReleaseDate"));
		result.setStatus(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Status"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTenantId(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.TenantId"));
		result.setTicket(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Ticket"));
		result.setType(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Type"));
		result.setWindowRelease(_ctx.booleanValue("CreateLinkeBahamutReleaseResponse.Result.WindowRelease"));

		List<String> apps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.Apps.Length"); i++) {
			apps.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Apps["+ i +"]"));
		}
		result.setApps(apps);

		List<String> delAppMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.DelAppMetaIds.Length"); i++) {
			delAppMetaIds.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.DelAppMetaIds["+ i +"]"));
		}
		result.setDelAppMetaIds(delAppMetaIds);

		List<String> iterations = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.Iterations.Length"); i++) {
			iterations.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Iterations["+ i +"]"));
		}
		result.setIterations(iterations);

		List<String> managers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.Managers.Length"); i++) {
			managers.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Managers["+ i +"]"));
		}
		result.setManagers(managers);

		List<String> multiEnvConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.MultiEnvConfigs.Length"); i++) {
			multiEnvConfigs.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.MultiEnvConfigs["+ i +"]"));
		}
		result.setMultiEnvConfigs(multiEnvConfigs);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);

		List<String> tenantReleaseInfos = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutReleaseResponse.Result.TenantReleaseInfos.Length"); i++) {
			tenantReleaseInfos.add(_ctx.stringValue("CreateLinkeBahamutReleaseResponse.Result.TenantReleaseInfos["+ i +"]"));
		}
		result.setTenantReleaseInfos(tenantReleaseInfos);
		createLinkeBahamutReleaseResponse.setResult(result);
	 
	 	return createLinkeBahamutReleaseResponse;
	}
}