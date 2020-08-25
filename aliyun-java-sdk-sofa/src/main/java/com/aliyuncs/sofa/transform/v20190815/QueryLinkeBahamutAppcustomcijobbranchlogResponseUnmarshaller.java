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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomcijobbranchlogResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppcustomcijobbranchlogResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppcustomcijobbranchlogResponseUnmarshaller {

	public static QueryLinkeBahamutAppcustomcijobbranchlogResponse unmarshall(QueryLinkeBahamutAppcustomcijobbranchlogResponse queryLinkeBahamutAppcustomcijobbranchlogResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.RequestId"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.ResultCode"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.ResultMessage"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.ErrorMessage"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Message"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.ResponseStatusCode"));
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].AppId"));
			resultItem.setAppName(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].AppName"));
			resultItem.setBranch(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Branch"));
			resultItem.setCommitMessage(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].CommitMessage"));
			resultItem.setContext(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Context"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Created"));
			resultItem.setCustomCIId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].CustomCIId"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Deleted"));
			resultItem.setExecutionDate(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].ExecutionDate"));
			resultItem.setExecutionId(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].ExecutionId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Id"));
			resultItem.setIsLatest(_ctx.booleanValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].IsLatest"));
			resultItem.setLastCommitId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].LastCommitId"));
			resultItem.setLastExecuted(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].LastExecuted"));
			resultItem.setLastExecuteCost(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].LastExecuteCost"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].LastModified"));
			resultItem.setPipelineInstanceId(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].PipelineInstanceId"));
			resultItem.setPipelineTemplateId(_ctx.longValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].PipelineTemplateId"));
			resultItem.setPipelineTemplateName(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].PipelineTemplateName"));
			resultItem.setQuality(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Quality"));
			resultItem.setResult(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Result"));
			resultItem.setStatus(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].Status"));
			resultItem.setTenantId(_ctx.stringValue("QueryLinkeBahamutAppcustomcijobbranchlogResponse.Result["+ i +"].TenantId"));

			result.add(resultItem);
		}
		queryLinkeBahamutAppcustomcijobbranchlogResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppcustomcijobbranchlogResponse;
	}
}