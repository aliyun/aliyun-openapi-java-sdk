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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAttachableiterationsbyreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAttachableiterationsbyreleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAttachableiterationsbyreleaseResponseUnmarshaller {

	public static QueryLinkeBahamutAttachableiterationsbyreleaseResponse unmarshall(QueryLinkeBahamutAttachableiterationsbyreleaseResponse queryLinkeBahamutAttachableiterationsbyreleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.RequestId"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.ResultCode"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.ResultMessage"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.ErrorMessage"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Message"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneCodeChangeId(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AoneCodeChangeId"));
			resultItem.setBranchRelease(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].BranchRelease"));
			resultItem.setCompatible(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Deleted"));
			resultItem.setEmergency(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Emergency"));
			resultItem.setExternalId(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].ExternalId"));
			resultItem.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].FabricBizType"));
			resultItem.setFinished(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Finished"));
			resultItem.setGreyRelease(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setIterationManager(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].IterationManager"));
			resultItem.setIterationTemplate(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].IterationTemplate"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Name"));
			resultItem.setOriginalRelease(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].OriginalRelease"));
			resultItem.setOverdueApplyModifyReleaseId(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].OverdueApplyModifyReleaseId"));
			resultItem.setPrePubOwner(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].PrePubOwner"));
			resultItem.setPrivateAppGroup(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].PrivateAppGroup"));
			resultItem.setProdCode(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].ProdVersion"));
			resultItem.setProjectId(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].ProjectId"));
			resultItem.setProjectName(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].ProjectName"));
			resultItem.setRelease(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Release"));
			resultItem.setStageStep(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].StageStep"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTecRiskOwner(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].TecRiskOwner"));
			resultItem.setTenant(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Tenant"));
			resultItem.setTestOwner(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].TestOwner"));
			resultItem.setType(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Type"));
			resultItem.setUseBaselineToRelease(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].UseBaselineToRelease"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> appMetaNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AppMetaNames.Length"); j++) {
				appMetaNames.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AppMetaNames["+ j +"]"));
			}
			resultItem.setAppMetaNames(appMetaNames);

			List<String> auditProds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AuditProds.Length"); j++) {
				auditProds.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].AuditProds["+ j +"]"));
			}
			resultItem.setAuditProds(auditProds);

			List<String> defects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Defects.Length"); j++) {
				defects.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Defects["+ j +"]"));
			}
			resultItem.setDefects(defects);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> paasApplyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].PaasApplyIds.Length"); j++) {
				paasApplyIds.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].PaasApplyIds["+ j +"]"));
			}
			resultItem.setPaasApplyIds(paasApplyIds);

			List<String> requirements = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Requirements.Length"); j++) {
				requirements.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Requirements["+ j +"]"));
			}
			resultItem.setRequirements(requirements);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("QueryLinkeBahamutAttachableiterationsbyreleaseResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		queryLinkeBahamutAttachableiterationsbyreleaseResponse.setResult(result);
	 
	 	return queryLinkeBahamutAttachableiterationsbyreleaseResponse;
	}
}