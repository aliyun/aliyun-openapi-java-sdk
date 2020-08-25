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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaseattachtoreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaseattachtoreleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleaseattachtoreleaseResponseUnmarshaller {

	public static QueryLinkeBahamutReleaseattachtoreleaseResponse unmarshall(QueryLinkeBahamutReleaseattachtoreleaseResponse queryLinkeBahamutReleaseattachtoreleaseResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleaseattachtoreleaseResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.RequestId"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.ResultCode"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.ResultMessage"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.ErrorMessage"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Message"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.ResponseStatusCode"));
		queryLinkeBahamutReleaseattachtoreleaseResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("QueryLinkeBahamutReleaseattachtoreleaseResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		queryLinkeBahamutReleaseattachtoreleaseResponse.setResult(result);
	 
	 	return queryLinkeBahamutReleaseattachtoreleaseResponse;
	}
}