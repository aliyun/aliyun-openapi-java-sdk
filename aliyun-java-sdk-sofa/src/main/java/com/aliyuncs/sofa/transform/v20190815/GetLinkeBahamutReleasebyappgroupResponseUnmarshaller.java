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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleasebyappgroupResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleasebyappgroupResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutReleasebyappgroupResponseUnmarshaller {

	public static GetLinkeBahamutReleasebyappgroupResponse unmarshall(GetLinkeBahamutReleasebyappgroupResponse getLinkeBahamutReleasebyappgroupResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutReleasebyappgroupResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.RequestId"));
		getLinkeBahamutReleasebyappgroupResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.ResultCode"));
		getLinkeBahamutReleasebyappgroupResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.ResultMessage"));
		getLinkeBahamutReleasebyappgroupResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.ErrorMessage"));
		getLinkeBahamutReleasebyappgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.ErrorMsgParamsMap"));
		getLinkeBahamutReleasebyappgroupResponse.setMessage(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Message"));
		getLinkeBahamutReleasebyappgroupResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutReleasebyappgroupResponse.ResponseStatusCode"));
		getLinkeBahamutReleasebyappgroupResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAfterFastDevDate(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].AfterFastDevDate"));
			resultItem.setAoneReleaseId(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].AppGroup"));
			resultItem.setAttachable(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Attachable"));
			resultItem.setBetaRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].BetaRelease"));
			resultItem.setContainPreInMultiEnv(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].ContainPreInMultiEnv"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Creator"));
			resultItem.setDailyRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].DailyRelease"));
			resultItem.setDeadlines(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Deadlines"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Deleted"));
			resultItem.setDependencies(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Dependencies"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].ExternalId"));
			resultItem.setGreenChannelId(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].GreenChannelId"));
			resultItem.setGreenChannelName(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].GreenChannelName"));
			resultItem.setGreenChannelPortalUrl(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].GreenChannelPortalUrl"));
			resultItem.setHasCreatedAppReleaseDetail(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].HasCreatedAppReleaseDetail"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Id"));
			resultItem.setIterationType(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].IterationType"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Link"));
			resultItem.setMergeStartTime(_ctx.longValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].MergeStartTime"));
			resultItem.setMultiEnvProd(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].MultiEnvProd"));
			resultItem.setMultiEnvRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].MultiEnvRelease"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Status"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].TenantId"));
			resultItem.setTicket(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Ticket"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Type"));
			resultItem.setWindowRelease(_ctx.booleanValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].WindowRelease"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Apps.Length"); j++) {
				apps.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			List<String> delAppMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].DelAppMetaIds.Length"); j++) {
				delAppMetaIds.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].DelAppMetaIds["+ j +"]"));
			}
			resultItem.setDelAppMetaIds(delAppMetaIds);

			List<String> iterations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Iterations.Length"); j++) {
				iterations.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Iterations["+ j +"]"));
			}
			resultItem.setIterations(iterations);

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			List<String> multiEnvConfigs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].MultiEnvConfigs.Length"); j++) {
				multiEnvConfigs.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].MultiEnvConfigs["+ j +"]"));
			}
			resultItem.setMultiEnvConfigs(multiEnvConfigs);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			List<String> tenantReleaseInfos = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].TenantReleaseInfos.Length"); j++) {
				tenantReleaseInfos.add(_ctx.stringValue("GetLinkeBahamutReleasebyappgroupResponse.Result["+ i +"].TenantReleaseInfos["+ j +"]"));
			}
			resultItem.setTenantReleaseInfos(tenantReleaseInfos);

			result.add(resultItem);
		}
		getLinkeBahamutReleasebyappgroupResponse.setResult(result);
	 
	 	return getLinkeBahamutReleasebyappgroupResponse;
	}
}