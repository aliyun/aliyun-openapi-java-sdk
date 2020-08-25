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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsprojectResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsprojectResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutVcsprojectResponseUnmarshaller {

	public static CreateLinkeBahamutVcsprojectResponse unmarshall(CreateLinkeBahamutVcsprojectResponse createLinkeBahamutVcsprojectResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutVcsprojectResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.RequestId"));
		createLinkeBahamutVcsprojectResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.ResultCode"));
		createLinkeBahamutVcsprojectResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.ResultMessage"));
		createLinkeBahamutVcsprojectResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.ErrorMessage"));
		createLinkeBahamutVcsprojectResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.ErrorMsgParamsMap"));
		createLinkeBahamutVcsprojectResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Message"));
		createLinkeBahamutVcsprojectResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutVcsprojectResponse.ResponseStatusCode"));
		createLinkeBahamutVcsprojectResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutVcsprojectResponse.Success"));

		Result result = new Result();
		result.setDescription(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.Description"));
		result.setEncoding(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.Encoding"));
		result.setHttpUrlToRepo(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.HttpUrlToRepo"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.Id"));
		result.setName(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.Name"));
		result.setNamespace(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.Namespace"));
		result.setPublicStatus(_ctx.booleanValue("CreateLinkeBahamutVcsprojectResponse.Result.PublicStatus"));
		result.setSshUrlToRepo(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.SshUrlToRepo"));
		result.setVisibility(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.Visibility"));
		result.setVisibilityLevel(_ctx.longValue("CreateLinkeBahamutVcsprojectResponse.Result.VisibilityLevel"));
		result.setWebUrl(_ctx.stringValue("CreateLinkeBahamutVcsprojectResponse.Result.WebUrl"));
		createLinkeBahamutVcsprojectResponse.setResult(result);
	 
	 	return createLinkeBahamutVcsprojectResponse;
	}
}