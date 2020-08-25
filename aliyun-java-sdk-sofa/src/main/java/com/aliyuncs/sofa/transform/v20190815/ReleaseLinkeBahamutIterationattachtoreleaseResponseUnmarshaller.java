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

import com.aliyuncs.sofa.model.v20190815.ReleaseLinkeBahamutIterationattachtoreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseLinkeBahamutIterationattachtoreleaseResponseUnmarshaller {

	public static ReleaseLinkeBahamutIterationattachtoreleaseResponse unmarshall(ReleaseLinkeBahamutIterationattachtoreleaseResponse releaseLinkeBahamutIterationattachtoreleaseResponse, UnmarshallerContext _ctx) {
		
		releaseLinkeBahamutIterationattachtoreleaseResponse.setRequestId(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.RequestId"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setResultCode(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.ResultCode"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setResultMessage(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.ResultMessage"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setErrorMessage(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.ErrorMessage"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.ErrorMsgParamsMap"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setMessage(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Message"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setResponseStatusCode(_ctx.longValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.ResponseStatusCode"));
		releaseLinkeBahamutIterationattachtoreleaseResponse.setSuccess(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("ReleaseLinkeBahamutIterationattachtoreleaseResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		releaseLinkeBahamutIterationattachtoreleaseResponse.setResult(result);
	 
	 	return releaseLinkeBahamutIterationattachtoreleaseResponse;
	}
}