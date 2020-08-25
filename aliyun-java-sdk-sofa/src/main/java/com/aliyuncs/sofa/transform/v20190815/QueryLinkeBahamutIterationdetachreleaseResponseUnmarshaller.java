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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationdetachreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationdetachreleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationdetachreleaseResponseUnmarshaller {

	public static QueryLinkeBahamutIterationdetachreleaseResponse unmarshall(QueryLinkeBahamutIterationdetachreleaseResponse queryLinkeBahamutIterationdetachreleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationdetachreleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.RequestId"));
		queryLinkeBahamutIterationdetachreleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.ResultCode"));
		queryLinkeBahamutIterationdetachreleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.ResultMessage"));
		queryLinkeBahamutIterationdetachreleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.ErrorMessage"));
		queryLinkeBahamutIterationdetachreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationdetachreleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Message"));
		queryLinkeBahamutIterationdetachreleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationdetachreleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationdetachreleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("QueryLinkeBahamutIterationdetachreleaseResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		queryLinkeBahamutIterationdetachreleaseResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationdetachreleaseResponse;
	}
}