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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponseUnmarshaller {

	public static QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse unmarshall(QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.RequestId"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.ResultCode"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.ResultMessage"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.ErrorMessage"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.Message"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.ResponseStatusCode"));
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("QueryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.Result["+ i +"]"));
		}
		queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse.setResult(result);
	 
	 	return queryLinkeBahamutApppipelinecomponentallallowskipwhichneedconfigResponse;
	}
}