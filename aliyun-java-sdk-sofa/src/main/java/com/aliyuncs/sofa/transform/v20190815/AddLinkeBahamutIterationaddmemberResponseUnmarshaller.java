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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationaddmemberResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationaddmemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutIterationaddmemberResponseUnmarshaller {

	public static AddLinkeBahamutIterationaddmemberResponse unmarshall(AddLinkeBahamutIterationaddmemberResponse addLinkeBahamutIterationaddmemberResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutIterationaddmemberResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.RequestId"));
		addLinkeBahamutIterationaddmemberResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.ResultCode"));
		addLinkeBahamutIterationaddmemberResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.ResultMessage"));
		addLinkeBahamutIterationaddmemberResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.ErrorMessage"));
		addLinkeBahamutIterationaddmemberResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.ErrorMsgParamsMap"));
		addLinkeBahamutIterationaddmemberResponse.setMessage(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Message"));
		addLinkeBahamutIterationaddmemberResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutIterationaddmemberResponse.ResponseStatusCode"));
		addLinkeBahamutIterationaddmemberResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutIterationaddmemberResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutIterationaddmemberResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("AddLinkeBahamutIterationaddmemberResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddmemberResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("AddLinkeBahamutIterationaddmemberResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		addLinkeBahamutIterationaddmemberResponse.setResult(result);
	 
	 	return addLinkeBahamutIterationaddmemberResponse;
	}
}