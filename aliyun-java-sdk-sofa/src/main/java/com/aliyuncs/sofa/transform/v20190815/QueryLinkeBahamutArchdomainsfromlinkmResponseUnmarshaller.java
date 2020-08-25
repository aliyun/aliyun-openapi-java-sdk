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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutArchdomainsfromlinkmResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutArchdomainsfromlinkmResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutArchdomainsfromlinkmResponseUnmarshaller {

	public static QueryLinkeBahamutArchdomainsfromlinkmResponse unmarshall(QueryLinkeBahamutArchdomainsfromlinkmResponse queryLinkeBahamutArchdomainsfromlinkmResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutArchdomainsfromlinkmResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.RequestId"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.ResultCode"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.ResultMessage"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.ErrorMessage"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Message"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.ResponseStatusCode"));
		queryLinkeBahamutArchdomainsfromlinkmResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Success"));

		Result result = new Result();
		result.setBakOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.BakOwner"));
		result.setBakTestOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.BakTestOwner"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.ExternalId"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Level"));
		result.setName(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Name"));
		result.setOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.Owner"));
		result.setParentId(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.ParentId"));
		result.setTenantId(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.TenantId"));
		result.setTestOwner(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.TestOwner"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> linkcGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.LinkcGroups.Length"); i++) {
			linkcGroups.add(_ctx.stringValue("QueryLinkeBahamutArchdomainsfromlinkmResponse.Result.LinkcGroups["+ i +"]"));
		}
		result.setLinkcGroups(linkcGroups);
		queryLinkeBahamutArchdomainsfromlinkmResponse.setResult(result);
	 
	 	return queryLinkeBahamutArchdomainsfromlinkmResponse;
	}
}