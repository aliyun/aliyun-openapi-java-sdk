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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationtemplateiterationtemplateResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationtemplateiterationtemplateResponseUnmarshaller {

	public static GetLinkeBahamutIterationtemplateiterationtemplateResponse unmarshall(GetLinkeBahamutIterationtemplateiterationtemplateResponse getLinkeBahamutIterationtemplateiterationtemplateResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.RequestId"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.ResultCode"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.ResultMessage"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.ErrorMessage"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Message"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.ResponseStatusCode"));
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Description"));
		result.setEnable(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Enable"));
		result.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.FabricBizType"));
		result.setId(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.IndependentComplete"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Modifier"));
		result.setName(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Name"));
		result.setNeedProject(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.NeedProject"));
		result.setNeedWorkItem(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.NeedWorkItem"));
		result.setTemplateGroup(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.TemplateGroup"));
		result.setTenant(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Type"));
		result.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.XflushCheckEnable"));

		List<String> preSetStageTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.PreSetStageTemplateIds.Length"); i++) {
			preSetStageTemplateIds.add(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.PreSetStageTemplateIds["+ i +"]"));
		}
		result.setPreSetStageTemplateIds(preSetStageTemplateIds);

		List<String> stageTemplates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.StageTemplates.Length"); i++) {
			stageTemplates.add(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.StageTemplates["+ i +"]"));
		}
		result.setStageTemplates(stageTemplates);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("GetLinkeBahamutIterationtemplateiterationtemplateResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		getLinkeBahamutIterationtemplateiterationtemplateResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationtemplateiterationtemplateResponse;
	}
}