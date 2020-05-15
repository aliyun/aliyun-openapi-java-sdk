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

import com.aliyuncs.sofa.model.v20190815.SendLinkeBahamutFlowtasknoticeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendLinkeBahamutFlowtasknoticeResponseUnmarshaller {

	public static SendLinkeBahamutFlowtasknoticeResponse unmarshall(SendLinkeBahamutFlowtasknoticeResponse sendLinkeBahamutFlowtasknoticeResponse, UnmarshallerContext _ctx) {
		
		sendLinkeBahamutFlowtasknoticeResponse.setRequestId(_ctx.stringValue("SendLinkeBahamutFlowtasknoticeResponse.RequestId"));
		sendLinkeBahamutFlowtasknoticeResponse.setResultCode(_ctx.stringValue("SendLinkeBahamutFlowtasknoticeResponse.ResultCode"));
		sendLinkeBahamutFlowtasknoticeResponse.setResultMessage(_ctx.stringValue("SendLinkeBahamutFlowtasknoticeResponse.ResultMessage"));
		sendLinkeBahamutFlowtasknoticeResponse.setErrorMessage(_ctx.stringValue("SendLinkeBahamutFlowtasknoticeResponse.ErrorMessage"));
		sendLinkeBahamutFlowtasknoticeResponse.setMessage(_ctx.stringValue("SendLinkeBahamutFlowtasknoticeResponse.Message"));
		sendLinkeBahamutFlowtasknoticeResponse.setSuccess(_ctx.booleanValue("SendLinkeBahamutFlowtasknoticeResponse.Success"));
	 
	 	return sendLinkeBahamutFlowtasknoticeResponse;
	}
}