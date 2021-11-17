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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.RequestLoginInfoResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestLoginInfoResponse.DeviceStateDTO;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestLoginInfoResponse.DeviceStateDTO.Binder;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestLoginInfoResponse.DeviceStateDTO.CurrentUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLoginInfoResponseUnmarshaller {

	public static RequestLoginInfoResponse unmarshall(RequestLoginInfoResponse requestLoginInfoResponse, UnmarshallerContext _ctx) {
		
		requestLoginInfoResponse.setRequestId(_ctx.stringValue("RequestLoginInfoResponse.RequestId"));
		requestLoginInfoResponse.setErrorMessage(_ctx.stringValue("RequestLoginInfoResponse.ErrorMessage"));
		requestLoginInfoResponse.setSuccess(_ctx.booleanValue("RequestLoginInfoResponse.Success"));
		requestLoginInfoResponse.setErrorCode(_ctx.stringValue("RequestLoginInfoResponse.ErrorCode"));

		List<DeviceStateDTO> data = new ArrayList<DeviceStateDTO>();
		for (int i = 0; i < _ctx.lengthValue("RequestLoginInfoResponse.Data.Length"); i++) {
			DeviceStateDTO deviceStateDTO = new DeviceStateDTO();
			deviceStateDTO.setLiveMode(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].LiveMode"));
			deviceStateDTO.setDeviceName(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].DeviceName"));
			deviceStateDTO.setDeviceId(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].DeviceId"));
			deviceStateDTO.setLiveId(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].LiveId"));
			deviceStateDTO.setUserRole(_ctx.integerValue("RequestLoginInfoResponse.Data["+ i +"].UserRole"));
			deviceStateDTO.setLiveStatus(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].LiveStatus"));
			deviceStateDTO.setLiveType(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].LiveType"));
			deviceStateDTO.setDeviceConnState(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].DeviceConnState"));
			deviceStateDTO.setIsAuthorizeLive(_ctx.booleanValue("RequestLoginInfoResponse.Data["+ i +"].IsAuthorizeLive"));

			Binder binder = new Binder();
			binder.setUserSource(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].Binder.UserSource"));
			binder.setUserId(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].Binder.UserId"));
			deviceStateDTO.setBinder(binder);

			CurrentUser currentUser = new CurrentUser();
			currentUser.setUserSource(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].CurrentUser.UserSource"));
			currentUser.setUserId(_ctx.stringValue("RequestLoginInfoResponse.Data["+ i +"].CurrentUser.UserId"));
			deviceStateDTO.setCurrentUser(currentUser);

			data.add(deviceStateDTO);
		}
		requestLoginInfoResponse.setData(data);
	 
	 	return requestLoginInfoResponse;
	}
}