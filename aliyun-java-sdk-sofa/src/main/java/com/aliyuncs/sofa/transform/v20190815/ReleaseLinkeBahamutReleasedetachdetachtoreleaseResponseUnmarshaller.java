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

import com.aliyuncs.sofa.model.v20190815.ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseUnmarshaller {

	public static ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse unmarshall(ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse releaseLinkeBahamutReleasedetachdetachtoreleaseResponse, UnmarshallerContext _ctx) {
		
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setRequestId(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.RequestId"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setResultCode(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.ResultCode"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setResultMessage(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.ResultMessage"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setErrorMessage(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.ErrorMessage"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.ErrorMsgParamsMap"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setMessage(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Message"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setResponseStatusCode(_ctx.longValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.ResponseStatusCode"));
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setSuccess(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		releaseLinkeBahamutReleasedetachdetachtoreleaseResponse.setResult(result);
	 
	 	return releaseLinkeBahamutReleasedetachdetachtoreleaseResponse;
	}
}