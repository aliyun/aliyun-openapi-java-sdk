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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetbyreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetbyreleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetbyreleaseResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetbyreleaseResponse unmarshall(GetLinkeBahamutIterationgetbyreleaseResponse getLinkeBahamutIterationgetbyreleaseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetbyreleaseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.RequestId"));
		getLinkeBahamutIterationgetbyreleaseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.ResultCode"));
		getLinkeBahamutIterationgetbyreleaseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.ResultMessage"));
		getLinkeBahamutIterationgetbyreleaseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.ErrorMessage"));
		getLinkeBahamutIterationgetbyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetbyreleaseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Message"));
		getLinkeBahamutIterationgetbyreleaseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetbyreleaseResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetbyreleaseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAoneCodeChangeId(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AoneCodeChangeId"));
			resultItem.setBranchRelease(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].BranchRelease"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Creator"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Deleted"));
			resultItem.setEmergency(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Emergency"));
			resultItem.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].ExternalId"));
			resultItem.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].FabricBizType"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Finished"));
			resultItem.setGreyRelease(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].GreyRelease"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setIterationManager(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].IterationManager"));
			resultItem.setIterationTemplate(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].IterationTemplate"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Name"));
			resultItem.setOriginalRelease(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].OriginalRelease"));
			resultItem.setOverdueApplyModifyReleaseId(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].OverdueApplyModifyReleaseId"));
			resultItem.setPrePubOwner(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].PrePubOwner"));
			resultItem.setPrivateAppGroup(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].PrivateAppGroup"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].ProdVersion"));
			resultItem.setProjectId(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].ProjectId"));
			resultItem.setProjectName(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].ProjectName"));
			resultItem.setRelease(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Release"));
			resultItem.setStageStep(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].StageStep"));
			resultItem.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].TagAndMergeMasterWhenEmergency"));
			resultItem.setTecRiskOwner(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].TecRiskOwner"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Tenant"));
			resultItem.setTestOwner(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].TestOwner"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Type"));
			resultItem.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].UseBaselineToRelease"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> appMetaIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AppMetaIds.Length"); j++) {
				appMetaIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AppMetaIds["+ j +"]"));
			}
			resultItem.setAppMetaIds(appMetaIds);

			List<String> appMetaNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AppMetaNames.Length"); j++) {
				appMetaNames.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AppMetaNames["+ j +"]"));
			}
			resultItem.setAppMetaNames(appMetaNames);

			List<String> auditProds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AuditProds.Length"); j++) {
				auditProds.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].AuditProds["+ j +"]"));
			}
			resultItem.setAuditProds(auditProds);

			List<String> defects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Defects.Length"); j++) {
				defects.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Defects["+ j +"]"));
			}
			resultItem.setDefects(defects);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> paasApplyIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].PaasApplyIds.Length"); j++) {
				paasApplyIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].PaasApplyIds["+ j +"]"));
			}
			resultItem.setPaasApplyIds(paasApplyIds);

			List<String> requirements = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Requirements.Length"); j++) {
				requirements.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Requirements["+ j +"]"));
			}
			resultItem.setRequirements(requirements);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("GetLinkeBahamutIterationgetbyreleaseResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		getLinkeBahamutIterationgetbyreleaseResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationgetbyreleaseResponse;
	}
}