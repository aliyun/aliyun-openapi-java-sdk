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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationsupdateResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationsupdateResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutIterationsupdateResponseUnmarshaller {

	public static UpdateLinkeBahamutIterationsupdateResponse unmarshall(UpdateLinkeBahamutIterationsupdateResponse updateLinkeBahamutIterationsupdateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutIterationsupdateResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.RequestId"));
		updateLinkeBahamutIterationsupdateResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.ResultCode"));
		updateLinkeBahamutIterationsupdateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.ResultMessage"));
		updateLinkeBahamutIterationsupdateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.ErrorMessage"));
		updateLinkeBahamutIterationsupdateResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutIterationsupdateResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Message"));
		updateLinkeBahamutIterationsupdateResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutIterationsupdateResponse.ResponseStatusCode"));
		updateLinkeBahamutIterationsupdateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutIterationsupdateResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("UpdateLinkeBahamutIterationsupdateResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("UpdateLinkeBahamutIterationsupdateResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		updateLinkeBahamutIterationsupdateResponse.setResult(result);
	 
	 	return updateLinkeBahamutIterationsupdateResponse;
	}
}