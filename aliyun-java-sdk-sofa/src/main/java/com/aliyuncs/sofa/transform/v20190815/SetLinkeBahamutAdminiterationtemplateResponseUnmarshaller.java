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

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutAdminiterationtemplateResponse;
import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutAdminiterationtemplateResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutAdminiterationtemplateResponseUnmarshaller {

	public static SetLinkeBahamutAdminiterationtemplateResponse unmarshall(SetLinkeBahamutAdminiterationtemplateResponse setLinkeBahamutAdminiterationtemplateResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutAdminiterationtemplateResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.RequestId"));
		setLinkeBahamutAdminiterationtemplateResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.ResultCode"));
		setLinkeBahamutAdminiterationtemplateResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.ResultMessage"));
		setLinkeBahamutAdminiterationtemplateResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.ErrorMessage"));
		setLinkeBahamutAdminiterationtemplateResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.ErrorMsgParamsMap"));
		setLinkeBahamutAdminiterationtemplateResponse.setMessage(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Message"));
		setLinkeBahamutAdminiterationtemplateResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutAdminiterationtemplateResponse.ResponseStatusCode"));
		setLinkeBahamutAdminiterationtemplateResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SetLinkeBahamutAdminiterationtemplateResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Description"));
			resultItem.setEnable(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Enable"));
			resultItem.setFabricBizType(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].FabricBizType"));
			resultItem.setId(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setLastModified(_ctx.longValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].LastModified"));
			resultItem.setModifier(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Modifier"));
			resultItem.setName(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Name"));
			resultItem.setNeedProject(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].NeedProject"));
			resultItem.setNeedWorkItem(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].NeedWorkItem"));
			resultItem.setTemplateGroup(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].TemplateGroup"));
			resultItem.setTenant(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Tenant"));
			resultItem.setType(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Type"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> preSetStageTemplateIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].PreSetStageTemplateIds.Length"); j++) {
				preSetStageTemplateIds.add(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].PreSetStageTemplateIds["+ j +"]"));
			}
			resultItem.setPreSetStageTemplateIds(preSetStageTemplateIds);

			List<String> stageTemplates = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].StageTemplates.Length"); j++) {
				stageTemplates.add(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].StageTemplates["+ j +"]"));
			}
			resultItem.setStageTemplates(stageTemplates);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("SetLinkeBahamutAdminiterationtemplateResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		setLinkeBahamutAdminiterationtemplateResponse.setResult(result);
	 
	 	return setLinkeBahamutAdminiterationtemplateResponse;
	}
}