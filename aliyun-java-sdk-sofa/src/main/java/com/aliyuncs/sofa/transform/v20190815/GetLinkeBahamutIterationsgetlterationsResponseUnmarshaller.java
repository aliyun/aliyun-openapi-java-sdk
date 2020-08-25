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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetlterationsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetlterationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationsgetlterationsResponseUnmarshaller {

	public static GetLinkeBahamutIterationsgetlterationsResponse unmarshall(GetLinkeBahamutIterationsgetlterationsResponse getLinkeBahamutIterationsgetlterationsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationsgetlterationsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.RequestId"));
		getLinkeBahamutIterationsgetlterationsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.ResultCode"));
		getLinkeBahamutIterationsgetlterationsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.ResultMessage"));
		getLinkeBahamutIterationsgetlterationsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.ErrorMessage"));
		getLinkeBahamutIterationsgetlterationsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationsgetlterationsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Message"));
		getLinkeBahamutIterationsgetlterationsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationsgetlterationsResponse.ResponseStatusCode"));
		getLinkeBahamutIterationsgetlterationsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneCodeChangeId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AoneCodeChangeId"));
			resultItem.setBranchRelease(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].BranchRelease"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Deleted"));
			resultItem.setEmergency(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Emergency"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].ExternalId"));
			resultItem.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].FabricBizType"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Finished"));
			resultItem.setGreyRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setIterationManager(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].IterationManager"));
			resultItem.setIterationTemplate(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].IterationTemplate"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Name"));
			resultItem.setOriginalRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].OriginalRelease"));
			resultItem.setOverdueApplyModifyReleaseId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].OverdueApplyModifyReleaseId"));
			resultItem.setPrePubOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].PrePubOwner"));
			resultItem.setPrivateAppGroup(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].PrivateAppGroup"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setProjectId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].ProjectId"));
			resultItem.setProjectName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].ProjectName"));
			resultItem.setRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Release"));
			resultItem.setStageStep(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].StageStep"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTecRiskOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].TecRiskOwner"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Tenant"));
			resultItem.setTestOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].TestOwner"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Type"));
			resultItem.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].UseBaselineToRelease"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> appMetaNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AppMetaNames.Length"); j++) {
				appMetaNames.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AppMetaNames["+ j +"]"));
			}
			resultItem.setAppMetaNames(appMetaNames);

			List<String> auditProds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AuditProds.Length"); j++) {
				auditProds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].AuditProds["+ j +"]"));
			}
			resultItem.setAuditProds(auditProds);

			List<String> defects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Defects.Length"); j++) {
				defects.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Defects["+ j +"]"));
			}
			resultItem.setDefects(defects);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> paasApplyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].PaasApplyIds.Length"); j++) {
				paasApplyIds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].PaasApplyIds["+ j +"]"));
			}
			resultItem.setPaasApplyIds(paasApplyIds);

			List<String> requirements = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Requirements.Length"); j++) {
				requirements.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Requirements["+ j +"]"));
			}
			resultItem.setRequirements(requirements);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		getLinkeBahamutIterationsgetlterationsResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationsgetlterationsResponse;
	}
}