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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DownloadConversationDetailsResponse;
import com.aliyuncs.outboundbot.model.v20191226.DownloadConversationDetailsResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadConversationDetailsResponseUnmarshaller {

	public static DownloadConversationDetailsResponse unmarshall(DownloadConversationDetailsResponse downloadConversationDetailsResponse, UnmarshallerContext _ctx) {
		
		downloadConversationDetailsResponse.setRequestId(_ctx.stringValue("DownloadConversationDetailsResponse.RequestId"));
		downloadConversationDetailsResponse.setSuccess(_ctx.booleanValue("DownloadConversationDetailsResponse.Success"));
		downloadConversationDetailsResponse.setCode(_ctx.stringValue("DownloadConversationDetailsResponse.Code"));
		downloadConversationDetailsResponse.setMessage(_ctx.stringValue("DownloadConversationDetailsResponse.Message"));
		downloadConversationDetailsResponse.setHttpStatusCode(_ctx.integerValue("DownloadConversationDetailsResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(_ctx.stringValue("DownloadConversationDetailsResponse.DownloadParams.SignatureUrl"));
		downloadConversationDetailsResponse.setDownloadParams(downloadParams);
	 
	 	return downloadConversationDetailsResponse;
	}
}