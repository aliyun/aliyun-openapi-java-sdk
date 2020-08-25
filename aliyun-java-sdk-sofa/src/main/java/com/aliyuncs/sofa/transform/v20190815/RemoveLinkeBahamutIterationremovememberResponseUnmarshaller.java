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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationremovememberResponse;
import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationremovememberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeBahamutIterationremovememberResponseUnmarshaller {

	public static RemoveLinkeBahamutIterationremovememberResponse unmarshall(RemoveLinkeBahamutIterationremovememberResponse removeLinkeBahamutIterationremovememberResponse, UnmarshallerContext _ctx) {
		
		removeLinkeBahamutIterationremovememberResponse.setRequestId(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.RequestId"));
		removeLinkeBahamutIterationremovememberResponse.setResultCode(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.ResultCode"));
		removeLinkeBahamutIterationremovememberResponse.setResultMessage(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.ResultMessage"));
		removeLinkeBahamutIterationremovememberResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.ErrorMessage"));
		removeLinkeBahamutIterationremovememberResponse.setErrorMsgParamsMap(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.ErrorMsgParamsMap"));
		removeLinkeBahamutIterationremovememberResponse.setMessage(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Message"));
		removeLinkeBahamutIterationremovememberResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeBahamutIterationremovememberResponse.ResponseStatusCode"));
		removeLinkeBahamutIterationremovememberResponse.setSuccess(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("RemoveLinkeBahamutIterationremovememberResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("RemoveLinkeBahamutIterationremovememberResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("RemoveLinkeBahamutIterationremovememberResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		removeLinkeBahamutIterationremovememberResponse.setResult(result);
	 
	 	return removeLinkeBahamutIterationremovememberResponse;
	}
}