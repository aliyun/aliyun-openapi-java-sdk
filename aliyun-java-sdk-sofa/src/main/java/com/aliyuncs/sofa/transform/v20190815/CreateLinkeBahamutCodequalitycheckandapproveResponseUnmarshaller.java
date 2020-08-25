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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutCodequalitycheckandapproveResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutCodequalitycheckandapproveResponseUnmarshaller {

	public static CreateLinkeBahamutCodequalitycheckandapproveResponse unmarshall(CreateLinkeBahamutCodequalitycheckandapproveResponse createLinkeBahamutCodequalitycheckandapproveResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutCodequalitycheckandapproveResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.RequestId"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.ResultCode"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.ResultMessage"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.ErrorMessage"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.ErrorMsgParamsMap"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.Message"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.ResponseStatusCode"));
		createLinkeBahamutCodequalitycheckandapproveResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutCodequalitycheckandapproveResponse.Success"));
	 
	 	return createLinkeBahamutCodequalitycheckandapproveResponse;
	}
}