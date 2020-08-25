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

import com.aliyuncs.sofa.model.v20190815.CancelLinkeBahamutNotificationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelLinkeBahamutNotificationResponseUnmarshaller {

	public static CancelLinkeBahamutNotificationResponse unmarshall(CancelLinkeBahamutNotificationResponse cancelLinkeBahamutNotificationResponse, UnmarshallerContext _ctx) {
		
		cancelLinkeBahamutNotificationResponse.setRequestId(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.RequestId"));
		cancelLinkeBahamutNotificationResponse.setResultCode(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.ResultCode"));
		cancelLinkeBahamutNotificationResponse.setResultMessage(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.ResultMessage"));
		cancelLinkeBahamutNotificationResponse.setErrorMessage(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.ErrorMessage"));
		cancelLinkeBahamutNotificationResponse.setErrorMsgParamsMap(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.ErrorMsgParamsMap"));
		cancelLinkeBahamutNotificationResponse.setMessage(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.Message"));
		cancelLinkeBahamutNotificationResponse.setResponseStatusCode(_ctx.longValue("CancelLinkeBahamutNotificationResponse.ResponseStatusCode"));
		cancelLinkeBahamutNotificationResponse.setResult(_ctx.stringValue("CancelLinkeBahamutNotificationResponse.Result"));
		cancelLinkeBahamutNotificationResponse.setSuccess(_ctx.booleanValue("CancelLinkeBahamutNotificationResponse.Success"));
	 
	 	return cancelLinkeBahamutNotificationResponse;
	}
}