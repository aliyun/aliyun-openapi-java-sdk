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

import com.aliyuncs.iot.model.v20180120.CreateDeviceDynamicGroupResponse;
import com.aliyuncs.iot.model.v20180120.CreateDeviceDynamicGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDeviceDynamicGroupResponseUnmarshaller {

	public static CreateDeviceDynamicGroupResponse unmarshall(CreateDeviceDynamicGroupResponse createDeviceDynamicGroupResponse, UnmarshallerContext _ctx) {
		
		createDeviceDynamicGroupResponse.setRequestId(_ctx.stringValue("CreateDeviceDynamicGroupResponse.RequestId"));
		createDeviceDynamicGroupResponse.setSuccess(_ctx.booleanValue("CreateDeviceDynamicGroupResponse.Success"));
		createDeviceDynamicGroupResponse.setCode(_ctx.stringValue("CreateDeviceDynamicGroupResponse.Code"));
		createDeviceDynamicGroupResponse.setErrorMessage(_ctx.stringValue("CreateDeviceDynamicGroupResponse.ErrorMessage"));

		Data data = new Data();
		data.setGroupId(_ctx.stringValue("CreateDeviceDynamicGroupResponse.Data.GroupId"));
		data.setUtcCreate(_ctx.stringValue("CreateDeviceDynamicGroupResponse.Data.UtcCreate"));
		data.setGroupName(_ctx.stringValue("CreateDeviceDynamicGroupResponse.Data.GroupName"));
		data.setGroupDesc(_ctx.stringValue("CreateDeviceDynamicGroupResponse.Data.GroupDesc"));
		data.setDynamicGroupExpression(_ctx.stringValue("CreateDeviceDynamicGroupResponse.Data.DynamicGroupExpression"));
		createDeviceDynamicGroupResponse.setData(data);
	 
	 	return createDeviceDynamicGroupResponse;
	}
}