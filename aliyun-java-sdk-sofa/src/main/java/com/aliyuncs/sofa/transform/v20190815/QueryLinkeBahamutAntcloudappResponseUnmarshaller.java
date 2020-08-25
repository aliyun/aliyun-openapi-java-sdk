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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAntcloudappResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAntcloudappResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAntcloudappResponseUnmarshaller {

	public static QueryLinkeBahamutAntcloudappResponse unmarshall(QueryLinkeBahamutAntcloudappResponse queryLinkeBahamutAntcloudappResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAntcloudappResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.RequestId"));
		queryLinkeBahamutAntcloudappResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.ResultCode"));
		queryLinkeBahamutAntcloudappResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.ResultMessage"));
		queryLinkeBahamutAntcloudappResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.ErrorMessage"));
		queryLinkeBahamutAntcloudappResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAntcloudappResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Message"));
		queryLinkeBahamutAntcloudappResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAntcloudappResponse.ResponseStatusCode"));
		queryLinkeBahamutAntcloudappResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAntcloudappResponse.Success"));

		Result result = new Result();
		result.setAlias(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.Alias"));
		result.setApplicationName(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.ApplicationName"));
		result.setAppGroupName(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.AppGroupName"));
		result.setAppLevel(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.AppLevel"));
		result.setBuildpackName(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.BuildpackName"));
		result.setBuildpackVersion(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.BuildpackVersion"));
		result.setCreationTime(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.CreationTime"));
		result.setDescription(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.Description"));
		result.setHasImported(_ctx.booleanValue("QueryLinkeBahamutAntcloudappResponse.Result.HasImported"));
		result.setOwnerLoginName(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.OwnerLoginName"));
		result.setStatus(_ctx.stringValue("QueryLinkeBahamutAntcloudappResponse.Result.Status"));
		result.setTechV2(_ctx.booleanValue("QueryLinkeBahamutAntcloudappResponse.Result.TechV2"));
		queryLinkeBahamutAntcloudappResponse.setResult(result);
	 
	 	return queryLinkeBahamutAntcloudappResponse;
	}
}