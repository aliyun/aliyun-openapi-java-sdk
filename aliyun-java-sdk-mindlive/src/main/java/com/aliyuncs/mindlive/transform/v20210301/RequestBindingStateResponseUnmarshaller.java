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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.RequestBindingStateResponse;
import com.aliyuncs.mindlive.model.v20210301.RequestBindingStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestBindingStateResponseUnmarshaller {

	public static RequestBindingStateResponse unmarshall(RequestBindingStateResponse requestBindingStateResponse, UnmarshallerContext _ctx) {
		
		requestBindingStateResponse.setRequestId(_ctx.stringValue("RequestBindingStateResponse.RequestId"));
		requestBindingStateResponse.setSuccess(_ctx.booleanValue("RequestBindingStateResponse.Success"));
		requestBindingStateResponse.setErrorCode(_ctx.stringValue("RequestBindingStateResponse.ErrorCode"));
		requestBindingStateResponse.setErrorMessage(_ctx.stringValue("RequestBindingStateResponse.ErrorMessage"));

		Data data = new Data();
		data.setDeviceId(_ctx.stringValue("RequestBindingStateResponse.Data.DeviceId"));
		data.setUserSource(_ctx.stringValue("RequestBindingStateResponse.Data.UserSource"));
		data.setUserId(_ctx.stringValue("RequestBindingStateResponse.Data.UserId"));
		data.setBindAt(_ctx.longValue("RequestBindingStateResponse.Data.BindAt"));
		data.setUserNick(_ctx.stringValue("RequestBindingStateResponse.Data.UserNick"));
		data.setUserAvatar(_ctx.stringValue("RequestBindingStateResponse.Data.UserAvatar"));
		requestBindingStateResponse.setData(data);
	 
	 	return requestBindingStateResponse;
	}
}