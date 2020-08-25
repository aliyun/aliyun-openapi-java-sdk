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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeBroadcastmessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeBroadcastmessageResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeBroadcastmessageResponse unmarshall(DeleteLinkeantcodeAntcodeBroadcastmessageResponse deleteLinkeantcodeAntcodeBroadcastmessageResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.RequestId"));
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.ResultCode"));
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setData(_ctx.booleanValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.Data"));
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.Message"));
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeBroadcastmessageResponse.setStatus(_ctx.booleanValue("DeleteLinkeantcodeAntcodeBroadcastmessageResponse.Status"));
	 
	 	return deleteLinkeantcodeAntcodeBroadcastmessageResponse;
	}
}