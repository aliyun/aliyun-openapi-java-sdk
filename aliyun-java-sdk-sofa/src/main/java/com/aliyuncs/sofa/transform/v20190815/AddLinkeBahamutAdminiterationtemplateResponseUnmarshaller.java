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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminiterationtemplateResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminiterationtemplateResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminiterationtemplateResponseUnmarshaller {

	public static AddLinkeBahamutAdminiterationtemplateResponse unmarshall(AddLinkeBahamutAdminiterationtemplateResponse addLinkeBahamutAdminiterationtemplateResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminiterationtemplateResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.RequestId"));
		addLinkeBahamutAdminiterationtemplateResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.ResultCode"));
		addLinkeBahamutAdminiterationtemplateResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.ResultMessage"));
		addLinkeBahamutAdminiterationtemplateResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.ErrorMessage"));
		addLinkeBahamutAdminiterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminiterationtemplateResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Message"));
		addLinkeBahamutAdminiterationtemplateResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminiterationtemplateResponse.ResponseStatusCode"));
		addLinkeBahamutAdminiterationtemplateResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Description"));
		result.setEnable(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Enable"));
		result.setFabricBizType(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.FabricBizType"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.IndependentComplete"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Modifier"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Name"));
		result.setNeedProject(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.NeedProject"));
		result.setNeedWorkItem(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.NeedWorkItem"));
		result.setTemplateGroup(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.TemplateGroup"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Type"));
		result.setXflushCheckEnable(_ctx.booleanValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.XflushCheckEnable"));

		List<String> preSetStageTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.PreSetStageTemplateIds.Length"); i++) {
			preSetStageTemplateIds.add(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.PreSetStageTemplateIds["+ i +"]"));
		}
		result.setPreSetStageTemplateIds(preSetStageTemplateIds);

		List<String> stageTemplates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.StageTemplates.Length"); i++) {
			stageTemplates.add(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.StageTemplates["+ i +"]"));
		}
		result.setStageTemplates(stageTemplates);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("AddLinkeBahamutAdminiterationtemplateResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		addLinkeBahamutAdminiterationtemplateResponse.setResult(result);
	 
	 	return addLinkeBahamutAdminiterationtemplateResponse;
	}
}