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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutIterationsdocreateResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutIterationsdocreateResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutIterationsdocreateResponseUnmarshaller {

	public static CreateLinkeBahamutIterationsdocreateResponse unmarshall(CreateLinkeBahamutIterationsdocreateResponse createLinkeBahamutIterationsdocreateResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutIterationsdocreateResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.RequestId"));
		createLinkeBahamutIterationsdocreateResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.ResultCode"));
		createLinkeBahamutIterationsdocreateResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.ResultMessage"));
		createLinkeBahamutIterationsdocreateResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.ErrorMessage"));
		createLinkeBahamutIterationsdocreateResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.ErrorMsgParamsMap"));
		createLinkeBahamutIterationsdocreateResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Message"));
		createLinkeBahamutIterationsdocreateResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutIterationsdocreateResponse.ResponseStatusCode"));
		createLinkeBahamutIterationsdocreateResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AoneCodeChangeId"));
		result.setBranchRelease(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.BranchRelease"));
		result.setCompatible(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Creator"));
		result.setCreatorSysName(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.CreatorSysName"));
		result.setDeleted(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Deleted"));
		result.setEmergency(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Emergency"));
		result.setExternalId(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.ExternalId"));
		result.setFabricBizType(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.FabricBizType"));
		result.setFinished(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Finished"));
		result.setGreyRelease(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.GreyRelease"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.IndependentComplete"));
		result.setIterationManager(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.IterationManager"));
		result.setIterationTemplate(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.IterationTemplate"));
		result.setLastModified(_ctx.longValue("CreateLinkeBahamutIterationsdocreateResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Name"));
		result.setOriginalRelease(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.OriginalRelease"));
		result.setOverdueApplyModifyReleaseId(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.OverdueApplyModifyReleaseId"));
		result.setPrePubOwner(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.PrePubOwner"));
		result.setPrivateAppGroup(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.PrivateAppGroup"));
		result.setProdCode(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.ProdVersion"));
		result.setProjectId(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.ProjectId"));
		result.setProjectName(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.ProjectName"));
		result.setRelease(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Release"));
		result.setStageStep(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.StageStep"));
		result.setTagAndMergeMasterWhenEmergency(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.TagAndMergeMasterWhenEmergency"));
		result.setTecRiskOwner(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.TecRiskOwner"));
		result.setTenant(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Tenant"));
		result.setTestOwner(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.TestOwner"));
		result.setType(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Type"));
		result.setUseBaselineToRelease(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.UseBaselineToRelease"));
		result.setXflushCheckEnable(_ctx.booleanValue("CreateLinkeBahamutIterationsdocreateResponse.Result.XflushCheckEnable"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> appMetaNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AppMetaNames.Length"); i++) {
			appMetaNames.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AppMetaNames["+ i +"]"));
		}
		result.setAppMetaNames(appMetaNames);

		List<String> auditProds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AuditProds.Length"); i++) {
			auditProds.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.AuditProds["+ i +"]"));
		}
		result.setAuditProds(auditProds);

		List<String> defects = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Defects.Length"); i++) {
			defects.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Defects["+ i +"]"));
		}
		result.setDefects(defects);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> paasApplyIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.PaasApplyIds.Length"); i++) {
			paasApplyIds.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.PaasApplyIds["+ i +"]"));
		}
		result.setPaasApplyIds(paasApplyIds);

		List<String> requirements = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Requirements.Length"); i++) {
			requirements.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Requirements["+ i +"]"));
		}
		result.setRequirements(requirements);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("CreateLinkeBahamutIterationsdocreateResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		createLinkeBahamutIterationsdocreateResponse.setResult(result);
	 
	 	return createLinkeBahamutIterationsdocreateResponse;
	}
}