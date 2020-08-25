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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutWebapicreatedeploymentunitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutWebapicreatedeploymentunitResponseUnmarshaller {

	public static CreateLinkeBahamutWebapicreatedeploymentunitResponse unmarshall(CreateLinkeBahamutWebapicreatedeploymentunitResponse createLinkeBahamutWebapicreatedeploymentunitResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutWebapicreatedeploymentunitResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.RequestId"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.ResultCode"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.ResultMessage"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.ErrorMessage"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.ErrorMsgParamsMap"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.Message"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.ResponseStatusCode"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setResult(_ctx.stringValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.Result"));
		createLinkeBahamutWebapicreatedeploymentunitResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutWebapicreatedeploymentunitResponse.Success"));
	 
	 	return createLinkeBahamutWebapicreatedeploymentunitResponse;
	}
}