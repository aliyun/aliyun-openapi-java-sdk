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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutArchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutArchdomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutArchdomainResponseUnmarshaller {

	public static AddLinkeBahamutArchdomainResponse unmarshall(AddLinkeBahamutArchdomainResponse addLinkeBahamutArchdomainResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutArchdomainResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.RequestId"));
		addLinkeBahamutArchdomainResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.ResultCode"));
		addLinkeBahamutArchdomainResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.ResultMessage"));
		addLinkeBahamutArchdomainResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.ErrorMessage"));
		addLinkeBahamutArchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.ErrorMsgParamsMap"));
		addLinkeBahamutArchdomainResponse.setMessage(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Message"));
		addLinkeBahamutArchdomainResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutArchdomainResponse.ResponseStatusCode"));
		addLinkeBahamutArchdomainResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutArchdomainResponse.Success"));

		Result result = new Result();
		result.setBakOwner(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.BakOwner"));
		result.setBakTestOwner(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.BakTestOwner"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutArchdomainResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutArchdomainResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.ExternalId"));
		result.setId(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutArchdomainResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.Level"));
		result.setName(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.Name"));
		result.setOwner(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.Owner"));
		result.setParentId(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.ParentId"));
		result.setTenantId(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.TenantId"));
		result.setTestOwner(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.TestOwner"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutArchdomainResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> linkcGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutArchdomainResponse.Result.LinkcGroups.Length"); i++) {
			linkcGroups.add(_ctx.stringValue("AddLinkeBahamutArchdomainResponse.Result.LinkcGroups["+ i +"]"));
		}
		result.setLinkcGroups(linkcGroups);
		addLinkeBahamutArchdomainResponse.setResult(result);
	 
	 	return addLinkeBahamutArchdomainResponse;
	}
}