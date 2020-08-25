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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetmyreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetmyreleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGetmyreleaseResponseUnmarshaller {

	public static GetLinkeBahamutGetmyreleaseResponse unmarshall(GetLinkeBahamutGetmyreleaseResponse getLinkeBahamutGetmyreleaseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGetmyreleaseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.RequestId"));
		getLinkeBahamutGetmyreleaseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.ResultCode"));
		getLinkeBahamutGetmyreleaseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.ResultMessage"));
		getLinkeBahamutGetmyreleaseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.ErrorMessage"));
		getLinkeBahamutGetmyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGetmyreleaseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Message"));
		getLinkeBahamutGetmyreleaseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGetmyreleaseResponse.ResponseStatusCode"));
		getLinkeBahamutGetmyreleaseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAfterFastDevDate(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].AfterFastDevDate"));
			resultItem.setAoneReleaseId(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].AppGroup"));
			resultItem.setAttachable(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Attachable"));
			resultItem.setBetaRelease(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].BetaRelease"));
			resultItem.setContainPreInMultiEnv(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].ContainPreInMultiEnv"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Creator"));
			resultItem.setDailyRelease(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].DailyRelease"));
			resultItem.setDeadlines(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Deadlines"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Deleted"));
			resultItem.setDependencies(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Dependencies"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].ExternalId"));
			resultItem.setGreenChannelId(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].GreenChannelId"));
			resultItem.setGreenChannelName(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].GreenChannelName"));
			resultItem.setGreenChannelPortalUrl(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].GreenChannelPortalUrl"));
			resultItem.setHasCreatedAppReleaseDetail(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].HasCreatedAppReleaseDetail"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Id"));
			resultItem.setIterationType(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].IterationType"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Link"));
			resultItem.setMergeStartTime(_ctx.longValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].MergeStartTime"));
			resultItem.setMultiEnvProd(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].MultiEnvProd"));
			resultItem.setMultiEnvRelease(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].MultiEnvRelease"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Status"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].TenantId"));
			resultItem.setTicket(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Ticket"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Type"));
			resultItem.setWindowRelease(_ctx.booleanValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].WindowRelease"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Apps.Length"); j++) {
				apps.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			List<String> delAppMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].DelAppMetaIds.Length"); j++) {
				delAppMetaIds.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].DelAppMetaIds["+ j +"]"));
			}
			resultItem.setDelAppMetaIds(delAppMetaIds);

			List<String> iterations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Iterations.Length"); j++) {
				iterations.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Iterations["+ j +"]"));
			}
			resultItem.setIterations(iterations);

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			List<String> multiEnvConfigs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].MultiEnvConfigs.Length"); j++) {
				multiEnvConfigs.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].MultiEnvConfigs["+ j +"]"));
			}
			resultItem.setMultiEnvConfigs(multiEnvConfigs);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			List<String> tenantReleaseInfos = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].TenantReleaseInfos.Length"); j++) {
				tenantReleaseInfos.add(_ctx.stringValue("GetLinkeBahamutGetmyreleaseResponse.Result["+ i +"].TenantReleaseInfos["+ j +"]"));
			}
			resultItem.setTenantReleaseInfos(tenantReleaseInfos);

			result.add(resultItem);
		}
		getLinkeBahamutGetmyreleaseResponse.setResult(result);
	 
	 	return getLinkeBahamutGetmyreleaseResponse;
	}
}