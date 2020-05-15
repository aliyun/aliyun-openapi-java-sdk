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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutArchdomainsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutArchdomainsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutArchdomainsResponseUnmarshaller {

	public static AddLinkeBahamutArchdomainsResponse unmarshall(AddLinkeBahamutArchdomainsResponse addLinkeBahamutArchdomainsResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutArchdomainsResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.RequestId"));
		addLinkeBahamutArchdomainsResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.ResultCode"));
		addLinkeBahamutArchdomainsResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.ResultMessage"));
		addLinkeBahamutArchdomainsResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.ErrorMessage"));
		addLinkeBahamutArchdomainsResponse.setMessage(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Message"));
		addLinkeBahamutArchdomainsResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutArchdomainsResponse.Success"));

		Result result = new Result();
		result.setBakOwner(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.BakOwner"));
		result.setBakTestOwner(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.BakTestOwner"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutArchdomainsResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutArchdomainsResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.ExternalId"));
		result.setId(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutArchdomainsResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.Level"));
		result.setName(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.Name"));
		result.setOwner(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.Owner"));
		result.setParentId(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.ParentId"));
		result.setTenantId(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.TenantId"));
		result.setTestOwner(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.TestOwner"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutArchdomainsResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> linkcGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutArchdomainsResponse.Result.LinkcGroups.Length"); i++) {
			linkcGroups.add(_ctx.stringValue("AddLinkeBahamutArchdomainsResponse.Result.LinkcGroups["+ i +"]"));
		}
		result.setLinkcGroups(linkcGroups);
		addLinkeBahamutArchdomainsResponse.setResult(result);
	 
	 	return addLinkeBahamutArchdomainsResponse;
	}
}