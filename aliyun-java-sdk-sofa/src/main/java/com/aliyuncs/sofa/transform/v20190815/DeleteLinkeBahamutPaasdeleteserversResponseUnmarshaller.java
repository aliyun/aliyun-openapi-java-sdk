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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutPaasdeleteserversResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutPaasdeleteserversResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutPaasdeleteserversResponseUnmarshaller {

	public static DeleteLinkeBahamutPaasdeleteserversResponse unmarshall(DeleteLinkeBahamutPaasdeleteserversResponse deleteLinkeBahamutPaasdeleteserversResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutPaasdeleteserversResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.RequestId"));
		deleteLinkeBahamutPaasdeleteserversResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.ResultCode"));
		deleteLinkeBahamutPaasdeleteserversResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.ResultMessage"));
		deleteLinkeBahamutPaasdeleteserversResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.ErrorMessage"));
		deleteLinkeBahamutPaasdeleteserversResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutPaasdeleteserversResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Message"));
		deleteLinkeBahamutPaasdeleteserversResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutPaasdeleteserversResponse.ResponseStatusCode"));
		deleteLinkeBahamutPaasdeleteserversResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("DeleteLinkeBahamutPaasdeleteserversResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		deleteLinkeBahamutPaasdeleteserversResponse.setResult(result);
	 
	 	return deleteLinkeBahamutPaasdeleteserversResponse;
	}
}