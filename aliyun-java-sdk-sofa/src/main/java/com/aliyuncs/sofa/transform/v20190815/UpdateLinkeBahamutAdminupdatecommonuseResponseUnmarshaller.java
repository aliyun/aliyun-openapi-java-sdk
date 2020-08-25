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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminupdatecommonuseResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminupdatecommonuseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminupdatecommonuseResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminupdatecommonuseResponse unmarshall(UpdateLinkeBahamutAdminupdatecommonuseResponse updateLinkeBahamutAdminupdatecommonuseResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminupdatecommonuseResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.RequestId"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.ResultCode"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.ResultMessage"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.ErrorMessage"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Message"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Success"));

		Result result = new Result();
		result.setCat(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Cat"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Name"));
		result.setProductName(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.ProductName"));
		result.setSort(_ctx.longValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Sort"));
		result.setUrl(_ctx.stringValue("UpdateLinkeBahamutAdminupdatecommonuseResponse.Result.Url"));
		updateLinkeBahamutAdminupdatecommonuseResponse.setResult(result);
	 
	 	return updateLinkeBahamutAdminupdatecommonuseResponse;
	}
}