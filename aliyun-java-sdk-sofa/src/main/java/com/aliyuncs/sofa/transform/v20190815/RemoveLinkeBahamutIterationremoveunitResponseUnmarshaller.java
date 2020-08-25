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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationremoveunitResponse;
import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationremoveunitResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeBahamutIterationremoveunitResponseUnmarshaller {

	public static RemoveLinkeBahamutIterationremoveunitResponse unmarshall(RemoveLinkeBahamutIterationremoveunitResponse removeLinkeBahamutIterationremoveunitResponse, UnmarshallerContext _ctx) {
		
		removeLinkeBahamutIterationremoveunitResponse.setRequestId(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.RequestId"));
		removeLinkeBahamutIterationremoveunitResponse.setResultCode(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.ResultCode"));
		removeLinkeBahamutIterationremoveunitResponse.setResultMessage(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.ResultMessage"));
		removeLinkeBahamutIterationremoveunitResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.ErrorMessage"));
		removeLinkeBahamutIterationremoveunitResponse.setErrorMsgParamsMap(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.ErrorMsgParamsMap"));
		removeLinkeBahamutIterationremoveunitResponse.setMessage(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Message"));
		removeLinkeBahamutIterationremoveunitResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeBahamutIterationremoveunitResponse.ResponseStatusCode"));
		removeLinkeBahamutIterationremoveunitResponse.setSuccess(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("RemoveLinkeBahamutIterationremoveunitResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		removeLinkeBahamutIterationremoveunitResponse.setResult(result);
	 
	 	return removeLinkeBahamutIterationremoveunitResponse;
	}
}