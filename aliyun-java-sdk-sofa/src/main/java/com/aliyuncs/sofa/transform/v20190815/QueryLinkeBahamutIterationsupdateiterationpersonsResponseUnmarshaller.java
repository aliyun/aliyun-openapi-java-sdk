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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationsupdateiterationpersonsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationsupdateiterationpersonsResponseUnmarshaller {

	public static QueryLinkeBahamutIterationsupdateiterationpersonsResponse unmarshall(QueryLinkeBahamutIterationsupdateiterationpersonsResponse queryLinkeBahamutIterationsupdateiterationpersonsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.RequestId"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.ResultCode"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.ResultMessage"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.ErrorMessage"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Message"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("QueryLinkeBahamutIterationsupdateiterationpersonsResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		queryLinkeBahamutIterationsupdateiterationpersonsResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationsupdateiterationpersonsResponse;
	}
}