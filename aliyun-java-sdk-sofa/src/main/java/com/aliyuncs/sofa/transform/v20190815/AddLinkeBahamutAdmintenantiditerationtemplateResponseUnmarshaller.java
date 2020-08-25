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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmintenantiditerationtemplateResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdmintenantiditerationtemplateResponseUnmarshaller {

	public static AddLinkeBahamutAdmintenantiditerationtemplateResponse unmarshall(AddLinkeBahamutAdmintenantiditerationtemplateResponse addLinkeBahamutAdmintenantiditerationtemplateResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.RequestId"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.ResultCode"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.ResultMessage"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.ErrorMessage"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Message"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.ResponseStatusCode"));
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Description"));
		result.setEnable(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Enable"));
		result.setFabricBizType(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.FabricBizType"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.IndependentComplete"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Modifier"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Name"));
		result.setNeedProject(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.NeedProject"));
		result.setNeedWorkItem(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.NeedWorkItem"));
		result.setTemplateGroup(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.TemplateGroup"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Type"));
		result.setXflushCheckEnable(_ctx.booleanValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.XflushCheckEnable"));

		List<String> preSetStageTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.PreSetStageTemplateIds.Length"); i++) {
			preSetStageTemplateIds.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.PreSetStageTemplateIds["+ i +"]"));
		}
		result.setPreSetStageTemplateIds(preSetStageTemplateIds);

		List<String> stageTemplates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.StageTemplates.Length"); i++) {
			stageTemplates.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.StageTemplates["+ i +"]"));
		}
		result.setStageTemplates(stageTemplates);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("AddLinkeBahamutAdmintenantiditerationtemplateResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		addLinkeBahamutAdmintenantiditerationtemplateResponse.setResult(result);
	 
	 	return addLinkeBahamutAdmintenantiditerationtemplateResponse;
	}
}