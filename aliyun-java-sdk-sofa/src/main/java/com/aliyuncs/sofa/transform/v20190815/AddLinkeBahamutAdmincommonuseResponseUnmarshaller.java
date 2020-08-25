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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmincommonuseResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdmincommonuseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdmincommonuseResponseUnmarshaller {

	public static AddLinkeBahamutAdmincommonuseResponse unmarshall(AddLinkeBahamutAdmincommonuseResponse addLinkeBahamutAdmincommonuseResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdmincommonuseResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.RequestId"));
		addLinkeBahamutAdmincommonuseResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.ResultCode"));
		addLinkeBahamutAdmincommonuseResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.ResultMessage"));
		addLinkeBahamutAdmincommonuseResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.ErrorMessage"));
		addLinkeBahamutAdmincommonuseResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdmincommonuseResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.Message"));
		addLinkeBahamutAdmincommonuseResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdmincommonuseResponse.ResponseStatusCode"));
		addLinkeBahamutAdmincommonuseResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdmincommonuseResponse.Success"));

		Result result = new Result();
		result.setCat(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.Result.Cat"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdmincommonuseResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdmincommonuseResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdmincommonuseResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.Result.Name"));
		result.setProductName(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.Result.ProductName"));
		result.setSort(_ctx.longValue("AddLinkeBahamutAdmincommonuseResponse.Result.Sort"));
		result.setUrl(_ctx.stringValue("AddLinkeBahamutAdmincommonuseResponse.Result.Url"));
		addLinkeBahamutAdmincommonuseResponse.setResult(result);
	 
	 	return addLinkeBahamutAdmincommonuseResponse;
	}
}