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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllDeviceGroupResponse;
import com.aliyuncs.lto.model.v20210707.ListAllDeviceGroupResponse.DeviceGroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllDeviceGroupResponseUnmarshaller {

	public static ListAllDeviceGroupResponse unmarshall(ListAllDeviceGroupResponse listAllDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		listAllDeviceGroupResponse.setRequestId(_ctx.stringValue("ListAllDeviceGroupResponse.RequestId"));
		listAllDeviceGroupResponse.setCode(_ctx.stringValue("ListAllDeviceGroupResponse.Code"));
		listAllDeviceGroupResponse.setHttpStatusCode(_ctx.integerValue("ListAllDeviceGroupResponse.HttpStatusCode"));
		listAllDeviceGroupResponse.setMessage(_ctx.stringValue("ListAllDeviceGroupResponse.Message"));
		listAllDeviceGroupResponse.setSuccess(_ctx.booleanValue("ListAllDeviceGroupResponse.Success"));

		List<DeviceGroupInfo> data = new ArrayList<DeviceGroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllDeviceGroupResponse.Data.Length"); i++) {
			DeviceGroupInfo deviceGroupInfo = new DeviceGroupInfo();
			deviceGroupInfo.setName(_ctx.stringValue("ListAllDeviceGroupResponse.Data["+ i +"].Name"));
			deviceGroupInfo.setDeviceGroupId(_ctx.stringValue("ListAllDeviceGroupResponse.Data["+ i +"].DeviceGroupId"));

			data.add(deviceGroupInfo);
		}
		listAllDeviceGroupResponse.setData(data);
	 
	 	return listAllDeviceGroupResponse;
	}
}