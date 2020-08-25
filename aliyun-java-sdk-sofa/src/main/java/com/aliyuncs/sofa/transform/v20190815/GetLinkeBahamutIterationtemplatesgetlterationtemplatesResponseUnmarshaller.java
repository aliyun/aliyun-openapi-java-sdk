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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponseUnmarshaller {

	public static GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse unmarshall(GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.RequestId"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.ResultCode"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.ResultMessage"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.ErrorMessage"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Message"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.ResponseStatusCode"));
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Deleted"));
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Description"));
			resultItem.setEnable(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Enable"));
			resultItem.setFabricBizType(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].FabricBizType"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Id"));
			resultItem.setIndependentComplete(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].IndependentComplete"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].LastModified"));
			resultItem.setModifier(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Modifier"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Name"));
			resultItem.setNeedProject(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].NeedProject"));
			resultItem.setNeedWorkItem(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].NeedWorkItem"));
			resultItem.setTemplateGroup(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].TemplateGroup"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Tenant"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Type"));
			resultItem.setXflushCheckEnable(_ctx.booleanValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].XflushCheckEnable"));

			List<String> preSetStageTemplateIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].PreSetStageTemplateIds.Length"); j++) {
				preSetStageTemplateIds.add(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].PreSetStageTemplateIds["+ j +"]"));
			}
			resultItem.setPreSetStageTemplateIds(preSetStageTemplateIds);

			List<String> stageTemplates = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].StageTemplates.Length"); j++) {
				stageTemplates.add(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].StageTemplates["+ j +"]"));
			}
			resultItem.setStageTemplates(stageTemplates);

			List<String> tasks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Tasks.Length"); j++) {
				tasks.add(_ctx.stringValue("GetLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.Result["+ i +"].Tasks["+ j +"]"));
			}
			resultItem.setTasks(tasks);

			result.add(resultItem);
		}
		getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationtemplatesgetlterationtemplatesResponse;
	}
}