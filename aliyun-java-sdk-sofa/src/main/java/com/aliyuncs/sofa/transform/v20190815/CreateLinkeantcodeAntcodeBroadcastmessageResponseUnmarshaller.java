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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeBroadcastmessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeBroadcastmessageResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeBroadcastmessageResponse unmarshall(CreateLinkeantcodeAntcodeBroadcastmessageResponse createLinkeantcodeAntcodeBroadcastmessageResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeBroadcastmessageResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.RequestId"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.ResultCode"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.ResultMessage"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setColor(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.Color"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setCreatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.CreatedAt"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setEndsAt(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.EndsAt"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setFont(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.Font"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setId(_ctx.longValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.Id"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.Message"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.ResponseStatusCode"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setStartsAt(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.StartsAt"));
		createLinkeantcodeAntcodeBroadcastmessageResponse.setUpdatedAt(_ctx.stringValue("CreateLinkeantcodeAntcodeBroadcastmessageResponse.UpdatedAt"));
	 
	 	return createLinkeantcodeAntcodeBroadcastmessageResponse;
	}
}