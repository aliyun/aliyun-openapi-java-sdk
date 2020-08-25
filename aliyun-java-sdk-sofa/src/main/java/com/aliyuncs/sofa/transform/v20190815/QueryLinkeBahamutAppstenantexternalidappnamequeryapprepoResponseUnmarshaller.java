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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponseUnmarshaller {

	public static QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse unmarshall(QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.RequestId"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.ResultCode"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.ResultMessage"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.ErrorMessage"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Message"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.ResponseStatusCode"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.AppName"));
		result.setReadNeedOwnerAudit(_ctx.booleanValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.ReadNeedOwnerAudit"));
		result.setReadSecLevel(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.ReadSecLevel"));
		result.setRepoName(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.RepoName"));
		result.setRepoUrl(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.RepoUrl"));
		result.setTenantId(_ctx.longValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.TenantId"));
		result.setVisibilityLevel(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.VisibilityLevel"));
		result.setWriteNeedOwnerAudit(_ctx.booleanValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.WriteNeedOwnerAudit"));
		result.setWriteSecLevel(_ctx.stringValue("QueryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.Result.WriteSecLevel"));
		queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppstenantexternalidappnamequeryapprepoResponse;
	}
}