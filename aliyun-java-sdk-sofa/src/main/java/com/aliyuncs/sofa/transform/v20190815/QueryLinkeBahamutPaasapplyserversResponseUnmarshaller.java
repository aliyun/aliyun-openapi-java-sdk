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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPaasapplyserversResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutPaasapplyserversResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutPaasapplyserversResponseUnmarshaller {

	public static QueryLinkeBahamutPaasapplyserversResponse unmarshall(QueryLinkeBahamutPaasapplyserversResponse queryLinkeBahamutPaasapplyserversResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutPaasapplyserversResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.RequestId"));
		queryLinkeBahamutPaasapplyserversResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.ResultCode"));
		queryLinkeBahamutPaasapplyserversResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.ResultMessage"));
		queryLinkeBahamutPaasapplyserversResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.ErrorMessage"));
		queryLinkeBahamutPaasapplyserversResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutPaasapplyserversResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Message"));
		queryLinkeBahamutPaasapplyserversResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutPaasapplyserversResponse.ResponseStatusCode"));
		queryLinkeBahamutPaasapplyserversResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutPaasapplyserversResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutPaasapplyserversResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("QueryLinkeBahamutPaasapplyserversResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		queryLinkeBahamutPaasapplyserversResponse.setResult(result);
	 
	 	return queryLinkeBahamutPaasapplyserversResponse;
	}
}