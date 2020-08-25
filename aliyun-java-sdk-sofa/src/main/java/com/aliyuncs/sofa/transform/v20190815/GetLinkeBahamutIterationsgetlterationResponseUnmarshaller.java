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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetlterationResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetlterationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationsgetlterationResponseUnmarshaller {

	public static GetLinkeBahamutIterationsgetlterationResponse unmarshall(GetLinkeBahamutIterationsgetlterationResponse getLinkeBahamutIterationsgetlterationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationsgetlterationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.RequestId"));
		getLinkeBahamutIterationsgetlterationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.ResultCode"));
		getLinkeBahamutIterationsgetlterationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.ResultMessage"));
		getLinkeBahamutIterationsgetlterationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.ErrorMessage"));
		getLinkeBahamutIterationsgetlterationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationsgetlterationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Message"));
		getLinkeBahamutIterationsgetlterationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationsgetlterationResponse.ResponseStatusCode"));
		getLinkeBahamutIterationsgetlterationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutIterationsgetlterationResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationsgetlterationResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("GetLinkeBahamutIterationsgetlterationResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		getLinkeBahamutIterationsgetlterationResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationsgetlterationResponse;
	}
}