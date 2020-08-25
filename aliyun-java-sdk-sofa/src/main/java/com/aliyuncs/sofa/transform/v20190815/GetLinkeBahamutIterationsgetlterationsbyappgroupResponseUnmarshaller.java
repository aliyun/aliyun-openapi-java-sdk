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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetlterationsbyappgroupResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationsgetlterationsbyappgroupResponseUnmarshaller {

	public static GetLinkeBahamutIterationsgetlterationsbyappgroupResponse unmarshall(GetLinkeBahamutIterationsgetlterationsbyappgroupResponse getLinkeBahamutIterationsgetlterationsbyappgroupResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.RequestId"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.ResultCode"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.ResultMessage"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.ErrorMessage"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Message"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.ResponseStatusCode"));
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneCodeChangeId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AoneCodeChangeId"));
			resultItem.setBranchRelease(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].BranchRelease"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Deleted"));
			resultItem.setEmergency(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Emergency"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].ExternalId"));
			resultItem.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].FabricBizType"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Finished"));
			resultItem.setGreyRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setIterationManager(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].IterationManager"));
			resultItem.setIterationTemplate(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].IterationTemplate"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Name"));
			resultItem.setOriginalRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].OriginalRelease"));
			resultItem.setOverdueApplyModifyReleaseId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].OverdueApplyModifyReleaseId"));
			resultItem.setPrePubOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].PrePubOwner"));
			resultItem.setPrivateAppGroup(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].PrivateAppGroup"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].ProdVersion"));
			resultItem.setProjectId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].ProjectId"));
			resultItem.setProjectName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].ProjectName"));
			resultItem.setRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Release"));
			resultItem.setStageStep(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].StageStep"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTecRiskOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].TecRiskOwner"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Tenant"));
			resultItem.setTestOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].TestOwner"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Type"));
			resultItem.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].UseBaselineToRelease"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> appMetaNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AppMetaNames.Length"); j++) {
				appMetaNames.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AppMetaNames["+ j +"]"));
			}
			resultItem.setAppMetaNames(appMetaNames);

			List<String> auditProds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AuditProds.Length"); j++) {
				auditProds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].AuditProds["+ j +"]"));
			}
			resultItem.setAuditProds(auditProds);

			List<String> defects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Defects.Length"); j++) {
				defects.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Defects["+ j +"]"));
			}
			resultItem.setDefects(defects);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> paasApplyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].PaasApplyIds.Length"); j++) {
				paasApplyIds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].PaasApplyIds["+ j +"]"));
			}
			resultItem.setPaasApplyIds(paasApplyIds);

			List<String> requirements = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Requirements.Length"); j++) {
				requirements.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Requirements["+ j +"]"));
			}
			resultItem.setRequirements(requirements);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationsbyappgroupResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		getLinkeBahamutIterationsgetlterationsbyappgroupResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationsgetlterationsbyappgroupResponse;
	}
}