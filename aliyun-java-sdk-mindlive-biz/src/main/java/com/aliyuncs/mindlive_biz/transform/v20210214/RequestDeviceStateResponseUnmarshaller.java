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

import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceStateResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceStateResponse.Data;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceStateResponse.Data.Binder;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceStateResponse.Data.CurrentUser;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestDeviceStateResponse.Data.Service;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestDeviceStateResponseUnmarshaller {

	public static RequestDeviceStateResponse unmarshall(RequestDeviceStateResponse requestDeviceStateResponse, UnmarshallerContext _ctx) {
		
		requestDeviceStateResponse.setRequestId(_ctx.stringValue("RequestDeviceStateResponse.RequestId"));
		requestDeviceStateResponse.setErrorMessage(_ctx.stringValue("RequestDeviceStateResponse.ErrorMessage"));
		requestDeviceStateResponse.setSuccess(_ctx.booleanValue("RequestDeviceStateResponse.Success"));
		requestDeviceStateResponse.setErrorCode(_ctx.stringValue("RequestDeviceStateResponse.ErrorCode"));

		Data data = new Data();
		data.setLiveMode(_ctx.stringValue("RequestDeviceStateResponse.Data.LiveMode"));
		data.setDeviceName(_ctx.stringValue("RequestDeviceStateResponse.Data.DeviceName"));
		data.setDeviceId(_ctx.stringValue("RequestDeviceStateResponse.Data.DeviceId"));
		data.setLiveId(_ctx.stringValue("RequestDeviceStateResponse.Data.LiveId"));
		data.setLiveStatus(_ctx.stringValue("RequestDeviceStateResponse.Data.LiveStatus"));
		data.setUserRole(_ctx.integerValue("RequestDeviceStateResponse.Data.UserRole"));
		data.setLiveType(_ctx.stringValue("RequestDeviceStateResponse.Data.LiveType"));
		data.setDeviceConnState(_ctx.stringValue("RequestDeviceStateResponse.Data.DeviceConnState"));
		data.setIsAuthorizeLive(_ctx.booleanValue("RequestDeviceStateResponse.Data.IsAuthorizeLive"));
		data.setSystemVersion(_ctx.stringValue("RequestDeviceStateResponse.Data.SystemVersion"));

		Binder binder = new Binder();
		binder.setUserSource(_ctx.stringValue("RequestDeviceStateResponse.Data.Binder.UserSource"));
		binder.setUserId(_ctx.stringValue("RequestDeviceStateResponse.Data.Binder.UserId"));
		data.setBinder(binder);

		CurrentUser currentUser = new CurrentUser();
		currentUser.setUserSource(_ctx.stringValue("RequestDeviceStateResponse.Data.CurrentUser.UserSource"));
		currentUser.setUserId(_ctx.stringValue("RequestDeviceStateResponse.Data.CurrentUser.UserId"));
		data.setCurrentUser(currentUser);

		Service service = new Service();
		service.setServicePackName(_ctx.stringValue("RequestDeviceStateResponse.Data.Service.ServicePackName"));
		service.setServiceEffectAt(_ctx.longValue("RequestDeviceStateResponse.Data.Service.ServiceEffectAt"));
		service.setServiceExpireAt(_ctx.longValue("RequestDeviceStateResponse.Data.Service.ServiceExpireAt"));
		data.setService(service);
		requestDeviceStateResponse.setData(data);
	 
	 	return requestDeviceStateResponse;
	}
}