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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.SendSideMessageResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.SendSideMessageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendSideMessageResponseUnmarshaller {

	public static SendSideMessageResponse unmarshall(SendSideMessageResponse sendSideMessageResponse, UnmarshallerContext _ctx) {
		
		sendSideMessageResponse.setRequestId(_ctx.stringValue("SendSideMessageResponse.RequestId"));
		sendSideMessageResponse.setErrorMessage(_ctx.stringValue("SendSideMessageResponse.ErrorMessage"));
		sendSideMessageResponse.setSuccess(_ctx.booleanValue("SendSideMessageResponse.Success"));
		sendSideMessageResponse.setErrorCode(_ctx.stringValue("SendSideMessageResponse.ErrorCode"));

		Data data = new Data();
		data.setUuid(_ctx.stringValue("SendSideMessageResponse.Data.Uuid"));
		data.setTimeStamp(_ctx.longValue("SendSideMessageResponse.Data.TimeStamp"));
		data.setSuccess(_ctx.booleanValue("SendSideMessageResponse.Data.Success"));
		data.setContent(_ctx.stringValue("SendSideMessageResponse.Data.Content"));
		sendSideMessageResponse.setData(data);
	 
	 	return sendSideMessageResponse;
	}
}