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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutReleasemanageiterationrelationshipappResponseUnmarshaller {

	public static DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse unmarshall(DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse deleteLinkeBahamutReleasemanageiterationrelationshipappResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.RequestId"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.ResultCode"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.ResultMessage"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.ErrorMessage"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Message"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.ResponseStatusCode"));
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("DeleteLinkeBahamutReleasemanageiterationrelationshipappResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		deleteLinkeBahamutReleasemanageiterationrelationshipappResponse.setResult(result);
	 
	 	return deleteLinkeBahamutReleasemanageiterationrelationshipappResponse;
	}
}