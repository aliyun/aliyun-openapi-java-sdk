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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutUsertokenResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutUsertokenResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutUsertokenResponseUnmarshaller {

	public static CreateLinkeBahamutUsertokenResponse unmarshall(CreateLinkeBahamutUsertokenResponse createLinkeBahamutUsertokenResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutUsertokenResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.RequestId"));
		createLinkeBahamutUsertokenResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.ResultCode"));
		createLinkeBahamutUsertokenResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.ResultMessage"));
		createLinkeBahamutUsertokenResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.ErrorMessage"));
		createLinkeBahamutUsertokenResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.ErrorMsgParamsMap"));
		createLinkeBahamutUsertokenResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.Message"));
		createLinkeBahamutUsertokenResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutUsertokenResponse.ResponseStatusCode"));
		createLinkeBahamutUsertokenResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutUsertokenResponse.Success"));

		Result result = new Result();
		result.setAccount(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.Result.Account"));
		result.setCreated(_ctx.longValue("CreateLinkeBahamutUsertokenResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("CreateLinkeBahamutUsertokenResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("CreateLinkeBahamutUsertokenResponse.Result.LastModified"));
		result.setToken(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.Result.Token"));
		result.setUser(_ctx.stringValue("CreateLinkeBahamutUsertokenResponse.Result.User"));
		createLinkeBahamutUsertokenResponse.setResult(result);
	 
	 	return createLinkeBahamutUsertokenResponse;
	}
}