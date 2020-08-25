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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutVcsmrcommentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutVcsmrcommentResponseUnmarshaller {

	public static CreateLinkeBahamutVcsmrcommentResponse unmarshall(CreateLinkeBahamutVcsmrcommentResponse createLinkeBahamutVcsmrcommentResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutVcsmrcommentResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.RequestId"));
		createLinkeBahamutVcsmrcommentResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.ResultCode"));
		createLinkeBahamutVcsmrcommentResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.ResultMessage"));
		createLinkeBahamutVcsmrcommentResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.ErrorMessage"));
		createLinkeBahamutVcsmrcommentResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.ErrorMsgParamsMap"));
		createLinkeBahamutVcsmrcommentResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.Message"));
		createLinkeBahamutVcsmrcommentResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutVcsmrcommentResponse.ResponseStatusCode"));
		createLinkeBahamutVcsmrcommentResponse.setResult(_ctx.stringValue("CreateLinkeBahamutVcsmrcommentResponse.Result"));
		createLinkeBahamutVcsmrcommentResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutVcsmrcommentResponse.Success"));
	 
	 	return createLinkeBahamutVcsmrcommentResponse;
	}
}