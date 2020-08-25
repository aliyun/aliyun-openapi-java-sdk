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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleaseResponseUnmarshaller {

	public static QueryLinkeBahamutReleaseResponse unmarshall(QueryLinkeBahamutReleaseResponse queryLinkeBahamutReleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.RequestId"));
		queryLinkeBahamutReleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.ResultCode"));
		queryLinkeBahamutReleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.ResultMessage"));
		queryLinkeBahamutReleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.ErrorMessage"));
		queryLinkeBahamutReleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Message"));
		queryLinkeBahamutReleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutReleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAfterFastDevDate(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].AfterFastDevDate"));
			resultItem.setAoneReleaseId(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].AoneReleaseId"));
			resultItem.setAppGroup(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].AppGroup"));
			resultItem.setAttachable(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Attachable"));
			resultItem.setBetaRelease(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].BetaRelease"));
			resultItem.setContainPreInMultiEnv(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].ContainPreInMultiEnv"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Creator"));
			resultItem.setDailyRelease(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].DailyRelease"));
			resultItem.setDeadlines(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Deadlines"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Deleted"));
			resultItem.setDependencies(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Dependencies"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].ExternalId"));
			resultItem.setGreenChannelId(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].GreenChannelId"));
			resultItem.setGreenChannelName(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].GreenChannelName"));
			resultItem.setGreenChannelPortalUrl(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].GreenChannelPortalUrl"));
			resultItem.setHasCreatedAppReleaseDetail(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].HasCreatedAppReleaseDetail"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Id"));
			resultItem.setIterationType(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].IterationType"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].LastModified"));
			resultItem.setLink(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Link"));
			resultItem.setMergeStartTime(_ctx.longValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].MergeStartTime"));
			resultItem.setMultiEnvProd(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].MultiEnvProd"));
			resultItem.setMultiEnvRelease(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].MultiEnvRelease"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Name"));
			resultItem.setReleaseDate(_ctx.longValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].ReleaseDate"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Status"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].TenantId"));
			resultItem.setTicket(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Ticket"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Type"));
			resultItem.setWindowRelease(_ctx.booleanValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].WindowRelease"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Apps.Length"); j++) {
				apps.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			List<String> delAppMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].DelAppMetaIds.Length"); j++) {
				delAppMetaIds.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].DelAppMetaIds["+ j +"]"));
			}
			resultItem.setDelAppMetaIds(delAppMetaIds);

			List<String> iterations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Iterations.Length"); j++) {
				iterations.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Iterations["+ j +"]"));
			}
			resultItem.setIterations(iterations);

			List<String> managers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Managers.Length"); j++) {
				managers.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Managers["+ j +"]"));
			}
			resultItem.setManagers(managers);

			List<String> multiEnvConfigs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].MultiEnvConfigs.Length"); j++) {
				multiEnvConfigs.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].MultiEnvConfigs["+ j +"]"));
			}
			resultItem.setMultiEnvConfigs(multiEnvConfigs);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			List<String> tenantReleaseInfos = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].TenantReleaseInfos.Length"); j++) {
				tenantReleaseInfos.add(_ctx.stringValue("QueryLinkeBahamutReleaseResponse.Result["+ i +"].TenantReleaseInfos["+ j +"]"));
			}
			resultItem.setTenantReleaseInfos(tenantReleaseInfos);

			result.add(resultItem);
		}
		queryLinkeBahamutReleaseResponse.setResult(result);
	 
	 	return queryLinkeBahamutReleaseResponse;
	}
}