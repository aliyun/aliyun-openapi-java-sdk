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

import com.aliyuncs.sofa.model.v20190815.CloseLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static CloseLinkeBahamutVcsmergerequestResponse unmarshall(CloseLinkeBahamutVcsmergerequestResponse closeLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		closeLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.RequestId"));
		closeLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.ResultCode"));
		closeLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		closeLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		closeLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		closeLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.Message"));
		closeLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("CloseLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		closeLinkeBahamutVcsmergerequestResponse.setResult(_ctx.stringValue("CloseLinkeBahamutVcsmergerequestResponse.Result"));
		closeLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("CloseLinkeBahamutVcsmergerequestResponse.Success"));
	 
	 	return closeLinkeBahamutVcsmergerequestResponse;
	}
}