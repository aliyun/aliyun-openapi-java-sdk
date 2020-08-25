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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetiterationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetiterationsResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetiterationsResponse unmarshall(GetLinkeBahamutIterationgetiterationsResponse getLinkeBahamutIterationgetiterationsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetiterationsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.RequestId"));
		getLinkeBahamutIterationgetiterationsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.ResultCode"));
		getLinkeBahamutIterationgetiterationsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.ResultMessage"));
		getLinkeBahamutIterationgetiterationsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.ErrorMessage"));
		getLinkeBahamutIterationgetiterationsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetiterationsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Message"));
		getLinkeBahamutIterationgetiterationsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetiterationsResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetiterationsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneCodeChangeId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AoneCodeChangeId"));
			resultItem.setBranchRelease(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].BranchRelease"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Deleted"));
			resultItem.setEmergency(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Emergency"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].FabricBizType"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Finished"));
			resultItem.setGreyRelease(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setIterationManager(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].IterationManager"));
			resultItem.setIterationTemplate(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].IterationTemplate"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Name"));
			resultItem.setOriginalRelease(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].OriginalRelease"));
			resultItem.setOverdueApplyModifyReleaseId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].OverdueApplyModifyReleaseId"));
			resultItem.setPrePubOwner(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].PrePubOwner"));
			resultItem.setPrivateAppGroup(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].PrivateAppGroup"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setProjectId(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].ProjectId"));
			resultItem.setProjectName(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].ProjectName"));
			resultItem.setRelease(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Release"));
			resultItem.setStageStep(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].StageStep"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTecRiskOwner(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].TecRiskOwner"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Tenant"));
			resultItem.setTestOwner(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].TestOwner"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Type"));
			resultItem.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].UseBaselineToRelease"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> appMetaNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AppMetaNames.Length"); j++) {
				appMetaNames.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AppMetaNames["+ j +"]"));
			}
			resultItem.setAppMetaNames(appMetaNames);

			List<String> auditProds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AuditProds.Length"); j++) {
				auditProds.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].AuditProds["+ j +"]"));
			}
			resultItem.setAuditProds(auditProds);

			List<String> defects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Defects.Length"); j++) {
				defects.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Defects["+ j +"]"));
			}
			resultItem.setDefects(defects);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> paasApplyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].PaasApplyIds.Length"); j++) {
				paasApplyIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].PaasApplyIds["+ j +"]"));
			}
			resultItem.setPaasApplyIds(paasApplyIds);

			List<String> requirements = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Requirements.Length"); j++) {
				requirements.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Requirements["+ j +"]"));
			}
			resultItem.setRequirements(requirements);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("GetLinkeBahamutIterationgetiterationsResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		getLinkeBahamutIterationgetiterationsResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationgetiterationsResponse;
	}
}