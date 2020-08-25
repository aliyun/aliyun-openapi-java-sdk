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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutTenanttpauthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutTenanttpauthResponseUnmarshaller {

	public static UpdateLinkeBahamutTenanttpauthResponse unmarshall(UpdateLinkeBahamutTenanttpauthResponse updateLinkeBahamutTenanttpauthResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutTenanttpauthResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutTenanttpauthResponse.RequestId"));
		updateLinkeBahamutTenanttpauthResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutTenanttpauthResponse.ResultCode"));
		updateLinkeBahamutTenanttpauthResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutTenanttpauthResponse.ResultMessage"));
		updateLinkeBahamutTenanttpauthResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutTenanttpauthResponse.ErrorMessage"));
		updateLinkeBahamutTenanttpauthResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutTenanttpauthResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutTenanttpauthResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutTenanttpauthResponse.Message"));
		updateLinkeBahamutTenanttpauthResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutTenanttpauthResponse.ResponseStatusCode"));
		updateLinkeBahamutTenanttpauthResponse.setResult(_ctx.booleanValue("UpdateLinkeBahamutTenanttpauthResponse.Result"));
		updateLinkeBahamutTenanttpauthResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutTenanttpauthResponse.Success"));
	 
	 	return updateLinkeBahamutTenanttpauthResponse;
	}
}