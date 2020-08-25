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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminiterationtemplateidResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAdminiterationtemplateidResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAdminiterationtemplateidResponseUnmarshaller {

	public static QueryLinkeBahamutAdminiterationtemplateidResponse unmarshall(QueryLinkeBahamutAdminiterationtemplateidResponse queryLinkeBahamutAdminiterationtemplateidResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAdminiterationtemplateidResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.RequestId"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.ResultCode"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.ResultMessage"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.ErrorMessage"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Message"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAdminiterationtemplateidResponse.ResponseStatusCode"));
		queryLinkeBahamutAdminiterationtemplateidResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Description"));
		result.setEnable(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Enable"));
		result.setFabricBizType(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.FabricBizType"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Id"));
		result.setIndependentComplete(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.IndependentComplete"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.LastModified"));
		result.setModifier(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Modifier"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Name"));
		result.setNeedProject(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.NeedProject"));
		result.setNeedWorkItem(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.NeedWorkItem"));
		result.setTemplateGroup(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.TemplateGroup"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Type"));
		result.setXflushCheckEnable(_ctx.booleanValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.XflushCheckEnable"));

		List<String> preSetStageTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.PreSetStageTemplateIds.Length"); i++) {
			preSetStageTemplateIds.add(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.PreSetStageTemplateIds["+ i +"]"));
		}
		result.setPreSetStageTemplateIds(preSetStageTemplateIds);

		List<String> stageTemplates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.StageTemplates.Length"); i++) {
			stageTemplates.add(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.StageTemplates["+ i +"]"));
		}
		result.setStageTemplates(stageTemplates);

		List<String> tasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Tasks.Length"); i++) {
			tasks.add(_ctx.stringValue("QueryLinkeBahamutAdminiterationtemplateidResponse.Result.Tasks["+ i +"]"));
		}
		result.setTasks(tasks);
		queryLinkeBahamutAdminiterationtemplateidResponse.setResult(result);
	 
	 	return queryLinkeBahamutAdminiterationtemplateidResponse;
	}
}