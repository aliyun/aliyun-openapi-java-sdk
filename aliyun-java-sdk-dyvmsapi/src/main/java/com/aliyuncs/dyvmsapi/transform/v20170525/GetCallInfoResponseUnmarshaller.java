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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import com.aliyuncs.dyvmsapi.model.v20170525.GetCallInfoResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.GetCallInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallInfoResponseUnmarshaller {

	public static GetCallInfoResponse unmarshall(GetCallInfoResponse getCallInfoResponse, UnmarshallerContext _ctx) {
		
		getCallInfoResponse.setRequestId(_ctx.stringValue("GetCallInfoResponse.RequestId"));
		getCallInfoResponse.setCode(_ctx.stringValue("GetCallInfoResponse.Code"));
		getCallInfoResponse.setMessage(_ctx.stringValue("GetCallInfoResponse.Message"));

		Data data = new Data();
		data.setChannelId(_ctx.stringValue("GetCallInfoResponse.Data.ChannelId"));
		data.setStatus(_ctx.stringValue("GetCallInfoResponse.Data.Status"));
		getCallInfoResponse.setData(data);
	 
	 	return getCallInfoResponse;
	}
}