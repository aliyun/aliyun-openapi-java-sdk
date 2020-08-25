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

import com.aliyuncs.sofa.model.v20190815.ReopenLinkeBahamutVcsmergerequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReopenLinkeBahamutVcsmergerequestResponseUnmarshaller {

	public static ReopenLinkeBahamutVcsmergerequestResponse unmarshall(ReopenLinkeBahamutVcsmergerequestResponse reopenLinkeBahamutVcsmergerequestResponse, UnmarshallerContext _ctx) {
		
		reopenLinkeBahamutVcsmergerequestResponse.setRequestId(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.RequestId"));
		reopenLinkeBahamutVcsmergerequestResponse.setResultCode(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.ResultCode"));
		reopenLinkeBahamutVcsmergerequestResponse.setResultMessage(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.ResultMessage"));
		reopenLinkeBahamutVcsmergerequestResponse.setErrorMessage(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.ErrorMessage"));
		reopenLinkeBahamutVcsmergerequestResponse.setErrorMsgParamsMap(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.ErrorMsgParamsMap"));
		reopenLinkeBahamutVcsmergerequestResponse.setMessage(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.Message"));
		reopenLinkeBahamutVcsmergerequestResponse.setResponseStatusCode(_ctx.longValue("ReopenLinkeBahamutVcsmergerequestResponse.ResponseStatusCode"));
		reopenLinkeBahamutVcsmergerequestResponse.setResult(_ctx.stringValue("ReopenLinkeBahamutVcsmergerequestResponse.Result"));
		reopenLinkeBahamutVcsmergerequestResponse.setSuccess(_ctx.booleanValue("ReopenLinkeBahamutVcsmergerequestResponse.Success"));
	 
	 	return reopenLinkeBahamutVcsmergerequestResponse;
	}
}