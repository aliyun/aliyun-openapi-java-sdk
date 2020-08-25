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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCurrentcurrentpipelinesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCurrentcurrentpipelinesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutCurrentcurrentpipelinesResponseUnmarshaller {

	public static QueryLinkeBahamutCurrentcurrentpipelinesResponse unmarshall(QueryLinkeBahamutCurrentcurrentpipelinesResponse queryLinkeBahamutCurrentcurrentpipelinesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.RequestId"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.ResultCode"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.ResultMessage"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.ErrorMessage"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Message"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.ResponseStatusCode"));
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAuto(_ctx.booleanValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].Auto"));
			resultItem.setContext(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].Context"));
			resultItem.setDisplayName(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].DisplayName"));
			resultItem.setInVisible(_ctx.booleanValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].InVisible"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].LastModified"));
			resultItem.setModifier(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].Modifier"));
			resultItem.setPipeline(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].Pipeline"));
			resultItem.setPipelineInstanceId(_ctx.longValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].PipelineInstanceId"));
			resultItem.setPipelineTemplateId(_ctx.longValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].PipelineTemplateId"));
			resultItem.setPipelineTrigger(_ctx.stringValue("QueryLinkeBahamutCurrentcurrentpipelinesResponse.Result["+ i +"].PipelineTrigger"));

			result.add(resultItem);
		}
		queryLinkeBahamutCurrentcurrentpipelinesResponse.setResult(result);
	 
	 	return queryLinkeBahamutCurrentcurrentpipelinesResponse;
	}
}