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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutArchdomainResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutArchdomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutArchdomainResponseUnmarshaller {

	public static UpdateLinkeBahamutArchdomainResponse unmarshall(UpdateLinkeBahamutArchdomainResponse updateLinkeBahamutArchdomainResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutArchdomainResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.RequestId"));
		updateLinkeBahamutArchdomainResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.ResultCode"));
		updateLinkeBahamutArchdomainResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.ResultMessage"));
		updateLinkeBahamutArchdomainResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.ErrorMessage"));
		updateLinkeBahamutArchdomainResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutArchdomainResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Message"));
		updateLinkeBahamutArchdomainResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutArchdomainResponse.ResponseStatusCode"));
		updateLinkeBahamutArchdomainResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutArchdomainResponse.Success"));

		Result result = new Result();
		result.setBakOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.BakOwner"));
		result.setBakTestOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.BakTestOwner"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutArchdomainResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutArchdomainResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.ExternalId"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutArchdomainResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.Level"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.Name"));
		result.setOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.Owner"));
		result.setParentId(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.ParentId"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.TenantId"));
		result.setTestOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.TestOwner"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutArchdomainResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> linkcGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutArchdomainResponse.Result.LinkcGroups.Length"); i++) {
			linkcGroups.add(_ctx.stringValue("UpdateLinkeBahamutArchdomainResponse.Result.LinkcGroups["+ i +"]"));
		}
		result.setLinkcGroups(linkcGroups);
		updateLinkeBahamutArchdomainResponse.setResult(result);
	 
	 	return updateLinkeBahamutArchdomainResponse;
	}
}