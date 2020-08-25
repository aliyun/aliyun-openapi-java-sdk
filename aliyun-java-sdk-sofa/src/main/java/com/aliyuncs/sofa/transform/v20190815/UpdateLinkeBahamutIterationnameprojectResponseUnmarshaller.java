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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationnameprojectResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationnameprojectResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutIterationnameprojectResponseUnmarshaller {

	public static UpdateLinkeBahamutIterationnameprojectResponse unmarshall(UpdateLinkeBahamutIterationnameprojectResponse updateLinkeBahamutIterationnameprojectResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutIterationnameprojectResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.RequestId"));
		updateLinkeBahamutIterationnameprojectResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.ResultCode"));
		updateLinkeBahamutIterationnameprojectResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.ResultMessage"));
		updateLinkeBahamutIterationnameprojectResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.ErrorMessage"));
		updateLinkeBahamutIterationnameprojectResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutIterationnameprojectResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Message"));
		updateLinkeBahamutIterationnameprojectResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutIterationnameprojectResponse.ResponseStatusCode"));
		updateLinkeBahamutIterationnameprojectResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("UpdateLinkeBahamutIterationnameprojectResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		updateLinkeBahamutIterationnameprojectResponse.setResult(result);
	 
	 	return updateLinkeBahamutIterationnameprojectResponse;
	}
}