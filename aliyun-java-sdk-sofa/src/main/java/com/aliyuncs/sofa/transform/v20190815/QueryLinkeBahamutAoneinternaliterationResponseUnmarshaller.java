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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternaliterationResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneinternaliterationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneinternaliterationResponseUnmarshaller {

	public static QueryLinkeBahamutAoneinternaliterationResponse unmarshall(QueryLinkeBahamutAoneinternaliterationResponse queryLinkeBahamutAoneinternaliterationResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneinternaliterationResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.RequestId"));
		queryLinkeBahamutAoneinternaliterationResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.ResultCode"));
		queryLinkeBahamutAoneinternaliterationResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.ResultMessage"));
		queryLinkeBahamutAoneinternaliterationResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.ErrorMessage"));
		queryLinkeBahamutAoneinternaliterationResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAoneinternaliterationResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Message"));
		queryLinkeBahamutAoneinternaliterationResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneinternaliterationResponse.ResponseStatusCode"));
		queryLinkeBahamutAoneinternaliterationResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("QueryLinkeBahamutAoneinternaliterationResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		queryLinkeBahamutAoneinternaliterationResponse.setResult(result);
	 
	 	return queryLinkeBahamutAoneinternaliterationResponse;
	}
}