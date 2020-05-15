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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutArchdomainsResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutArchdomainsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutArchdomainsResponseUnmarshaller {

	public static UpdateLinkeBahamutArchdomainsResponse unmarshall(UpdateLinkeBahamutArchdomainsResponse updateLinkeBahamutArchdomainsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutArchdomainsResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.RequestId"));
		updateLinkeBahamutArchdomainsResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.ResultCode"));
		updateLinkeBahamutArchdomainsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.ResultMessage"));
		updateLinkeBahamutArchdomainsResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.ErrorMessage"));
		updateLinkeBahamutArchdomainsResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Message"));
		updateLinkeBahamutArchdomainsResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutArchdomainsResponse.Success"));

		Result result = new Result();
		result.setBakOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.BakOwner"));
		result.setBakTestOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.BakTestOwner"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutArchdomainsResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutArchdomainsResponse.Result.Deleted"));
		result.setDescription(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.Description"));
		result.setExternalId(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.ExternalId"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutArchdomainsResponse.Result.LastModified"));
		result.setLevel(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.Level"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.Name"));
		result.setOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.Owner"));
		result.setParentId(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.ParentId"));
		result.setTenantId(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.TenantId"));
		result.setTestOwner(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.TestOwner"));

		List<String> appMetaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutArchdomainsResponse.Result.AppMetaIds.Length"); i++) {
			appMetaIds.add(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.AppMetaIds["+ i +"]"));
		}
		result.setAppMetaIds(appMetaIds);

		List<String> linkcGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutArchdomainsResponse.Result.LinkcGroups.Length"); i++) {
			linkcGroups.add(_ctx.stringValue("UpdateLinkeBahamutArchdomainsResponse.Result.LinkcGroups["+ i +"]"));
		}
		result.setLinkcGroups(linkcGroups);
		updateLinkeBahamutArchdomainsResponse.setResult(result);
	 
	 	return updateLinkeBahamutArchdomainsResponse;
	}
}