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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutCloudtenantResponse;
import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutCloudtenantResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutCloudtenantResponseUnmarshaller {

	public static SaveLinkeBahamutCloudtenantResponse unmarshall(SaveLinkeBahamutCloudtenantResponse saveLinkeBahamutCloudtenantResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutCloudtenantResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.RequestId"));
		saveLinkeBahamutCloudtenantResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.ResultCode"));
		saveLinkeBahamutCloudtenantResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.ResultMessage"));
		saveLinkeBahamutCloudtenantResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.ErrorMessage"));
		saveLinkeBahamutCloudtenantResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Message"));
		saveLinkeBahamutCloudtenantResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutCloudtenantResponse.Success"));

		Result result = new Result();
		result.setAccessKey(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.AccessKey"));
		result.setAccessSecret(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.AccessSecret"));
		result.setCreated(_ctx.longValue("SaveLinkeBahamutCloudtenantResponse.Result.Created"));
		result.setCustomerId(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.CustomerId"));
		result.setDeleted(_ctx.booleanValue("SaveLinkeBahamutCloudtenantResponse.Result.Deleted"));
		result.setEndPoint(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.EndPoint"));
		result.setId(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("SaveLinkeBahamutCloudtenantResponse.Result.LastModified"));
		result.setLinkETenant(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.LinkETenant"));
		result.setStationName(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.StationName"));
		result.setTenantId(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.TenantId"));
		result.setTenantName(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.TenantName"));
		result.setToken(_ctx.stringValue("SaveLinkeBahamutCloudtenantResponse.Result.Token"));
		saveLinkeBahamutCloudtenantResponse.setResult(result);
	 
	 	return saveLinkeBahamutCloudtenantResponse;
	}
}