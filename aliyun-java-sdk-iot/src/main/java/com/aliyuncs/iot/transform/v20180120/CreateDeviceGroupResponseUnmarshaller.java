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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateDeviceGroupResponse;
import com.aliyuncs.iot.model.v20180120.CreateDeviceGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceGroupResponseUnmarshaller {

	public static CreateDeviceGroupResponse unmarshall(CreateDeviceGroupResponse createDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		createDeviceGroupResponse.setRequestId(_ctx.stringValue("CreateDeviceGroupResponse.RequestId"));
		createDeviceGroupResponse.setSuccess(_ctx.booleanValue("CreateDeviceGroupResponse.Success"));
		createDeviceGroupResponse.setCode(_ctx.stringValue("CreateDeviceGroupResponse.Code"));
		createDeviceGroupResponse.setErrorMessage(_ctx.stringValue("CreateDeviceGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setGroupId(_ctx.stringValue("CreateDeviceGroupResponse.Data.GroupId"));
		data.setUtcCreate(_ctx.stringValue("CreateDeviceGroupResponse.Data.UtcCreate"));
		data.setGroupName(_ctx.stringValue("CreateDeviceGroupResponse.Data.GroupName"));
		data.setGroupDesc(_ctx.stringValue("CreateDeviceGroupResponse.Data.GroupDesc"));
		createDeviceGroupResponse.setData(data);
	 
	 	return createDeviceGroupResponse;
	}
}