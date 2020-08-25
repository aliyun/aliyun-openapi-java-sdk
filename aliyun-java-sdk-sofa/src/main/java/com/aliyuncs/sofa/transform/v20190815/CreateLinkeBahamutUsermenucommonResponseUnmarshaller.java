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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutUsermenucommonResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutUsermenucommonResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutUsermenucommonResponseUnmarshaller {

	public static CreateLinkeBahamutUsermenucommonResponse unmarshall(CreateLinkeBahamutUsermenucommonResponse createLinkeBahamutUsermenucommonResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutUsermenucommonResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.RequestId"));
		createLinkeBahamutUsermenucommonResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.ResultCode"));
		createLinkeBahamutUsermenucommonResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.ResultMessage"));
		createLinkeBahamutUsermenucommonResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.ErrorMessage"));
		createLinkeBahamutUsermenucommonResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.ErrorMsgParamsMap"));
		createLinkeBahamutUsermenucommonResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.Message"));
		createLinkeBahamutUsermenucommonResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutUsermenucommonResponse.ResponseStatusCode"));
		createLinkeBahamutUsermenucommonResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutUsermenucommonResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("CreateLinkeBahamutUsermenucommonResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("CreateLinkeBahamutUsermenucommonResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("CreateLinkeBahamutUsermenucommonResponse.Result.LastModified"));
		result.setMenuUseMap(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.Result.MenuUseMap"));
		result.setUrlUseMap(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.Result.UrlUseMap"));
		result.setUserEmpId(_ctx.stringValue("CreateLinkeBahamutUsermenucommonResponse.Result.UserEmpId"));
		createLinkeBahamutUsermenucommonResponse.setResult(result);
	 
	 	return createLinkeBahamutUsermenucommonResponse;
	}
}