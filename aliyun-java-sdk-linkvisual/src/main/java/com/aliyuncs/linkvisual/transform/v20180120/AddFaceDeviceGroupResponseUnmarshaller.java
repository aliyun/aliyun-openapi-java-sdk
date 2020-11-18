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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.AddFaceDeviceGroupResponse;
import com.aliyuncs.linkvisual.model.v20180120.AddFaceDeviceGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceDeviceGroupResponseUnmarshaller {

	public static AddFaceDeviceGroupResponse unmarshall(AddFaceDeviceGroupResponse addFaceDeviceGroupResponse, UnmarshallerContext _ctx) {
		
		addFaceDeviceGroupResponse.setRequestId(_ctx.stringValue("AddFaceDeviceGroupResponse.RequestId"));
		addFaceDeviceGroupResponse.setSuccess(_ctx.booleanValue("AddFaceDeviceGroupResponse.Success"));
		addFaceDeviceGroupResponse.setCode(_ctx.stringValue("AddFaceDeviceGroupResponse.Code"));
		addFaceDeviceGroupResponse.setErrorMessage(_ctx.stringValue("AddFaceDeviceGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setDeviceGroupId(_ctx.stringValue("AddFaceDeviceGroupResponse.Data.DeviceGroupId"));
		data.setDeviceGroupName(_ctx.stringValue("AddFaceDeviceGroupResponse.Data.DeviceGroupName"));
		data.setModifiedTime(_ctx.stringValue("AddFaceDeviceGroupResponse.Data.ModifiedTime"));
		addFaceDeviceGroupResponse.setData(data);
	 
	 	return addFaceDeviceGroupResponse;
	}
}