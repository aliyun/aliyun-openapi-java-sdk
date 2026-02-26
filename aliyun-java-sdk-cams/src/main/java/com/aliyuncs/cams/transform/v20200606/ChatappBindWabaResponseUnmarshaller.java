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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.ChatappBindWabaResponse;
import com.aliyuncs.cams.model.v20200606.ChatappBindWabaResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatappBindWabaResponseUnmarshaller {

	public static ChatappBindWabaResponse unmarshall(ChatappBindWabaResponse chatappBindWabaResponse, UnmarshallerContext _ctx) {
		
		chatappBindWabaResponse.setRequestId(_ctx.stringValue("ChatappBindWabaResponse.RequestId"));
		chatappBindWabaResponse.setAccessDeniedDetail(_ctx.stringValue("ChatappBindWabaResponse.AccessDeniedDetail"));
		chatappBindWabaResponse.setMessage(_ctx.stringValue("ChatappBindWabaResponse.Message"));
		chatappBindWabaResponse.setCode(_ctx.stringValue("ChatappBindWabaResponse.Code"));
		chatappBindWabaResponse.setSuccess(_ctx.booleanValue("ChatappBindWabaResponse.Success"));

		Data data = new Data();
		data.setCustSpaceId(_ctx.stringValue("ChatappBindWabaResponse.Data.CustSpaceId"));
		data.setWabaId(_ctx.stringValue("ChatappBindWabaResponse.Data.WabaId"));
		chatappBindWabaResponse.setData(data);
	 
	 	return chatappBindWabaResponse;
	}
}