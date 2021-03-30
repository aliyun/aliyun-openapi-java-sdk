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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.GetAuthInfoResponse;
import com.aliyuncs.scsp.model.v20200702.GetAuthInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthInfoResponseUnmarshaller {

	public static GetAuthInfoResponse unmarshall(GetAuthInfoResponse getAuthInfoResponse, UnmarshallerContext _ctx) {
		
		getAuthInfoResponse.setRequestId(_ctx.stringValue("GetAuthInfoResponse.RequestId"));
		getAuthInfoResponse.setMessage(_ctx.stringValue("GetAuthInfoResponse.Message"));
		getAuthInfoResponse.setCode(_ctx.stringValue("GetAuthInfoResponse.Code"));
		getAuthInfoResponse.setSuccess(_ctx.booleanValue("GetAuthInfoResponse.Success"));

		Data data = new Data();
		data.setApp(_ctx.stringValue("GetAuthInfoResponse.Data.App"));
		data.setTenantId(_ctx.stringValue("GetAuthInfoResponse.Data.TenantId"));
		data.setUserName(_ctx.stringValue("GetAuthInfoResponse.Data.UserName"));
		data.setUserId(_ctx.stringValue("GetAuthInfoResponse.Data.UserId"));
		data.setAppKey(_ctx.stringValue("GetAuthInfoResponse.Data.AppKey"));
		data.setTime(_ctx.longValue("GetAuthInfoResponse.Data.Time"));
		data.setSessionId(_ctx.stringValue("GetAuthInfoResponse.Data.SessionId"));
		data.setCode(_ctx.stringValue("GetAuthInfoResponse.Data.Code"));
		data.setAppName(_ctx.stringValue("GetAuthInfoResponse.Data.AppName"));
		getAuthInfoResponse.setData(data);
	 
	 	return getAuthInfoResponse;
	}
}