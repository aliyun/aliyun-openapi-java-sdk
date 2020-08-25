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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationaddprojectinfoResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationaddprojectinfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutIterationaddprojectinfoResponseUnmarshaller {

	public static AddLinkeBahamutIterationaddprojectinfoResponse unmarshall(AddLinkeBahamutIterationaddprojectinfoResponse addLinkeBahamutIterationaddprojectinfoResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutIterationaddprojectinfoResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.RequestId"));
		addLinkeBahamutIterationaddprojectinfoResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.ResultCode"));
		addLinkeBahamutIterationaddprojectinfoResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.ResultMessage"));
		addLinkeBahamutIterationaddprojectinfoResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.ErrorMessage"));
		addLinkeBahamutIterationaddprojectinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.ErrorMsgParamsMap"));
		addLinkeBahamutIterationaddprojectinfoResponse.setMessage(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Message"));
		addLinkeBahamutIterationaddprojectinfoResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutIterationaddprojectinfoResponse.ResponseStatusCode"));
		addLinkeBahamutIterationaddprojectinfoResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("AddLinkeBahamutIterationaddprojectinfoResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		addLinkeBahamutIterationaddprojectinfoResponse.setResult(result);
	 
	 	return addLinkeBahamutIterationaddprojectinfoResponse;
	}
}