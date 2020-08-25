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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetrelatelatestiterationResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetrelatelatestiterationResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetrelatelatestiterationResponse unmarshall(GetLinkeBahamutIterationgetrelatelatestiterationResponse getLinkeBahamutIterationgetrelatelatestiterationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.RequestId"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.ResultCode"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.ResultMessage"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.ErrorMessage"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Message"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("GetLinkeBahamutIterationgetrelatelatestiterationResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		getLinkeBahamutIterationgetrelatelatestiterationResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationgetrelatelatestiterationResponse;
	}
}