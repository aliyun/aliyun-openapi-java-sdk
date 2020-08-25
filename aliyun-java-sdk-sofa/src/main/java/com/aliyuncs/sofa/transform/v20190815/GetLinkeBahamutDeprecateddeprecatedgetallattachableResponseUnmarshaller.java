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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutDeprecateddeprecatedgetallattachableResponseUnmarshaller {

	public static GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse unmarshall(GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse getLinkeBahamutDeprecateddeprecatedgetallattachableResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.RequestId"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.ResultCode"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.ResultMessage"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.ErrorMessage"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.ErrorMsgParamsMap"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setMessage(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Message"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.ResponseStatusCode"));
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAfterFastDevDate(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].AfterFastDevDate"));
			resultItem.setAoneReleaseId(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroup(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].AppGroup"));
			resultItem.setAttachable(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Attachable"));
			resultItem.setBetaRelease(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].BetaRelease"));
			resultItem.setContainPreInMultiEnv(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].ContainPreInMultiEnv"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Creator"));
			resultItem.setDailyRelease(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].DailyRelease"));
			resultItem.setDeadlines(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Deadlines"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Deleted"));
			resultItem.setDependencies(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Dependencies"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].ExternalId"));
			resultItem.setGreenChannelId(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].GreenChannelId"));
			resultItem.setGreenChannelName(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].GreenChannelName"));
			resultItem.setGreenChannelPortalUrl(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].GreenChannelPortalUrl"));
			resultItem.setHasCreatedAppReleaseDetail(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].HasCreatedAppReleaseDetail"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Id"));
			resultItem.setIterationType(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].IterationType"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Link"));
			resultItem.setMergeStartTime(_ctx.longValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].MergeStartTime"));
			resultItem.setMultiEnvProd(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].MultiEnvProd"));
			resultItem.setMultiEnvRelease(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].MultiEnvRelease"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Status"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTenantId(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].TenantId"));
			resultItem.setTicket(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Ticket"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Type"));
			resultItem.setWindowRelease(_ctx.booleanValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].WindowRelease"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Apps.Length"); j++) {
				apps.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			List<String> delAppMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].DelAppMetaIds.Length"); j++) {
				delAppMetaIds.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].DelAppMetaIds["+ j +"]"));
			}
			resultItem.setDelAppMetaIds(delAppMetaIds);

			List<String> iterations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Iterations.Length"); j++) {
				iterations.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Iterations["+ j +"]"));
			}
			resultItem.setIterations(iterations);

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			List<String> multiEnvConfigs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].MultiEnvConfigs.Length"); j++) {
				multiEnvConfigs.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].MultiEnvConfigs["+ j +"]"));
			}
			resultItem.setMultiEnvConfigs(multiEnvConfigs);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			List<String> tenantReleaseInfos = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].TenantReleaseInfos.Length"); j++) {
				tenantReleaseInfos.add(_ctx.stringValue("GetLinkeBahamutDeprecateddeprecatedgetallattachableResponse.Result["+ i +"].TenantReleaseInfos["+ j +"]"));
			}
			resultItem.setTenantReleaseInfos(tenantReleaseInfos);

			result.add(resultItem);
		}
		getLinkeBahamutDeprecateddeprecatedgetallattachableResponse.setResult(result);
	 
	 	return getLinkeBahamutDeprecateddeprecatedgetallattachableResponse;
	}
}